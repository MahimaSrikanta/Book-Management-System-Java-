/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author Mahima
 */
public class BookRecordMaintenance extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form BookRecordMaintenance
     */
    
    //Variables Declaration
    int indexValue=0;
    BookStore db = new BookStore();
    boolean newBook = false;   // while adding new Book, set as true
  
    
    public BookRecordMaintenance() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bookCodeText = new javax.swing.JTextField();
        bookCodeLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        bookTitleText = new javax.swing.JTextField();
        bookPriceLabel = new javax.swing.JLabel();
        bookPriceText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Maintenance");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bookCodeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookCodeTextFocusGained(evt);
            }
        });
        bookCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCodeTextActionPerformed(evt);
            }
        });
        bookCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookCodeTextKeyPressed(evt);
            }
        });

        bookCodeLabel.setText("Code:");

        bookTitleLabel.setText("Title:");

        bookTitleText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookTitleTextFocusGained(evt);
            }
        });
        bookTitleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTitleTextKeyPressed(evt);
            }
        });

        bookPriceLabel.setText("Price:");

        bookPriceText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookPriceTextFocusGained(evt);
            }
        });
        bookPriceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookPriceTextKeyPressed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        firstButton.setText("FIRST");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        lastButton.setText("LAST");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("PREV");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookCodeLabel)
                            .addComponent(bookTitleLabel)
                            .addComponent(bookPriceLabel))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addComponent(firstButton))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton)
                            .addComponent(lastButton))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton)
                            .addComponent(nextButton))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prevButton)
                            .addComponent(exitButton))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCodeLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTitleLabel)
                    .addComponent(bookTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookPriceLabel)
                    .addComponent(bookPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstButton)
                    .addComponent(lastButton)
                    .addComponent(nextButton)
                    .addComponent(prevButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookCodeTextActionPerformed

    private void bookCodeTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookCodeTextFocusGained
      
    }//GEN-LAST:event_bookCodeTextFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //When Form is shown, all buttons except "UPDATE" buttons are enabled
        enablebuttons(true);
        
        indexValue = db.firstBook();
        
        //When the Form is shown, the first data is displayed
        bookCodeText.setText(String.valueOf (db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
    }//GEN-LAST:event_formComponentShown

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
       
        //Display the first item of the list
        indexValue = db.firstBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
       
        
    }//GEN-LAST:event_firstButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        //Display the last item of the list
        indexValue = db.lastBook();
        
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        
       
    }//GEN-LAST:event_lastButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
               
       //Display the next Button
        indexValue = db.nextBook();
            
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        
      
        
       
    }//GEN-LAST:event_nextButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       //Clears all the text fields and enables update button
        enablebuttons(false);
        bookCodeText.setText(" ");
        bookTitleText.setText(" ");
        bookPriceText.setText(" ");
        
        //New book record needs to be entered
        newBook= true;
        
       // To add the book at the end of the Bookrecord list
        db.addNewBook();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        //Checks if this action is for adding new book and adds new book
        if(newBook){
        //Writes the new Book into text file    
        writeCSVFile(new String[]{bookCodeText.getText(),bookTitleText.getText(),bookPriceText.getText()});
        //add the new book to book object
        db.addBook(new Book(bookCodeText.getText(),bookTitleText.getText(),Double.parseDouble(bookPriceText.getText()) ));
        newBook = false;
       
        }
        //If this action is for updating the existing file, updates the existing file
        else{
            System.out.println("Hi");
            String bookid = bookCodeText.getText();
            for(int i =0; i <db.book1.size();i++){ 
                if (bookid.equals(db.book1.get(i).getCode()) ){
                    db.book1.get(i).setTitle(bookTitleText.getText());
                    db.book1.get(i).setPrice(Double.parseDouble(bookPriceText.getText()));
                }
            }
         //Erases the exixting file and rewrites the file with updated data
            eraseCSVFile();
            for(int i =0; i <db.book1.size();i++){
                writeCSVFile(new String[]{db.book1.get(i).getCode(), db.book1.get(i).getTitle(),String.valueOf(db.book1.get(i).getPrice())});
          
            }
        }
               
        
        //Display the last item of the list
        indexValue = db.lastBook();
        
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        enablebuttons(true);
        
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //Deletes the current book  record
       indexValue = db.deleteBook();
      
        //clears the textfields
        bookCodeText.setText(" ");
        bookTitleText.setText(" ");
        bookPriceText.setText(" ");
        
        //Displays the next record
        if (indexValue != db.lastBook()){
            indexValue = db.firstBook();
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        }
        else{
        
        bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
        bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
        bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        }
        //Erases the existing file and rewrites it 
        eraseCSVFile();
        for(int i =0; i <db.book1.size();i++){
            writeCSVFile(new String[]{db.book1.get(i).getCode(), db.book1.get(i).getTitle(),String.valueOf(db.book1.get(i).getPrice())});
        }
     
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void bookTitleTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookTitleTextFocusGained
        //UPDATE button is enabled
        enablebuttons(false);
    }//GEN-LAST:event_bookTitleTextFocusGained

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       //Exits from the program
        System.exit(0);
 
    }//GEN-LAST:event_exitButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
       //Shows the previous books details
      
       indexValue = db.prevBook();
       
       bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
       bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
       bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
        System.out.println(System.getProperty("user.dir"));
        
       
    }//GEN-LAST:event_prevButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formWindowClosed

    private void bookCodeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookCodeTextKeyPressed

    }//GEN-LAST:event_bookCodeTextKeyPressed

    private void bookTitleTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTitleTextKeyPressed
        //Escape Sequence key pressed
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE){
            enablebuttons(true);
            indexValue = db.nextBook();
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
            bookCodeText.requestFocus();
        }
    }//GEN-LAST:event_bookTitleTextKeyPressed

    private void bookPriceTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookPriceTextKeyPressed
        //Escape Sequence key pressed
        
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE){
            enablebuttons(true);
            indexValue = db.nextBook();
            bookCodeText.setText(String.valueOf(db.book1.get(indexValue).getCode()));
            bookTitleText.setText(String.valueOf(db.book1.get(indexValue).getTitle()));
            bookPriceText.setText(String.valueOf(db.book1.get(indexValue).getPrice()));
            bookCodeText.requestFocus();
        }
    }//GEN-LAST:event_bookPriceTextKeyPressed

    private void bookPriceTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookPriceTextFocusGained
        // To update the new Book
        enablebuttons(false);
    }//GEN-LAST:event_bookPriceTextFocusGained
    
    //Button visbility control function 
    public void enablebuttons(boolean flag){
        boolean flag2 = false;
        if (!flag)
            flag2 = true;
        updateButton.setEnabled(flag2);
        addButton.setEnabled(flag);
        deleteButton.setEnabled(flag);
        lastButton.setEnabled(flag);
        nextButton.setEnabled(flag);
        firstButton.setEnabled(flag);
        prevButton.setEnabled(flag);
        
        
        
       
    }                         
    /**
     * @param args the command line arguments
     */
  
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookRecordMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRecordMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRecordMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRecordMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
        //Calling the read from text file funtion 
        BookRecordMaintenance bookRecordMaintenance = new BookRecordMaintenance();
        bookRecordMaintenance.parseCSVFile();
           

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bookRecordMaintenance.setVisible(true);
                
            }
        });
    }
    
    //Method to read text file
    public String[] parseCSVFile() throws IOException{
        //Declaring the local variables
        String lines ="";
        String array[] = null;
        String filePath = System.getProperty("user.dir");
        try {
            //System.out.println(System.getProperty("user.dir"));
            FileReader fr = new FileReader(filePath + "\\BookRecord.txt");
            BufferedReader br = new BufferedReader(fr);
           //Reading whole file and spliting it by "," and passing it to Book record Iterator method 
            while((lines= br.readLine())!= null){
                array =lines.split(",");
                db.addBook(new Book (array[0],array[1],Double.parseDouble(array[2])));
               
            }
            
         br.close();
        } catch (FileNotFoundException ex) {
             System.out.println("File Not Found");;
        }
        return array;
      
        
   }
    //Method to write into the text File
       public void writeCSVFile(String[] bookDetails1){
        try {
        String[] books = bookDetails1;
        String content = " ";
        String filePath = System.getProperty("user.dir");
        FileWriter wr = new FileWriter((filePath + "\\BookRecord.txt"),true);
        BufferedWriter writer = new BufferedWriter(wr);
        for(String item: books){
            content +=(item+",");
       }
        content = content.substring(1, content.length());
              
        writer.write(content);
        writer.newLine();
        writer.flush();
        writer.close();
        }catch (Exception e) {
        System.out.println("Problem reading file.");
        }
    }
  
public void eraseCSVFile(){
        try {
        String filePath = System.getProperty("user.dir");       
        FileOutputStream fileOut1 = new FileOutputStream((filePath + "\\BookRecord.txt"));
        fileOut1.close();
        }catch (Exception e) {
        System.out.println("Problem reading file.");
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bookCodeLabel;
    private javax.swing.JTextField bookCodeText;
    private javax.swing.JLabel bookPriceLabel;
    private javax.swing.JTextField bookPriceText;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JTextField bookTitleText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton lastButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

//Book Class with code, title and Price
  class Book  {
    
    private String code;
    private String title;
    private double price;
    
    public Book(String code, String title, double price){
        this.code = code;
        this.title = title;
        this.price = price;
            
    }
    public String getCode(){
        return this.code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
      
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
         this.title = title;
         
     }  
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price ){
        this.price = price;
    }
  }

//Book Database store
class BookStore{
   List <Book> book1 = new ArrayList<Book>();
   ListIterator<Book> iterator = book1.listIterator();
   int indexValue =0;

    public void  addBook(Book book){
             
        iterator.add(book);
        
    }
    
    //Method to ADD new Book
    public void addNewBook(){
        while (iterator.hasNext()){
            iterator.next();
        }
    }
    //Method to Add First Book
    public int firstBook(){
          while(iterator.hasPrevious()){
              iterator.previous();
         }
         int firstIndex = iterator.nextIndex();
         return (firstIndex);
    }
    
    //Method to get Last Book
    public int lastBook(){
        while(iterator.hasNext()){
            iterator.next();
        }
       int lastIndex =  iterator.previousIndex();
       iterator.previous();
       return(lastIndex );
    }
    
    //Method for next Book
    public int nextBook(){
        while(iterator.hasNext()&& (iterator.nextIndex()< book1.size()-1)){
            iterator.next();
            
            return (iterator.nextIndex());
       }
      return (firstBook());     
     }  
    
    //Method for Previous Book
    public int prevBook(){
        int prevIndex = iterator.previousIndex();
        while(iterator.hasPrevious()&& (prevIndex> 0)){
            iterator.previous();
            
            return (prevIndex);
        }
        if (prevIndex == 0){
            return(firstBook());
        }

        return (lastBook());
    }
    
    //Method for Book deletion 
    public int  deleteBook(){
        
      if(!iterator.hasPrevious()){
          iterator.remove();  
        }
     
    
        else{
          iterator.next();
          iterator.remove();
      }
            
        return iterator.nextIndex();
    
    }
    
    //Method for updating the book
    public int updateBook(){
        return iterator.nextIndex();
    }
    
    //Get the next List Iterator index
    public int nextIndex(){
        iterator.next();
        return(iterator.nextIndex());
    }
    
       
}
