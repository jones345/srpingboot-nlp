package nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class pipline {
   private static StanfordCoreNLP stanfordCoreNLP;
   private static String propertiesName = "tokenize";
   private static Properties properties;

   private pipline(){

   }

   static{
      properties = new Properties();
      properties.setProperty("annotators", propertiesName);
   }

   public static StanfordCoreNLP getPipeline(){
      if(stanfordCoreNLP == null){
         stanfordCoreNLP = new StanfordCoreNLP(properties);
      }
      return stanfordCoreNLP;
   }
}
