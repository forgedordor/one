package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coii {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final fcsu c;
    public final cogw d;
    private final eosc e;
    private final cokd f;

    public coii(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, cokd cokdVar, cogw cogwVar) {
        this.e = eoscVar;
        this.b = eoscVar2;
        this.c = fcsuVar;
        this.f = cokdVar;
        this.d = cogwVar;
    }

    private final eiju c(final String str, final Optional optional) {
        return this.f.c(str, Optional.empty()).h(new ejvr() { // from class: coig
            /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cokf cokfVar = (cokf) obj;
                boolean zIsEmpty = cokfVar.b().isEmpty();
                String str2 = str;
                if (zIsEmpty || cokfVar.a().isEmpty()) {
                    eksl ekslVar = (eksl) coii.a.j();
                    ekslVar.X(coie.a, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 105, "FileTransferPausedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer paused callback.");
                    return null;
                }
                Optional optional2 = optional;
                coii coiiVar = this.a;
                final ?? r6 = cokfVar.b().get();
                r6.aV(coiiVar.d.f().toEpochMilli(), ((cokk) cokfVar.a().get()).p());
                optional2.ifPresent(new Consumer() { // from class: coih
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        r6.bK(((Integer) obj2).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eksl ekslVar2 = (eksl) coii.a.h();
                ekslVar2.X(coie.a, str2);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 120, "FileTransferPausedCallbackHandler.java")).q("File transfer paused. Marking message paused.");
                baxe baxeVar = (baxe) coiiVar.c.b();
                ConversationIdType conversationIdTypeA = r6.A();
                MessageIdType messageIdTypeC = r6.C();
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("updateFileTransferMessagePaused");
                brduVar.G(r6.o());
                brduVar.O(r6.r());
                brduVar.U(r6.k());
                brduVar.B(r6.f());
                baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar);
                return null;
            }
        }, this.e);
    }

    public final eiju a(String str) {
        return c(str, Optional.of(10007));
    }

    public final eiju b(String str) {
        return c(str, Optional.empty());
    }
}
