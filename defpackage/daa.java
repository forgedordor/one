package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daa extends fdbr implements fdap {
    final /* synthetic */ fdap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daa(fdap fdapVar) {
        super(1);
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((kjg) obj).a >> 32;
        return new kjg((((Number) this.a.invoke(Integer.valueOf((int) (r0 & 4294967295L)))).intValue() & 4294967295L) | (((int) j) << 32));
    }
}
