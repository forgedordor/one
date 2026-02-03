package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkv implements dijt {
    public final String a;
    public final djrr b;
    private final List c;
    private final String d;
    private final String e;

    public /* synthetic */ dlkv(String str, List list, djrr djrrVar, int i) {
        list = (i & 2) != 0 ? fcvo.a : list;
        djrrVar = (i & 8) != 0 ? null : djrrVar;
        str.getClass();
        list.getClass();
        this.a = str;
        this.c = list;
        this.d = null;
        this.b = djrrVar;
        this.e = null;
    }

    @Override // defpackage.dijt
    public final String a() {
        return null;
    }

    @Override // defpackage.dijt
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkv)) {
            return false;
        }
        dlkv dlkvVar = (dlkv) obj;
        if (!fdbq.f(this.a, dlkvVar.a) || !fdbq.f(this.c, dlkvVar.c)) {
            return false;
        }
        String str = dlkvVar.d;
        if (!fdbq.f(null, null) || this.b != dlkvVar.b) {
            return false;
        }
        String str2 = dlkvVar.e;
        return fdbq.f(null, null);
    }

    @Override // defpackage.dijt
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.c.hashCode();
        djrr djrrVar = this.b;
        return ((iHashCode * 961) + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31;
    }

    public final String toString() {
        return "TombstoneLine(text=" + this.a + ", annotations=" + this.c + ", contentDescription=null, icon=" + this.b + ", iconContentDescription=null)";
    }
}
