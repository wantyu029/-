package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.AbstractFileFilter;

public class RegexFileFilter extends AbstractFileFilter implements Serializable {

   private final Pattern pattern;


   public RegexFileFilter(String var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Pattern is missing");
      } else {
         Pattern var2 = Pattern.compile(var1);
         this.pattern = var2;
      }
   }

   public RegexFileFilter(String var1, int var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("Pattern is missing");
      } else {
         Pattern var3 = Pattern.compile(var1, var2);
         this.pattern = var3;
      }
   }

   public RegexFileFilter(String var1, IOCase var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("Pattern is missing");
      } else {
         byte var3 = 0;
         if(var2 != null && !var2.isCaseSensitive()) {
            var3 = 2;
         }

         Pattern var4 = Pattern.compile(var1, var3);
         this.pattern = var4;
      }
   }

   public RegexFileFilter(Pattern var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Pattern is missing");
      } else {
         this.pattern = var1;
      }
   }

   public boolean accept(File var1, String var2) {
      return this.pattern.matcher(var2).matches();
   }
}
