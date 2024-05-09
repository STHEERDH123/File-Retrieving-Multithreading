# File-Retrieving-Multithreading
**Project Name:** File Retrieval System

**Description:**
The File Retrieval System is a Java-based application designed to showcase principles of distributed systems architectures and multithreading. The system facilitates efficient indexing and retrieval of files from datasets, employing parallel processing techniques to enhance performance.

**Directory Structure:**
```
File-Retrieval-System/
│
├── src/main/java/engine                   # Contains the source code files
│                   ├── AppInterface.java  # Implementation of the command-line interface
│                   ├── ProcessingEngine.java  # Implementation of file indexing and search functionalities
│                   └── IndexStore.java    # Implementation of global index management
|                   └── IndexingTask.java   #Indexing functionality
|                   └── DataPartitioning.java  #Data Partitioning logic
│
├── model/              # Directory containing sample datasets for testing
│   ├── searchResult.java
│   
│   
│
├── README.md              # Manual providing information on how to build and run the program
│
└── Datasets
    |--Dataset1
    |--Dataset2
    |--Dataset3
    |--Dataset4
    |--Dataset5
```

**How to Build:**
1. Clone the repository to your local machine: `git clone https://github.com/your-username/File-Retrieval-System.git`
2. Navigate to the project directory: `cd File-Retrieval-System`
3. Compile the Java source files:
   ```
   javac src/*.java
   ```

**How to Run:**
1. Ensure that the datasets to be indexed are located in the project root directory.
2. Create .jar file of the project.
3. Execute the program:
   ```
   java -jar jarfilename.jar
   ```
4. Follow the command-line prompts to index files or search for specific terms within the datasets.

**Performance Evaluation:**
1. The performance evaluation process involves assessing indexing efficiency across diverse datasets and varying numbers of worker threads.
2. Different configurations of worker threads (ranging from 1 to 8) are tested to observe how indexing performance scales with increasing concurrency levels.
3. Wall time measurements are recorded for each dataset and worker thread configuration to calculate indexing throughput.
4. A comprehensive report summarizing indexing throughput for each configuration is generated for analysis.
