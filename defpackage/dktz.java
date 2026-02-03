package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktz {
    public final dihr a;
    public final String b;
    public final String c;
    public final List d;
    public final fdae e;
    public final dkty f;

    public dktz(dihr dihrVar, dkty dktyVar, String str, String str2, List list, fdae fdaeVar) {
        str.getClass();
        list.getClass();
        this.a = dihrVar;
        this.f = dktyVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dktz)) {
            return false;
        }
        dktz dktzVar = (dktz) obj;
        return fdbq.f(this.a, dktzVar.a) && fdbq.f(this.f, dktzVar.f) && fdbq.f(this.b, dktzVar.b) && fdbq.f(this.c, dktzVar.c) && fdbq.f(this.d, dktzVar.d) && fdbq.f(this.e, dktzVar.e);
    }

    public final int hashCode() {
        dihr dihrVar = this.a;
        int iHashCode = ((((dihrVar == null ? 0 : dihrVar.hashCode()) * 31) + this.f.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        return (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AppBarUiData(navigationAction=" + this.a + ", logo=" + this.f + ", title=" + this.b + ", description=" + this.c + ", actions=" + this.d + ", onClick=" + this.e + ")";
    }
}
