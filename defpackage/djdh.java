package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdh implements djcw {
    public final String a;
    public final String b;
    public final fdae c;
    public final fdae d;

    public djdh(String str, String str2, fdae fdaeVar, fdae fdaeVar2) {
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
        this.d = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djdh)) {
            return false;
        }
        djdh djdhVar = (djdh) obj;
        return fdbq.f(this.a, djdhVar.a) && fdbq.f(this.b, djdhVar.b) && fdbq.f(this.c, djdhVar.c) && fdbq.f(this.d, djdhVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        fdae fdaeVar = this.c;
        return ((iHashCode2 + (fdaeVar != null ? fdaeVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowHeaderUiData(headerText=" + this.a + ", onClick=<redacted>, onDismiss=<redacted>)";
    }

    public /* synthetic */ djdh(String str, String str2, fdae fdaeVar, fdae fdaeVar2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : fdaeVar, fdaeVar2);
    }
}
