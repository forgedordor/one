package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qu {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static qu b;
    private xa c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return xa.b(i, mode);
    }

    public static synchronized qu d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            qu quVar = new qu();
            b = quVar;
            quVar.c = xa.e();
            b.c.g(new qt());
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
