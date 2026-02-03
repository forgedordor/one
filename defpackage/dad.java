package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dad extends fdbr implements fdap {
    final /* synthetic */ fdap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dad(fdap fdapVar) {
        super(1);
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        return new kjb(((Number) this.a.invoke(Integer.valueOf((int) (((kjg) obj).a & 4294967295L)))).intValue() & 4294967295L);
    }
}
