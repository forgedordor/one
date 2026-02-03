package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhq implements Comparable {
    private final boolean a;
    private final boolean b;

    public nhq(mau mauVar, int i) {
        this.a = 1 == (mauVar.e & 1);
        this.b = mti.g(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nhq nhqVar) {
        return ekdr.b.e(this.b, nhqVar.b).e(this.a, nhqVar.a).a();
    }
}
