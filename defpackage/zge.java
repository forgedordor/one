package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zge extends fcyz implements fdat {
    final /* synthetic */ amwe a;
    final /* synthetic */ zgh b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zge(amwe amweVar, zgh zghVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amweVar;
        this.b = zghVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zge) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cwdc cwdcVar;
        fctl.b(obj);
        amwe amweVar = this.a;
        if (amweVar.d() != null && (cwdcVar = (cwdc) fdct.b(this.b.i)) != null) {
            cwdcVar.a(amweVar.d(), kjc.c(this.c), 3);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zge(this.a, this.b, this.c, fcxyVar);
    }
}
