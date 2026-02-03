package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcu {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;

    private dbcu() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbcu.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("stargate.DatagramNotificationService", "OnDatagramSent");
                fbrhVarA.b();
                dbdn dbdnVar = dbdn.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbdnVar);
                fbrhVarA.b = new fcrh(dbdp.a);
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
        synchronized (dbcu.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("stargate.DatagramNotificationService", "OnReceiveDatagram");
                fbrhVarA.b();
                dbdr dbdrVar = dbdr.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbdrVar);
                fbrhVarA.b = new fcrh(dbdt.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
