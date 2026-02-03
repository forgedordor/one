package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acbh implements egzv<List<egbe>> {
    final /* synthetic */ acbj a;

    public acbh(acbj acbjVar) {
        this.a = acbjVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        acbj acbjVar = this.a;
        Throwable th2 = null;
        acbjVar.q = null;
        Throwable cause = th;
        while (cause != null) {
            Throwable thA = ehla.a(cause);
            if ((thA instanceof dcet) || (thA instanceof UserRecoverableAuthException)) {
                th2 = thA;
                break;
            }
            cause = thA.getCause();
        }
        if (th2 == null) {
            acbj.a.s("Load accounts failed due to non user recoverable error.", th);
            View view = acbjVar.c.Q;
            view.getClass();
            Snackbar snackbarP = Snackbar.p(view, R.string.bugle_load_account_failure, -2);
            snackbarP.v(R.string.bugle_retry, new eifs(acbjVar.f, "com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragmentPeer$3", "onError", 264, "Load account error, click retry", new View.OnClickListener() { // from class: acbf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.a.a();
                }
            }));
            snackbarP.i();
            return;
        }
        final Intent intentA = th2 instanceof dcet ? ((dcet) th2).a() : ((UserRecoverableAuthException) th2).a();
        if (intentA != null) {
            View view2 = acbjVar.c.Q;
            view2.getClass();
            Snackbar snackbarP2 = Snackbar.p(view2, R.string.bugle_play_services_error, -2);
            snackbarP2.v(R.string.bugle_fix_it, new eifs(acbjVar.f, "com/google/android/apps/messaging/gaia/expresssignin/BugleExpressSignInFragmentPeer$3", "onError", 289, "Play services error, click fix", new View.OnClickListener() { // from class: acbg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.a.a.c.startActivityForResult(intentA, 29878);
                }
            }));
            snackbarP2.i();
            return;
        }
        cqbd cqbdVarE = acbj.a.e();
        cqbdVarE.I("Load accounts failed due to user recoverable error.");
        cqbdVarE.s(th2);
        View view3 = acbjVar.c.Q;
        view3.getClass();
        Snackbar.p(view3, R.string.bugle_play_services_error, -2).i();
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void b(Object obj) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (egbe egbeVar : (List) obj) {
            if (egbeVar.b().k.equals("pseudonymous")) {
                this.a.q = egbeVar.a();
            } else {
                ekfwVar.h(egbeVar);
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG.isEmpty()) {
            ((dava) this.a.p.b()).b(null);
        }
        ((dyrq) this.a.k).a.a(ekgbVarG);
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
