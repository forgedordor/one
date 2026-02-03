package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dloh {
    public final dlnq a;
    public final dihq b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final fdap f;
    private final dlog g;

    public /* synthetic */ dloh(dlnq dlnqVar, dihq dihqVar, List list, boolean z, boolean z2, fdap fdapVar, dlog dlogVar, int i) {
        list = (i & 4) != 0 ? fcvo.a : list;
        boolean z3 = z | (!((i & 8) == 0));
        boolean z4 = z2 & ((i & 16) == 0);
        fdapVar = (i & 32) != 0 ? new fdap() { // from class: dlof
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return fctx.a;
            }
        } : fdapVar;
        dlogVar = (i & 64) != 0 ? new dlog(null) : dlogVar;
        dihqVar.getClass();
        list.getClass();
        fdapVar.getClass();
        dlogVar.getClass();
        this.a = dlnqVar;
        this.b = dihqVar;
        this.c = list;
        this.d = z3;
        this.e = z4;
        this.f = fdapVar;
        this.g = dlogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dloh)) {
            return false;
        }
        dloh dlohVar = (dloh) obj;
        return fdbq.f(this.a, dlohVar.a) && fdbq.f(this.b, dlohVar.b) && fdbq.f(this.c, dlohVar.c) && this.d == dlohVar.d && this.e == dlohVar.e && fdbq.f(this.f, dlohVar.f) && fdbq.f(this.g, dlohVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fdap fdapVar = this.f;
        return (((((((iHashCode * 31) + dloe.a(this.d)) * 31) + dloe.a(this.e)) * 31) + fdapVar.hashCode()) * 31) + 39584;
    }

    public final String toString() {
        return "TopAppBarUiData(middleUiData=" + this.a + ", onBackAction=" + this.b + ", actions=" + this.c + ", liftOnScroll=" + this.d + ", isTranslucent=" + this.e + ", onInteractive=" + this.f + ", flags=" + this.g + ")";
    }
}
