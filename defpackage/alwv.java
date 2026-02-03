package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwv implements ajlt, amia {
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage");
    private static final Duration i;
    private static final Duration j;
    public final MessageId a;
    public final ConversationId b;
    public final ajmc c;
    public final amvr d;
    public final ekgb e;
    public final fcsu f;
    public Instant g;
    private final fcsu k;
    private final Context l;
    private final fcsu m;
    private final fcsu n;
    private final aptj o;
    private final ajlk p;
    private final MessagesTable.BindData q;
    private final ancl r;
    private final anlb s;
    private final anpj t;
    private final boolean u;
    private final cogw v;
    private final alwr w;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(15L);
        durationOfMinutes.getClass();
        i = durationOfMinutes;
        Duration durationOfHours = Duration.ofHours(24L);
        durationOfHours.getClass();
        j = durationOfHours;
    }

    public alwv(fcsu fcsuVar, Context context, alwr alwrVar, fcsu fcsuVar2, fcsu fcsuVar3, aptj aptjVar, MessageId messageId, ConversationId conversationId, ajlk ajlkVar, MessagesTable.BindData bindData, ajmc ajmcVar, amvr amvrVar, ancl anclVar, anlb anlbVar, anpj anpjVar, boolean z, ekgb ekgbVar, fcsu fcsuVar4, cogw cogwVar) {
        fcsuVar.getClass();
        context.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        conversationId.getClass();
        ajlkVar.getClass();
        bindData.getClass();
        anclVar.getClass();
        ekgbVar.getClass();
        cogwVar.getClass();
        this.k = fcsuVar;
        this.l = context;
        this.w = alwrVar;
        this.m = fcsuVar2;
        this.n = fcsuVar3;
        this.o = aptjVar;
        this.a = messageId;
        this.b = conversationId;
        this.p = ajlkVar;
        this.q = bindData;
        this.c = ajmcVar;
        this.d = amvrVar;
        this.r = anclVar;
        this.s = anlbVar;
        this.t = anpjVar;
        this.u = z;
        this.e = ekgbVar;
        this.f = fcsuVar4;
        this.v = cogwVar;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bindData.w());
        instantOfEpochMilli.getClass();
        this.g = instantOfEpochMilli;
    }

    @Override // defpackage.ajlt
    public final anms A() {
        return ((anar) this.r).k;
    }

    @Override // defpackage.ajlt
    public final angj B() {
        return ((anar) this.r).l;
    }

    @Override // defpackage.ajlt
    public final int C() {
        int iS = this.q.s();
        return ((iS == 2 || iS == 1 || iS == 11 || iS == 100) && (a() != ajls.b || F().k())) ? 3 : 2;
    }

    @Override // defpackage.ajlt
    public final int D() {
        int i2 = ((anar) this.r).m;
        if (i2 != 0) {
            return i2;
        }
        throw null;
    }

    @Override // defpackage.amia
    public final int E() {
        return this.q.m();
    }

    public final basd F() {
        basd basdVarI = this.q.I();
        basdVarI.getClass();
        return basdVarI;
    }

    @Override // defpackage.amia
    public final fhaz G() {
        return this.q.ad();
    }

    @Override // defpackage.ajlt
    public final ajls a() {
        ajls ajlsVarA = andv.a(this.q.m());
        ajlsVarA.getClass();
        return ajlsVarA;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.ajlt
    public final ajmb c() {
        return ((anar) this.r).b;
    }

    @Override // defpackage.ajlt
    public final ajmc d() {
        return this.c;
    }

    @Override // defpackage.ajlt
    public final ajmx e() {
        return ((anar) this.r).d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alwv) {
            alwv alwvVar = (alwv) obj;
            if (fdbq.f(this.a, alwvVar.a) && fdbq.f(this.b, alwvVar.b) && fdbq.f(this.p, alwvVar.p) && this.u == alwvVar.u && fdbq.f(this.g, alwvVar.g) && fdbq.f(p(), alwvVar.p()) && fdbq.f(this.q, alwvVar.q) && fdbq.f(this.r, alwvVar.r) && fdbq.f(this.c, alwvVar.c) && fdbq.f(this.d, alwvVar.d) && fdbq.f(this.s, alwvVar.s) && fdbq.f(this.e, alwvVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajlt
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ amvr g() {
        return this.d;
    }

    @Override // defpackage.ajlt
    public final amwc h() {
        return ((anar) this.r).g;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ajlt
    public final angr i() {
        if (this.u) {
            return null;
        }
        return ((anar) this.r).c;
    }

    @Override // defpackage.ajlt
    public final anlb j() {
        return this.s;
    }

    @Override // defpackage.ajlt
    public final anpj k(int i2) {
        ahkn ahknVar = ((ahlv) this.m.b()).a.a;
        ahnh ahnhVar = ahknVar.a;
        return new anjk((fdjx) ahnhVar.oS.b(), (dqsn) ahnhVar.qq.b(), (anch) ahknVar.mS.b(), this.a, i2);
    }

    @Override // defpackage.ajlt
    public final anpj l() {
        ahkn ahknVar = ((ahlw) this.n.b()).a.a;
        ahnh ahnhVar = ahknVar.a;
        return new anja((fdjx) ahnhVar.oS.b(), (fdjx) ahnhVar.m.b(), (cqtp) ahknVar.dK.b(), (bbmo) ahknVar.iA.b(), this.a);
    }

    @Override // defpackage.ajlt
    public final anpj m() {
        return this.t;
    }

    @Override // defpackage.ajlt
    public final eiju n() {
        return ((amfb) this.k.b()).a(this);
    }

    @Override // defpackage.ajlt
    public final Instant o() {
        return this.g;
    }

    @Override // defpackage.ajlt
    public final Instant p() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.q.z());
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    @Override // defpackage.ajlt
    public final Long q() {
        Long lValueOf = Long.valueOf(this.q.B());
        if (lValueOf.longValue() == 0) {
            return null;
        }
        return lValueOf;
    }

    @Override // defpackage.ajlt
    public final String r() {
        return ((anar) this.r).e;
    }

    @Override // defpackage.ajlt
    public final String s() throws Resources.NotFoundException {
        MessagesTable.BindData bindData = this.q;
        if (bindData.L() == bvdn.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE) {
            Resources resources = this.l.getResources();
            if (bindData.m() == 0) {
                String string = resources.getString(R.string.protocol_label_sms_auto_fallback_sent);
                string.getClass();
                return string;
            }
            if (bindData.m() == 1) {
                String string2 = resources.getString(R.string.protocol_label_mms_auto_fallback_sent);
                string2.getClass();
                return string2;
            }
        }
        Context context = this.l;
        aptj aptjVar = this.o;
        int iM = bindData.m();
        boolean zA = aptjVar.a();
        switch (iM) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                String string3 = zA ? context.getResources().getString(R.string.satellite) : context.getResources().getString(R.string.protocol_satellite);
                string3.getClass();
                return string3;
            default:
                return "Unknown";
        }
    }

    @Override // defpackage.ajlt
    public final boolean t(aoer aoerVar) {
        if (!fcva.g(ajlj.ONE_ON_ONE, ajlj.GROUP).contains(this.p.c())) {
            ekrw ekrwVarH = h.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.c, this.a);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 318, "BugleMessage.kt")).q("Not deletable for everyone reason: conversation is not 1:1 or group");
            return false;
        }
        if (a() != ajls.b) {
            ekrw ekrwVarH2 = h.h();
            ekrwVarH2.X(eksq.a, "BugleMapi");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(cqnc.c, this.a);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 325, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not rich");
            return false;
        }
        if (C() != 3) {
            ekrw ekrwVarH3 = h.h();
            ekrwVarH3.X(eksq.a, "BugleMapi");
            ekrd ekrdVar3 = (ekrd) ekrwVarH3;
            ekrdVar3.X(cqnc.c, this.a);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 332, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not fully interactable");
            return false;
        }
        ajmc ajmcVar = this.c;
        if (!(ajmcVar instanceof ajmq)) {
            ekrw ekrwVarH4 = h.h();
            ekrwVarH4.X(eksq.a, "BugleMapi");
            ekrd ekrdVar4 = (ekrd) ekrwVarH4;
            ekrdVar4.X(cqnc.c, this.a);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 339, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not outgoing");
            return false;
        }
        if (!((ajmq) ajmcVar).c().z(aoerVar)) {
            ekrw ekrwVarH5 = h.h();
            ekrwVarH5.X(eksq.a, "BugleMapi");
            ekrd ekrdVar5 = (ekrd) ekrwVarH5;
            ekrdVar5.X(cqnc.c, this.a);
            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 346, "BugleMessage.kt")).q("Not deletable for everyone reason: message has different self identity");
            return false;
        }
        if (!this.g.plus(j).isBefore(this.v.f())) {
            return true;
        }
        ekrw ekrwVarH6 = h.h();
        ekrwVarH6.X(eksq.a, "BugleMapi");
        ekrd ekrdVar6 = (ekrd) ekrwVarH6;
        ekrdVar6.X(cqnc.c, this.a);
        ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 353, "BugleMessage.kt")).q("Not deletable for everyone reason: message is too old");
        return false;
    }

    public final String toString() {
        return "BugleMessage(messageDetailsFactory=" + this.k + ", context=" + this.l + ", canForwardMessageUtil=" + this.w + ", replyIdsObservableSupplierFactoryProvider=" + this.m + ", replyCountObservableSupplierFactoryProvider=" + this.n + ", enableSwipeToShowTimestamps=" + this.o + ", id=" + this.a + ", conversationId=" + this.b + ", conversationProperties=" + this.p + ", messageRow=" + this.q + ", provenance=" + this.c + ", content=" + this.d + ", extensionState=" + this.r + ", status=" + this.s + ", statusSupplier=" + this.t + ", ignoreReactions=" + this.u + ", recipients=" + this.e + ", editHistoryLoaderProvider=" + this.f + ", clock=" + this.v + ")";
    }

    @Override // defpackage.ajlt
    public final boolean u() {
        return alwr.a(this);
    }

    @Override // defpackage.ajlt
    public final boolean v(aoer aoerVar) {
        Instant instantN;
        List listG = fcva.g(ajlj.ONE_ON_ONE, ajlj.GROUP);
        ajlk ajlkVar = this.p;
        if (!listG.contains(ajlkVar.c())) {
            ekrw ekrwVarH = h.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.c, this.a);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 254, "BugleMessage.kt")).q("Not editable reason: conversation is not 1:1 or group");
            return false;
        }
        if (ajlkVar.t() != w()) {
            ekrw ekrwVarH2 = h.h();
            ekrwVarH2.X(eksq.a, "BugleMapi");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(cqnc.c, this.a);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 261, "BugleMessage.kt")).q("Not editable reason: conversation is encrypted does not match message");
            return false;
        }
        if (a() != ajls.b) {
            ekrw ekrwVarH3 = h.h();
            ekrwVarH3.X(eksq.a, "BugleMapi");
            ekrd ekrdVar3 = (ekrd) ekrwVarH3;
            ekrdVar3.X(cqnc.c, this.a);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 268, "BugleMessage.kt")).q("Not editable reason: message is not rich");
            return false;
        }
        if (C() != 3) {
            ekrw ekrwVarH4 = h.h();
            ekrwVarH4.X(eksq.a, "BugleMapi");
            ekrd ekrdVar4 = (ekrd) ekrwVarH4;
            ekrdVar4.X(cqnc.c, this.a);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 275, "BugleMessage.kt")).q("Not editable reason: message is not fully interactable");
            return false;
        }
        if (!(this.d instanceof amwf)) {
            ekrw ekrwVarH5 = h.h();
            ekrwVarH5.X(eksq.a, "BugleMapi");
            ekrd ekrdVar5 = (ekrd) ekrwVarH5;
            ekrdVar5.X(cqnc.c, this.a);
            ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 282, "BugleMessage.kt")).q("Not editable reason: message is not text");
            return false;
        }
        ajmc ajmcVar = this.c;
        if (!(ajmcVar instanceof ajmq)) {
            ekrw ekrwVarH6 = h.h();
            ekrwVarH6.X(eksq.a, "BugleMapi");
            ekrd ekrdVar6 = (ekrd) ekrwVarH6;
            ekrdVar6.X(cqnc.c, this.a);
            ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 289, "BugleMessage.kt")).q("Not editable reason: message is not outgoing");
            return false;
        }
        if (!((ajmq) ajmcVar).c().z(aoerVar)) {
            ekrw ekrwVarH7 = h.h();
            ekrwVarH7.X(eksq.a, "BugleMapi");
            ekrd ekrdVar7 = (ekrd) ekrwVarH7;
            ekrdVar7.X(cqnc.c, this.a);
            ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 296, "BugleMessage.kt")).q("Not editable reason: message has different self identity");
            return false;
        }
        angj angjVarB = B();
        if (angjVarB == null || (instantN = ((bqec) fcva.N(angjVarB.a)).n()) == null) {
            instantN = this.g;
        }
        if (!instantN.plus(i).isBefore(this.v.f())) {
            return true;
        }
        ekrw ekrwVarH8 = h.h();
        ekrwVarH8.X(eksq.a, "BugleMapi");
        ekrd ekrdVar8 = (ekrd) ekrwVarH8;
        ekrdVar8.X(cqnc.c, this.a);
        ((ekrd) ekrdVar8.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 305, "BugleMessage.kt")).q("Not editable reason: message is too old");
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean w() {
        return this.q.o() != 0;
    }

    @Override // defpackage.ajlt
    public final boolean x() {
        Map mapUnmodifiableMap;
        eyge eygeVar;
        Map mapUnmodifiableMap2;
        eyga eygaVarQ = this.q.Q();
        String str = null;
        if (eygaVarQ != null && (mapUnmodifiableMap = DesugarCollections.unmodifiableMap(eygaVarQ.b)) != null && (eygeVar = (eyge) mapUnmodifiableMap.get(civa.RCS_PENPAL_NAMESPACE.q)) != null && (mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(eygeVar.b)) != null) {
            str = (String) mapUnmodifiableMap2.get("jakgvfknopmmo");
        }
        return fdbq.f(str, "true");
    }

    @Override // defpackage.ajlt
    public final boolean y() {
        return this.q.ai();
    }

    @Override // defpackage.ajlt
    public final boolean z() {
        return ((anar) this.r).a;
    }
}
