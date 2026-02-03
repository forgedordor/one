package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhv {
    public final List a;
    public final long b;
    public final long c;
    public final List d;
    public final long e;
    public final long f;

    public dlhv(List list, long j, long j2, List list2, long j3, long j4) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = list2;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhv)) {
            return false;
        }
        dlhv dlhvVar = (dlhv) obj;
        if (!fdbq.f(this.a, dlhvVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = dlhvVar.b;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.c, dlhvVar.c) && fdbq.f(this.d, dlhvVar.d) && fcts.a(this.e, dlhvVar.e) && fcts.a(this.f, dlhvVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = ije.a;
        List list = this.d;
        return ((((((((iHashCode + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + list.hashCode()) * 31) + fctr.a(this.e)) * 31) + fctr.a(this.f);
    }

    public final String toString() {
        long j = this.f;
        long j2 = this.e;
        long j3 = this.c;
        return "TextualBubbleColorData(normalBackgroundColor=" + this.a + ", normalTextColor=" + ije.g(this.b) + ", normalLinkColor=" + ije.g(j3) + ", highlightedBackgroundColors=" + this.d + ", highlightedTextColor=" + ije.g(j2) + ", highlightedLinkColor=" + ije.g(j) + ")";
    }
}
