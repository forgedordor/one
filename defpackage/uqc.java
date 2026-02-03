package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqc {
    public final boolean A;
    public final boolean B;
    public final avoe C;
    public final fcsu H;
    public final a I;
    private final fcsu K;
    public bagb c;
    public uql d;
    public uqi e;
    public String g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final eygg l;
    public final fcsu m;
    public final fcsu n;
    public final eygg o;
    public final eygg p;
    public final eygg q;
    public final eygg r;
    public final fcsu s;
    public final eygg t;
    public final eygg u;
    public final fcsu v;
    public final fcsu w;
    public final upv x;
    public final ConversationIdType y;
    public final ConversationId z;
    public static final cqce a = cqce.g("Bugle", "ConversationSettingsFragment");
    public static final eksp b = eksp.c("BugleNotifications");
    private static final eksp J = eksp.c("BugleNotifications");
    public Optional f = Optional.empty();
    public final egzv D = new egzv<Optional<String>>() { // from class: uqc.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            uqc.a.r("Error getting group name data for conversation settings, conversationId: ".concat(String.valueOf(String.valueOf(uqc.this.y))));
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                uqi uqiVar = uqc.this.e;
                uqiVar.a = (String) optional.get();
                uqiVar.q(0);
            }
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    };
    public final egps E = new egps<Void, Boolean>() { // from class: uqc.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (((Boolean) obj2).booleanValue()) {
                return;
            }
            uqc.a.r("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(uqc.this.y))));
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            uqc.a.r("Error reporting not spam, conversationId: ".concat(String.valueOf(String.valueOf(uqc.this.y))));
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps F = new egps<ParticipantsTable.BindData, Void>() { // from class: uqc.3
        @Override // defpackage.egps
        public final /* synthetic */ void c(Object obj, Object obj2) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            tix tixVar = (tix) uqc.this.s.b();
            tiv tivVarG = tiw.g();
            String strO = bindData.O();
            strO.getClass();
            ((tir) tivVarG).a = strO;
            tivVarG.g(bindData.X(), false);
            tivVarG.h(bindData.aa(), false);
            tixVar.b(tivVarG.f());
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            uqc.a.r("Error unblocking destination");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final egps G = new egps<Void, evwl<ahci>>() { // from class: uqc.4
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws IOException {
            uqc uqcVar = uqc.this;
            upv upvVar = uqcVar.x;
            upvVar.getClass();
            Context contextZ = upvVar.z();
            fcsu fcsuVar = uqcVar.j;
            fcsuVar.getClass();
            eiid.o(contextZ, ((ahbk) ((Optional) fcsuVar.b()).orElseThrow()).a(contextZ, (ahci) ((evwl) obj2).a(ahci.a, evrr.a())));
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((eksl) ((eksl) ((eksl) uqc.b.j()).g(th)).h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer$4", "onFailure", (char) 287, "ConversationSettingsBaseFragmentPeer.java")).q("Missing self identity, can't show security key");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public uqc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eygg eyggVar, fcsu fcsuVar6, fcsu fcsuVar7, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5, fcsu fcsuVar8, eygg eyggVar6, eygg eyggVar7, fcsu fcsuVar9, upv upvVar, fcsu fcsuVar10, fcsu fcsuVar11, upx upxVar) {
        this.H = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = eyggVar;
        this.m = fcsuVar6;
        this.n = fcsuVar7;
        this.o = eyggVar2;
        this.p = eyggVar3;
        this.q = eyggVar4;
        this.r = eyggVar5;
        this.s = fcsuVar8;
        this.t = eyggVar6;
        this.u = eyggVar7;
        this.v = fcsuVar9;
        this.K = fcsuVar10;
        this.w = fcsuVar11;
        this.x = upvVar;
        ConversationIdType conversationIdTypeB = barn.b(upxVar.b);
        this.y = conversationIdTypeB;
        this.z = new BugleConversationId(conversationIdTypeB);
        this.B = upxVar.d;
        this.A = upxVar.c;
        avoe avoeVarB = avoe.b(upxVar.f);
        this.C = avoeVarB == null ? avoe.UNRECOGNIZED : avoeVarB;
        this.I = new a();
    }

    public final void a(String str) {
        cgoq cgoqVar = (cgoq) this.K.b();
        fcsu fcsuVar = this.n;
        cqdn cqdnVar = (cqdn) fcsuVar.b();
        ConversationIdType conversationIdType = this.y;
        Intent intentB = cgoqVar.b(str, cqdnVar.e(conversationIdType), conversationIdType);
        if (intentB != null) {
            this.x.startActivityForResult(intentB, 1001);
            return;
        }
        eksl ekslVar = (eksl) J.j();
        ekslVar.X(cqnc.r, conversationIdType.a());
        ekslVar.X(cgey.t, ((cqdn) fcsuVar.b()).e(conversationIdType));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer", "createAndOpenNotificationChannel", 696, "ConversationSettingsBaseFragmentPeer.java")).q("intent is null, unable to open notification channel settings");
    }

    /* compiled from: PG */
    final class b implements egzv<bage> {
        private final Consumer a;
        private final Consumer b;

        public b(Consumer consumer, Consumer consumer2) {
            this.a = consumer;
            this.b = consumer2;
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            this.b.z(th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            this.a.z((bage) obj);
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    }

    /* compiled from: PG */
    final class a implements egps<Void, Boolean> {
        public a() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            if (!((Boolean) obj2).booleanValue()) {
                uqc.a.r("Error creating shortcut, can't open notification settings");
                return;
            }
            uqc uqcVar = uqc.this;
            uqi uqiVar = uqcVar.e;
            uqiVar.getClass();
            uqcVar.a(uqiVar.a);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            uqc.a.r("Error creating shortcut, can't open notification settings");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
