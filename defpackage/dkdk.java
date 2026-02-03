package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdk implements dkdm {
    public final djrr a;
    public final String b;

    public dkdk(djrr djrrVar, String str) {
        djrrVar.getClass();
        this.a = djrrVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkdk)) {
            return false;
        }
        dkdk dkdkVar = (dkdk) obj;
        return this.a == dkdkVar.a && fdbq.f(this.b, dkdkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", bottomLabel=" + this.b + ")";
    }

    public /* synthetic */ dkdk(djrr djrrVar) {
        this(djrrVar, null);
    }
}
