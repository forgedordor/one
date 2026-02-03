package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldj implements anke {
    public static final long a;
    public static final Duration b;
    public final fcsu c;
    private final fdjx d;
    private final cohg e;

    static {
        long j = fdhi.a;
        a = fdhk.f(2, fdhl.d);
        b = Duration.ofSeconds(8L);
    }

    public aldj(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.d = fdjxVar;
        this.c = fcsuVar;
        this.e = new cohf("SuggestionBugleSendMessageListener::onMessageSent");
    }

    @Override // defpackage.anke
    public final eieu a() {
        return this.e.a();
    }

    @Override // defpackage.anke
    public final eiju b(amzg amzgVar) {
        amzgVar.getClass();
        if (!((Boolean) ((cczi) crbf.bF.get()).e()).booleanValue() && amzgVar.f() != null) {
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        auvw.k(this.d, null, null, new aldi(this, amzgVar, null), 3);
        eiju eijuVarE2 = eijx.e(null);
        eijuVarE2.getClass();
        return eijuVarE2;
    }
}
