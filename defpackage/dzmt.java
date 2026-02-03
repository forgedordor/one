package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzmt implements dzjv {
    public static final dzms h() {
        dzmq dzmqVar = new dzmq();
        dzmqVar.a = 100.0f;
        dzmqVar.e = 1;
        dzmqVar.b = 100;
        dzmqVar.d = (byte) 3;
        return dzmqVar;
    }

    @Override // defpackage.dzjv
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.dzjv
    public abstract fcsu b();

    @Override // defpackage.dzjv
    public final boolean c() {
        int iG = g();
        return iG == 3 || iG == 1;
    }

    public abstract float d();

    public abstract int e();

    public abstract ejwi f();

    public abstract int g();
}
