package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class oun<T> extends AbstractList<T> {
    public final fdjx a;
    public final fdjq b;
    public final our c;
    public final ouj d;
    public final List e;
    public final List f;
    private final owd g;

    public oun(owd owdVar, fdjx fdjxVar, fdjq fdjqVar, our ourVar, ouj oujVar) {
        owdVar.getClass();
        fdjxVar.getClass();
        fdjqVar.getClass();
        oujVar.getClass();
        this.g = owdVar;
        this.a = fdjxVar;
        this.b = fdjqVar;
        this.c = ourVar;
        this.d = oujVar;
        int i = oujVar.b;
        int i2 = oujVar.a;
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public owd a() {
        return this.g;
    }

    public abstract Object b();

    public abstract void c(fdat fdatVar);

    public abstract void d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.c.get(i);
    }

    public void i(orr orrVar, orp orpVar) {
        orrVar.getClass();
    }

    public abstract boolean j();

    public final int l() {
        return this.c.f();
    }

    public final int m() {
        return this.c.b();
    }

    public final List n() {
        return v() ? this : new oxa(this);
    }

    public final void o(ouh ouhVar) {
        ouhVar.getClass();
        fdap fdapVar = new fdap() { // from class: oug
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == null);
            }
        };
        List list = this.e;
        fcva.x(list, fdapVar);
        list.add(new WeakReference(ouhVar));
    }

    public final void p(fdat fdatVar) {
        fdatVar.getClass();
        fdap fdapVar = new fdap() { // from class: oud
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == null);
            }
        };
        List list = this.f;
        fcva.x(list, fdapVar);
        list.add(new WeakReference(fdatVar));
        c(fdatVar);
    }

    public final void q(int i) {
        if (i >= 0 && i < l()) {
            our ourVar = this.c;
            ourVar.g = fddu.i(i - ourVar.b, 0, ourVar.f - 1);
            d(i);
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + l());
        }
    }

    public final void r(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = fcva.aj(this.e).iterator();
        while (it.hasNext()) {
            ouh ouhVar = (ouh) ((WeakReference) it.next()).get();
            if (ouhVar != null) {
                ouhVar.a(i, i2);
            }
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = fcva.aj(this.e).iterator();
        while (it.hasNext()) {
            ouh ouhVar = (ouh) ((WeakReference) it.next()).get();
            if (ouhVar != null) {
                ouhVar.b(i, i2);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return l();
    }

    public final void t(final ouh ouhVar) {
        ouhVar.getClass();
        fcva.x(this.e, new fdap() { // from class: ouf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                boolean z = true;
                if (weakReference.get() != null) {
                    if (weakReference.get() != ouhVar) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final void u(final fdat fdatVar) {
        fdatVar.getClass();
        fcva.x(this.f, new fdap() { // from class: oue
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                boolean z = true;
                if (weakReference.get() != null) {
                    if (weakReference.get() != fdatVar) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public boolean v() {
        return j();
    }
}
