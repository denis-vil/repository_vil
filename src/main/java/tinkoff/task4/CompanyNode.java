package task4;

class CompanyNode {
    int parent;
    int cost;
    String companyName;

    public CompanyNode(int parent, int cost, String companyName) {
        this.parent = parent;
        this.cost = cost;
        this.companyName = companyName;
    }
}