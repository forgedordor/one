package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egls {
    public static final String a = eglj.class.getName();
    public static final ekrg b = ekrg.c("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer");
    public final egps c = new egps<efwo, Void>() { // from class: egls.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            egls.this.i.b((efwo) obj);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((ekrd) ((ekrd) ((ekrd) egls.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$1", "onFailure", 'j', "OGExpressSignInDialogFragmentPeer.java")).q("log in account failed");
            egls eglsVar = egls.this;
            eglj.aV(eglsVar.f.getString(R.string.tiktok_account_login_failure)).t(eglsVar.h.I(), egls.a);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps d = new egps<Void, String>() { // from class: egls.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((ekrd) ((ekrd) ((ekrd) egls.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$2", "onFailure", '{', "OGExpressSignInDialogFragmentPeer.java")).q("add account failed");
            egls eglsVar = egls.this;
            eglj.aV(eglsVar.f.getString(R.string.tiktok_add_account_error)).t(eglsVar.h.I(), egls.a);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egzv e = new egzv<List<egbe>>() { // from class: egls.3
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            egls eglsVar = egls.this;
            Throwable th2 = null;
            eglsVar.v = null;
            Throwable cause = th;
            while (cause != null) {
                Throwable thA = ehla.a(cause);
                if ((thA instanceof dceo) || (thA instanceof dcen)) {
                    th2 = thA;
                    break;
                }
                cause = thA.getCause();
            }
            if (th2 == null) {
                ((ekrd) ((ekrd) ((ekrd) egls.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$3", "onError", (char) 173, "OGExpressSignInDialogFragmentPeer.java")).q("Load accounts failed");
                return;
            }
            if (th2 instanceof dceo) {
                eglsVar.o.c(eglsVar.g, ((dceo) th2).a, 38294);
            } else if (!(th2 instanceof dcen)) {
                ((ekrd) ((ekrd) ((ekrd) egls.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$3", "onError", (char) 170, "OGExpressSignInDialogFragmentPeer.java")).q("Load accounts failed with play service error");
            } else {
                eglsVar.o.c(eglsVar.g, ((dcen) th2).a, 38294);
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void b(Object obj) {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (egbe egbeVar : (List) obj) {
                if (!egbeVar.b().k.equals("incognito")) {
                    if (egbeVar.b().k.equals("pseudonymous")) {
                        egls.this.v = egbeVar;
                    } else {
                        ekfwVar.h(egbeVar);
                    }
                }
            }
            ((dyrq) egls.this.r).a.a(ekfwVar.g());
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };
    public final Context f;
    public final Activity g;
    public final ea h;
    public final efxf i;
    public final egcd j;
    public final egca k;
    public final egbf l;
    public final egpr m;
    public final ehac n;
    public final dcdt o;
    public final ejwi p;
    public final eilb q;
    public final dytx r;
    public final dyty s;
    public final Executor t;
    public dysd u;
    public egbe v;

    public egls(Context context, Activity activity, ea eaVar, final ejwi ejwiVar, ehrb ehrbVar, eigp eigpVar, efxf efxfVar, egcd egcdVar, egca egcaVar, final egda egdaVar, egbf egbfVar, final egpr egprVar, ehac ehacVar, dcdt dcdtVar, Executor executor, eosc eoscVar, dtah dtahVar, ejwi ejwiVar2, eilb eilbVar) {
        ejwl.l(activity instanceof iy);
        this.f = context;
        this.g = activity;
        this.h = eaVar;
        this.i = efxfVar;
        this.j = egcdVar;
        this.k = egcaVar;
        this.l = egbfVar;
        this.m = egprVar;
        this.n = ehacVar;
        this.o = dcdtVar;
        this.p = ejwiVar2;
        this.q = eilbVar;
        this.t = executor;
        dyrl dyrlVar = new dyrl();
        dyrlVar.a = new egli(ejwiVar);
        dyrlVar.c = egkp.a(ehrbVar, eaVar, new egli(ejwiVar));
        dyrlVar.d = new eifs(eigpVar, "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer", "<init>", 247, "Express SignIn Dialog: Clicked Add Account", new View.OnClickListener() { // from class: eglp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = ((ejwt) ejwiVar).a;
                egda egdaVar2 = egdaVar;
                String str = (String) obj;
                if (egdaVar2.b(str)) {
                    egprVar.g(new egpq(egdaVar2.a(str)), this.a.d);
                }
            }
        });
        dyrj dyrjVarC = dyrlVar.c();
        dytw dytwVarJ = dytx.j(context);
        ((dyrp) dytwVarJ).b = dyrjVarC;
        dytwVarJ.g(eoscVar);
        dytwVarJ.k(dtahVar);
        dytx dytxVarM = dytwVarJ.m();
        this.r = dytxVarM;
        this.s = new dyty(dytxVarM);
    }
}
