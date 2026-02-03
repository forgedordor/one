package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class assl {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final awhr c;
    public final awhr d;
    private final eosc e;

    public assl(eosc eoscVar, fcsu fcsuVar, awhr awhrVar, awhr awhrVar2) {
        this.e = eoscVar;
        this.b = fcsuVar;
        this.c = awhrVar2;
        this.d = awhrVar;
    }

    public final eiju a(final alqm alqmVar, MessageCoreData messageCoreData) {
        eieu eieuVarK = eiiy.k("RcsContactsCacheRefresher::refreshCapabilitiesForMessageProtocolAndCacheMismatch");
        try {
            final boolean zT = baui.t(messageCoreData.d());
            final ConversationIdType conversationIdTypeA = messageCoreData.A();
            eiju eijuVarH = eijx.h(new eooy() { // from class: assj
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ConversationIdType conversationIdType = conversationIdTypeA;
                    if (!conversationIdType.b()) {
                        assl asslVar = this.a;
                        bojh bojhVarR = ((bakt) asslVar.b.b()).r(conversationIdType);
                        if (bojhVarR == null) {
                            ((eksl) ((eksl) assl.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/RcsCapabilitiesCacheRefresher", "shouldCheckCachedCapabilities", 93, "RcsCapabilitiesCacheRefresher.java")).t("Could not check cached capabilities, conversation data for conversationId=%s is null", conversationIdType);
                        } else {
                            boolean z = zT;
                            if ((z || bojhVarR.r() != 2) && bvdi.c(bojhVarR.k()) && !bojhVarR.an()) {
                                alqm alqmVar2 = alqmVar;
                                return z ? asslVar.d.c(alqmVar2) : asslVar.c.c(alqmVar2);
                            }
                        }
                    }
                    return eijx.e(awhp.e());
                }
            }, this.e).h(new ejvr() { // from class: assk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = assl.a;
                    return null;
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarH;
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
