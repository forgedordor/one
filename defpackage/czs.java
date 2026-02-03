package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czs extends fdbr implements fdap {
    final /* synthetic */ fdap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czs(fdap fdapVar) {
        super(1);
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        return new kjg((((int) (r0 & 4294967295L)) & 4294967295L) | (((Number) this.a.invoke(Integer.valueOf((int) (((kjg) obj).a >> 32)))).intValue() << 32));
    }
}
