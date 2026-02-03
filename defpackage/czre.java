package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czre implements ehaw {
    final /* synthetic */ czrg a;

    public czre(czrg czrgVar) {
        this.a = czrgVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        egyj egyjVar = czrg.b;
        egyjVar.getClass();
        return egyjVar;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        if (dfpi.z()) {
            eiju eijuVarE = eijx.e(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (!dfpi.G()) {
            czrg.a.n().q("Not returning RcsDefaultOnConsentData since the flag is disabled");
            eiju eijuVarE2 = eijx.e(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        if (dfar.b()) {
            czrg czrgVar = this.a;
            return auvw.c(czrgVar.c, fcyi.a, fdjz.a, new czrd(czrgVar, null));
        }
        czrg.a.n().q("Not returning RcsDefaultOnConsentData since ToS flag is not allowed");
        eiju eijuVarE3 = eijx.e(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
        eijuVarE3.getClass();
        return eijuVarE3;
    }
}
