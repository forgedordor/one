package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzus implements dzjv {
    public static final dzuq h() {
        dzuj dzujVar = new dzuj();
        dzujVar.a = 10;
        byte b = dzujVar.c;
        dzujVar.b = true;
        dzujVar.c = (byte) (b | 3);
        dzujVar.e = new dzur(1.0f);
        dzujVar.d = 1;
        dzujVar.c = (byte) (dzujVar.c | 4);
        return dzujVar;
    }

    @Override // defpackage.dzjv
    public abstract int a();

    @Override // defpackage.dzjv
    public final /* synthetic */ fcsu b() {
        return null;
    }

    @Override // defpackage.dzjv
    public final boolean c() {
        return e() == 3;
    }

    public abstract boolean d();

    public abstract int e();

    public abstract dzur f();

    public abstract void g();
}
