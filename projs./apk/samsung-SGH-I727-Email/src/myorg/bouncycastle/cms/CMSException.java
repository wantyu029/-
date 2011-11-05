package myorg.bouncycastle.cms;


public class CMSException extends Exception {

   Exception e;


   public CMSException(String var1) {
      super(var1);
   }

   public CMSException(String var1, Exception var2) {
      super(var1);
      this.e = var2;
   }

   public Throwable getCause() {
      return this.e;
   }

   public Exception getUnderlyingException() {
      return this.e;
   }
}
