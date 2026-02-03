package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtd extends cbtf {
    public final epwc a;

    public cbtd(epwc epwcVar) {
        epwcVar.getClass();
        this.a = epwcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbtd) && fdbq.f(this.a, ((cbtd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Mls(fileMetadata=" + this.a + ")";
    }
}
