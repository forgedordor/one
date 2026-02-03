package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afqa extends fcyz implements fdat {
    int a;
    final /* synthetic */ afqm b;
    final /* synthetic */ vvr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqa(fcxy fcxyVar, afqm afqmVar, vvr vvrVar) {
        super(2, fcxyVar);
        this.b = afqmVar;
        this.c = vvrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            afqm afqmVar = this.b;
            vvr vvrVar = this.c;
            wmv wmvVar = new wmv(null);
            this.a = 1;
            obj = afqmVar.m.a(vvrVar, wmvVar, null, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        wnq wnqVar = ((wno) obj).a;
        int iOrdinal = this.b.d.ordinal();
        return new amts(wnqVar, iOrdinal != 1 ? iOrdinal != 2 ? elha.UNKNOWN : elha.FORWARD : elha.SHARE);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqa afqaVar = new afqa(fcxyVar, this.b, this.c);
        afqaVar.d = obj;
        return afqaVar;
    }
}
