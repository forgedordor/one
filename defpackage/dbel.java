package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbel {
    public static volatile fbsy a;
    private static volatile fbrk b;

    private dbel() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbel.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("stargate.SatelliteSessionStateNotificationService", "OnSatelliteSessionStateChanged");
                fbrhVarA.b();
                dbdv dbdvVar = dbdv.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbdvVar);
                fbrhVarA.b = new fcrh(dbdx.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
