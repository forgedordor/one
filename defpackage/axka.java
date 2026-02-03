package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axka {
    private static final eksp c = eksp.c("BugleDataModel");
    public final fcsu a;
    public final eosc b;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private final fcsu e;

    public axka(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.e = fcsuVar;
        this.a = fcsuVar2;
        this.b = eoscVar;
    }

    public final void a(final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("SendingContext::populatePendingMessages");
        try {
            brdr brdrVarB = axtl.b();
            brdrVarB.h(new Function() { // from class: axtg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.m(conversationIdType);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brap brapVar = (brap) brdrVarB.b().p();
            while (brapVar.moveToNext()) {
                try {
                    MessageCoreData messageCoreDataA = ((bveg) this.e.b()).a();
                    messageCoreDataA.aO(brapVar);
                    if (messageCoreDataA.cW() || messageCoreDataA.dd()) {
                        this.d.put(conversationIdType, true);
                        break;
                    }
                } finally {
                }
            }
            this.d.put(conversationIdType, false);
            ((eksl) ((eksl) c.h()).h("com/google/android/apps/messaging/shared/datamodel/SendingContext", "populateFirstPendingMessage", 76, "SendingContext.java")).t("Conversation(id:%s) has no pending messages & using fast path message sending cache", conversationIdType);
            brapVar.close();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean b(ConversationIdType conversationIdType) {
        Boolean bool = (Boolean) this.d.put(conversationIdType, true);
        return (bool == null || bool.booleanValue()) ? false : true;
    }
}
