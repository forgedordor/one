package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmwe {
    public static final ejxr a = cdag.x("split_external_intents");
    private final Context b;

    public cmwe(Context context) {
        this.b = context;
    }

    public final boolean a() {
        return ((Boolean) ((cczi) a.get()).e()).booleanValue() && this.b.getResources().getBoolean(R.bool.is_large_window_size_class_width);
    }
}
