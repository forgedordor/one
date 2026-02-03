package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccal extends ccan {
    public final String a;
    public final eyxu b;
    public final boolean c;
    public final List d;

    public ccal(String str, eyxu eyxuVar, boolean z, List list) {
        str.getClass();
        eyxuVar.getClass();
        this.a = str;
        this.b = eyxuVar;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccal)) {
            return false;
        }
        ccal ccalVar = (ccal) obj;
        return fdbq.f(this.a, ccalVar.a) && fdbq.f(this.b, ccalVar.b) && this.c == ccalVar.c && fdbq.f(this.d, ccalVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        List list = this.d;
        return (((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "MlsGroupInfo(responseKey=" + this.a + ", groupInfoResponse=" + this.b + ", forEraAdvancement=" + this.c + ", keyPackages=" + this.d + ")";
    }
}
