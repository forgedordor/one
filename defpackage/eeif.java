package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeif implements View.OnClickListener {
    final /* synthetic */ eeih a;

    public eeif(eeih eeihVar) {
        this.a = eeihVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eeih eeihVar = this.a;
        int i = eeihVar.aj;
        if (i == 2) {
            eeihVar.p(1);
            eeihVar.ag.announceForAccessibility(eeihVar.Y(R.string.mtrl_picker_toggled_to_day_selection));
        } else if (i == 1) {
            eeihVar.p(2);
            eeihVar.e.announceForAccessibility(eeihVar.Y(R.string.mtrl_picker_toggled_to_year_selection));
        }
    }
}
