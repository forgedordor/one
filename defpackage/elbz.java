package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elbz extends elbf {
    final elbw a;

    public elbz(elbd elbdVar) {
        Map mapH;
        elbi elbiVar = elbdVar.a;
        Integer num = 10;
        num.getClass();
        int iOrdinal = elbiVar.a.ordinal();
        if (iOrdinal == 0) {
            mapH = ekmi.h(10);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    throw new UnsupportedOperationException("This ordering does not define a comparator.");
                }
                throw new AssertionError();
            }
            mapH = ekmi.j(10);
        }
        this.a = new elbw(mapH);
        ejwl.e(true, "Not true that %s is non-negative.", 0L);
    }

    @Override // defpackage.elbb
    protected final long a() {
        return 0L;
    }

    @Override // defpackage.elbf, defpackage.elbb, defpackage.elca
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.elbg, defpackage.elbo
    public final Set d() {
        return new elbv(this.a);
    }

    @Override // defpackage.elbg, defpackage.elbo
    public final Set e(final Object obj) {
        elbq elbqVar = (elbq) this.a.a(obj);
        if (elbqVar == null) {
            obj.getClass();
            throw new IllegalArgumentException(a.b(obj, "Node ", " is not an element of this graph."));
        }
        Set setA = elbqVar.a();
        ejxr ejxrVar = new ejxr() { // from class: elay
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.d().contains(obj));
            }
        };
        ejxr ejxrVar2 = new ejxr() { // from class: elaz
            @Override // defpackage.ejxr
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
            }
        };
        setA.getClass();
        return new elbt(setA, ejxrVar, ejxrVar2);
    }

    @Override // defpackage.elch
    public final Object g(Object obj) {
        elbq elbqVar = (elbq) this.a.a(obj);
        Object objB = elbqVar == null ? null : elbqVar.b();
        if (objB == null) {
            return null;
        }
        return objB;
    }

    @Override // defpackage.elch
    public final void f() {
    }
}
