package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjh extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ ConstraintLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjh(fdpl fdplVar, ConstraintLayout constraintLayout, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = constraintLayout;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            afjg afjgVar = new afjg(this.c);
            this.a = 1;
            if (fdplVar.a(afjgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afjh(this.b, this.c, fcxyVar);
    }
}
