package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.material.snackbar.Snackbar;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egme {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer");
    public final egps b = new egps<efwo, Void>() { // from class: egme.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            egme.this.m.c((efwo) obj);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            egme.this.m.a();
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps c = new egps<Void, String>() { // from class: egme.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            Snackbar.p(egme.this.f.Q, R.string.tiktok_add_account_error, 0).i();
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egzv d = new AnonymousClass3();
    public final eg e;
    public final egma f;
    public final ehac g;
    public final egpr h;
    public final eigp i;
    public final egcd j;
    public final egki k;
    public final ejwi l;
    public final egbb m;
    public final eilb n;
    public final dytx o;
    public final dyty p;
    public final Executor q;
    public ejwi r;
    public egbe s;
    private final egca t;

    public egme(Context context, eg egVar, egma egmaVar, final ejwi ejwiVar, ehac ehacVar, final egpr egprVar, eigp eigpVar, egcd egcdVar, egca egcaVar, egkj egkjVar, Map map, egbb egbbVar, ehrb ehrbVar, final egda egdaVar, eilb eilbVar, dtah dtahVar, Executor executor, eosc eoscVar) {
        Class cls;
        ejud ejudVar = ejud.a;
        this.r = ejudVar;
        this.e = egVar;
        this.f = egmaVar;
        this.g = ehacVar;
        this.h = egprVar;
        this.i = eigpVar;
        this.j = egcdVar;
        this.t = egcaVar;
        this.m = egbbVar;
        this.n = eilbVar;
        this.q = executor;
        dytw dytwVarJ = dytx.j(context);
        dyrl dyrlVar = new dyrl();
        dyrlVar.a = new egli(ejwiVar);
        dyrlVar.c = egkp.a(ehrbVar, egmaVar, new egli(ejwiVar));
        dyrlVar.d = new eifs(eigpVar, "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer", "<init>", 255, "Click Add Accounts in TikTok Express SignIn", new View.OnClickListener() { // from class: egmd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = ((ejwt) ejwiVar).a;
                egda egdaVar2 = egdaVar;
                String str = (String) obj;
                if (egdaVar2.b(str)) {
                    egprVar.g(new egpq(egdaVar2.a(str)), this.a.c);
                }
            }
        });
        ((dyrp) dytwVarJ).b = dyrlVar.c();
        dytwVarJ.g(eoscVar);
        dytwVarJ.k(dtahVar);
        dytx dytxVarM = dytwVarJ.m();
        this.o = dytxVarM;
        this.p = new dyty(dytxVarM);
        Intent intent = egVar.getIntent();
        if (intent.getBooleanExtra("$tiktok$eligibility_intents$mapper_class_owned", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("$tiktok$eligibility_intents$mapper_class");
            serializableExtra.getClass();
            cls = (Class) serializableExtra;
        } else {
            cls = null;
        }
        if (cls == null) {
            this.k = new egki(egkjVar.a, ejudVar, egkjVar.c);
            this.l = ejudVar;
            return;
        }
        ejwl.p(egkjVar.b.containsKey(cls), "EligibilityMapper not found for %s", cls);
        this.k = new egki(egkjVar.a, ejwi.j((egkl) ((fcsu) egkjVar.b.get(cls)).b()), egkjVar.c);
        ejwl.p(map.containsKey(cls), "AccountIneligibleDialogCreator not provided for mapperClass: %s", cls);
        this.l = ejwi.j((egly) ((fcsu) map.get(cls)).b());
    }

    public final void a() {
        egoc.d("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer", "refresh", 390, this.t.b(), "Failed account invalidation.", new Object[0]);
    }

    /* compiled from: PG */
    /* renamed from: egme$3, reason: invalid class name */
    class AnonymousClass3 implements egzv<ekgp<egbe, egkk>> {
        public AnonymousClass3() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            Throwable th2;
            egme egmeVar = egme.this;
            egmeVar.s = null;
            Throwable cause = th;
            while (cause != null) {
                Throwable thA = ehla.a(cause);
                if ((thA instanceof dcet) || (thA instanceof UserRecoverableAuthException)) {
                    th2 = thA;
                    break;
                }
                cause = thA.getCause();
            }
            th2 = null;
            if (th2 == null) {
                ((ekrd) ((ekrd) ((ekrd) egme.a.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 151, "ExpressSignInFragmentPeer.java")).q("Load accounts failed due to non user recoverable error.");
                Snackbar snackbarP = Snackbar.p(egmeVar.f.Q, R.string.tiktok_load_account_failure, -2);
                snackbarP.v(R.string.tiktok_retry, new eifs(egmeVar.i, "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", 159, "Load account error, click retry", new View.OnClickListener() { // from class: egmf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egme.this.a();
                    }
                }));
                snackbarP.i();
                return;
            }
            final Intent intentA = th2 instanceof dcet ? ((dcet) th2).a() : ((UserRecoverableAuthException) th2).a();
            if (intentA == null) {
                ((ekrd) ((ekrd) ((ekrd) egme.a.i()).g(th2)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 168, "ExpressSignInFragmentPeer.java")).q("Load accounts failed due to user recoverable error.");
                Snackbar.p(egmeVar.f.Q, R.string.tiktok_play_services_error, -2).i();
            } else {
                Snackbar snackbarP2 = Snackbar.p(egmeVar.f.Q, R.string.tiktok_play_services_error, -2);
                snackbarP2.v(R.string.tiktok_fix_it, new eifs(egmeVar.i, "com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", 183, "Play services error, click fix", new View.OnClickListener() { // from class: egmg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egme.this.f.startActivityForResult(intentA, 29878);
                    }
                }));
                snackbarP2.i();
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void b(Object obj) {
            ekgp ekgpVar = (ekgp) obj;
            ejwi ejwiVarJ = ejwi.j(ekgpVar);
            egme egmeVar = egme.this;
            egmeVar.r = ejwiVarJ;
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                egbe egbeVar = (egbe) ((Map.Entry) ekqgVarListIterator.next()).getKey();
                if (!egbeVar.b().k.equals("incognito")) {
                    if (egbeVar.b().k.equals("pseudonymous")) {
                        egmeVar.s = egbeVar;
                    } else {
                        ekfwVar.h(egbeVar);
                    }
                }
            }
            ((dyrq) egmeVar.o).a.a(ekfwVar.g());
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }
}
