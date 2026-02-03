package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ent extends icr implements jbp {
    public LazyLayoutItemAnimator a;

    public ent(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        this.a = lazyLayoutItemAnimator;
    }

    @Override // defpackage.icr
    public final void dU() {
        this.a.b = this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ent) && fdbq.f(this.a, ((ent) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ens ensVar = (ens) list.get(i);
            ini iniVar = ensVar.d;
            if (iniVar != null) {
                long j = ensVar.c;
                int iA = kjb.a(j);
                int iB = kjb.b(j);
                float fA = iA - kjb.a(iniVar.m);
                float fB = iB - kjb.b(r6);
                imwVar.t().c.e(fA, fB);
                float f = -fA;
                float f2 = -fB;
                try {
                    inm.a(imwVar, iniVar);
                } finally {
                    imwVar.t().c.e(f, f2);
                }
            }
        }
        imwVar.p();
    }

    @Override // defpackage.icr
    public final void s() {
        this.a.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
