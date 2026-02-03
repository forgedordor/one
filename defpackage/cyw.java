package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyw extends fdbr implements fdap {
    final /* synthetic */ dhk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyw(dhk dhkVar) {
        super(1);
        this.a = dhkVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(!fdbq.f(obj, this.a.f()));
    }
}
