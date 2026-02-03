package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbg extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzbx b;
    final /* synthetic */ ekgb c;
    final /* synthetic */ Optional d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbg(bzbx bzbxVar, ekgb ekgbVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzbxVar;
        this.c = ekgbVar;
        this.d = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bzbx bzbxVar = this.b;
        String strB = bzhh.d.b(bzbxVar.d);
        bzbf bzbfVar = new bzbf(bzbxVar, this.c, this.d, null);
        this.a = 1;
        Object objA = aipq.a(bzbxVar.b, strB, bzbfVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbg(this.b, this.c, this.d, fcxyVar);
    }
}
