package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxa extends fcyz implements fdat {
    int a;
    final /* synthetic */ pxb b;
    final /* synthetic */ Activity c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxa(pxb pxbVar, Activity activity, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pxbVar;
        this.c = activity;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pxa) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.d;
            final lbz lbzVar = new lbz() { // from class: pwx
                @Override // defpackage.lbz
                public final void accept(Object obj2) {
                    fdosVar.b((pxc) obj2);
                }
            };
            final pxb pxbVar = this.b;
            pxbVar.b.a(this.c, new Executor() { // from class: pwy
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, lbzVar);
            fdae fdaeVar = new fdae() { // from class: pwz
                @Override // defpackage.fdae
                public final Object invoke() {
                    pxbVar.b.b(lbzVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pxa pxaVar = new pxa(this.b, this.c, fcxyVar);
        pxaVar.d = obj;
        return pxaVar;
    }
}
