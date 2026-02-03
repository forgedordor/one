package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvu implements crvm {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/a2p/ChatbotSubscriptionManagerImpl");
    private final Context b;
    private final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public crvu(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
    }

    private static final crwi h(crxh crxhVar) {
        int iOrdinal = crxhVar.ordinal();
        if (iOrdinal == 0) {
            return crwi.CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return crwi.SUBSCRIBE_SENT;
        }
        if (iOrdinal == 2) {
            return crwi.UNSUBSCRIBE_SENT;
        }
        if (iOrdinal == 3) {
            return crwi.UNRECOGNIZED;
        }
        throw new fctg();
    }

    private static final crws i(crxh crxhVar) {
        int iOrdinal = crxhVar.ordinal();
        if (iOrdinal == 0) {
            return crws.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return crws.HIDE;
        }
        if (iOrdinal == 2) {
            return crws.HIDE;
        }
        if (iOrdinal == 3) {
            return crws.UNRECOGNIZED;
        }
        throw new fctg();
    }

    private static final boolean j(ResolvedRecipient resolvedRecipient, ajlk ajlkVar) {
        return resolvedRecipient.g().A() && ajlkVar.c() == ajlj.RBM;
    }

    @Override // defpackage.crvm
    public final crwi a(crxh crxhVar) {
        crxhVar.getClass();
        return h(crxhVar);
    }

    @Override // defpackage.crvm
    public final eiju b(Conversation conversation) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new crvr(this, conversation, null));
    }

    @Override // defpackage.crvm
    public final eiju c(Conversation conversation, crwz crwzVar, String str, crvz crvzVar) {
        crwzVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new crvt(this, conversation, crwzVar, str, crvzVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.crxh r7, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8, defpackage.ajlk r9, defpackage.crwz r10, java.lang.String r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crvu.d(crxh, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ajlk, crwz, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x016a, code lost:
    
        if (defpackage.fdxs.c(r0, r2) == r3) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.crxh r21, com.google.android.apps.messaging.shared.api.messaging.Conversation r22, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r23, defpackage.ajlk r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crvu.e(crxh, com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ajlk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        if (r12.d(r13, r6) == r0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.api.messaging.Conversation r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crvu.f(com.google.android.apps.messaging.shared.api.messaging.Conversation, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0224, code lost:
    
        if (r1.d(r2, r5) == r7) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.api.messaging.Conversation r18, defpackage.crwz r19, java.lang.String r20, defpackage.crvz r21, defpackage.fcxy r22) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crvu.g(com.google.android.apps.messaging.shared.api.messaging.Conversation, crwz, java.lang.String, crvz, fcxy):java.lang.Object");
    }
}
