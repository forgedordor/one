package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amza extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ amzb c;
    final /* synthetic */ andk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amza(andk andkVar, amzb amzbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = andkVar;
        this.c = amzbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amza) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object it;
        ajlt ajltVar;
        amzb amzbVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            it = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            it = this.d.a.iterator();
            it.getClass();
        }
        do {
            ekqg ekqgVar = (ekqg) it;
            if (!ekqgVar.hasNext()) {
                return this.d;
            }
            ajltVar = (ajlt) ekqgVar.next();
            amzbVar = this.c;
            ajltVar.getClass();
            this.a = it;
            this.b = 1;
        } while (amzbVar.a.a(ajltVar, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amza(this.d, this.c, fcxyVar);
    }
}
