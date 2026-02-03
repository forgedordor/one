package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvv extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdxf c;
    final /* synthetic */ febb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdvv(fdpl fdplVar, fdxf fdxfVar, febb febbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdxfVar;
        this.d = febbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdvv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdpl fdplVar = this.b;
                fdxf fdxfVar = this.c;
                this.a = 1;
                if (fdplVar.a(fdxfVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            this.d.h();
            return fctx.a;
        } catch (Throwable th) {
            this.d.h();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdvv(this.b, this.c, this.d, fcxyVar);
    }
}
