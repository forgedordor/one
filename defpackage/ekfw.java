package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfw extends ekfl {
    public ekfw() {
        super(4);
    }

    @Override // defpackage.ekfl, defpackage.ekfm
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final ekgb g() {
        this.c = true;
        return ekgb.i(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public ekfw(int i) {
        super(i);
    }
}
