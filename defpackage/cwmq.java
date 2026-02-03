package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwmq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwmr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwmq(cwmr cwmrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwmrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwmq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cwmr cwmrVar = this.b;
            this.a = 1;
            obj = cwmrVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.b.a.f((Map) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwmq(this.b, fcxyVar);
    }
}
