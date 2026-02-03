package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzuv implements dzjv {
    public static final dzuu f() {
        dzul dzulVar = new dzul();
        dzulVar.a = 0.5f;
        dzulVar.b = (byte) 1;
        dzulVar.c = 1;
        return dzulVar;
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
        return e() == 3;
    }

    public abstract float d();

    public abstract int e();
}
