package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpvs {
    public final ekgb a;
    public final String b;
    public final int c;

    public cpvs(ekgb ekgbVar, String str, int i) {
        ekgbVar.getClass();
        str.getClass();
        this.a = ekgbVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpvs)) {
            return false;
        }
        cpvs cpvsVar = (cpvs) obj;
        return fdbq.f(this.a, cpvsVar.a) && fdbq.f(this.b, cpvsVar.b) && this.c == cpvsVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ListCmsItemsResult(cmsItems=" + this.a + ", pageToken=" + this.b + ", totalSize=" + this.c + ")";
    }
}
