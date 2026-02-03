package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeid extends lcl {
    final /* synthetic */ eeih a;

    public eeid(eeih eeihVar) {
        this.a = eeihVar;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        eeih eeihVar = this.a;
        lhgVar.i(new lhd(16, eeihVar.ah.getVisibility() == 0 ? eeihVar.Y(R.string.mtrl_picker_toggle_to_year_selection) : eeihVar.Y(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
