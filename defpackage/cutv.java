package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutv implements ozb {
    final /* synthetic */ cuty a;

    public cutv(cuty cutyVar) {
        this.a = cutyVar;
    }

    @Override // defpackage.ozb
    public final boolean a(Preference preference) {
        cuty cutyVar = this.a;
        cutyVar.u.c();
        iv ivVar = cutyVar.u.f;
        if (ivVar == null) {
            return true;
        }
        ivVar.d().getLayoutParams().height = cutyVar.u.a.getResources().getDimensionPixelSize(R.dimen.group_mms_preference_dialog_listview_height);
        return true;
    }
}
