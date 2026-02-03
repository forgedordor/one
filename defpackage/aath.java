package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aath extends aatl {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public int e = 1;

    public aath(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    public final void a(int i, int i2) {
        fcsu fcsuVar = this.a;
        im imVarK = ((DataDonationActivity) fcsuVar.b()).k();
        if (imVarK != null) {
            imVarK.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
            imVarK.setDisplayHomeAsUpEnabled(true);
            imVarK.setDisplayShowCustomEnabled(true);
            imVarK.setDisplayShowTitleEnabled(false);
            imVarK.setCustomView(R.layout.data_donation_toolbar);
            ((TextView) imVarK.getCustomView().findViewById(R.id.data_donation_toolbar_title)).setText(((DataDonationActivity) fcsuVar.b()).getResources().getQuantityString(R.plurals.donation_toolbar_title, i2, Integer.valueOf(i2)));
            Button button = (Button) imVarK.getCustomView().findViewById(R.id.data_donation_toolbar_button);
            boolean z = i > 0;
            final boolean z2 = z && i2 == 0;
            button.setEnabled(z);
            button.setText(z2 ? R.string.donation_toolbar_select : R.string.donation_toolbar_deselect);
            if (z) {
                button.setOnClickListener(new View.OnClickListener() { // from class: aatf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ea eaVarH = ((DataDonationActivity) this.a.a.b()).a().h("dd_fragment_tag");
                        if (eaVarH != null) {
                            einf.f(new aasy(z2), eaVarH);
                        }
                    }
                });
            }
        }
    }
}
