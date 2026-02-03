package defpackage;

import android.view.View;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyw implements View.OnClickListener {
    final /* synthetic */ Preference a;

    public oyw(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(view);
    }
}
