package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhr extends ekgb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ eknz c;
    final /* synthetic */ ekhu e;

    public ekhr(ekhu ekhuVar, int i, int i2, eknz eknzVar) {
        this.a = i;
        this.b = i2;
        this.c = eknzVar;
        this.e = ekhuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.a;
        ejwl.v(i, i2);
        if (i == 0 || i == i2 - 1) {
            return ((eknz) this.e.c.get(i + this.b)).e(this.c);
        }
        return (eknz) this.e.c.get(i + this.b);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
