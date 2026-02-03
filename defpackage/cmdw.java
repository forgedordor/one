package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmdw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmdx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmdw(cmdx cmdxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmdxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmdw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmdx cmdxVar = this.b;
            fdpl fdplVarA = fdqc.a(new fdpb(new cmdt(cmdxVar, null)));
            cmdv cmdvVar = new cmdv(cmdxVar);
            this.a = 1;
            if (fdplVarA.a(cmdvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmdw(this.b, fcxyVar);
    }
}
