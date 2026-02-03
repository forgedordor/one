package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eywe {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;
    private static volatile fbrk d;
    private static volatile fbrk e;
    private static volatile fbrk f;
    private static volatile fbrk g;
    private static volatile fbrk h;
    private static volatile fbrk i;
    private static volatile fbrk j;
    private static volatile fbrk k;
    private static volatile fbrk l;
    private static volatile fbrk m;

    private eywe() {
    }

    public static eywc a(fbnd fbndVar) {
        return (eywc) eywc.h(new eywb(), fbndVar);
    }

    public static eywd b(fbnd fbndVar) {
        return new eywd(fbndVar, fbnc.a.f(fcrw.a, fcru.ASYNC));
    }

    public static fbrk c() {
        fbrk fbrkVarA;
        fbrk fbrkVar = h;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = h;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                fbrhVarA.b();
                ezho ezhoVar = ezho.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezhoVar);
                fbrhVarA.b = new fcrh(ezhq.a);
                fbrkVarA = fbrhVarA.a();
                h = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk d() {
        fbrk fbrkVarA;
        fbrk fbrkVar = i;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = i;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "BatchAckMessages");
                fbrhVarA.b();
                ezhs ezhsVar = ezhs.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezhsVar);
                fbrhVarA.b = new fcrh(ezhu.a);
                fbrkVarA = fbrhVarA.a();
                i = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk e() {
        fbrk fbrkVarA;
        fbrk fbrkVar = d;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = d;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.BIDI_STREAMING;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "Bind");
                fbrhVarA.b();
                ezhw ezhwVar = ezhw.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezhwVar);
                fbrhVarA.b = new fcrh(ezhy.a);
                fbrkVarA = fbrhVarA.a();
                d = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk f() {
        fbrk fbrkVarA;
        fbrk fbrkVar = m;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = m;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "Echo");
                fbrhVarA.b();
                ezim ezimVar = ezim.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezimVar);
                fbrhVarA.b = new fcrh(ezio.a);
                fbrkVarA = fbrhVarA.a();
                m = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk g() {
        fbrk fbrkVarA;
        fbrk fbrkVar = l;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = l;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "PrewarmReceiver");
                fbrhVarA.b();
                ezkb ezkbVar = ezkb.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezkbVar);
                fbrhVarA.b = new fcrh(ezkd.a);
                fbrkVarA = fbrhVarA.a();
                l = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk h() {
        fbrk fbrkVarA;
        fbrk fbrkVar = g;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = g;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                fbrhVarA.b();
                ezkf ezkfVar = ezkf.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezkfVar);
                fbrhVarA.b = new fcrh(ezkh.a);
                fbrkVarA = fbrhVarA.a();
                g = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk i() {
        fbrk fbrkVarA;
        fbrk fbrkVar = f;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = f;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.SERVER_STREAMING;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessagesExpress");
                fbrhVarA.b();
                ezkj ezkjVar = ezkj.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezkjVar);
                fbrhVarA.b = new fcrh(ezlb.a);
                fbrkVarA = fbrhVarA.a();
                f = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk j() {
        fbrk fbrkVarA;
        fbrk fbrkVar = e;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = e;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.SERVER_STREAMING;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                fbrhVarA.b();
                ezkl ezklVar = ezkl.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezklVar);
                fbrhVarA.b = new fcrh(ezlb.a);
                fbrkVarA = fbrhVarA.a();
                e = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk k() {
        fbrk fbrkVarA;
        fbrk fbrkVar = j;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = j;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "RevokeMessagesById");
                fbrhVarA.b();
                ezlv ezlvVar = ezlv.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezlvVar);
                fbrhVarA.b = new fcrh(ezlx.a);
                fbrkVarA = fbrhVarA.a();
                j = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk l() {
        fbrk fbrkVarA;
        fbrk fbrkVar = k;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = k;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "RevokeMessagesBySender");
                fbrhVarA.b();
                ezlz ezlzVar = ezlz.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezlzVar);
                fbrhVarA.b = new fcrh(ezmb.a);
                fbrkVarA = fbrhVarA.a();
                k = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk m() {
        fbrk fbrkVarA;
        fbrk fbrkVar = c;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "SendMessageExpress");
                fbrhVarA.b();
                ezmj ezmjVar = ezmj.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezmjVar);
                fbrhVarA.b = new fcrh(ezml.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk n() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eywe.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Messaging", "SendMessage");
                fbrhVarA.b();
                ezjl ezjlVar = ezjl.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(ezjlVar);
                fbrhVarA.b = new fcrh(ezjn.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
