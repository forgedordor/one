package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czj extends fdbr implements fdap {
    final /* synthetic */ dap a;
    final /* synthetic */ dar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czj(dap dapVar, dar darVar) {
        super(1);
        this.a = dapVar;
        this.b = darVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iOrdinal = ((cze) obj).ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            dat datVar = this.a.b().a;
            if (datVar != null) {
                f = datVar.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            dat datVar2 = this.b.b().a;
            if (datVar2 != null) {
                f = datVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
