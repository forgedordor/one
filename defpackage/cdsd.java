package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsd {
    public final String a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    public cdsd() {
        String str = null;
        this(str, str, str, 7);
    }

    public static /* synthetic */ cdsd a(cdsd cdsdVar, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = cdsdVar.a;
        }
        if ((i & 2) != 0) {
            str2 = cdsdVar.b;
        }
        if ((i & 4) != 0) {
            str3 = cdsdVar.c;
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new cdsd(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdsd)) {
            return false;
        }
        cdsd cdsdVar = (cdsd) obj;
        return fdbq.f(this.a, cdsdVar.a) && fdbq.f(this.b, cdsdVar.b) && fdbq.f(this.c, cdsdVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Metadata(title=" + this.a + ", description=" + this.b + ", imageUrl=" + this.c + ")";
    }

    public cdsd(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public /* synthetic */ cdsd(String str, String str2, String str3, int i) {
        this(1 == (i & 1) ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
