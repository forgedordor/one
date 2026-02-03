package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgy {
    private static volatile dbgy b;
    public final Context a;

    private dbgy(Context context) {
        this.a = context;
    }

    public static dbgy a() {
        dbgy dbgyVar = b;
        if (dbgyVar != null) {
            return dbgyVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (b == null) {
            synchronized (dbgy.class) {
                if (b == null) {
                    b = new dbgy(context);
                }
            }
        }
    }

    public final dbgu c() {
        return new dbgx(this.a);
    }
}
