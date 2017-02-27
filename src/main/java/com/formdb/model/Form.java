package com.formdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Phani on 2/26/17.
 */

@Entity
@Table(name = "form")
public class Form {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "form_id")
        private int formId;

        //Tab1_Header
        @Column(name = "tab1_row1")
        private String tab1Row1;
        @Column(name = "tab1_row2")
        private String tab1Row2;
        @Column(name = "tab1_row3")
        private String tab1Row3;

        //Tab2_Header
        @Column(name = "tab2_row1")
        private String tab2Row1;
        @Column(name = "tab2_row2")
        private String tab2Row2;
        @Column(name = "tab2_row3")
        private String tab2Row3;
        @Column(name = "tab2_row4")
        private String tab2Row4;
        @Column(name = "tab2_row5")
        private String tab2Row5;
        @Column(name = "tab2_row6")
        private String tab2Row6;
        @Column(name = "tab2_row7")
        private String tab2Row7;
        @Column(name = "tab2_row8")
        private String tab2Row8;
        @Column(name = "tab2_row9")
        private String tab2Row9;
        @Column(name = "tab2_row10")
        private String tab2Row10;
        @Column(name = "tab2_row11")
        private String tab2Row11;
        @Column(name = "tab2_row12")
        private String tab2Row12;
        @Column(name = "tab2_row13")
        private String tab2Row13;
        @Column(name = "tab2_row14")
        private String tab2Row14;
        @Column(name = "tab2_row15")
        private String tab2Row15;
        @Column(name = "tab2_row16")
        private String tab2Row16;
        @Column(name = "tab2_row17")
        private String tab2Row17;
        @Column(name = "tab2_row18")
        private String tab2Row18;

        //Tab3_Header
        @Column(name = "tab3_row1")
        private String tab3Row1;
        @Column(name = "tab3_row2")
        private String tab3Row2;
        @Column(name = "tab3_row3")
        private String tab3Row3;
        @Column(name = "tab3_row4")
        private String tab3Row4;
        @Column(name = "tab3_row5")
        private String tab3Row5;
        @Column(name = "tab3_row6")
        private String tab3Row6;
        @Column(name = "tab3_row7")
        private String tab3Row7;
        @Column(name = "tab3_row8")
        private String tab3Row8;
        @Column(name = "tab3_row9")
        private String tab3Row9;
        @Column(name = "tab3_row10")
        private String tab3Row10;
        @Column(name = "tab3_row11")
        private String tab3Row11;
        @Column(name = "tab3_row12")
        private String tab3Row12;
        @Column(name = "tab3_row13")
        private String tab3Row13;
        @Column(name = "tab3_row14")
        private String tab3Row14;
        @Column(name = "tab3_row15")
        private String tab3Row15;
        @Column(name = "tab3_row16")
        private String tab3Row16;
        @Column(name = "tab3_row17")
        private String tab3Row17;
        @Column(name = "tab3_row18")
        private String tab3Row18;
        @Column(name = "tab3_row19")
        private String tab3Row19;

        public int getFormId() { return formId; }
        public void setFormId(int formId) { this.formId = formId; }

        //Tab1_Header
        public String getTab1Row1() { return tab1Row1; }
        public void setTab1Row1(String tab1Row1) { this.tab1Row1 = tab1Row1; }

        public String getTab1Row2() { return tab1Row2; }
        public void setTab1Row2(String tab1Row2) { this.tab1Row2 = tab1Row2; }

        public String getTab1Row3() { return tab1Row3; }
        public void setTab1Row3(String tab1Row3) { this.tab1Row3 = tab1Row3; }

        //Tab2_Header
        public String getTab2Row1() { return tab2Row1; }
        public void setTab2Row1(String tab2Row1) { this.tab2Row1 = tab2Row1; }

        public String getTab2Row2() { return tab2Row2; }
        public void setTab2Row2(String tab2Row2) { this.tab2Row2 = tab2Row2; }

        public String getTab2Row3() { return tab2Row3; }
        public void setTab2Row3(String tab2Row3) { this.tab2Row3 = tab2Row3; }

        public String getTab2Row4() { return tab2Row4; }
        public void setTab2Row4(String tab2Row4) { this.tab2Row4 = tab2Row4; }

        public String getTab2Row5() { return tab2Row5; }
        public void setTab2Row5(String tab2Row5) { this.tab2Row5 = tab2Row5; }

        public String getTab2Row6() { return tab2Row6; }
        public void setTab2Row6(String tab2Row6) { this.tab2Row6 = tab2Row6; }

        public String getTab2Row7() { return tab2Row7; }
        public void setTab2Row7(String tab2Row7) { this.tab2Row7 = tab2Row7; }

        public String getTab2Row8() { return tab2Row8; }
        public void setTab2Row8(String tab2Row8) { this.tab2Row8 = tab2Row8; }

        public String getTab2Row9() { return tab2Row9; }
        public void setTab2Row9(String tab2Row9) { this.tab2Row9 = tab2Row9; }

        public String getTab2Row10() { return tab2Row10; }
        public void setTab2Row10(String tab2Row10) { this.tab2Row10 = tab2Row10; }

        public String getTab2Row11() { return tab2Row11; }
        public void setTab2Row11(String tab2Row11) { this.tab2Row11 = tab2Row11; }

        public String getTab2Row12() { return tab2Row12; }
        public void setTab2Row12(String tab2Row12) { this.tab2Row12 = tab2Row12; }

        public String getTab2Row13() { return tab2Row13; }
        public void setTab2Row13(String tab2Row13) { this.tab2Row13 = tab2Row13; }

        public String getTab2Row14() { return tab2Row14; }
        public void setTab2Row14(String tab2Row14) { this.tab2Row14 = tab2Row14; }

        public String getTab2Row15() { return tab2Row15 }
        public void setTab2Row15(String tab2Row15) { this.tab2Row15 = tab2Row15; }

        public String getTab2Row16() { return tab2Row16; }
        public void setTab2Row16(String tab2Row16) { this.tab2Row16 = tab2Row16; }

        public String getTab2Row17() { return tab2Row17; }
        public void setTab2Row17(String tab2Row17) { this.tab2Row17 = tab2Row17; }

        public String getTab2Row18() { return tab2Row18; }
        public void setTab2Row18(String tab2Row18) { this.tab2Row18 = tab2Row18; }

        //Tab3_Header
        public String getTab3Row1() { return tab3Row1; }
        public void setTab3Row1(String tab3Row1) { this.tab3Row1 = tab3Row1; }

        public String getTab3Row2() { return tab3Row2; }
        public void setTab3Row2(String tab3Row2) { this.tab3Row2 = tab3Row2; }

        public String getTab3Row3() { return tab3Row3; }
        public void setTab3Row3(String tab3Row3) { this.tab3Row3 = tab3Row3; }

        public String getTab3Row4() { return tab3Row4; }
        public void setTab3Row4(String tab3Row4) { this.tab3Row4 = tab3Row4; }

        public String getTab3Row5() { return tab3Row5; }
        public void setTab3Row5(String tab3Row5) { this.tab3Row5 = tab3Row5; }

        public String getTab3Row6() { return tab3Row6; }
        public void setTab3Row6(String tab3Row6) { this.tab3Row6 = tab3Row6; }

        public String getTab3Row7() { return tab3Row7; }
        public void setTab3Row7(String tab3Row7) { this.tab3Row7 = tab3Row7; }

        public String getTab3Row8() { return tab3Row8; }
        public void setTab3Row8(String tab3Row8) { this.tab3Row8 = tab3Row8; }

        public String getTab3Row9(){ return tab3Row9; }
        public void setTab3Row9(String tab3Row9) { this.tab3Row9 = tab3Row9; }

        public String getTab3Row10() { return tab3Row10; }
        public void setTab3Row10(String tab3Row10) { this.tab3Row10 = tab3Row10; }

        public String getTab3Row11() { return tab3Row11; }
        public void setTab3Row11(String tab3Row11) { this.tab3Row11 = tab3Row11; }

        public String getTab3Row12() { return tab3Row12; }
        public void setTab3Row12(String tab3Row12) { this.tab3Row12 = tab3Row12; }

        public String getTab3Row13() { return tab3Row13; }
        public void setTab3Row13(String tab3Row13) { this.tab3Row13 = tab3Row13; }

        public String getTab3Row14() { return tab3Row14; }
        public void setTab3Row14(String tab3Row14) { this.tab3Row14 = tab3Row14; }

        public String getTab3Row15() { return tab3Row15; }
        public void setTab3Row15(String tab3Row15) { this.tab3Row15 = tab3Row15; }

        public String getTab3Row16() { return tab3Row16; }
        public void setTab3Row16(String tab3Row16) { this.tab3Row16 = tab3Row16; }

        public String getTab3Row17() { return tab3Row17; }
        public void setTab3Row17(String tab3Row17) { this.tab3Row17 = tab3Row17; }

        public String getTab3Row18() { return tab3Row18; }
        public void setTab3Row18(String tab3Row18) { this.tab3Row18 = tab3Row18; }

        public String getTab3Row19() { return tab3Row19; }
        public void setTab3Row19(String tab3Row19) { this.tab3Row19 = tab3Row19; }


}
