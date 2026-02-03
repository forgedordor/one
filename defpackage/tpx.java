package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer");
    public static final cczi b = cdag.g(cdag.b, "fi_settings_page_learn_more_url", "https://support.google.com/fi/?p=transfertomessages");
    public static final ejxr c = cdag.v("fi_account_error_string_update");
    public final tpq d;
    public final efwo e;
    public final eils f;
    public final tpi g;
    public final fcsu h;
    public final fcsu i;
    public final ehac j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final egps n = new tpw(this);
    public final appb o;
    public final aoot p;
    public Preference q;
    private final evsp r;
    private final eigp s;

    public tpx(evsp evspVar, tpq tpqVar, efwo efwoVar, eils eilsVar, tpi tpiVar, fcsu fcsuVar, fcsu fcsuVar2, eigp eigpVar, ehac ehacVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, appb appbVar, aoot aootVar) {
        this.r = evspVar;
        this.d = tpqVar;
        this.e = efwoVar;
        this.f = eilsVar;
        this.g = tpiVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.s = eigpVar;
        this.j = ehacVar;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.o = appbVar;
        this.p = aootVar;
    }

    private final void e(String str) {
        View view = this.d.Q;
        view.getClass();
        View rootView = view.getRootView();
        rootView.getClass();
        Snackbar snackbarQ = Snackbar.q(rootView, str, 0);
        snackbarQ.n();
        snackbarQ.i();
    }

    public final void a() {
        tpq tpqVar = this.d;
        Intent intentB = tlz.b(tpqVar.z());
        if (((Boolean) cpyl.a.e()).booleanValue()) {
            intentB.putExtra("entry_point", this.r.b);
        }
        efyp.c(intentB, this.e);
        eilp.a(tpqVar, intentB);
        einf.f(new tru(), tpqVar);
    }

    public final void b() {
        if (((Boolean) ((cczi) c.get()).e()).booleanValue()) {
            e(this.d.Y(R.string.fi_account_invalid_fi_account_new));
        } else {
            e(this.d.Y(R.string.fi_account_invalid_fi_account));
        }
    }

    public final void c(Throwable th) {
        e(this.d.Y(R.string.fi_account_verify_fail_message));
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer", "showErrorSnackBarForInternalError", 351, "FiAccountFragmentPeer.java")).r("Failure to validate fi account for accountId: %d", this.e.a());
    }

    public final void d() {
        tpq tpqVar = this.d;
        AlertDialog.Builder message = new AlertDialog.Builder(tpqVar.z()).setTitle(tpqVar.Y(R.string.fi_account_rcs_enabled_dialog_title_v2)).setMessage(dajs.c(tpqVar.z(), this.h, this.i, R.string.fi_account_rcs_enabled_dialog_body_v2, null, cpyl.j));
        String strY = tpqVar.Y(R.string.fi_account_rcs_enabled_dialog_positive_button);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tpt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                tpx tpxVar = this.a;
                ((egpr) tpxVar.m.b()).g(egpq.b(((cjzq) tpxVar.l.b()).h(ckbz.TOGGLE_STATE_USER_DISABLED)), tpxVar.n);
            }
        };
        eigp eigpVar = this.s;
        message.setPositiveButton(strY, new eigf(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer", "showIsRcsEnabledDialog", 250, "FiAccountFragmentPeer:isRcsEnabledDialog:positive", onClickListener)).setNegativeButton(tpqVar.Y(R.string.fi_account_rcs_enabled_dialog_negative_button), new eigf(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer", "showIsRcsEnabledDialog", 266, "FiAccountFragmentPeer:isRcsEnabledDialog:negative", new DialogInterface.OnClickListener() { // from class: tpu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                einf.f(new tsc(), this.a.d);
                dialogInterface.dismiss();
            }
        }));
        final AlertDialog alertDialogCreate = message.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: tpv
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ekrg ekrgVar = tpx.a;
                TextView textView = (TextView) alertDialogCreate.findViewById(android.R.id.message);
                eebt.b(textView);
                eebt.c(textView);
            }
        });
        alertDialogCreate.show();
    }

    /* compiled from: PG */
    final class a implements egzv<trs> {
        public a() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            tpx tpxVar = tpx.this;
            if (tpxVar.o.a()) {
                return;
            }
            tpxVar.q.G(true);
            tpxVar.c(th);
            egau.a();
            try {
                einf.f(new tsc(), tpxVar.d);
                ecem.c();
            } catch (Throwable th2) {
                try {
                    ecem.c();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void b(Object obj) {
            tpx tpxVar = tpx.this;
            trs trsVar = (trs) obj;
            if (tpxVar.o.a()) {
                return;
            }
            if (trsVar.c) {
                tpx tpxVar2 = tpx.this;
                if (tpxVar2.p.a() || !trsVar.d) {
                    tpxVar2.a();
                    return;
                } else {
                    tpxVar2.d();
                    tpxVar2.q.G(true);
                    return;
                }
            }
            tpxVar.b();
            tpxVar.q.G(true);
            egau.a();
            try {
                einf.f(new tsc(), tpxVar.d);
                ecem.c();
            } catch (Throwable th) {
                try {
                    ecem.c();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    }
}
