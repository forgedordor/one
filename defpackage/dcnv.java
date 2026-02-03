package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcnv {
    private static final dcnv a = new dcnv();
    private dcnu b = null;

    public static dcnu b(Context context) {
        return a.a(context);
    }

    public final synchronized dcnu a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new dcnu(context);
        }
        return this.b;
    }
}
