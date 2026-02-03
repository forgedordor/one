package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfw extends fcyz implements fdat {
    int a;
    final /* synthetic */ xfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfw(xfx xfxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xfxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xfx xfxVar = this.b;
            this.a = 1;
            obj = fdtc.a(xfxVar.d, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajlk ajlkVar = (ajlk) obj;
        if ((ajlkVar instanceof ajts) && ((ajts) ajlkVar).H() == cins.j) {
            xfx xfxVar2 = this.b;
            if (!cpga.g(xfxVar2.b)) {
                ((acgu) xfxVar2.f.b()).a(42);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xfw(this.b, fcxyVar);
    }
}
