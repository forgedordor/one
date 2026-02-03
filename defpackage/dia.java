package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dia implements der {
    private final int a;
    private final int b;
    private final des c;

    public dia() {
        this(0, (des) null, 7);
    }

    @Override // defpackage.ddz
    public final /* bridge */ /* synthetic */ diw a(dib dibVar) {
        return c();
    }

    @Override // defpackage.der
    public final /* bridge */ /* synthetic */ djb b(dib dibVar) {
        return c();
    }

    public final djl c() {
        return new djl(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dia)) {
            return false;
        }
        dia diaVar = (dia) obj;
        return diaVar.a == this.a && diaVar.b == this.b && fdbq.f(diaVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public dia(int i, int i2, des desVar) {
        this.a = i;
        this.b = i2;
        this.c = desVar;
    }

    public /* synthetic */ dia(int i, des desVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? dev.a : desVar);
    }
}
