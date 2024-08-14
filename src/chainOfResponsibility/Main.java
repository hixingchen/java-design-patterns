package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        ReimbursementHandler departmentHeadHandler = new DepartmentHeadHandler();
        ReimbursementHandler managerHandler = new ManagerHandler();
        ReimbursementHandler financeHandler = new FinanceHandler();
        departmentHeadHandler.setSuccessor(managerHandler).setSuccessor(financeHandler);
        departmentHeadHandler.handleRequest(new ReimbursementRequest(1000, "Need to buy a new laptop"));
        departmentHeadHandler.handleRequest(new ReimbursementRequest(5000, "Need to buy a new car"));
        departmentHeadHandler.handleRequest(new ReimbursementRequest(10000, "Need to buy a new house"));
    }
}
