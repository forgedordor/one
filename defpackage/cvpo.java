package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpo implements cvpi {
    public final fcsu a;
    private final eosd b;

    public cvpo(fcsu fcsuVar, eosd eosdVar) {
        this.a = fcsuVar;
        this.b = eosdVar;
    }

    @Override // defpackage.cvpi
    public final eiju a(final ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("AddContactBanner2DatabaseOperationsImpl#getConversationOpenCount");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: cvpn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bojh bojhVarR = ((bakt) this.a.a.b()).r(barn.b(conversationId.b()));
                    return Integer.valueOf(bojhVarR != null ? bojhVarR.p() : 0);
                }
            }, this.b);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cvpi
    public final void b(final ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("AddContactBanner2DatabaseOperationsImpl#dismissAddContactBanner");
        try {
            auvh.h(eijx.g(new Callable() { // from class: cvpm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bakt baktVar = (bakt) this.a.a.b();
                    ConversationIdType conversationIdTypeB = barn.b(conversationId.b());
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("setConversationOpenCount");
                    boteVar.E(((Integer) cvow.a.e()).intValue() + 2);
                    return Boolean.valueOf(baktVar.aj(conversationIdTypeB, boteVar));
                }
            }, this.b));
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

    @Override // defpackage.cvpi
    public final void c(final ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("AddContactBanner2DatabaseOperationsImpl#incrementConversationOpenCount");
        try {
            auvh.h(a(conversationId).i(new eooz() { // from class: cvpl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Integer num = (Integer) obj;
                    if (num.intValue() <= ((Integer) cvow.a.e()).intValue() + 1) {
                        ConversationId conversationId2 = conversationId;
                        bakt baktVar = (bakt) this.a.a.b();
                        ConversationIdType conversationIdTypeB = barn.b(conversationId2.b());
                        String[] strArr = botm.a;
                        bote boteVar = new bote();
                        boteVar.ap("incrementConversationOpenCount");
                        boteVar.E(num.intValue() + 1);
                        baktVar.aj(conversationIdTypeB, boteVar);
                    }
                    return eijx.e(null);
                }
            }, this.b));
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
}
