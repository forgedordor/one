package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnsd b;
    final /* synthetic */ cnsa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnsc(cnsd cnsdVar, cnsa cnsaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnsdVar;
        this.c = cnsaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnsc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnsd cnsdVar = this.b;
            cnsb cnsbVar = new cnsb(cnsdVar, this.c, null);
            this.a = 1;
            if (aipq.a(cnsdVar.c, "Bugle.Telephony.ForwardSync.SpotSyncWorkHandler.Duration", cnsbVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnsc(this.b, this.c, fcxyVar);
    }
}
