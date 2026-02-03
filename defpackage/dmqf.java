package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqf extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmqf(boolean z, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && this.b) {
            hox hoxVar = this.c;
            if (!dmqh.c(hoxVar)) {
                dmqh.b(hoxVar, true);
                this.a = 1;
                if (fdkj.c(2750L, this) == fcylVar) {
                    return fcylVar;
                }
                dmqh.b(this.c, false);
            }
        } else {
            dmqh.b(this.c, false);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmqf(this.b, this.c, fcxyVar);
    }
}
