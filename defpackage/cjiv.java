package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjiv {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;
    private static volatile fbrk d;
    private static volatile fbrk e;
    private static volatile fbrk f;
    private static volatile fbrk g;
    private static volatile fbrk h;
    private static volatile fbrk i;

    private cjiv() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = f;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = f;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "AddUserToGroup");
                fbrhVarA.b();
                cjgh cjghVar = cjgh.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjghVar);
                fbrhVarA.b = new fcrh(cjgj.a);
                fbrkVarA = fbrhVarA.a();
                f = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk b() {
        fbrk fbrkVarA;
        fbrk fbrkVar = e;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = e;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "CreateGroup");
                fbrhVarA.b();
                cjgx cjgxVar = cjgx.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjgxVar);
                fbrhVarA.b = new fcrh(cjgz.a);
                fbrkVarA = fbrhVarA.a();
                e = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk c() {
        fbrk fbrkVarA;
        fbrk fbrkVar = g;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = g;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "RemoveUserFromGroup");
                fbrhVarA.b();
                cjkc cjkcVar = cjkc.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjkcVar);
                fbrhVarA.b = new fcrh(cjke.a);
                fbrkVarA = fbrhVarA.a();
                g = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk d() {
        fbrk fbrkVarA;
        fbrk fbrkVar = d;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = d;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "RevokeMessage");
                fbrhVarA.b();
                cjkq cjkqVar = cjkq.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjkqVar);
                fbrhVarA.b = new fcrh(cjks.a);
                fbrkVarA = fbrhVarA.a();
                d = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk e() {
        fbrk fbrkVarA;
        fbrk fbrkVar = c;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "SendFile");
                fbrhVarA.b();
                cjky cjkyVar = cjky.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjkyVar);
                fbrhVarA.b = new fcrh(cjla.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk f() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "SendMessage");
                fbrhVarA.b();
                cjlg cjlgVar = cjlg.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjlgVar);
                fbrhVarA.b = new fcrh(cjli.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk g() {
        fbrk fbrkVarA;
        fbrk fbrkVar = i;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = i;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "TriggerGroupNotification");
                fbrhVarA.b();
                cjls cjlsVar = cjls.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjlsVar);
                fbrhVarA.b = new fcrh(cjlu.a);
                fbrkVarA = fbrhVarA.a();
                i = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk h() {
        fbrk fbrkVarA;
        fbrk fbrkVar = h;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (cjiv.class) {
            fbrkVarA = h;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.MessagingEngineService", "UpdateGroup");
                fbrhVarA.b();
                cjma cjmaVar = cjma.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(cjmaVar);
                fbrhVarA.b = new fcrh(cjmc.a);
                fbrkVarA = fbrhVarA.a();
                h = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
