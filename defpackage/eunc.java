package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eunc {
    public static euna j() {
        eulz eulzVar = new eulz();
        eulzVar.c(0);
        eulzVar.b(0);
        eulzVar.d(0);
        eulzVar.e(0);
        return eulzVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract Drawable e();

    public abstract eunb f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public final boolean k() {
        return (d() & 2) == 2;
    }

    public final boolean l() {
        return (k() || (d() & 1) == 1) ? false : true;
    }
}
