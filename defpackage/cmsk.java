package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/ThreadInfoCache");
    private final ctz b = new ctz();
    private final ctz c = new ctz();
    private final HashSet d = new HashSet();
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cmsk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
    }

    public final synchronized cmtz a(cmmp cmmpVar, long j, String str, Integer num) {
        long j2;
        ctz ctzVar = this.c;
        cmtz cmtzVarW = (cmtz) ctzVar.d(j);
        if (cmtzVarW == null || cmtzVarW.b.isEmpty()) {
            j2 = j;
            cmtzVarW = ((cmqj) this.f.b()).w(cmmpVar, j2, str, num);
            if (!cmtzVarW.b.isEmpty()) {
                ctzVar.h(j2, cmtzVarW);
            }
        } else {
            j2 = j;
        }
        if (!cmtzVarW.b.isEmpty()) {
            return cmtzVarW;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getThreadData", 209, "ThreadInfoCache.java")).s("Use unknown sender since thread couldn't find any recipients. threadId: %s", j2);
        return new cmtz(j2, ekgb.r(((alrj) this.g.b()).n("ʼUNKNOWN_SENDER!ʼ")), false);
    }

    public final synchronized void b() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "clear", 59, "ThreadInfoCache.java")).q("Cleared ThreadInfoCache");
        this.b.g();
        this.c.g();
        this.d.clear();
    }

    public final synchronized boolean c(ConversationIdType conversationIdType) {
        return this.d.contains(conversationIdType);
    }

    public final synchronized ConversationIdType d(long j, int i, cnvx cnvxVar, String str, bvdk bvdkVar, boolean z) {
        Object obj;
        ConversationIdType conversationIdTypeA;
        ConversationIdType conversationIdType = barn.a;
        ctz ctzVar = this.b;
        int iB = cwe.b(ctzVar.b, ctzVar.d, j);
        if (iB < 0 || (obj = ctzVar.c[iB]) == cua.a) {
            obj = conversationIdType;
        }
        ConversationIdType conversationIdType2 = (ConversationIdType) obj;
        if (!conversationIdType2.b()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 92, "ThreadInfoCache.java")).A("Getting existing conversation (a mapping from the thread id to the conversation id already exists). threadId: %s, conversationId: %s", j, conversationIdType2);
            return conversationIdType2;
        }
        cmtz cmtzVarA = a(cmmo.c, j, str, Integer.valueOf(i));
        long j2 = cmtzVarA.a;
        String str2 = cmtzVarA.e;
        fcsu fcsuVar = this.e;
        ArrayList arrayListJ = ((bakt) fcsuVar.b()).J(cmtzVarA, i);
        if (cnvxVar != null) {
            bakt baktVar = (bakt) fcsuVar.b();
            baqz baqzVarA = bara.A(cnvxVar);
            baqzVarA.x(new cnqj(j2));
            baqzVarA.p(arrayListJ);
            ((bake) baqzVarA).b = Optional.ofNullable(cmtzVarA.c);
            baqzVarA.k(true);
            baqzVarA.l(false);
            ((bake) baqzVarA).c = Optional.ofNullable(str2);
            baqzVarA.r(Optional.ofNullable(cmtzVarA.d));
            conversationIdTypeA = baktVar.k(baqzVarA.y(), z).a();
            if (!conversationIdTypeA.b() && (cnvxVar.a.d() || cmtzVarA.g)) {
                this.d.add(conversationIdTypeA);
            }
        } else {
            int i2 = z ? 0 : cmtzVarA.f;
            bakt baktVar2 = (bakt) fcsuVar.b();
            baqz baqzVarZ = bara.z();
            baqzVarZ.x(new cnqj(j2));
            baqzVarZ.f(bvdkVar);
            baqzVarZ.p(arrayListJ);
            baqzVarZ.m(i2);
            ((bake) baqzVarZ).b = Optional.ofNullable(cmtzVarA.c);
            baqzVarZ.k(true);
            baqzVarZ.l(false);
            ((bake) baqzVarZ).c = Optional.ofNullable(str2);
            baqzVarZ.r(Optional.ofNullable(cmtzVarA.d));
            conversationIdTypeA = baktVar2.k(baqzVarZ.y(), z).a();
            if (!conversationIdTypeA.b() && (bvdkVar.d() || cmtzVarA.g)) {
                this.d.add(conversationIdTypeA);
            }
        }
        if (conversationIdTypeA.b()) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 178, "ThreadInfoCache.java")).A("Failed to create conversation. Returning null conversation id. threadId: %s, conversationId: %s", j2, conversationIdTypeA);
            return conversationIdType;
        }
        ctzVar.h(j2, conversationIdTypeA);
        ekrw ekrwVarE3 = a.e();
        ekrwVarE3.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/sms/ThreadInfoCache", "getOrCreateConversation", 172, "ThreadInfoCache.java")).A("Conversation created successfully. threadId: %s, conversationId: %s", j2, conversationIdTypeA);
        return conversationIdTypeA;
    }
}
