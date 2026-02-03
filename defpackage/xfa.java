package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfa extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ xfi d;
    final /* synthetic */ djdi e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfa(xfi xfiVar, djdi djdiVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = xfiVar;
        this.e = djdiVar;
        this.f = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        vuq vuqVar;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            fctl.b(obj);
            vuqVar = obj3;
        } else {
            fctl.b(obj);
            xfi xfiVar = this.d;
            djdi djdiVar = this.e;
            vuq vuqVar2 = xfiVar.m;
            this.a = vuqVar2;
            this.b = djdiVar;
            this.c = 1;
            obj = xfiVar.h(djdiVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = djdiVar;
            vuqVar = vuqVar2;
        }
        djdi djdiVar2 = (djdi) obj2;
        vuqVar.a(new vus(djdiVar2, (dpzj) obj, this.f));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xfa(this.d, this.e, this.f, fcxyVar);
    }
}
