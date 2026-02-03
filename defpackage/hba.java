package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hba extends fcyz implements fdat {
    final /* synthetic */ jfw a;
    final /* synthetic */ fyf b;
    final /* synthetic */ hbl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hba(jfw jfwVar, fyf fyfVar, hbl hblVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = jfwVar;
        this.b = fyfVar;
        this.c = hblVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hba) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        jfw jfwVar = this.a;
        if (fdbq.f(jfwVar.a, true)) {
            fyf fyfVar = this.b;
            hbl hblVar = this.c;
            fyfVar.h(hblVar.d());
            int iE = hblVar.e();
            fyfVar.d = (iE * 0.10471976f) - 1.5707964f;
            hbl hblVar2 = fyfVar.a;
            hblVar2.i(iE);
            if (hbk.b(fyfVar.f(), 1)) {
                fyfVar.e = ddq.a(fyfVar.d);
            }
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                hblVar2.i(fyfVar.e());
            } finally {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
            }
        }
        jfwVar.a = true;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hba(this.a, this.b, this.c, fcxyVar);
    }
}
