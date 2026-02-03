package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejdb {
    public final fdvc a;
    public final fdvc b;
    public final fdvc c;
    public final fdvc d;

    public ejdb(fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4) {
        this.a = fdvcVar;
        this.b = fdvcVar2;
        this.c = fdvcVar3;
        this.d = fdvcVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejdb)) {
            return false;
        }
        ejdb ejdbVar = (ejdb) obj;
        return fdbq.f(this.a, ejdbVar.a) && fdbq.f(this.b, ejdbVar.b) && fdbq.f(this.c, ejdbVar.c) && fdbq.f(this.d, ejdbVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PenpalOnDeviceDownloadStatus(isStorageInsufficientFlow=" + this.a + ", bytesToDownloadFlow=" + this.b + ", totalBytesDownloadedFlow=" + this.c + ", downloadCompleteFlow=" + this.d + ")";
    }
}
