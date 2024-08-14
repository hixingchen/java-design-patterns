package chainOfResponsibility;

public abstract class ReimbursementHandler {
    protected ReimbursementHandler successor;

    public ReimbursementHandler setSuccessor(ReimbursementHandler successor) {
        this.successor = successor;
        return successor;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void handleRequest(ReimbursementRequest request);
}
