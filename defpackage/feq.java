package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class feq extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fes c;
    final /* synthetic */ jkb d;
    final /* synthetic */ ffv e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feq(jkb jkbVar, fdap fdapVar, fes fesVar, ffv ffvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = jkbVar;
        this.b = fdapVar;
        this.c = fesVar;
        this.e = ffvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((feq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a == 0) {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.f;
                jkb jkbVar = this.d;
                fdap fdapVar = fga.a;
                View view = jkbVar.a;
                fft fftVar = (fft) fdapVar.invoke(view);
                fgf fgfVar = new fgf(view, new fep(this.e), fftVar);
                if (fek.a) {
                    fdil.d(fdjxVar, null, null, new feo(this.c, fftVar, null), 3);
                }
                fdap fdapVar2 = this.b;
                if (fdapVar2 != null) {
                    fdapVar2.invoke(fgfVar);
                }
                this.c.a = fgfVar;
                this.a = 1;
                if (jkbVar.a(fgfVar, this) == fcylVar) {
                    return fcylVar;
                }
            } else {
                fctl.b(obj);
            }
            throw new fcta();
        } catch (Throwable th) {
            this.c.a = null;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        feq feqVar = new feq(this.d, this.b, this.c, this.e, fcxyVar);
        feqVar.f = obj;
        return feqVar;
    }
}
