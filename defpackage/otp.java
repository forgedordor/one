package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ots b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otp(ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ots otsVar = this.b;
            oql oqlVar = otsVar.e;
            fdpl fdplVarC = fdsn.c(oqlVar.b(orr.c), oqlVar.b(orr.b));
            oto otoVar = new oto(otsVar, null);
            this.a = 1;
            obj = fdtc.d(fdplVarC, otoVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        oxh oxhVar = (oxh) obj;
        if (oxhVar != null) {
            ots otsVar2 = this.b;
            if (ovs.a(3)) {
                ovs.b(3, "Jump triggered on PagingSource " + otsVar2.a + " by " + oxhVar);
            }
            otsVar2.d.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new otp(this.b, fcxyVar);
    }
}
