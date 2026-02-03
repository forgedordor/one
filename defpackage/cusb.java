package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cusb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cusc b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusb(cusc cuscVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cuscVar;
        this.c = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cusc cuscVar = this.b;
            View view = this.c;
            this.a = 1;
            if (cuscVar.a(view, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cusb(this.b, this.c, fcxyVar);
    }
}
