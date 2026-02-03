package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cudt extends fcyz implements fdat {
    int a;
    final /* synthetic */ jpb b;
    final /* synthetic */ igr c;
    final /* synthetic */ dpir d;
    final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cudt(jpb jpbVar, igr igrVar, dpir dpirVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = jpbVar;
        this.c = igrVar;
        this.d = dpirVar;
        this.e = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cudt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final jpb jpbVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: cudr
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Boolean.valueOf(jpbVar.d());
                }
            });
            cuds cudsVar = new cuds(this.c, this.d, this.e);
            this.a = 1;
            if (fdplVarA.a(cudsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cudt(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
