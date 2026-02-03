package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikt implements diky {
    public final String a;
    private final String b;

    public dikt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikt)) {
            return false;
        }
        dikt diktVar = (dikt) obj;
        return fdbq.f(this.a, diktVar.a) && fdbq.f(this.b, diktVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(fileSizeString=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
