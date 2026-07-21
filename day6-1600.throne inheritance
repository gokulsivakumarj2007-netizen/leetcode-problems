import java.util.*;

class ThroneInheritance {
    private String king;
    // Map to represent the family tree: Parent Name -> List of Children Names
    private Map<String, List<String>> familyTree;
    // Set to keep track of dead people for O(1) lookups
    private Set<String> deadSet;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        this.familyTree = new HashMap<>();
        this.deadSet = new HashSet<>();
        // Initialize the king in our family tree map
        familyTree.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        // Add the child to the parent's list of children
        familyTree.get(parentName).add(childName);
        // Initialize an empty children list for the newborn child
        familyTree.put(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        // Mark the person as dead
        deadSet.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        // Perform a pre-order DFS starting from the King
        dfs(king, order);
        return order;
    }

    private void dfs(String currentPerson, List<String> order) {
        // If the person is alive, add them to the succession order
        if (!deadSet.contains(currentPerson)) {
            order.add(currentPerson);
        }
        
        // Recurse for all of their children from oldest to youngest
        List<String> children = familyTree.get(currentPerson);
        if (children != null) {
            for (String child : children) {
                dfs(child, order);
            }
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_4 = obj.getInheritanceOrder();
 */
