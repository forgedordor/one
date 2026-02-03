package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhu implements dzhw {
    private final feji a;
    private final Comparable b;

    public dzhu(feji fejiVar, Comparable comparable) {
        this.a = fejiVar;
        this.b = comparable;
    }

    @Override // defpackage.dzhw
    public final long a() {
        return this.a.getSerializedSize();
    }

    @Override // defpackage.dzhw
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((dzhu) obj).b);
    }
}
