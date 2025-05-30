//scheduler
public interface Scheduler {

   public void allocateCPU(Job job);

   public Job dequeue();

   // ,,
   public void enqueue(Job job);

   // processes
   public String getRemainingProcesses();

   public boolean isEmpty();
   // node

   public Node peek();
}
