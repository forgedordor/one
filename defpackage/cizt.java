package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cizt {
    public static final cczi a = cdag.m(cdag.b, "enable_simplified_messaging_v2_api", false);
    static final cczi b = cdag.m(cdag.b, "enable_simplified_messaging_notification_v2_api", false);
    private final Context c;

    public cizt(Context context) {
        this.c = context;
    }

    public final boolean a() {
        return ((Boolean) a.e()).booleanValue() && !dhka.k(this.c);
    }
}
