package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xll extends fcyz implements fdat {
    int a;
    final /* synthetic */ xlm b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xll(xlm xlmVar, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xlmVar;
        this.c = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xll) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xlm xlmVar = this.b;
            Context context = this.c;
            this.a = 1;
            obj = xlmVar.c(context, 4, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xll(this.b, this.c, fcxyVar);
    }
}
