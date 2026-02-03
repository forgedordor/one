package defpackage;

import android.content.Intent;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqp implements efzm {
    final /* synthetic */ tqq a;

    public tqp(tqq tqqVar) {
        this.a = tqqVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        tqq.a.p("onAccountChanged called, opening FiSettingsFragment.");
        cg cgVar = new cg(this.a.c.a());
        efwo efwoVarA = efzkVar.a();
        tqs tqsVar = new tqs();
        eyhj.e(tqsVar);
        ehok.b(tqsVar, efwoVarA);
        cgVar.D(R.id.fragment_container, tqsVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        int i;
        cqce cqceVar = tqq.a;
        cqceVar.s("onAccountError called.", efygVar);
        if (((Boolean) ((cczi) tqq.b.get()).e()).booleanValue()) {
            tqq tqqVar = this.a;
            if (efygVar instanceof efyl) {
                Throwable cause = efygVar.getCause();
                i = cause instanceof egdj ? 102 : cause instanceof IllegalStateException ? 103 : cause instanceof egqh ? 104 : cause instanceof SecurityException ? 105 : EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            } else {
                i = efygVar instanceof efyh ? 4 : efygVar instanceof efym ? 1 : efygVar instanceof efyj ? 2 : efygVar instanceof efyn ? 3 : 0;
            }
            tqqVar.d.e("Bugle.Accounts.FiSettingsActivity.onAccountError.Count", i);
        }
        FiSettingsActivity fiSettingsActivity = this.a.c;
        Intent intentA = tlz.a(fiSettingsActivity);
        if (fiSettingsActivity.getIntent().hasExtra("entry_point")) {
            intentA = intentA.putExtra("entry_point", fiSettingsActivity.getIntent().getIntExtra("entry_point", -1));
        }
        if ((efygVar instanceof efyl) && (efygVar.getCause() instanceof axlg)) {
            cqceVar.m("There is no linked account; show opt in flow instead");
            fiSettingsActivity.startActivity(intentA);
            fiSettingsActivity.finish();
        } else {
            if (!(efygVar instanceof efyh)) {
                throw new IllegalStateException("Unexpected account loading error", efygVar);
            }
            cqceVar.m("Account not enabled; show opt in flow instead");
            fiSettingsActivity.startActivity(intentA);
            fiSettingsActivity.finish();
        }
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
