package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djys implements djyu {
    public final dkri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final fdae f;
    public final djyo g;

    public djys(dkri dkriVar, String str, String str2, boolean z, List list, fdae fdaeVar, djyo djyoVar) {
        this.a = dkriVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = fdaeVar;
        this.g = djyoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djys)) {
            return false;
        }
        djys djysVar = (djys) obj;
        return fdbq.f(this.a, djysVar.a) && fdbq.f(this.b, djysVar.b) && fdbq.f(this.c, djysVar.c) && this.d == djysVar.d && fdbq.f(this.e, djysVar.e) && fdbq.f(this.f, djysVar.f) && fdbq.f(this.g, djysVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Selectable(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isSelected=" + this.d + ", annotations=" + this.e + ", onToggle=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ djys(dkri dkriVar, String str, String str2, boolean z, fdae fdaeVar, djyo djyoVar) {
        this(dkriVar, str, str2, z, fcvo.a, fdaeVar, djyoVar);
    }
}
