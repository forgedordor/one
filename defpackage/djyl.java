package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyl implements djyu {
    public final dkri a;
    public final String b;
    public final String c;
    public final List d;
    public final fdae e;
    public final djyo f;
    private final String g;

    public /* synthetic */ djyl(dkri dkriVar, String str, String str2, List list, fdae fdaeVar, djyo djyoVar, int i) {
        list = (i & 16) != 0 ? fcvo.a : list;
        fdaeVar = (i & 32) != 0 ? new fdae() { // from class: djyk
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        djyoVar = (i & 64) != 0 ? new djyo((byte[]) null) : djyoVar;
        str2 = (i & 4) != 0 ? null : str2;
        list.getClass();
        fdaeVar.getClass();
        djyoVar.getClass();
        this.a = dkriVar;
        this.b = str;
        this.c = str2;
        this.g = null;
        this.d = list;
        this.e = fdaeVar;
        this.f = djyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djyl)) {
            return false;
        }
        djyl djylVar = (djyl) obj;
        if (!fdbq.f(this.a, djylVar.a) || !fdbq.f(this.b, djylVar.b) || !fdbq.f(this.c, djylVar.c)) {
            return false;
        }
        String str = djylVar.g;
        return fdbq.f(null, null) && fdbq.f(this.d, djylVar.d) && fdbq.f(this.e, djylVar.e) && fdbq.f(this.f, djylVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 961) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Basic(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", tertiaryText=null, annotations=" + this.d + ", onClick=" + this.e + ", flags=" + this.f + ")";
    }
}
