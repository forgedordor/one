package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bms {
    public static final Range h = new Range(0, 0);

    public static bmr i(Size size) {
        bhn bhnVar = new bhn();
        bhnVar.d(size);
        bhnVar.c(size);
        bhnVar.e(0);
        bhnVar.b(h);
        bhnVar.a = azv.b;
        bhnVar.f(false);
        return bhnVar;
    }

    public abstract int a();

    public abstract Range b();

    public abstract Size c();

    public abstract Size d();

    public abstract azv e();

    public abstract bjq f();

    public abstract bmr g();

    public abstract boolean h();
}
