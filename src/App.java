import java.lang.reflect.Field;
import java.text.Annotation;


public class App {

    public static void main(String[] args) {

        System.out.println(" *** Anotação ***");
        ClasseComAnotacao clazzz = new ClasseComAnotacao();


        for (Field field : clazzz.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Tabela.class)){
                Tabela ano = field.getAnnotation(Tabela.class);
                System.out.println(" nome: " + ano.toString());
                System.out.println(" valor de anotação: " + ano.value());

            }

        }










        }


    }
