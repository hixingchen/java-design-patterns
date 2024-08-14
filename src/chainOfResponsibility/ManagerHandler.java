package chainOfResponsibility;

public class ManagerHandler extends ReimbursementHandler{
    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("经理处理报销请求：" + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
