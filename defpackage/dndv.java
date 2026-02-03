package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndv extends mo {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ fdat c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdat e;

    public dndv(List list, List list2, fdat fdatVar, fdat fdatVar2, fdat fdatVar3) {
        this.a = list;
        this.b = list2;
        this.c = fdatVar;
        this.d = fdatVar2;
        this.e = fdatVar3;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.mo
    public final Object c(int i, int i2) {
        List list = this.b;
        return this.e.a(this.a.get(i), list.get(i2));
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        List list = this.b;
        return ((Boolean) this.d.a(this.a.get(i), list.get(i2))).booleanValue();
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        List list = this.b;
        return ((Boolean) this.c.a(this.a.get(i), list.get(i2))).booleanValue();
    }
}
