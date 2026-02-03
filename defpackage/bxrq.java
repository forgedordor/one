package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrq extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxrv b;
    final /* synthetic */ bxsi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxrq(fcxy fcxyVar, bxrv bxrvVar, bxsi bxsiVar) {
        super(2, fcxyVar);
        this.b = bxrvVar;
        this.c = bxsiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxrq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bxrv bxrvVar = this.b;
            bxsi bxsiVar = this.c;
            this.a = 1;
            obj = bxrvVar.d(bxsiVar.b, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        bxrv bxrvVar2 = this.b;
        aet aetVar = (aet) obj;
        int iF = bxrv.f(this.c.a);
        if (aetVar.c()) {
            for (Map.Entry entry : aetVar.a().entrySet()) {
                byap byapVar = (byap) bxrvVar2.c.b();
                Object key = entry.getKey();
                key.getClass();
                byapVar.b((String) key, iF, 2, ((aew) entry.getValue()).a);
            }
        } else {
            for (Map.Entry entry2 : aetVar.a().entrySet()) {
                byap byapVar2 = (byap) bxrvVar2.c.b();
                Object key2 = entry2.getKey();
                key2.getClass();
                byapVar2.a((String) key2, iF, 2, ((aew) entry2.getValue()).a);
            }
        }
        return Boolean.valueOf(aetVar.c());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxrq bxrqVar = new bxrq(fcxyVar, this.b, this.c);
        bxrqVar.d = obj;
        return bxrqVar;
    }
}
