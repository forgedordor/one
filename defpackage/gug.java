package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gug extends fcyz implements fdat {
    int a;
    final /* synthetic */ guk b;
    final /* synthetic */ jgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gug(guk gukVar, jgt jgtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gukVar;
        this.c = jgtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gug) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            guk gukVar = this.b;
            if (gukVar != null) {
                gul gulVar = gukVar.b;
                boolean z = gulVar.b != null;
                jgt jgtVar = this.c;
                int i2 = gulVar.d - 1;
                long jA = i2 != 1 ? i2 != 2 ? 4000L : Long.MAX_VALUE : 10000L;
                if (jgtVar != null) {
                    jA = jgtVar.a(jA, z);
                }
                this.a = 1;
                if (fdkj.c(jA, this) == fcylVar) {
                    return fcylVar;
                }
                this.b.a();
            }
        } else {
            this.b.a();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gug(this.b, this.c, fcxyVar);
    }
}
