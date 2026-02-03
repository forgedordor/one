package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtt {
    public final String a;
    public final boolean b;
    public final List c;
    public final fdae d;
    private final djrr e;

    public /* synthetic */ xtt(String str, boolean z, List list, fdae fdaeVar, int i) {
        list = (i & 8) != 0 ? fcvo.a : list;
        boolean z2 = (i & 4) == 0;
        list.getClass();
        this.a = str;
        this.e = null;
        this.b = z | (!z2);
        this.c = list;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtt)) {
            return false;
        }
        xtt xttVar = (xtt) obj;
        if (!fdbq.f(this.a, xttVar.a)) {
            return false;
        }
        djrr djrrVar = xttVar.e;
        return this.b == xttVar.b && fdbq.f(this.c, xttVar.c) && fdbq.f(this.d, xttVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DebugActionUiData(title=" + this.a + ", icon=null, isVisible=" + this.b + ", subActions=" + this.c + ", execute=" + this.d + ")";
    }
}
