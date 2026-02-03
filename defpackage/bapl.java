package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bapl {
    private final fcsu a;

    public bapl(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final bajf a(ConversationIdType conversationIdType) {
        badt badtVar;
        eieu eieuVarK = eiiy.k("ConversationListItemCoreDatabaseOperations#getExistingConversation");
        try {
            bbtk bbtkVar = (bbtk) bbth.a(conversationIdType).l();
            if (bbtkVar != null) {
                badtVar = (badt) this.a.b();
                badtVar.L(bbtkVar);
            } else {
                badtVar = null;
            }
            eieuVarK.close();
            return badtVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List b(final long j) {
        eieu eieuVarK = eiiy.k("ConversationListItemCoreDatabaseOperations#getExistingConversationsAfterTimestamp");
        try {
            ArrayList arrayList = new ArrayList();
            bcuy bcuyVarM = bcvg.n().a().m();
            bcuyVarM.A("getExistingConversationsAfterTimestamp");
            bcuyVarM.e(new Function() { // from class: bapk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bcvd bcvdVar = (bcvd) obj;
                    bcvdVar.ap(new dqty("conversations.sort_timestamp", 9, Long.valueOf(j)));
                    return bcvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bcut bcutVar = (bcut) bcuyVarM.b().p();
            while (bcutVar.moveToNext()) {
                try {
                    badt badtVar = (badt) this.a.b();
                    badtVar.M(bcutVar);
                    arrayList.add(badtVar);
                } finally {
                }
            }
            bcutVar.close();
            eieuVarK.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
