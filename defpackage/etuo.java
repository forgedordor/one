package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etuo {
    public static volatile fbrk a;
    public static volatile fbrk b;
    public static volatile fbrk c;
    public static volatile fbrk d;
    public static volatile fbrk e;
    public static volatile fbrk f;
    public static volatile fbrk g;
    public static volatile fbrk h;
    public static volatile fbrk i;
    private static volatile fbrk j;

    private etuo() {
    }

    public static etun a(fbnd fbndVar) {
        return (etun) etun.h(new etum(), fbndVar);
    }

    public static fbrk b() {
        fbrk fbrkVarA;
        fbrk fbrkVar = j;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (etuo.class) {
            fbrkVarA = j;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoState");
                fbrhVarA.b();
                etvg etvgVar = etvg.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(etvgVar);
                fbrhVarA.b = new fcrh(etvm.a);
                fbrkVarA = fbrhVarA.a();
                j = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
