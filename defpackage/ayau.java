package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayau extends fcyz implements fdat {
    int a;
    final /* synthetic */ aybe b;
    final /* synthetic */ aymo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayau(aybe aybeVar, aymo aymoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aybeVar;
        this.c = aymoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayau) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aybe aybeVar = this.b;
        aymo aymoVar = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(aybeVar.I), new ayaa(null, aymoVar, aybeVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ayau(this.b, this.c, fcxyVar);
    }
}
