package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrp implements egzv<aumq> {
    final /* synthetic */ acrt a;

    public acrp(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarI = acrt.a.i();
        ekrwVarI.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$6", "onError", (char) 1478, "HomeFragmentPeer.java")).q("SubscriptionMixin for getCmsSettingsDataSource failed");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Snackbar snackbarE;
        aumq aumqVar = (aumq) obj;
        acrt acrtVar = this.a;
        actb actbVar = (actb) acrtVar.bd.b();
        acom acomVar = acrtVar.b;
        View view = acomVar.Q;
        ViewGroup viewGroupF = acrt.f(acomVar);
        View viewG = acrtVar.ad.g();
        aumqVar.getClass();
        viewGroupF.getClass();
        autx autxVar = actbVar.c;
        boolean zM = autx.m(aumqVar);
        apqb apqbVar = actbVar.a;
        if (!apqbVar.a() && aumqVar.e) {
            fcsu fcsuVar = actbVar.b;
            if (!((acxm) fcsuVar.b()).g().booleanValue() && aumqVar.k && zM) {
                ((acxm) fcsuVar.b()).r(true);
                if (view == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                view.getViewTreeObserver().addOnPreDrawListener(new acsz(viewGroupF, viewG, actbVar, view));
                return;
            }
        }
        if (apqbVar.a() && aumqVar.e) {
            fcsu fcsuVar2 = actbVar.b;
            if (!((acxm) fcsuVar2.b()).i().booleanValue() && zM) {
                ((acxm) fcsuVar2.b()).t(true);
                if (view == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                view.getViewTreeObserver().addOnPreDrawListener(new acta(viewGroupF, viewG, actbVar, view));
                return;
            }
        }
        if (!apqbVar.a()) {
            fcsu fcsuVar3 = actbVar.b;
            if (((acxm) fcsuVar3.b()).g().booleanValue() && (!zM || !aumqVar.e)) {
                Snackbar snackbarE2 = ((acxm) fcsuVar3.b()).e();
                if (snackbarE2 != null) {
                    snackbarE2.e();
                    ((acxm) fcsuVar3.b()).r(false);
                    return;
                }
                return;
            }
        }
        if (apqbVar.a()) {
            fcsu fcsuVar4 = actbVar.b;
            if (((acxm) fcsuVar4.b()).i().booleanValue()) {
                if ((zM && aumqVar.e) || (snackbarE = ((acxm) fcsuVar4.b()).e()) == null) {
                    return;
                }
                snackbarE.e();
                ((acxm) fcsuVar4.b()).t(false);
            }
        }
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
