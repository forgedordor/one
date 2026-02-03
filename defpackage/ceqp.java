package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqp {
    private static final eksp a = eksp.c("BugleMdmCall");
    private static final cczv b = cdag.q(181707163, "log_mdm_requests");
    private final fcsu c;
    private final fcsu d;
    private final cenj e;

    public ceqp(fcsu fcsuVar, fcsu fcsuVar2, cenj cenjVar) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = cenjVar;
    }

    public final eiju a() {
        ezpp ezppVar = (ezpp) this.e.a("CMS").build();
        if (((Boolean) b.e()).booleanValue()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(bzmz.H, "getFiUserStanding");
            ekslVar.X(bzmz.G, ezppVar.c);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/net/common/tachyontiktokgrpc/MessagesMultiDeviceClient", "getFiUserStanding", 77, "MessagesMultiDeviceClient.java")).o();
        }
        eymd eymdVar = eymd.a;
        eymc eymcVar = (eymc) eymdVar.createBuilder();
        eymcVar.copyOnWrite();
        eymd eymdVar2 = (eymd) eymcVar.instance;
        ezppVar.getClass();
        eymdVar2.c = ezppVar;
        eymdVar2.b |= 1;
        eymd eymdVar3 = (eymd) eymcVar.build();
        eyvz eyvzVar = (eyvz) ceqb.b((eyvz) this.d.b(), false);
        fbnb fbnbVar = espr.a;
        esop esopVar = new esop();
        esopVar.b(ekhx.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        eyvz eyvzVar2 = (eyvz) ceqb.a((eyvz) eyvzVar.n(fbnbVar, new esow(esopVar.c())), Boolean.TRUE.equals(this.c.b()), 8752);
        fbnd fbndVar = eyvzVar2.a;
        fbrk fbrkVar = eywa.a;
        if (fbrkVar == null) {
            synchronized (eywa.class) {
                fbrkVar = eywa.a;
                if (fbrkVar == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.MessagesMultiDevice", "GetFiUserStanding");
                    fbrhVarA.b();
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eymdVar);
                    fbrhVarA.b = new fcrh(eymf.a);
                    fbrk fbrkVarA = fbrhVarA.a();
                    eywa.a = fbrkVarA;
                    fbrkVar = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVar, eyvzVar2.b), eymdVar3));
    }
}
