package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwp extends fdbr implements fdap {
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwp(Object obj) {
        super(1);
        this.a = obj;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(fdbq.f(obj, this.a));
    }
}
