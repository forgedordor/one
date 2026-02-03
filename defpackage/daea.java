package defpackage;

import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daea implements dagf {
    @Override // defpackage.dagf
    public final int a() {
        return R.id.zero_state_search_link_star_icon;
    }

    @Override // defpackage.dagf
    public final void b(cpdw cpdwVar, boolean z) {
        if (cpdwVar.i() || z) {
            ((ImageView) cpdwVar.b()).setVisibility(true != z ? 8 : 0);
        }
    }
}
