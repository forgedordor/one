package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxh extends fcyz implements fdat {
    int a;
    final /* synthetic */ azxk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxh(fcxy fcxyVar, azxk azxkVar) {
        super(2, fcxyVar);
        this.b = azxkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azxh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        botb botbVarE = botm.e();
        botbVarE.g(azxi.a);
        List listG = botbVarE.b().g();
        azxk azxkVar = this.b;
        if (!((arjp) azxkVar.d.b()).a()) {
            listG.getClass();
            List arrayList = new ArrayList();
            ekqh it = listG.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (((baqi) azxkVar.b.b()).k((ConversationIdType) next)) {
                    arrayList.add(next);
                }
            }
            listG = arrayList;
        }
        listG.getClass();
        ekgb ekgbVarA = ekfv.a(listG);
        this.a = 1;
        Object objB = azxkVar.b(ekgbVarA, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        azxh azxhVar = new azxh(fcxyVar, this.b);
        azxhVar.c = obj;
        return azxhVar;
    }
}
