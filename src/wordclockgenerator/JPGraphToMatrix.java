/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordclockgenerator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.apache.commons.collections15.map.FastHashMap;

/**
 *
 * @author patrick
 */
public class JPGraphToMatrix extends javax.swing.JPanel {

    /**
     * Creates new form jPSolutions
     */
    public JPGraphToMatrix() {
        initComponents();
        jCBsolutions.setModel(new DefaultComboBoxModel());
        jCBtime.setModel(new DefaultComboBoxModel());
        jTresult.setModel(new DefaultTableModel());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCBsolutions = new javax.swing.JComboBox();
        jLInfos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBfill = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCBtime = new javax.swing.JComboBox();
        jBExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTresult = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer,int row,int column)
            {
                Component comp=super.prepareRenderer(renderer,row, column);
                comp.setForeground(getColor(row,column));
                return comp;

            }
        };

        jBUpdate.setText("Update");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Solutions:");

        jCBsolutions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBsolutionsActionPerformed(evt);
            }
        });

        jLInfos.setText("                               ");

        jLabel3.setText("Fill Letters:");

        jCBfill.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A-Z", "a-z", "A-Z,a-z", "A-Z,a-z,0-9" }));
        jCBfill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfillActionPerformed(evt);
            }
        });

        jLabel2.setText("Mark Time:");

        jCBtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBtimeActionPerformed(evt);
            }
        });

        jBExport.setText("Export");
        jBExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExportActionPerformed(evt);
            }
        });

        jTresult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dsfs", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTresult.setEnabled(false);
        jScrollPane1.setViewportView(jTresult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBUpdate)
                            .addComponent(jBExport))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBsolutions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLInfos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jCBfill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 682, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBUpdate)
                    .addComponent(jLabel1)
                    .addComponent(jCBsolutions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLInfos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBExport)
                    .addComponent(jLabel3)
                    .addComponent(jCBfill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jCBtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private JPWordsToGraph.Graph graph=null;
    private TimeText[] ltt=null;
    
    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed
        if(JPWordsToGraph.getSolutions()!=null){
            //There are solutions:
            graph= JPWordsToGraph.getGraph();
            int s=jCBsolutions.getSelectedIndex();
            jCBsolutions.setModel(new DefaultComboBoxModel(JPWordsToGraph.getSolutions()));
            jCBsolutions.setSelectedIndex(s==-1?0:s);
            s=jCBtime.getSelectedIndex();
            ltt=JPWordsToGraph.getTimeTextList();
            jCBtime.setModel(new DefaultComboBoxModel(ltt));
            jCBtime.setSelectedIndex(s==-1?0:s);
        }
        updateTabel();
    }//GEN-LAST:event_jBUpdateActionPerformed

    private void jCBsolutionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBsolutionsActionPerformed
        updateTabel();
    }//GEN-LAST:event_jCBsolutionsActionPerformed

    private void jCBtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBtimeActionPerformed
        jTresult.repaint();
    }//GEN-LAST:event_jCBtimeActionPerformed

    private Character[] getFillLetters(){
        ArrayList<Character> r= new ArrayList<>();
        int i=jCBfill.getSelectedIndex();
        if(i==-1 || i==0 || i==2 || i==3) {
            r.addAll(Arrays.asList(new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}));
        }
        if(i==1 || i==2 || i==3) {
            r.addAll(Arrays.asList(new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}));
        }
        if(i==3) {
            r.addAll(Arrays.asList(new Character[]{'0','1','2','4','5','6','7','8','9'}));
        }
        
        return r.toArray(new Character[0]);
                
    }
    
    private void jCBfillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfillActionPerformed
        updateTabel();
    }//GEN-LAST:event_jCBfillActionPerformed

    private void jBExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExportActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        String ln=java.security.AccessController.doPrivileged(new sun.security.action.GetPropertyAction("line.separator"));
        try (Writer file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fc.getSelectedFile()), "utf-8"))) {
            int lh=resultmatrix.length;
            int lw=resultmatrix[0].length;
            //Print Table:
            file.write("//Text Matrix:"+ln);
            for(int h=0;h<lh;h++){
                file.write("//   ");
                for(int w=0;w<lw;w++){
                    file.write(resultmatrix[h][w]);
                }
                file.write(ln);                
            }
            file.write(ln); //End of sequence make                
            file.write(ln); //End of sequence make                
            
            //Generate List of all Words:
            file.write("//Word [0]=Startpos [1]=lengh of LED index"+ln);
            HashMap<TimeText,ArrayList<Integer>> words= new HashMap<>();
            int cwords=0;
            for(JPWordsToGraph.Node n : graph.nodes){
                //Find all subwords
                HashMap<String,ArrayList<TimeText>> subwords = new HashMap<>();
                
                for(Map.Entry<TimeText,String> e: n.mtt.entrySet()){
                    if(!subwords.containsKey(e.getValue())){
                        subwords.put(e.getValue(), new ArrayList<>());
                    }
                    subwords.get(e.getValue()).add(e.getKey());
                }
                
                int h=resultnode.get(n).x;
                int w=resultnode.get(n).y;
                        
                for(Map.Entry<String,ArrayList<TimeText>> e : subwords.entrySet()){
                    for(TimeText tt : e.getValue()){
                        if(!words.containsKey(tt)){
                            words.put(tt, new ArrayList<>());
                        }
                        words.get(tt).add(cwords);
                    }
                    file.write("//Word: \""+e.getKey()+"\""+ln);
                    file.write("const uint16_t word_"+cwords+"[] PROGMEM = { ");
                    file.write((lw*h+w+n.text.indexOf(e.getKey()))+", ");
                    file.write(e.getKey().length()+" };"+ln);
                    
                    cwords++;                    
                }
            }

            if(cwords-1>(256-2)){
                file.write("ERROR: More then 254 different words! Cannot generate data structure!"+ln);
                return;
            }
            

            //Generate Words(Nods) Table:
            file.write("//Word Table: "+ln);
            file.write("const uint16_t* const word_table[] PROGMEM = { ");
            for(int i=0;i<cwords;i++){
                String s="word_"+i;
                if(i<(cwords-1)) {
                    s+=", ";
                }
                file.write(s);
            }
            file.write("};"+ln); //End of sequence make                
            
            
            
            //Find all Different patterns:
            HashMap<String,ArrayList<TimeText>> patternttmap = new HashMap<>();
            HashMap<TimeText,String> ttpatternmap = new HashMap<>();
            for(TimeText tt: ltt){
                char[] pattern= new char[cwords];
                Arrays.fill(pattern, '0');
                //Generate pattern:
                for(Integer i : words.get(tt)){
                    pattern[i]='1';
                }
                if(!patternttmap.containsKey(String.valueOf(pattern))){
                    patternttmap.put(String.valueOf(pattern), new ArrayList<>());
                }
                patternttmap.get(String.valueOf(pattern)).add(tt);
                ttpatternmap.put(tt, String.valueOf(pattern));
            }
            String[] petternlist = patternttmap.keySet().toArray(new String[0]);
            
            //Generate word list for all Patterns:
            for(int i=0;i<petternlist.length;i++){
                file.write("//Pattern: \"");
                file.write(patternttmap.get(petternlist[i]).get(0).getText());
                file.write("\" ");
                for(TimeText tt : patternttmap.get(petternlist[i])){
                    file.write(tt.getTimeString()+" ");                
                }
                file.write(""+ln);
                file.write("const uint8_t pattern_"+i+"[] PROGMEM = { ");
                for(int j=0;j<graph.nodes.size();j++){
                    if(petternlist[i].charAt(j)=='1'){
                        file.write(j+", ");
                    }
                }
                file.write("0xFF };"+ln); //End of sequence make                
            }
            //Generate main Time table:
            file.write("//Main Time Table: "+ln);
            TimeText[][] mtt= new TimeText[24][60];
            for(TimeText tt: ltt){
                mtt[tt.getH()][tt.getM()]=tt;
            }
            HashMap<String,Integer> patterntoIndex = new FastHashMap<>();
            for(int i=0;i<petternlist.length;i++){
                patterntoIndex.put(petternlist[i], i);
            }            
            file.write("const uint8_t* const time_table[24][60] PROGMEM = {"+ln);
            for(int h=0;h<24;h++){
                file.write("   {");                
                for(int m=0;m<60;m++){
                    file.write("pattern_"+patterntoIndex.get(ttpatternmap.get(mtt[h][m])));                                
                    if(m<59){
                        file.write(", ");
                    }
                }
                file.write("}");                
                if(h<23){
                    file.write(", ");
                }
                file.write(ln);                
            }
            file.write("};"+ln);

            file.write("const uint16_t ledindexmap["+(lh*lw)+"] PROGMEM = {");
            for(int i=0;i<lh*lw;i++){
                if(i%lw==0){
                    file.write("   "+ln);
                }
                String s=""+i;
                while (s.length()<4){
                    s=" "+s;
                }
                file.write(s+" /* "+resultmatrix[i/lw][i%lw]+" */");                
                if(i<(lh*lw-1))
                {
                    file.write(", ");            
                }
            }
            file.write(ln+"};"+ln);
            
            file.write(String.join(ln, 
                "    ",
                "boolean ledstate["+(lh*lw)+"];",
                "",
                "void calcleadstate(uint8_t h, uint8_t m){",
                "  for(uint16_t i=0;i<"+(lh*lw)+";i++){",
                "    ledstate[i]=false;",
                "  }",
                "  h=h%24;",
                "  m=m%60;",
                "  //Read pattern Pointer",
                "  uint8_t* p_pattern = (uint8_t*) pgm_read_word(&(time_table[h][m]));",
                "  for(uint16_t i=0;;i++) {",
                "    uint8_t pvalue=pgm_read_byte(&(p_pattern[i]));",
                "    if(pvalue==0xFF){",
                "      break;    ",
                "    }",
                "    //Read word Pointer",
                "    uint16_t* p_word = (uint16_t*) pgm_read_word(&(word_table[pvalue]));",
                "    uint16_t leds_start= pgm_read_word(&(p_word[0]));",
                "    uint16_t leds_length= pgm_read_word(&(p_word[1]));",
                "    for(uint16_t j=0;j<leds_length;j++){",
                "      //Map Led Index  ",
                "      ledstate[pgm_read_word(&(ledindexmap[leds_start+j]))]=true;  ",
                "    }",
                "  }",
                "}",              
                ""));
            

        } catch (Exception ex) {
            Logger.getLogger(JPGraphToMatrix.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExport;
    private javax.swing.JButton jBUpdate;
    private javax.swing.JComboBox jCBfill;
    private javax.swing.JComboBox jCBsolutions;
    private javax.swing.JComboBox jCBtime;
    private javax.swing.JLabel jLInfos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTresult;
    // End of variables declaration//GEN-END:variables

    HashMap<JPWordsToGraph.Node, Point> resultnode = null;
    ArrayList<TimeText>[][] resulttt=null;
    Character[][] resultmatrix=null;
    private Color getColor(int row, int column){
        Color c= Color.BLACK;
        try{
            if(resulttt[row][column].contains(jCBtime.getSelectedItem())){
                c=Color.RED;
            }
        }
        catch(Exception ex){}
        return c;
    }
    
    private void updateTabel() {
        Random rand= new Random();
        if(jCBsolutions.getSelectedItem()!=null){
            JPWordsToGraph.Solution s= (JPWordsToGraph.Solution)jCBsolutions.getSelectedItem();
            s.debugPrint();
            Character[] fillLetters= getFillLetters();

            int ntl=0;
            for(JPWordsToGraph.Node n : graph.nodes){
                ntl+=n.text.length();
            }
            
            DecimalFormat df = new DecimalFormat("#.00"); 
            String info="Total Cells: "+(s.w*s.h);
            info+=" Unused Cells: "+(s.w*s.h-ntl);
            info+=" Usage: "+df.format((double)ntl/(s.w*s.h)*100.0)+"%";
            jLInfos.setText(info);
            
            Character[][] charmatrix= new Character[s.h][s.w];
            ArrayList<TimeText>[][] ttmatrix= new ArrayList[s.h][s.w];
            for(int h=0;h<s.h;h++){
                for(int w=0;w<s.w;w++){
                    ttmatrix[h][w]= new ArrayList<>();
                }
            }
            HashMap<JPWordsToGraph.Node,Point> nodematrix= new HashMap<>();
            for(int h=0;h<s.h;h++){
                //Calc length
                int length=0;
                int gaps=1;
                for(int i=0;i<s.list[h].size();i++){
                    length+=s.list[h].get(i).text.length()-s.overlap[h].get(i);                    
                    if(s.overlap[h].get(i)<=0){
                        gaps++;
                    }
                }
            
                int randspaces=s.w-length;
                float prob= (float)randspaces/(float)(gaps);
                int staticspaces = (int)Math.floor(prob);
                randspaces=randspaces-staticspaces*(s.list[h].size()+1);
                prob=prob-staticspaces;
                
                int w=0;
                for(int i=0;i<s.list[h].size();i++){
                    if(s.overlap[h].get(i)<=0){
                        int nspaces=staticspaces;
                        if(s.overlap[h].get(i)==-1){
                            nspaces++;
                        }
                        if(rand.nextDouble()<prob && randspaces>0){
                            randspaces--;
                            nspaces++;
                        }
                        for(int j=0;j<nspaces;j++){
                            charmatrix[h][w]=fillLetters[rand.nextInt(fillLetters.length)];
                            w++;
                        }
                    }
                    else{
                        w-=s.overlap[h].get(i); //Words overlap!
                    }
                    //Generate TimeText Char index map 
                    ArrayList<TimeText>[] ttcharmap= new ArrayList[s.list[h].get(i).text.length()];
                    for(int j =0;j<s.list[h].get(i).text.length();j++){
                        ttcharmap[j]= new ArrayList<>();
                    }
                    for(Map.Entry<TimeText,String> e: s.list[h].get(i).mtt.entrySet()){
                        int pos=s.list[h].get(i).text.indexOf(e.getValue());
                        for(int j=pos;j<pos+e.getValue().length();j++){
                            ttcharmap[j].add(e.getKey());
                        }
                    }
                    nodematrix.put(s.list[h].get(i), new Point(h, w));
                    
                    for(int j=0;j<s.list[h].get(i).text.length();j++){
                        charmatrix[h][w]=s.list[h].get(i).text.charAt(j);
                        ttmatrix[h][w].addAll(ttcharmap[j]);
                        w++;
                    }
                }
                for(;w<s.w;w++){
                    charmatrix[h][w]=fillLetters[rand.nextInt(fillLetters.length)];
                }
                
            }
            String[] title=new String[s.w];
            Arrays.fill(title, " ");
            jTresult.setModel(new DefaultTableModel(charmatrix,title));  
            jTresult.getTableHeader().setUI(null);
            DefaultTableCellRenderer renderer= new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
            for(int i=0;i<s.w;i++){
                jTresult.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                jTresult.getColumnModel().getColumn(i).setPreferredWidth(50);
                jTresult.getColumnModel().getColumn(i).setCellRenderer(renderer);
                jTresult.setRowHeight(50);
            }
            resultmatrix=charmatrix;
            resultnode=nodematrix;
            resulttt=ttmatrix;
        }
    }
}
