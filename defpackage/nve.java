package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nve implements Comparable {
    public final long a;
    public final byte[] b;

    public nve(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((nve) obj).a);
    }
}
