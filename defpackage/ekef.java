package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekef extends ekan {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekef(Iterable[] iterableArr) {
        super(2, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.ekan
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
