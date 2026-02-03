package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class disb {
    public final String a;
    public final disa b;
    public final disa c;
    public final dito d;
    public final String e;
    public final fdae f;
    private final boolean g;

    public disb() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disb)) {
            return false;
        }
        disb disbVar = (disb) obj;
        if (!fdbq.f(this.a, disbVar.a) || !fdbq.f(this.b, disbVar.b) || !fdbq.f(this.c, disbVar.c) || !fdbq.f(this.d, disbVar.d) || !fdbq.f(this.e, disbVar.e)) {
            return false;
        }
        boolean z = disbVar.g;
        return fdbq.f(this.f, disbVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        disa disaVar = this.b;
        int iHashCode2 = disaVar == null ? 0 : disaVar.hashCode();
        int i = iHashCode * 31;
        disa disaVar2 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (disaVar2 == null ? 0 : disaVar2.hashCode())) * 31;
        dito ditoVar = this.d;
        int iHashCode4 = (iHashCode3 + (ditoVar == null ? 0 : ditoVar.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + 1237) * 31;
        fdae fdaeVar = this.f;
        return iHashCode5 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "Full(title=" + this.a + ", confirmButtonData=" + this.b + ", dismissButtonData=" + this.c + ", symbol=" + this.d + ", text=" + this.e + ", isError=false, onClose=" + this.f + ")";
    }

    public /* synthetic */ disb(String str, disa disaVar, disa disaVar2, dito ditoVar, String str2, fdae fdaeVar, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : disaVar;
        this.c = (i & 4) != 0 ? null : disaVar2;
        this.d = (i & 8) != 0 ? null : ditoVar;
        this.e = (i & 16) != 0 ? null : str2;
        this.g = false;
        this.f = (i & 64) != 0 ? null : fdaeVar;
    }
}
