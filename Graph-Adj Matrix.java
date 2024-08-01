public class Main11 {
    private boolean[][] adjMat;
    private int nVertices;
    public Main11(int nVertices){
        this.nVertices=nVertices;
        adjMat=new boolean[nVertices][nVertices];
    }
    public void addEdge(int i,int j){
        adjMat[i][j]=true;
        adjMat[j][i]=true;
    }
    public void removeEdge(int i,int j){
        adjMat[i][j]=false;
        adjMat[j][i]=false;
    }
    public boolean hasEdge(int i,int j){
        return adjMat[i][j];
    }
    public void printGraph(){
        for(int i=0;i<nVertices;i++){
            for(int j=0;j<nVertices;j++){
                System.out.print(adjMat[i][j]?1:0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Main11 graph=new Main11(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        System.out.println("Graph:");
        graph.printGraph();
        System.out.println("Does 0-1 edge exist? "+graph.hasEdge(0,1));
        graph.removeEdge(0,1);
        System.out.println("Graph after removing 0-1 edge:");
        graph.printGraph();
        System.out.println("Does 0-1 edge exist? "+graph.hasEdge(0,1));
        
    }
    
}
