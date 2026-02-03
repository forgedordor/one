package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqwn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqwl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqwn(dqwl dqwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqwn) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            final dqwo dqwoVar = new dqwo(fdosVar);
            final dqwl dqwlVar = this.b;
            dqwlVar.M(dqwoVar);
            fdoj.a(fdosVar, dqwlVar);
            fdae fdaeVar = new fdae() { // from class: dqwm
                @Override // defpackage.fdae
                public final Object invoke() {
                    dqwlVar.Q(dqwoVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqwn dqwnVar = new dqwn(this.b, fcxyVar);
        dqwnVar.c = obj;
        return dqwnVar;
    }
}
