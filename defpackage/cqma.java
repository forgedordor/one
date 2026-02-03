package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqma implements Comparable {
    final int a;
    final int b;

    public cqma(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cqma cqmaVar = (cqma) obj;
        int i = this.a - cqmaVar.a;
        return i != 0 ? i : this.b - cqmaVar.b;
    }
}
