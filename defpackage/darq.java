package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darq extends fcyz implements fdat {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ int b;
    final /* synthetic */ dars c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public darq(fcxy fcxyVar, ConversationIdType conversationIdType, int i, dars darsVar) {
        super(2, fcxyVar);
        this.a = conversationIdType;
        this.b = i;
        this.c = darsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((darq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eksl ekslVar = (eksl) dars.a.h();
        ekslVar.X(cqnc.S, "MessagesPageDataBuilder");
        ConversationIdType conversationIdType = this.a;
        int i = this.b;
        ekslVar.B("#loadLatestPage for conversation: %s, with page size: %s", conversationIdType, i);
        dars darsVar = this.c;
        if (darsVar.f.a()) {
            ekgb ekgbVarZ = ((baes) darsVar.d.b()).f(conversationIdType, i).b().z();
            ekgbVarZ.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
            Iterator<E> it = ekgbVarZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((cszw) darsVar.b.b()).a(((baeb) darsVar.e.b()).b((bdxm) it.next()), null, (Context) darsVar.h.b()));
            }
            return arrayList;
        }
        ekgb ekgbVarZ2 = ((bael) darsVar.c.b()).g(conversationIdType, i).b().z();
        ekgbVarZ2.getClass();
        ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVarZ2, 10));
        Iterator<E> it2 = ekgbVarZ2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cszw) darsVar.b.b()).a(((baeb) darsVar.e.b()).d((bfsb) it2.next()), null, (Context) darsVar.h.b()));
        }
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        darq darqVar = new darq(fcxyVar, this.a, this.b, this.c);
        darqVar.d = obj;
        return darqVar;
    }
}
