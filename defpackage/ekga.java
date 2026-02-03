package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekga extends ekgb {
    final transient int a;
    final transient int b;
    final /* synthetic */ ekgb c;

    public ekga(ekgb ekgbVar, int i, int i2) {
        this.c = ekgbVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ekgb
    /* renamed from: b */
    public final ekgb subList(int i, int i2) {
        ejwl.k(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.ekfn
    public final int e() {
        return this.c.f() + this.a + this.b;
    }

    @Override // defpackage.ekfn
    public final int f() {
        return this.c.f() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ejwl.v(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ekfn
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.ekgb, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
