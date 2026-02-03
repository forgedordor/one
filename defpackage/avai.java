package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avai extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ fdat e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avai(fdpl fdplVar, int i, long j, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = i;
        this.d = j;
        this.e = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avai) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avah avahVar = new avah(this.b, this.c, this.d, (fdpm) this.f, this.e, null);
            this.a = 1;
            if (fdjy.a(avahVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avai avaiVar = new avai(this.b, this.c, this.d, this.e, fcxyVar);
        avaiVar.f = obj;
        return avaiVar;
    }
}
