package entities.service;

import entities.domain.Contract;
import entities.domain.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int numberOfInstallments){

        double basicQuota = contract.getTotalValue() / numberOfInstallments;

        for (int i = 1; i <= numberOfInstallments; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallment().add(new Installment(dueDate, quota));
        }

    }

}
