package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogt {
    private final Context a;

    public cogt(Context context) {
        this.a = context;
    }

    public final Context a() {
        return eehf.a(new ContextThemeWrapper(this.a, R.style.Theme_GoogleMaterial3_DayNight_NoActionBar));
    }
}
