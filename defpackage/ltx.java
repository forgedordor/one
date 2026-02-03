package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ltx implements ltu {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    public ltx(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ltu
    public final long a(float f, float f2) {
        float f3 = f2 + this.c;
        float f4 = f + this.a;
        float f5 = this.b;
        return csy.a(f4 / f5, f3 / f5);
    }
}
