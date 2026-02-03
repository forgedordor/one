package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsx {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;

    private cfsx() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cfsx.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.PersistentMessagingProxyNotificationService", "OnIncomingInboxMessage");
                fbrhVarA.b();
                cfsl cfslVar = cfsl.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cfslVar);
                fbrhVarA.b = new fcrh(cfsn.a);
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
        synchronized (cfsx.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.PersistentMessagingProxyNotificationService", "OnPersistentConnectionError");
                fbrhVarA.b();
                cfsp cfspVar = cfsp.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cfspVar);
                fbrhVarA.b = new fcrh(cfsr.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
