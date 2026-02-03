package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwj {
    public final ahwk a;
    public final ahwk b;
    public final ahwk c;
    private final ahwk d;

    public ahwj(ahwk ahwkVar, ahwk ahwkVar2, ahwk ahwkVar3, ahwk ahwkVar4) {
        this.a = ahwkVar;
        this.b = ahwkVar2;
        this.d = ahwkVar3;
        this.c = ahwkVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahwj)) {
            return false;
        }
        ahwj ahwjVar = (ahwj) obj;
        return fdbq.f(this.a, ahwjVar.a) && fdbq.f(this.b, ahwjVar.b) && fdbq.f(this.d, ahwjVar.d) && fdbq.f(this.c, ahwjVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AssetInfoCounts(backupCounts=" + this.a + ", restoredCounts=" + this.b + ", updatedCounts=" + this.d + ", duplicateCounts=" + this.c + ")";
    }
}
