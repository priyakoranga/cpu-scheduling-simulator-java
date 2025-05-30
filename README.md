# CPU Scheduler


A CPU Scheduling Simulator built in Java that visually and programmatically demonstrates the working of various CPU scheduling algorithms. This project was developed as part of a Software Engineering curriculum in the 3rd year of BTech in Computer Science.

📌 Features
Simulates multiple CPU scheduling algorithms:

First-Come First-Serve (FCFS)

Shortest Job First (SJF)

Round Robin (RR)

Priority Scheduling

Calculates:

Turnaround Time

Waiting Time

Average Waiting Time

Average Turnaround Time

User-defined input: arrival time, burst time, quantum (for RR), and priority (for priority scheduling)

Clear textual output with tabular representation of results

🛠️ Technologies Used
Java (JDK 8+)

Command Line Interface (CLI)


▶️ How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/cpu-scheduling-simulator-java.git
cd cpu-scheduling-simulator-java
Compile the code:

bash
Copy
Edit
javac Scheduler.java
Run the program:

bash
Copy
Edit
java Scheduler
Follow the prompts to input the number of processes, their details, and select the scheduling algorithm.

📈 Sample Output
less
Copy
Edit
Enter number of processes: 3
Enter Arrival Time, Burst Time, Priority for process 1: 0 5 2
Enter Arrival Time, Burst Time, Priority for process 2: 1 3 1
Enter Arrival Time, Burst Time, Priority for process 3: 2 8 3
Choose Scheduling Algorithm:
1. FCFS
2. SJF
3. Priority
4. Round Robin

Choice: 1

Process  Turnaround Time  Waiting Time
P1       5                0
P2       7                4
P3       15               7
Average Turnaround Time: 9
Average Waiting Time: 3.66
📚 Concepts Covered
CPU Scheduling fundamentals

Java OOP (Object-Oriented Programming)

Arrays and data structures

Sorting and control flow

Command line interaction

📌 Future Enhancements
GUI using JavaFX or Swing

Gantt Chart visualization

Support for I/O bound processes

Multithreading for real-time simulation
