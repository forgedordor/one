package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djje extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ djjn c;
    final /* synthetic */ Context d;
    final /* synthetic */ hox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djje(djjn djjnVar, Context context, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = djjnVar;
        this.d = context;
        this.e = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djje) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        if (this.b == 0) {
            fctl.b(obj);
            djjm djjmVar = this.c.h;
            if (djjmVar != null) {
                Context context = this.d;
                hox hoxVar2 = this.e;
                Integer num = new Integer(djjmVar.a);
                this.a = hoxVar2;
                this.b = 1;
                if (djjmVar.b.a(context, num, this) == fcylVar) {
                    return fcylVar;
                }
                hoxVar = hoxVar2;
            }
            return fctx.a;
        }
        Object obj2 = this.a;
        fctl.b(obj);
        hoxVar = obj2;
        hoxVar.b(false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djje(this.c, this.d, this.e, fcxyVar);
    }
}
