package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujb extends fcyz implements fdat {
    final /* synthetic */ doig a;
    final /* synthetic */ Context b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujb(fcxy fcxyVar, doig doigVar, Context context) {
        super(2, fcxyVar);
        this.a = doigVar;
        this.b = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ujb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return bxlf.d(le.d(this.a.a()), this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ujb ujbVar = new ujb(fcxyVar, this.a, this.b);
        ujbVar.c = obj;
        return ujbVar;
    }
}
