package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vdk implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ vdr b;

    public vdk(hsf hsfVar, vdr vdrVar) {
        this.a = hsfVar;
        this.b = vdrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            zye zyeVar = (zye) this.a.a();
            if (zyeVar instanceof zyc) {
                zxa zxaVar = (zxa) ((zyc) zyeVar).a;
                aagu aaguVar = (aagu) hro.a(zxaVar.p, hmlVar).a();
                final vdr vdrVar = this.b;
                fdvc fdvcVarC = ((aadt) vdrVar.i.b()).c();
                fdat fdatVar = aaguVar.a;
                boolean z = aaguVar.b;
                hmlVar.v(5004770);
                boolean zF = hmlVar.F(vdrVar);
                Object objF = hmlVar.f();
                if (zF || objF == hmk.a) {
                    objF = new fdap() { // from class: vdi
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ((zuh) vdrVar.f.b()).h(((Boolean) obj3).booleanValue());
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                cuit.a(fdvcVarC, fdatVar, z, (fdap) objF, aaguVar.c, hxe.d(-479370241, new vdj(zxaVar, aaguVar), hmlVar), hmlVar, 196608, 0);
            }
        }
        return fctx.a;
    }
}
