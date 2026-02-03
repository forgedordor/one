package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vef extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public vef(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vef vefVar = new vef((fcxy) obj3);
        vefVar.c = (fdpm) obj;
        vefVar.b = (Object[]) obj2;
        return vefVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.c;
            List listK = fcur.K((dihq[]) this.b);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                if (((dihq) obj2).e) {
                    arrayList.add(obj2);
                }
            }
            this.a = 1;
            if (r6.fO(arrayList, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
