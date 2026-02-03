package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnll extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnlm b;
    final /* synthetic */ ezol c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnll(cnlm cnlmVar, ezol ezolVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnlmVar;
        this.c = ezolVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnll) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnlm cnlmVar = this.b;
            ezol ezolVar = this.c;
            int i2 = this.d;
            this.a = 1;
            if (cnlmVar.a.s(ezolVar, i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnll(this.b, this.c, this.d, fcxyVar);
    }
}
