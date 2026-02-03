package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darr extends fcyz implements fdat {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ int b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ dars d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public darr(fcxy fcxyVar, ConversationIdType conversationIdType, int i, MessageIdType messageIdType, dars darsVar, long j) {
        super(2, fcxyVar);
        this.a = conversationIdType;
        this.b = i;
        this.c = messageIdType;
        this.d = darsVar;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((darr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eksl ekslVar = (eksl) dars.a.h();
        ekslVar.X(cqnc.S, "MessagesPageDataBuilder");
        int i = this.b;
        Integer num = new Integer(i);
        final ConversationIdType conversationIdType = this.a;
        MessageIdType messageIdType = this.c;
        ekslVar.I("#loadNextPage for conversation: %s, with page size: %s, with oldest message: %s", conversationIdType, num, messageIdType);
        dars darsVar = this.d;
        if (!darsVar.f.a()) {
            bael baelVar = (bael) darsVar.c.b();
            bjjp bjjpVarC = bjdl.c(conversationIdType, messageIdType, this.e, i);
            bjjpVarC.d(new Function() { // from class: baeh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bjjt bjjtVar = (bjjt) obj2;
                    bjjtVar.c();
                    return bjjtVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjjpVarC.c(new bjjm(bjju.b.b));
            bjjpVarC.y(i);
            ekgb ekgbVarZ = baelVar.a.d(false, conversationIdType, bjjpVarC.b()).b().z();
            ekgbVarZ.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
            Iterator<E> it = ekgbVarZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((cszw) darsVar.b.b()).a(((baeb) darsVar.e.b()).d((bfsb) it.next()), null, (Context) darsVar.h.b()));
            }
            return arrayList;
        }
        baes baesVar = (baes) darsVar.d.b();
        bjjp bjjpVarC2 = bjdl.c(conversationIdType, messageIdType, this.e, i);
        bjjpVarC2.d(new Function() { // from class: baep
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bjjt bjjtVar = (bjjt) obj2;
                bjjtVar.b(conversationIdType);
                bjjtVar.c();
                return bjjtVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bjjj bjjjVar = bjju.b;
        bjjpVarC2.c(new bjjm(bjjjVar.b), new bjjm(bjjjVar.a));
        bjjpVarC2.y(i);
        bfro bfroVarB = baesVar.a.b(bjjpVarC2.b());
        bfroVarB.A("ConversationMessageDataQueryHelperV2::getPreviousSentAndReceivedMessagesQuerySql");
        ekgb ekgbVarZ2 = bfroVarB.b().z();
        ekgbVarZ2.getClass();
        ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVarZ2, 10));
        Iterator<E> it2 = ekgbVarZ2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cszw) darsVar.b.b()).a(((baeb) darsVar.e.b()).b((bdxm) it2.next()), null, (Context) darsVar.h.b()));
        }
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        darr darrVar = new darr(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        darrVar.f = obj;
        return darrVar;
    }
}
