package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdc extends fcyz implements fdat {
    int a;
    final /* synthetic */ HugoHostFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdc(HugoHostFragment hugoHostFragment, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hugoHostFragment;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            HugoHostFragment hugoHostFragment = this.b;
            dpbq dpbqVar = hugoHostFragment.al;
            if (dpbqVar == null) {
                fdbq.c("hugoManager");
                dpbqVar = null;
            }
            fdpl fdplVarA = fdqq.a(new dpdb(((dpcf) dpbqVar).k, hugoHostFragment));
            dpcy dpcyVar = new dpcy(hugoHostFragment);
            this.a = 1;
            if (fdplVarA.a(dpcyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpdc(this.b, fcxyVar);
    }
}
