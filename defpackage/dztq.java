package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dztq implements dzjv {
    public static final dztp g() {
        dztl dztlVar = new dztl();
        dztlVar.b = (byte) 1;
        dztlVar.a = ejud.a;
        dztlVar.c = 1;
        return dztlVar;
    }

    @Override // defpackage.dzjv
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.dzjv
    public abstract fcsu b();

    @Override // defpackage.dzjv
    public final boolean c() {
        return e() == 3 || e() == 1;
    }

    public abstract ejwi d();

    public abstract int e();

    public abstract void f();
}
