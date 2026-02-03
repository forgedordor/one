package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerv {
    public static final cczi a = cdag.f(cdag.b, "verified_sms_registration_deadline_timeout_ms", TimeUnit.SECONDS.toMillis(60));
    private eqqx b;
    private final Object c = new Object();
    private final cepb d;

    public cerv(cepb cepbVar) {
        this.d = cepbVar;
    }

    public final eqqx a() {
        eqqx eqqxVar;
        fbqm fbqmVarB;
        synchronized (this.c) {
            if (this.b == null) {
                cepb cepbVar = this.d;
                synchronized (cepbVar.u) {
                    fbqmVarB = cepbVar.t;
                    if (fbqmVarB == null) {
                        ekrw ekrwVarE = cepb.a.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getVerifiedSmsChannel", 324, "GrpcChannelManager.java")).q("Creating Verified SMS Channel gRPC Channel");
                        fbqmVarB = cepbVar.b((String) ccze.T.e(), ((Long) cepb.g.e()).longValue(), ((Long) cepb.h.e()).longValue(), cepbVar.g(8));
                        cepbVar.t = fbqmVarB;
                    }
                }
                eqqx eqqxVar2 = (eqqx) eqqx.h(new eqqw(), fbqmVarB);
                fbrg fbrgVar = new fbrg();
                fbqx fbqxVar = fbrg.c;
                int i = fbrb.d;
                fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), "AIzaSyAKnDfiZeg6YM0hdZq29oAdumr3VXOcYJc");
                this.b = (eqqx) eqqxVar2.m(new fcrz(fbrgVar));
            }
            eqqxVar = this.b;
        }
        return eqqxVar;
    }
}
