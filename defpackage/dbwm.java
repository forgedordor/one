package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwm {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;

    private dbwm() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbwm.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "Handshake");
                fbrhVarA.b();
                dbxa dbxaVar = dbxa.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbxaVar);
                fbrhVarA.b = new fcrh(dbxc.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk b() {
        fbrk fbrkVarA;
        fbrk fbrkVar = c;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbwm.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "RestoreCustomD2DItem");
                fbrhVarA.b();
                dbxr dbxrVar = dbxr.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbxrVar);
                fbrhVarA.b = new fcrh(dbxt.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
