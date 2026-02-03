package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esum {
    public final fbrb a;
    public final fbod b;
    public final fbod c;
    public final fbod d;

    public esum(fbrb fbrbVar, fbod fbodVar, fbod fbodVar2, fbod fbodVar3) {
        this.a = fbrbVar;
        this.b = fbodVar;
        this.c = fbodVar2;
        this.d = fbodVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esum)) {
            return false;
        }
        esum esumVar = (esum) obj;
        return fdbq.f(this.a, esumVar.a) && fdbq.f(this.b, esumVar.b) && fdbq.f(this.c, esumVar.c) && fdbq.f(this.d, esumVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}
