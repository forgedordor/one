package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbct {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;
    private static volatile fbrk d;

    private dbct() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbct.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.apps.restore.osmigration.systemappapi.TargetService", "Handshake");
                fbrhVarA.b();
                dbco dbcoVar = dbco.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbcoVar);
                fbrhVarA.b = new fcrh(dbcq.a);
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
        synchronized (dbct.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.apps.restore.osmigration.systemappapi.TargetService", "ImportItem");
                fbrhVarA.b();
                dbce dbceVar = dbce.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbceVar);
                fbrhVarA.b = new fcrh(dbcg.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk c() {
        fbrk fbrkVarA;
        fbrk fbrkVar = d;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbct.class) {
            fbrkVarA = d;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.apps.restore.osmigration.systemappapi.TargetService", "ImportItemsDone");
                fbrhVarA.b();
                dbci dbciVar = dbci.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbciVar);
                fbrhVarA.b = new fcrh(dbck.a);
                fbrkVarA = fbrhVarA.a();
                d = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
