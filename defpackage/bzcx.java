package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcx extends fcyz implements fdat {
    final /* synthetic */ Collection a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzcx(fcxy fcxyVar, Collection collection) {
        super(2, fcxyVar);
        this.a = collection;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzcx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("CmsConversationsUpdater#loadCorrelationIds");
        botbVarE.i(new bzcy(this.a));
        bopp boppVar = botm.c;
        botbVarE.c(boppVar.a, boppVar.aw);
        ekgb ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        ArrayList<bojh> arrayList = new ArrayList();
        for (Object obj2 : ekgbVarZ) {
            if (((bojh) obj2).R() != null) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList, 10)), 16));
        for (bojh bojhVar : arrayList) {
            String strA = bojhVar.C().a();
            String strR = bojhVar.R();
            strR.getClass();
            fcti fctiVar = new fcti(strA, new fctk(strR));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzcx bzcxVar = new bzcx(fcxyVar, this.a);
        bzcxVar.b = obj;
        return bzcxVar;
    }
}
