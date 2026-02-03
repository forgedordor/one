package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddd extends fdbr implements fdap {
    final /* synthetic */ fdae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddd(fdae fdaeVar) {
        super(1);
        this.a = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((ikl) obj).r(((Boolean) this.a.invoke()).booleanValue());
        return fctx.a;
    }
}
