package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbj {
    public static final cqce a = cqce.g("BugleGaia", "BugleExpressSignInFragmentPeer");
    public final eg b;
    public final acay c;
    public final ehac d;
    public final egpr e;
    public final eigp f;
    public final egcd g;
    public final egbf h;
    public final egbb i;
    public final eilb j;
    public final dytx k;
    public final dyty l;
    public final egps m = new acbd(this);
    public final egps n = new acbe(this);
    public final egzv o = new acbh(this);
    public final fcsu p;
    public efwo q;
    private final egca r;

    public acbj(Context context, eg egVar, acay acayVar, ehac ehacVar, final egpr egprVar, eigp eigpVar, egcd egcdVar, egca egcaVar, egbf egbfVar, egbb egbbVar, dyyv dyyvVar, final egda egdaVar, eilb eilbVar, dtah dtahVar, eosc eoscVar, fcsu fcsuVar) {
        this.b = egVar;
        this.c = acayVar;
        this.d = ehacVar;
        this.e = egprVar;
        this.f = eigpVar;
        this.g = egcdVar;
        this.r = egcaVar;
        this.h = egbfVar;
        this.i = egbbVar;
        this.j = eilbVar;
        this.p = fcsuVar;
        dytw dytwVarJ = dytx.j(context);
        dyrl dyrlVar = new dyrl();
        dyrlVar.a = new egli(ejwi.j("google"));
        dyrlVar.b = new acbb(context, dyyvVar);
        dyrlVar.d = new eifs(eigpVar, "com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragmentPeer", "<init>", 159, "Click Add Accounts in TikTok Express SignIn", new View.OnClickListener() { // from class: acbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egda egdaVar2 = egdaVar;
                if (egdaVar2.b("google")) {
                    egprVar.g(new egpq(egdaVar2.a("google")), this.a.n);
                }
            }
        });
        ((dyrp) dytwVarJ).b = dyrlVar.c();
        dytwVarJ.g(eoscVar);
        dytwVarJ.k(dtahVar);
        dytx dytxVarM = dytwVarJ.m();
        this.k = dytxVarM;
        this.l = new dyty(dytxVarM);
    }

    public final void a() {
        egoc.d("com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragmentPeer", "refresh", 379, this.r.a(), "Failed account invalidation.", new Object[0]);
    }
}
