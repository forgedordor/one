package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekii extends ekhv {
    private final Comparator e;

    public ekii(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.ekhv, defpackage.ekfl, defpackage.ekfm
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.ekhv
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ekik g() {
        ekik ekikVarX = ekik.x(this.e, this.b, this.a);
        this.b = ekikVarX.size();
        this.c = true;
        return ekikVarX;
    }

    public final void m(Object obj) {
        super.c(obj);
    }

    public final void n(Object... objArr) {
        super.h(objArr);
    }

    public final void o(Iterable iterable) {
        super.j(iterable);
    }
}
