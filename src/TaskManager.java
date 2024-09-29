import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Ajouter une nouvelle tâche
    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    // Générer un rapport des tâches terminées
    public void printCompletedTasks() {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks() {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Classe interne pour représenter une tâche
    private class Task {
        private String title;
        private String description;
        private boolean completed;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
            this.completed = false;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        @Override
        public String toString() {
            return "Tache : " + title + " - " + description + " | Statut : " + (completed ? "Terminee" : "Non terminee");
        }
    }
}