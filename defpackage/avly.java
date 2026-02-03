package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avly extends fcyz implements fdap {
    int a;
    final /* synthetic */ avmg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avly(avmg avmgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = avmgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avmg avmgVar = this.b;
            avlx avlxVar = new avlx(avmgVar, null);
            this.a = 1;
            if (fdin.a(avmgVar.b, avlxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new avly(this.b, (fcxy) obj).b(fctx.a);
    }
}
