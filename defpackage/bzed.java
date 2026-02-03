package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzed extends fcyz implements fdat {
    final /* synthetic */ Collection a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzed(fcxy fcxyVar, Collection collection) {
        super(2, fcxyVar);
        this.a = collection;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzed) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+loadCorrelationIds");
        brdrVarD.h(new bzee(this.a));
        bran branVar = MessagesTable.c;
        brdrVarD.c(branVar.a, branVar.X);
        ekgb ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        ArrayList<MessagesTable.BindData> arrayList = new ArrayList();
        for (Object obj2 : ekgbVarZ) {
            if (((MessagesTable.BindData) obj2).T() != null) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList, 10)), 16));
        for (MessagesTable.BindData bindData : arrayList) {
            String strB = bindData.E().b();
            String strT = bindData.T();
            strT.getClass();
            fcti fctiVar = new fcti(strB, new fctk(strT));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzed bzedVar = new bzed(fcxyVar, this.a);
        bzedVar.b = obj;
        return bzedVar;
    }
}
