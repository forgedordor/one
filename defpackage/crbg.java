package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbg {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final ezac f;

    public crbg() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crbg)) {
            return false;
        }
        crbg crbgVar = (crbg) obj;
        return fdbq.f(this.a, crbgVar.a) && fdbq.f(this.b, crbgVar.b) && fdbq.f(this.c, crbgVar.c) && fdbq.f(this.d, crbgVar.d) && fdbq.f(this.e, crbgVar.e) && this.f == crbgVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SmartsResults(suggestionItems=" + this.a + ", classifications=" + this.b + ", messageClassifications=" + this.c + ", conversationClassifications=" + this.d + ", performanceMetrics=" + this.e + ", rejectionReason=" + this.f + ")";
    }

    public /* synthetic */ crbg(List list, List list2, List list3, List list4, List list5, ezac ezacVar, int i) {
        list = (i & 1) != 0 ? fcvo.a : list;
        list2 = (i & 2) != 0 ? fcvo.a : list2;
        list3 = (i & 4) != 0 ? fcvo.a : list3;
        list4 = (i & 8) != 0 ? fcvo.a : list4;
        list5 = (i & 16) != 0 ? fcvo.a : list5;
        ezacVar = (i & 32) != 0 ? ezac.UNKNOWN_REJECTION_REASON : ezacVar;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        ezacVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = ezacVar;
    }
}
