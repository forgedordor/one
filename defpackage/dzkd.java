package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzkd implements dzjv {
    public static final dzkc g() {
        dzjx dzjxVar = new dzjx();
        dzjxVar.c(new dzke() { // from class: dzkb
            @Override // defpackage.dzke
            public final feeg d() {
                return null;
            }
        });
        dzjxVar.b = 1;
        dzjxVar.a = (byte) 1;
        return dzjxVar;
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

    public abstract dzke d();

    public abstract int e();

    public abstract void f();
}
