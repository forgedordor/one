package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elbf extends elbb implements elch {
    private static Map h(final elch elchVar) {
        return new eklx(elchVar.c(), new ejvr() { // from class: elbe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                elbk elbkVar = (elbk) obj;
                Object obj2 = elbkVar.a;
                Object obj3 = elbkVar.b;
                Object objG = elchVar.g(obj2);
                objG.getClass();
                return objG;
            }
        });
    }

    @Override // defpackage.elbb, defpackage.elca
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elch)) {
            return false;
        }
        elch elchVar = (elch) obj;
        elchVar.f();
        return d().equals(elchVar.d()) && h(this).equals(h(elchVar));
    }

    public final int hashCode() {
        return h(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + h(this).toString();
    }
}
