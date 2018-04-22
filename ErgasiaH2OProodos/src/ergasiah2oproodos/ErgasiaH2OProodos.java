/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasiah2oproodos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author Apo P
 */
public class ErgasiaH2OProodos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Rotate rotate = new Rotate();
        rotate.setAngle(20);
        rotate.setPivotX(150);
        rotate.setPivotY(230);
        
        Rotate rotate2 = new Rotate();
        rotate2.setAngle(5);
        rotate2.setPivotX(250);
        rotate2.setPivotY(250);
        
        Sphere H = new Sphere();
        H.setRadius(100.0);
        H.setTranslateX(500);
        H.setTranslateY(400);
        H.setTranslateZ(500);
        H.toFront();
        
        Cylinder con1 = new Cylinder();
        con1.setHeight(120);
        con1.setRadius(35.0);
        con1.setTranslateX(470);
        con1.setTranslateY(290);
        con1.setTranslateZ(180);
        con1.getTransforms().addAll(rotate);
        
        Sphere O1 = new Sphere();
        O1.setRadius(50.0);
        O1.setTranslateX(585);
        O1.setTranslateY(170);
        O1.setTranslateZ(500);
        
        Cylinder con2 = new Cylinder();
        con2.setRadius(35.0);
        con2.setHeight(120);
        con2.setTranslateX(470);
        con2.setTranslateY(580);
        con2.setTranslateZ(180);
        con2.getTransforms().addAll(rotate2);
        
        Sphere O2 = new Sphere();
        O2.setRadius(50.0);
        O2.setTranslateX(487);
        O2.setTranslateY(650);
        O2.setTranslateZ(500);
        
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseColor(Color.RED);
        H.setMaterial(mat);
        PhongMaterial mat2 = new PhongMaterial();
        mat2.setDiffuseColor(Color.GREY);
        O1.setMaterial(mat2);
        O2.setMaterial(mat2);
        PhongMaterial mat3 = new PhongMaterial();
        mat3.setDiffuseColor(Color.WHITE);
        con1.setMaterial(mat3);
        con2.setMaterial(mat3);
        
        Group atom = new Group(H,con1,O1,con2,O2);
        
        Scene scene = new Scene(atom, 300, 250);
        
        primaryStage.setTitle("H2O");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
