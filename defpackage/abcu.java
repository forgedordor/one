package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abcu extends fcyz implements fdat {
    final /* synthetic */ abcv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcu(abcv abcvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = abcvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!((Boolean) ((cczi) abcv.a.get()).e()).booleanValue()) {
            return fcvo.a;
        }
        bozw bozwVarA = bpab.a();
        bozwVarA.A("collectPsdData");
        boolean zU = bozwVarA.b().U();
        cdew cdewVar = new cdew();
        cdewVar.b("HasPairedDittoClients");
        cdewVar.c(String.valueOf(zU));
        return fcva.b(cdewVar.a());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abcu(this.a, fcxyVar);
    }
}
