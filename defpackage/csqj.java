package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamAbuseStub");
    private static final cczi b = cdag.e(cdag.b, "tachyon_spam_grpc_deadline_seconds", 10);
    private final fcsu c;
    private eyjy d;
    private final Object e;

    public csqj(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.c = fcsuVar;
        this.e = new Object();
    }

    public final eyjy a() {
        fbqm fbqmVarA;
        eyjy eyjyVar;
        synchronized (this.e) {
            if (this.d == null) {
                try {
                    cepb cepbVar = (cepb) this.c.b();
                    synchronized (cepbVar.s) {
                        fbqmVarA = cepbVar.r;
                        if (fbqmVarA == null) {
                            ekrw ekrwVarE = cepb.a.e();
                            ekrwVarE.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonSpamChannel", 309, "GrpcChannelManager.java")).q("Creating Tachyon Spam gRPC Channel");
                            fbqmVarA = cepbVar.a((String) cepb.d.e(), cepbVar.g(7));
                            cepbVar.r = fbqmVarA;
                        }
                    }
                    this.d = (eyjy) ((eyjy) eyjy.h(new eyjx(), fbqmVarA)).m(new fcrz(((cepb) this.c.b()).e()));
                } catch (Exception e) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleSpam");
                    ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamAbuseStub", "getAbuseStub", 38, "TachyonSpamAbuseStub.kt")).q("Cannot create stub for spam tachyon grpc");
                    return null;
                }
            }
            eyjy eyjyVar2 = this.d;
            eyjyVar2.getClass();
            eyjyVar = (eyjy) eyjyVar2.k(((Number) b.e()).intValue(), TimeUnit.SECONDS);
        }
        return eyjyVar;
    }
}
