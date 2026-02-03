package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfi extends ekgi {
    public ekfi() {
    }

    @Override // defpackage.ekgi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekfk c() {
        int i = this.b;
        return i == 0 ? ekod.a : new ekod(this.a, i);
    }

    @Override // defpackage.ekgi
    @Deprecated
    public final /* bridge */ /* synthetic */ ekgp b() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    public final void d(Object obj, Object obj2) {
        super.i(obj, obj2);
    }

    public final void e(Iterable iterable) {
        super.l(iterable);
    }

    public final void f(Map map) {
        super.g(map);
    }

    @Override // defpackage.ekgi
    public final /* synthetic */ void g(Map map) {
        super.g(map);
    }

    public ekfi(int i) {
        super(i);
    }
}
