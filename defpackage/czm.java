package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czm extends fdbr implements fdap {
    final /* synthetic */ dap a;
    final /* synthetic */ dar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czm(dap dapVar, dar darVar) {
        super(1);
        this.a = dapVar;
        this.b = darVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iOrdinal = ((cze) obj).ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            daz dazVar = this.a.b().d;
            if (dazVar != null) {
                f = dazVar.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            daz dazVar2 = this.b.b().d;
            if (dazVar2 != null) {
                f = dazVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
