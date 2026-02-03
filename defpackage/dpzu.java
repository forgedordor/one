package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpzu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpzv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpzu(dpzv dpzvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpzvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpzu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Duration duration = dpzv.a;
            fduf fdufVar = this.b.c;
            fdufVar.f(((Duration) fdufVar.c()).plus(dpzv.a));
            while (true) {
                long j = dpzv.b;
                this.a = 1;
                if (fdkj.d(j, this) == fcylVar) {
                    return fcylVar;
                }
                Duration duration2 = dpzv.a;
                fduf fdufVar2 = this.b.c;
                fdufVar2.f(((Duration) fdufVar2.c()).plus(dpzv.a));
            }
        }
        Duration duration22 = dpzv.a;
        fduf fdufVar22 = this.b.c;
        fdufVar22.f(((Duration) fdufVar22.c()).plus(dpzv.a));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpzu(this.b, fcxyVar);
    }
}
