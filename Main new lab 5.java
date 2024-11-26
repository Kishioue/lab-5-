public class Main {
  public static void main(String[] args) {
      // Create the BST tree object
      BinarySearchTree lab5Tree = new BinarySearchTree();

      // Values to insert
      int[] valuesToInsert = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};

      // Insert values into the tree
      for (int val : valuesToInsert) {
          lab5Tree.insert(val);
      }

      // Step 2: Delete the value 17 from the BST
      lab5Tree.delete(17);

      // Step 3: Traverse and output values using inorder
      System.out.println("Inorder Traversal (sorted): ");
      lab5Tree.inorder();

      // Step 4: Traverse and output values using postorder
      System.out.println("Postorder Traversal: ");
      lab5Tree.postorder();

      // Step 5: Traverse and output values using preorder
      System.out.println("Preorder Traversal: ");
      lab5Tree.preorder();

      // Step 6: Search for the value 36
      System.out.println("Search for 36: " + lab5Tree.search(36));

      // Step 7: Search for the value 37
      System.out.println("Search for 37: " + lab5Tree.search(37));

      // Step 8: Display the path from the root to 2
      System.out.println("Path from root to 2: " + lab5Tree.path(2));

      // Step 9: Display the path from the root to 34
      System.out.println("Path from root to 34: " + lab5Tree.path(34));
  }
}