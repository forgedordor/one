package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrs extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxrv b;
    final /* synthetic */ bxsh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxrs(fcxy fcxyVar, bxrv bxrvVar, bxsh bxshVar) {
        super(2, fcxyVar);
        this.b = bxrvVar;
        this.c = bxshVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxrs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        boolean z = true;
        fctl.b(obj);
        if (i == 0) {
            bxrv bxrvVar = this.b;
            bxsh bxshVar = this.c;
            this.a = 1;
            obj = bxrvVar.e(bxshVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aet aetVar = (aet) obj;
        if (!aetVar.c()) {
            Collection collectionValues = aetVar.b().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((aew) it.next()).a != 6) {
                        z = false;
                        break;
                    }
                }
            }
        }
        bxrv bxrvVar2 = this.b;
        int iF = bxrv.f(this.c.a);
        if (z) {
            for (Map.Entry entry : aetVar.a().entrySet()) {
                byap byapVar = (byap) bxrvVar2.c.b();
                Object key = entry.getKey();
                key.getClass();
                byapVar.b((String) key, iF, 3, ((aew) entry.getValue()).a);
            }
        } else {
            for (Map.Entry entry2 : aetVar.a().entrySet()) {
                byap byapVar2 = (byap) bxrvVar2.c.b();
                Object key2 = entry2.getKey();
                key2.getClass();
                byapVar2.a((String) key2, iF, 3, ((aew) entry2.getValue()).a);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxrs bxrsVar = new bxrs(fcxyVar, this.b, this.c);
        bxrsVar.d = obj;
        return bxrsVar;
    }
}
