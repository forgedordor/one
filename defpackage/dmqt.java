package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ Duration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmqt(ddp ddpVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmqt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmqs dmqsVar = new dmqs(this.b, this.c, null);
            this.a = 1;
            if (fdjy.a(dmqsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmqt(this.b, this.c, fcxyVar);
    }
}
