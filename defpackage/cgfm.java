package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgfm extends cayv {
    public static final eksp a = eksp.c("BugleNotifications");
    public final fcsu b;
    public final fcsu c;
    private final eosc d;

    public cgfm(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("MarkFailuresAsNotifiedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cgfq.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cgfq cgfqVar = (cgfq) evuhVar;
        return eijx.g(new Callable() { // from class: cgfl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cgfm cgfmVar;
                Iterator<E> it = cgfqVar.b.iterator();
                boolean z = false;
                while (true) {
                    cgfmVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    cgfp cgfpVar = (cgfp) it.next();
                    int i = cgfpVar.b;
                    if ((i & 1) == 0 || (i & 2) == 0) {
                        ((eksl) ((eksl) cgfm.a.j()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 73, "MarkFailuresAsNotifiedHandler.java")).q("Conversation or message ID not found for resetting failed message notification");
                    } else {
                        baxe baxeVar = (baxe) cgfmVar.b.b();
                        ConversationIdType conversationIdTypeB = barn.b(cgfpVar.c);
                        MessageIdType messageIdTypeB = bary.b(cgfpVar.d);
                        String[] strArr = MessagesTable.a;
                        brdu brduVar = new brdu();
                        brduVar.ap("markFailedMessagesAsNotified");
                        brduVar.v(true);
                        if (baxeVar.V(conversationIdTypeB, messageIdTypeB, brduVar)) {
                            ekrw ekrwVarO = cgfm.a.o();
                            ekrwVarO.X(cqnc.r, cgfpVar.c);
                            ekrwVarO.X(cqnc.a, cgfpVar.d);
                            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 92, "MarkFailuresAsNotifiedHandler.java")).q("Marked failed message as notified");
                            z = true;
                        }
                    }
                }
                if (!z) {
                    return cbcw.i();
                }
                return cbcw.j(ekgb.r(cggg.c()));
            }
        }, this.d);
    }
}
