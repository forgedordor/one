package defpackage;

import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatj implements eind {
    final /* synthetic */ aath a;

    public aatj(aath aathVar) {
        this.a = aathVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        aava aavaVar = (aava) einbVar;
        im imVarK = ((DataDonationActivity) this.a.a.b()).k();
        if (imVarK != null) {
            ((Button) imVarK.getCustomView().findViewById(R.id.data_donation_toolbar_button)).setEnabled(!aavaVar.a());
        }
        return eine.a;
    }
}
