package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajh {
    public final dktz a;
    public final aahj b;

    public aajh(dktz dktzVar, aahj aahjVar) {
        aahjVar.getClass();
        this.a = dktzVar;
        this.b = aahjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aajh)) {
            return false;
        }
        aajh aajhVar = (aajh) obj;
        return fdbq.f(this.a, aajhVar.a) && fdbq.f(this.b, aajhVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RbmTopAppBarUiData(appBar=" + this.a + ", backBehavior=" + this.b + ")";
    }
}
