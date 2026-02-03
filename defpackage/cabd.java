package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabd extends fcyz implements fdat {
    final /* synthetic */ byir a;
    final /* synthetic */ cabe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cabd(fcxy fcxyVar, byir byirVar, cabe cabeVar) {
        super(2, fcxyVar);
        this.a = byirVar;
        this.b = cabeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cabd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        byiq byiqVarB = byiq.b(this.a.d);
        if (byiqVarB == null) {
            byiqVarB = byiq.UNSPECIFIED;
        }
        byiqVarB.getClass();
        if (((cabh) Map.EL.getOrDefault(this.b.b, byiqVarB, null)) == null) {
            throw new IllegalArgumentException("Undefined CMS Backfill Missing Field task type.");
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cabd cabdVar = new cabd(fcxyVar, this.a, this.b);
        cabdVar.c = obj;
        return cabdVar;
    }
}
