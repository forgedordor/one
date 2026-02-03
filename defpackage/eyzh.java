package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyzh {
    public static volatile fbrk a;
    public static volatile fbrk b;
    public static volatile fbrk c;
    public static volatile fbrk d;
    public static volatile fbrk e;
    public static volatile fbrk f;
    public static volatile fbrk g;
    public static volatile fbrk h;
    public static volatile fbrk i;
    public static volatile fbrk j;
    public static volatile fbrk k;
    public static volatile fbrk l;
    public static volatile fbrk m;
    private static volatile fbrk n;

    private eyzh() {
    }

    public static eyzg a(fbnd fbndVar) {
        return (eyzg) eyzg.h(new eyzf(), fbndVar);
    }

    public static fbrk b() {
        fbrk fbrkVarA;
        fbrk fbrkVar = n;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eyzh.class) {
            fbrkVarA = n;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Registration", "LookupRegistered");
                fbrhVarA.b();
                ezjt ezjtVar = ezjt.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezjtVar);
                fbrhVarA.b = new fcrh(ezjv.a);
                fbrkVarA = fbrhVarA.a();
                n = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
