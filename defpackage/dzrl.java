package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzrl implements dzjv {
    public static final dzrk i() {
        dzri dzriVar = new dzri();
        dzriVar.c(false);
        dzriVar.a = 50;
        dzriVar.c = (byte) (dzriVar.c | 1);
        dzriVar.b = ejud.a;
        dzriVar.d = 1;
        return dzriVar;
    }

    @Override // defpackage.dzjv
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.dzjv
    public final /* synthetic */ fcsu b() {
        return null;
    }

    @Override // defpackage.dzjv
    public final boolean c() {
        return g() == 3;
    }

    public abstract int d();

    public abstract ejwi e();

    public abstract boolean f();

    public abstract int g();

    public abstract void h();
}
