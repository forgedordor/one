package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhot extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhov b;
    final /* synthetic */ dhuu c;
    final /* synthetic */ sfp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhot(dhov dhovVar, dhuu dhuuVar, sfp sfpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhovVar;
        this.c = dhuuVar;
        this.d = sfpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        dhov dhovVar = this.b;
        dhuu dhuuVar = this.c;
        sfp sfpVar = this.d;
        this.a = 1;
        if (dhovVar.d(dhuuVar, sfpVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhot(this.b, this.c, this.d, fcxyVar);
    }
}
