package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjl extends afjo implements afjs, acop, afid, ahbh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/main/MainActivityPeer");
    public acrt A;
    public Toolbar B;
    public ConversationActivityUiState C;
    public ConversationActivityUsageStatisticsState D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public srp K;
    public boolean L;
    public MessageCoreData M;
    public int N;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final fcsu T;
    private final fcsu U;
    private final fcsu V;
    private final fcsu W;
    private final fcsu X;
    private final fcsu Y;
    private final fcsu Z;
    private final Optional aa;
    private final fcsu ab;
    private final fcsu ac;
    private final fdjx ad;
    private final fcsu ae;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final fcsu aj;
    private final fcsu ak;
    private final fcsu al;
    private final fctc am;
    private final fctc an;
    private final fctc ao;
    private abs ap;
    private abs aq;
    private bajg ar;
    public final MainActivity b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final eigp f;
    public final fcsu g;
    public final tlt h;
    public final fcsu i;
    public final Optional j;
    public final fcsu k;
    public final sqw l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final Optional u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final cqce z;

    public afjl(MainActivity mainActivity, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, eigp eigpVar, fcsu fcsuVar12, tlt tltVar, umn umnVar, fcsu fcsuVar13, Optional optional, fcsu fcsuVar14, fcsu fcsuVar15, sqw sqwVar, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, Optional optional2, fcsu fcsuVar28, fcsu fcsuVar29, Optional optional3, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fdjx fdjxVar, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43, apwj apwjVar, fcsu fcsuVar44, fcsu fcsuVar45, fcsu fcsuVar46) throws IOException {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        eigpVar.getClass();
        tltVar.getClass();
        umnVar.getClass();
        fcsuVar14.getClass();
        sqwVar.getClass();
        fcsuVar20.getClass();
        fcsuVar24.getClass();
        fcsuVar27.getClass();
        fcsuVar32.getClass();
        fdjxVar.getClass();
        fcsuVar34.getClass();
        fcsuVar36.getClass();
        fcsuVar37.getClass();
        fcsuVar40.getClass();
        fcsuVar41.getClass();
        fcsuVar42.getClass();
        fcsuVar43.getClass();
        apwjVar.getClass();
        fcsuVar44.getClass();
        fcsuVar45.getClass();
        fcsuVar46.getClass();
        this.b = mainActivity;
        this.P = fcsuVar;
        this.c = fcsuVar2;
        this.Q = fcsuVar4;
        this.d = fcsuVar5;
        this.R = fcsuVar6;
        this.e = fcsuVar7;
        this.S = fcsuVar8;
        this.T = fcsuVar9;
        this.U = fcsuVar10;
        this.V = fcsuVar11;
        this.f = eigpVar;
        this.g = fcsuVar12;
        this.h = tltVar;
        this.i = fcsuVar13;
        this.j = optional;
        this.W = fcsuVar14;
        this.k = fcsuVar15;
        this.l = sqwVar;
        this.m = fcsuVar18;
        this.n = fcsuVar19;
        this.X = fcsuVar20;
        this.Y = fcsuVar21;
        this.o = fcsuVar22;
        this.p = fcsuVar23;
        this.Z = fcsuVar24;
        this.q = fcsuVar25;
        this.r = fcsuVar26;
        this.aa = optional2;
        this.s = fcsuVar28;
        this.t = fcsuVar29;
        this.u = optional3;
        this.ab = fcsuVar30;
        this.ac = fcsuVar31;
        this.v = fcsuVar32;
        this.ad = fdjxVar;
        this.w = fcsuVar33;
        this.ae = fcsuVar34;
        this.af = fcsuVar36;
        this.x = fcsuVar37;
        this.ag = fcsuVar38;
        this.ah = fcsuVar39;
        this.ai = fcsuVar41;
        this.aj = fcsuVar42;
        this.y = fcsuVar43;
        this.ak = fcsuVar45;
        this.al = fcsuVar46;
        this.am = fctd.a(new fdae() { // from class: afif
            @Override // defpackage.fdae
            public final Object invoke() {
                return (afjp) new lxo(this.a.b).a(afjp.class);
            }
        });
        this.z = cqce.g("Bugle", "MainActivity");
        this.an = fctd.a(new fdae() { // from class: afig
            @Override // defpackage.fdae
            public final Object invoke() {
                return afhx.a(new afje(this.a));
            }
        });
        this.ao = fctd.a(new fdae() { // from class: afih
            @Override // defpackage.fdae
            public final Object invoke() {
                return (afhu) this.a.s.b();
            }
        });
        eieu eieuVarH = eiiy.h("MainActivityPeer#init");
        try {
            dztc.a.c(dzlw.e());
            if (!this.u.isEmpty()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/main/MainActivityPeer", "<init>", 362, "MainActivityPeer.kt")).q("MainActivityShell is present, using MainActivityShell.");
            } else if (abxb.a()) {
                final efxf efxfVar = (efxf) this.k.b();
                egap egapVarE = egaq.e(this.b);
                sqw sqwVar2 = this.l;
                eieu eieuVarJ = eiiy.j("DefaultAccountPrefetchedSelector::prefetchDefaultAccount", eiey.a);
                try {
                    ListenableFuture listenableFutureD = sqwVar2.b.a.d();
                    eieuVarJ.b(listenableFutureD);
                    fczl.a(eieuVarJ, null);
                    sqwVar2.c = eiju.g(listenableFutureD);
                    egapVarE.d(sqw.class);
                    efxfVar.e(new egkb(this.l.a));
                    if (abxb.b() || abxb.a()) {
                        Optional optional4 = (Optional) this.q.b();
                        final fdap fdapVar = new fdap() { // from class: afii
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                abxa abxaVar = (abxa) obj;
                                abxaVar.getClass();
                                efxfVar.e(new abwz(abxaVar));
                                return fctx.a;
                            }
                        };
                        optional4.ifPresent(new Consumer() { // from class: afij
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                fdapVar.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    efxfVar.e((efzm) fcsuVar16.b());
                    if (crtr.e()) {
                        efxfVar.e((efzm) fcsuVar17.b());
                    }
                    efxfVar.e(new afjb(this));
                    egapVarE.d(eghx.class);
                    efxfVar.g(egapVarE.a());
                    if (((Optional) this.ab.b()).isPresent()) {
                        ((efxf) ((abzr) ((Optional) this.ab.b()).get()).a.b()).f(abyy.g);
                    }
                } finally {
                }
            } else {
                efxf efxfVar2 = (efxf) this.k.b();
                egap egapVarE2 = egaq.e(this.b);
                egapVarE2.d(sqx.class);
                efxfVar2.e((efzm) fcsuVar16.b());
                efxfVar2.e(new afjb(this));
                efxfVar2.g(egapVarE2.a());
                Optional optional5 = this.aa;
                final fdap fdapVar2 = new fdap() { // from class: afik
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        sqv sqvVar = (sqv) obj;
                        sqvVar.getClass();
                        sqvVar.a();
                        return fctx.a;
                    }
                };
                optional5.ifPresent(new Consumer() { // from class: afil
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        fdapVar2.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    private final acod F() {
        lvj lvjVarH = this.b.a().h("conversation_list_root_fragment_tag");
        if (true != (lvjVarH instanceof ea)) {
            lvjVarH = null;
        }
        ehlg ehlgVar = lvjVarH instanceof ehlg ? (ehlg) lvjVarH : null;
        Object objH = ehlgVar != null ? ehlgVar.H() : null;
        if (objH instanceof acod) {
            return (acod) objH;
        }
        return null;
    }

    private final afhu G() {
        return (afhu) this.ao.a();
    }

    private final void H() {
        MainActivity mainActivity = this.b;
        mainActivity.getIntent().removeExtra("via_start_chat_intent");
        mainActivity.getIntent().removeExtra("render_add_recipient_button");
        mainActivity.getIntent().removeExtra("delete_empty_conversation_on_back");
    }

    private final void I(ConversationId conversationId, MessageIdType messageIdType) {
        if (n().a != 16) {
            H();
        }
        C();
        n().a = 1;
        n().b = conversationId;
        C();
        if (!messageIdType.c()) {
            this.b.getIntent().putExtra("message_id", messageIdType.b());
        }
        D();
    }

    public final void A() {
        abs absVar = this.ap;
        if (absVar != null) {
            boolean z = true;
            if (!n().c() && !n().d()) {
                z = false;
            }
            absVar.h(z);
        }
    }

    public final boolean B() {
        this.u.isPresent();
        return n().e();
    }

    public final void C() {
    }

    public final void D() {
        final fdea afjkVar;
        Toolbar toolbar;
        final uok uokVarP = p();
        if (uokVarP == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fdau fdauVar = new fdau() { // from class: afis
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                gg ggVar = (gg) obj;
                ConversationId conversationId = (ConversationId) obj2;
                ggVar.getClass();
                conversationId.getClass();
                SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
                return uokVarP.g(ggVar, conversationId);
            }
        };
        fdap fdapVar = new fdap() { // from class: afit
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                uokVarP.e(ggVar);
                return fctx.a;
            }
        };
        fdap fdapVar2 = new fdap() { // from class: afiu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                afjl afjlVar = this;
                uokVarP.f(ggVar, afjlVar.n().f(afjlVar.N));
                return fctx.a;
            }
        };
        if (this.E || this.G) {
            this.z.n("skipping ui state update because the activity is stopped or state has already been saved");
            return;
        }
        MainActivity mainActivity = this.b;
        Intent intent = mainActivity.getIntent();
        ConversationId conversationId = n().b;
        uok uokVarP2 = p();
        if (uokVarP2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cg cgVar = new cg(uokVarP2.b());
        boolean zD = n().d();
        boolean zC = n().c();
        uok uokVarP3 = p();
        ea eaVarA = uokVarP3 != null ? uokVarP3.a() : null;
        E();
        ea eaVarD = d();
        if (eaVarA != null && !zD) {
            cgVar.o(eaVarA);
        }
        C();
        if (n().c() && mainActivity.k() != null && (toolbar = this.B) != null) {
            toolbar.setVisibility(8);
        }
        if (zD) {
            if (this.ar == null) {
                new bajg(intent.getExtras());
            }
            this.ar = null;
            if (conversationId == null) {
                throw new IllegalStateException("Required value was null.");
            }
            acrt acrtVar = this.A;
            if (acrtVar != null) {
                acrtVar.i().Q(conversationId);
            }
            intent.getClass();
            MessageCoreData messageCoreDataS = s(intent);
            MessageCoreData messageCoreData = messageCoreDataS == null ? null : messageCoreDataS;
            if (!zC && messageCoreDataS != null) {
                afiy.a(intent);
            }
            if (intent.getBooleanExtra("open_keyboard", false)) {
                n().d = true;
            }
            C();
            fdauVar.a(cgVar, conversationId, messageCoreData);
            mainActivity.Y();
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1600, "MainActivityPeer.kt")).q("Conversation 2 from MainActivity enabled.");
            Intent intent2 = mainActivity.getIntent();
            intent2.getClass();
            afiy.a(intent2);
            this.M = null;
        }
        this.u.isPresent();
        ea eaVarC = c();
        eaVarC.getClass();
        ea eaVarH = eaVarC.I().h("conversation_placeholder");
        uml umlVar = eaVarH instanceof uml ? (uml) eaVarH : null;
        if (true != (umlVar instanceof uml)) {
            umlVar = null;
        }
        if (n().e()) {
            if (umlVar == null && afic.a(mainActivity, this.h.a)) {
                fdapVar.invoke(cgVar);
            } else if (umlVar != null && !afic.a(mainActivity, this.h.a)) {
                cgVar.o(umlVar);
            }
            g();
        } else if (umlVar != null) {
            cgVar.o(umlVar);
        }
        ufg ufgVarM = m();
        if (zC) {
            if (ufgVarM == null) {
                fdapVar2.invoke(cgVar);
            }
            ((cqdn) this.S.b()).f(mainActivity);
            afjkVar = new afjj(this);
        } else {
            if (ufgVarM != null) {
                cgVar.o(((vdt) ufgVarM).b);
            }
            afjkVar = new afjk(this);
        }
        cgVar.y(false, new Runnable() { // from class: afix
            @Override // java.lang.Runnable
            public final void run() {
                ((fdae) afjkVar).invoke();
            }
        });
        if (!cgVar.i()) {
            cgVar.c();
        }
        if (n().e() || afic.a(mainActivity, this.h.a)) {
            if (eaVarD == null) {
                acod acodVarF = F();
                acodVarF.getClass();
                acodVarF.b();
            }
            acrt acrtVarQ = q();
            acrtVarQ.getClass();
            acrtVarQ.aO = this;
            this.A = acrtVarQ;
        } else if (eaVarD != null) {
            acod acodVarF2 = F();
            acodVarF2.getClass();
            acodVarF2.c();
            this.A = null;
            C();
            ((dssz) this.d.b()).a(((acgx) this.g.b()).a(mainActivity, null));
        }
        A();
    }

    public final void E() {
        this.u.isPresent();
        C();
    }

    @Override // defpackage.afid
    public final void a(agbs agbsVar) {
        this.u.isPresent();
        C();
        this.ar = null;
        int i = agbsVar.g;
        boolean z = i != 2;
        if (i == 2) {
            o().a = elka.CONVERSATION_FROM_COMPOSE;
            n().a = 16;
        } else if (((dfmi) this.ai.b()).a() && i == 7) {
            o().a = elka.CONVERSATION_FROM_RBM_SUGGESTED_ACTION;
        }
        MainActivity mainActivity = this.b;
        boolean z2 = agbsVar.b;
        Intent intent = mainActivity.getIntent();
        intent.putExtra("render_add_recipient_button", z2);
        intent.putExtra("delete_empty_conversation_on_back", agbsVar.c);
        intent.putExtra("via_start_chat_intent", true ^ z);
        ComposeRowState composeRowState = agbsVar.d;
        if (composeRowState != null) {
            intent.getClass();
            avnt.d(intent, composeRowState);
        }
        I(agbsVar.a, bary.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afid
    public final void b() {
        Optional optional = this.u;
        optional.isPresent();
        H();
        optional.isPresent();
        n().d = false;
        MainActivity mainActivity = this.b;
        mainActivity.getIntent().replaceExtras((Bundle) null);
        ekgb ekgbVar = avmq.a;
        ekgbVar.getClass();
        ekqh it = ekgbVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mainActivity.getIntent().hasExtra(str)) {
                mainActivity.getIntent().removeExtra(str);
            }
        }
        z();
    }

    public final ea c() {
        ea eaVarH = this.b.a().h("conversation_root_fragment_tag");
        if (eaVarH instanceof ea) {
            return eaVarH;
        }
        return null;
    }

    public final ea d() {
        this.u.isPresent();
        acod acodVarF = F();
        if (acodVarF != null) {
            return acodVarF.a();
        }
        return null;
    }

    @Override // defpackage.acop
    public final Optional e() {
        this.u.isPresent();
        return this.b.V();
    }

    @Override // defpackage.acop
    public final void f() {
        if (e().isEmpty()) {
            this.z.m("Bypassing dismissActionMode call, since action mode was not started");
            return;
        }
        this.z.m("dismissActionMode");
        this.u.isPresent();
        abs absVar = this.aq;
        if (absVar != null) {
            absVar.h(false);
        }
        afhu afhuVarG = G();
        Window window = afhuVarG.a.getWindow();
        Integer num = afhuVarG.b;
        window.setStatusBarColor(num != null ? num.intValue() : 0);
        afhuVarG.b = null;
        this.b.W();
    }

    @Override // defpackage.acop
    public final void g() {
        this.u.isPresent();
        this.b.Y();
    }

    @Override // defpackage.acop
    public final void h() {
        if (B()) {
            this.b.Z();
        }
    }

    @Override // defpackage.acop
    public final void i() {
        this.u.isPresent();
        E();
        Intent intent = this.b.getIntent();
        intent.getClass();
        afiy.a(intent);
        if (e().isPresent()) {
            f();
        }
        n().b = null;
        n().a = 2;
        D();
    }

    @Override // defpackage.acop
    public final void j(ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar) {
        conversationId.getClass();
        Optional optional = this.u;
        optional.isPresent();
        this.ar = bajgVar;
        optional.isPresent();
        C();
        I(conversationId, messageIdType);
    }

    @Override // defpackage.acop
    public final /* synthetic */ void k(ConversationId conversationId, bajg bajgVar) {
        acoo.a(this, conversationId, bajgVar);
    }

    @Override // defpackage.acop
    public final void l(ActionMode.Callback callback, View view) {
        this.u.isPresent();
        abs absVar = this.aq;
        if (absVar != null) {
            absVar.h(true);
        }
        z();
        this.b.ac(callback, view);
        afhu afhuVarG = G();
        Window window = afhuVarG.a.getWindow();
        afhuVarG.b = Integer.valueOf(window.getStatusBarColor());
        window.setStatusBarColor(((Number) afhuVarG.c.a()).intValue());
    }

    public final ufg m() {
        this.u.isPresent();
        uok uokVarP = p();
        if (uokVarP != null) {
            return uokVarP.c();
        }
        return null;
    }

    public final ConversationActivityUiState n() {
        ConversationActivityUiState conversationActivityUiState = this.C;
        if (conversationActivityUiState != null) {
            return conversationActivityUiState;
        }
        fdbq.c("uiState");
        return null;
    }

    public final ConversationActivityUsageStatisticsState o() {
        ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = this.D;
        if (conversationActivityUsageStatisticsState != null) {
            return conversationActivityUsageStatisticsState;
        }
        fdbq.c("usageStatisticsState");
        return null;
    }

    public final uok p() {
        lvj lvjVarC = c();
        ehlg ehlgVar = lvjVarC instanceof ehlg ? (ehlg) lvjVarC : null;
        Object objH = ehlgVar != null ? ehlgVar.H() : null;
        if (objH instanceof uok) {
            return (uok) objH;
        }
        return null;
    }

    public final acrt q() {
        this.u.isPresent();
        ea eaVarD = d();
        if (eaVarD instanceof acom) {
            return ((acom) eaVarD).H();
        }
        return null;
    }

    public final ConversationId r(Intent intent) {
        return ((ajso) this.w.b()).a(intent);
    }

    public final MessageCoreData s(Intent intent) {
        MessageCoreData messageCoreDataF;
        elwq elwqVar;
        if (!craf.b || !intent.hasExtra("android.remoteInputDraft")) {
            if (intent.hasExtra("draft_data")) {
                return (MessageCoreData) intent.getParcelableExtra("draft_data");
            }
            return null;
        }
        String stringExtra = intent.getStringExtra("android.remoteInputDraft");
        ConversationId conversationId = n().b;
        String strB = conversationId != null ? conversationId.b() : null;
        bags bagsVar = (bags) this.Q.b();
        fcsu fcsuVar = bagsVar.a;
        ConversationIdType conversationIdTypeB = barn.b(strB);
        cogw cogwVar = (cogw) fcsuVar.b();
        cogwVar.getClass();
        cbpr cbprVar = (cbpr) bagsVar.b.b();
        cbprVar.getClass();
        chwq chwqVar = (chwq) bagsVar.c.b();
        chwqVar.getClass();
        ((cmum) bagsVar.d.b()).getClass();
        ((cmuq) bagsVar.e.b()).getClass();
        ((Context) bagsVar.f.b()).getClass();
        cqpz cqpzVar = (cqpz) bagsVar.g.b();
        cqpzVar.getClass();
        ((crny) bagsVar.h.b()).getClass();
        cqmp cqmpVar = (cqmp) bagsVar.i.b();
        cqmpVar.getClass();
        ((cmop) bagsVar.j.b()).getClass();
        ((cmtv) bagsVar.k.b()).getClass();
        cmvw cmvwVar = (cmvw) bagsVar.l.b();
        cmvwVar.getClass();
        ((bagw) bagsVar.m.b()).getClass();
        ((anpm) bagsVar.n.b()).getClass();
        ((bbfn) bagsVar.o.b()).getClass();
        baii baiiVar = (baii) bagsVar.p.b();
        baiiVar.getClass();
        bveg bvegVar = (bveg) bagsVar.q.b();
        bvegVar.getClass();
        uhr uhrVar = (uhr) bagsVar.r.b();
        uhrVar.getClass();
        ((batj) bagsVar.s.b()).getClass();
        fcsu fcsuVar2 = bagsVar.u;
        fcsu fcsuVar3 = bagsVar.t;
        fcsu fcsuVar4 = bagsVar.v;
        ((awlc) bagsVar.w.b()).getClass();
        bagr bagrVar = new bagr(cogwVar, cbprVar, chwqVar, cqpzVar, cqmpVar, cmvwVar, baiiVar, bvegVar, uhrVar, fcsuVar3, fcsuVar2, conversationIdTypeB, fcsuVar4, bagsVar.x);
        bagrVar.t(stringExtra);
        long epochMilli = ((cogw) this.P.b()).f().toEpochMilli();
        eieu eieuVarK = eiiy.k("DraftMessageData::prepareMessageForSending");
        try {
            cqaz.k(bagrVar.o.isEmpty());
            bagrVar.f = bagrVar.p(bagrVar.f);
            eieu eieuVarK2 = eiiy.k("DraftMessageData::createMessageWithCurrentAttachments");
            try {
                if (bagrVar.x()) {
                    messageCoreDataF = bagrVar.u.e(bagrVar.c, null, bagrVar.f, bagrVar.h, bagrVar.i);
                } else if (bagrVar.m.isEmpty()) {
                    messageCoreDataF = bagrVar.u.f(bagrVar.c, null, bagrVar.f);
                } else {
                    try {
                        aubq aubqVarA = ((chtk) bagrVar.w.b()).a(bagrVar.j);
                        if (aubqVarA == null && (aubqVarA = (aubq) bagrVar.k.get()) == null) {
                            throw new bagq(bagrVar.j);
                        }
                        messageCoreDataF = bagrVar.u.t(bagrVar.c, bagrVar.f, aubqVarA);
                    } catch (RuntimeException e) {
                        ekrw ekrwVarJ = bagr.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "createMessageWithCurrentAttachments", 622, "DraftMessageData.java")).q("failed to draft as sms link file transfer, drafting without chat endpoint instead");
                        messageCoreDataF = bagrVar.u.f(bagrVar.c, null, bagrVar.f);
                    }
                }
                List list = bagrVar.m;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MessagePartCoreData) it.next()).D());
                }
                ((MessageData) messageCoreDataF).i.addAll(0, arrayList);
                ((MessageData) messageCoreDataF).m = null;
                list.clear();
                bagrVar.o.clear();
                List list2 = bagrVar.p;
                list2.clear();
                bagrVar.t(null);
                bagrVar.s(null);
                bagrVar.i = false;
                bagrVar.r(255);
                eieuVarK2.close();
                messageCoreDataF.ce(messageCoreDataF.A(), messageCoreDataF.u(), epochMilli);
                eieuVarK2 = eiiy.k("DraftMessageData::getDraftProtocolConditions");
                try {
                    if (((bagp) bagrVar.e.get()) == null) {
                        elwqVar = null;
                    } else {
                        elwm elwmVar = (elwm) elwq.a.createBuilder();
                        boolean z = !list2.isEmpty();
                        elwmVar.copyOnWrite();
                        elwq elwqVar2 = (elwq) elwmVar.instance;
                        elwqVar2.b |= 16384;
                        elwqVar2.l = z;
                        elwmVar.copyOnWrite();
                        elwq elwqVar3 = (elwq) elwmVar.instance;
                        elwqVar3.b |= 4096;
                        elwqVar3.j = false;
                        elwmVar.copyOnWrite();
                        elwq elwqVar4 = (elwq) elwmVar.instance;
                        elwqVar4.b |= 8192;
                        elwqVar4.k = false;
                        elwqVar = (elwq) elwmVar.build();
                    }
                    eieuVarK2.close();
                    ((MessageData) messageCoreDataF).p = elwqVar;
                    eieuVarK.close();
                    return messageCoreDataF;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void t(int i) {
        MainActivity mainActivity = this.b;
        View viewFindViewById = mainActivity.findViewById(R.id.contact_picker_fragment_container);
        if (viewFindViewById == null) {
            mainActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new afjc(this, i));
        } else if (viewFindViewById.getVisibility() != i) {
            viewFindViewById.setVisibility(i);
        }
    }

    @Override // defpackage.afjo
    public final void u(Bundle bundle) throws IOException {
        eieu eieuVarH = eiiy.h("MainActivity#onCreate");
        try {
            this.u.isPresent();
            fcsu fcsuVar = this.e;
            ((ajfo) fcsuVar.b()).d(ajfo.q);
            Intent intent = this.b.getIntent();
            boolean z = bundle == null && intent != null && intent.getBooleanExtra("via_notification", false);
            if (z) {
                ((ajfo) fcsuVar.b()).d(ajfo.m);
            }
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/main/MainActivityPeer", "onCreate", 593, "MainActivityPeer.kt");
            intent.getClass();
            boolean z2 = z;
            ekrdVar.I("onCreate: intent conversationId: %s, timestamp: %d, via notification: %s", r(intent), Long.valueOf(intent.getLongExtra("intent_timestamp", 0L)), Boolean.valueOf(z2));
            eieuVarH = eiiy.h("MainActivity#preOnCreate");
            try {
                x(intent, bundle, false);
                fczl.a(eieuVarH, null);
                if (((abjz) this.X.b()).b()) {
                    cqce cqceVar = this.z;
                    cqceVar.p("Try to launch Ditto.");
                    Object objB = this.Y.b();
                    objB.getClass();
                    Optional optional = (Optional) objB;
                    if (optional.isPresent() && ((abdk) optional.get()).m()) {
                        cqceVar.p("Launching Ditto.");
                        super.u(bundle);
                        ((abdk) optional.get()).c();
                        this.b.finish();
                        fczl.a(eieuVarH, null);
                        return;
                    }
                } else {
                    this.z.p("Device is SMS Capable");
                }
                auvw.k(this.ad, null, null, new afji(this, null), 3);
                super.u(bundle);
                if (((asgn) this.aj.b()).a()) {
                    abl.a(this.b);
                }
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(eksq.a, "Bugle");
                ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/main/MainActivityPeer", "onCreate", 627, "MainActivityPeer.kt");
                C();
                ekrdVar2.t("viewModel.conversation1Override: %s", false);
                MainActivity mainActivity = this.b;
                this.H = afic.a(mainActivity, this.h.a);
                abxb.a();
                eieuVarH = eiiy.h("setContentView");
                try {
                    mainActivity.setContentView(this.H ? ((asgt) this.y.b()).a() ? R.layout.main_activity_with_home_container_split_view_coolranch : R.layout.main_activity_with_home_container_split_view : R.layout.main_activity_full_view);
                    fczl.a(eieuVarH, null);
                    if (n().e()) {
                        ((ajfo) this.e.b()).d(ajfo.p);
                        fcsu fcsuVar2 = ((adaw) this.ac.b()).k;
                        ((dzuc) fcsuVar2.b()).e(adaw.b);
                        ((dzuc) fcsuVar2.b()).e(adaw.a);
                        ((dzuc) fcsuVar2.b()).e(adaw.d);
                        ((dzuc) fcsuVar2.b()).e(adaw.c);
                    }
                    if (((asgn) this.aj.b()).a() && ((arkg) this.af.b()).a()) {
                        View viewFindViewById = this.b.findViewById(android.R.id.content);
                        viewFindViewById.getClass();
                        ldn ldnVar = new ldn() { // from class: afir
                            @Override // defpackage.ldn
                            public final lgt ez(View view, lgt lgtVar) {
                                kzc kzcVarF = lgtVar.f(647);
                                view.setPadding(kzcVarF.b, 0, kzcVarF.d, 0);
                                return lgtVar;
                            }
                        };
                        int[] iArr = ley.a;
                        len.k(viewFindViewById, ldnVar);
                    }
                    eieuVarH = eiiy.h("MainActivity#onBackPressCallbacks");
                    try {
                        this.ap = new afja(this);
                        MainActivity mainActivity2 = this.b;
                        ace aceVarC = mainActivity2.c();
                        abs absVar = this.ap;
                        absVar.getClass();
                        aceVarC.b(mainActivity2, absVar);
                        this.aq = new afiz(this);
                        ace aceVarC2 = mainActivity2.c();
                        abs absVar2 = this.aq;
                        absVar2.getClass();
                        aceVarC2.b(mainActivity2, absVar2);
                        fczl.a(eieuVarH, null);
                        this.z.m("OnCreate#hasNewIntent:" + this.L);
                        ((afib) this.an.a()).a(new afhz());
                        eieuVarH = eiiy.h("MainActivity#postOnCreate");
                        try {
                            w(intent, z2);
                            fczl.a(eieuVarH, null);
                            fczl.a(eieuVarH, null);
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void v() {
        this.u.isPresent();
        E();
        E();
        if (n().c() && m() != null) {
            ufx.d((ufx) this.Z.b(), 10, 0, n().f(this.N), 0, false, 58);
        }
        if (this.J) {
            this.N = 2;
        }
        b();
    }

    public final void w(final Intent intent, boolean z) {
        SidecarCompat sidecarCompat;
        prs prsVarB;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        ConversationId conversationId;
        if (n().e()) {
            fcsu fcsuVar = this.o;
            ((adas) fcsuVar.b()).h();
            lvc lvcVarP = this.b.P();
            Object objB = fcsuVar.b();
            objB.getClass();
            lvcVarP.c((lvi) objB);
        } else if (n().d()) {
            MainActivity mainActivity = this.b;
            fcsu fcsuVar2 = this.p;
            lvc lvcVarP2 = mainActivity.P();
            Object objB2 = fcsuVar2.b();
            objB2.getClass();
            lvcVarP2.c((lvi) objB2);
        }
        this.M = null;
        final cukm cukmVar = (cukm) this.V.b();
        final MainActivity mainActivity2 = this.b;
        tlt tltVar = this.h;
        final boolean z2 = tltVar.a;
        eijx.f(new Runnable() { // from class: cukl
            /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[EDGE_INSN: B:41:0x006b->B:29:0x006b BREAK  A[LOOP:0: B:21:0x004b->B:42:?]] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 314
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cukl.run():void");
            }
        }, cukmVar.c);
        Optional optional = (Optional) this.ae.b();
        final fdap fdapVar = new fdap() { // from class: afie
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                aidh aidhVar = (aidh) obj;
                aidhVar.getClass();
                aidhVar.a();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: afio
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (z && (conversationId = n().b) != null && (conversationId instanceof BugleConversationId)) {
            ((ajhd) this.U.b()).aj(elqb.INCOMING_MSG_NOTIFICATION, 4, ekgb.r(((BugleConversationId) conversationId).a));
        }
        View viewFindViewById = mainActivity2.findViewById(true != this.H ? R.id.conversation_and_compose_container_full_view : R.id.conversation_and_compose_container_split_view);
        viewFindViewById.getClass();
        if (afic.a(mainActivity2, tltVar.a)) {
            ConstraintLayout constraintLayout = viewFindViewById instanceof ConstraintLayout ? (ConstraintLayout) viewFindViewById : null;
            if (constraintLayout != null) {
                int i = pww.a;
                pxi pxiVar = (pxi) pwv.a.a();
                if (pxiVar == null) {
                    if (pyh.a == null) {
                        ReentrantLock reentrantLock = pyh.b;
                        reentrantLock.lock();
                        try {
                            if (pyh.a == null) {
                                try {
                                    prsVarB = pyb.b();
                                } catch (Throwable unused) {
                                }
                                if (prsVarB != null && prsVarB.compareTo(prs.a) >= 0) {
                                    sidecarCompat = new SidecarCompat(mainActivity2);
                                    SidecarInterface sidecarInterface = sidecarCompat.a;
                                    Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                                    Class<?> returnType = method != null ? method.getReturnType() : null;
                                    if (!fdbq.f(returnType, Void.TYPE)) {
                                        throw new NoSuchMethodException(a.l(returnType, "Illegal return type for 'setSidecarCallback': "));
                                    }
                                    if (sidecarInterface != null) {
                                        sidecarInterface.getDeviceState();
                                    }
                                    if (sidecarInterface != null) {
                                        sidecarInterface.onDeviceStateListenersChanged(true);
                                    }
                                    Method method2 = (sidecarInterface == null || (cls3 = sidecarInterface.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                                    Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                                    if (!fdbq.f(returnType2, SidecarWindowLayoutInfo.class)) {
                                        throw new NoSuchMethodException(a.l(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
                                    }
                                    Method method3 = (sidecarInterface == null || (cls2 = sidecarInterface.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                    Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                    if (!fdbq.f(returnType3, Void.TYPE)) {
                                        throw new NoSuchMethodException(a.l(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
                                    }
                                    Method method4 = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                    Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                    if (!fdbq.f(returnType4, Void.TYPE)) {
                                        throw new NoSuchMethodException(a.l(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
                                    }
                                    SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                    try {
                                        sidecarDeviceState.posture = 3;
                                    } catch (NoSuchFieldError unused2) {
                                        SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                        Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                        objInvoke.getClass();
                                        if (((Integer) objInvoke).intValue() != 3) {
                                            throw new Exception("Invalid device posture getter/setter");
                                        }
                                    }
                                    SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                    Rect rect = sidecarDisplayFeature.getRect();
                                    rect.getClass();
                                    sidecarDisplayFeature.setRect(rect);
                                    sidecarDisplayFeature.getType();
                                    sidecarDisplayFeature.setType(1);
                                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                    try {
                                        List list = sidecarWindowLayoutInfo.displayFeatures;
                                    } catch (NoSuchFieldError unused3) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(sidecarDisplayFeature);
                                        SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                        Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                        objInvoke2.getClass();
                                        if (!fdbq.f(arrayList, (List) objInvoke2)) {
                                            throw new Exception("Invalid display feature getter/setter");
                                        }
                                    }
                                } else {
                                    sidecarCompat = null;
                                }
                                pyh.a = new pyh(sidecarCompat);
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    pxiVar = pyh.a;
                    pxiVar.getClass();
                }
                new pxh(null);
                new prh();
                pxb pxbVar = new pxb(pxiVar);
                MainActivity mainActivity3 = this.b;
                fdpb fdpbVar = new fdpb(new pxa(pxbVar, mainActivity3, null));
                fdjq fdjqVar = fdkq.a;
                auvw.k(lvk.a(mainActivity3), null, null, new afjh(new fdua(fdqc.b(fdpbVar, fdzb.a), dphw.d(constraintLayout), new afjf(this, null)), constraintLayout, null), 3);
            }
        }
        String stringExtra = intent.getStringExtra("attachment_uri");
        if (!TextUtils.isEmpty(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("attachment_type");
            ((cqei) this.R.b()).i(viewFindViewById);
            ConversationId conversationId2 = n().b;
            if (le.m(stringExtra2) && conversationId2 != null) {
                MainActivity mainActivity4 = this.b;
                ((aijh) this.T.b()).J(mainActivity4, Uri.parse(stringExtra), bace.a(mainActivity4, ajwb.a(conversationId2)));
                ((ajhd) this.U.b()).L(1);
            } else if (le.z(stringExtra2)) {
                ((aijh) this.T.b()).x(this.b, Uri.parse(stringExtra), stringExtra2);
                ((ajhd) this.U.b()).av();
            }
        }
        lvj lvjVarC = c();
        if (lvjVarC != null) {
            C();
            C();
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/main/MainActivityPeer", "maybeReattachConversationRootFragmentAfterConfigurationChange", 2261, "MainActivityPeer.kt")).q("MainActivityPeer#maybeReattachConversationRootFragment not reattaching");
            D();
        }
    }

    public final void x(Intent intent, Bundle bundle, boolean z) {
        ConversationActivityUiState conversationActivityUiState;
        this.z.p(a.r(abxb.a(), "isBugleAccountEnabled: "));
        if (bundle != null) {
            ConversationActivityUiState conversationActivityUiState2 = (ConversationActivityUiState) bundle.getParcelable("uistate");
            if (conversationActivityUiState2 != null) {
                this.C = conversationActivityUiState2;
            }
            ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = (ConversationActivityUsageStatisticsState) bundle.getParcelable("usstate");
            if (conversationActivityUsageStatisticsState != null) {
                this.D = conversationActivityUsageStatisticsState;
            }
            this.I = bundle.getBoolean("rcscapabilityupdate");
            this.J = bundle.getBoolean("shouldclearactivitystack");
        }
        int i = 1;
        if (z || this.C == null) {
            ConversationId conversationIdR = r(intent);
            int intExtra = intent.getIntExtra("conversation_state", 1);
            if (conversationIdR != null) {
                conversationActivityUiState = new ConversationActivityUiState(conversationIdR, intExtra);
            } else if (intExtra == 2) {
                conversationActivityUiState = new ConversationActivityUiState(2);
            } else {
                conversationActivityUiState = new ConversationActivityUiState(0);
            }
            this.C = conversationActivityUiState;
        }
        this.h.a = n().b();
        if (z || this.D == null) {
            elka elkaVar = elka.CONVERSATION_FROM_LIST;
            if (n().b()) {
                elkaVar = elka.CONVERSATION_FROM_BUBBLE;
            }
            this.D = new ConversationActivityUsageStatisticsState(elkaVar);
        }
        boolean booleanExtra = intent.getBooleanExtra("should_launch_home_on_back", false);
        boolean booleanExtra2 = intent.getBooleanExtra("via_share_intent", false);
        boolean booleanExtra3 = intent.getBooleanExtra("via_rbm_deep_link", false);
        if (booleanExtra || booleanExtra2) {
            i = intent.hasExtra("FOCUS_ON_FIELD") ? 3 : 2;
        } else if (intent.getBooleanExtra("via_start_chat_intent", false)) {
            o().a = elka.CONVERSATION_FROM_COMPOSE;
            i = 4;
        } else if (booleanExtra3) {
            i = 5;
        }
        this.N = i;
        this.E = false;
    }

    public final void y() {
        this.u.isPresent();
        Optional optionalE = e();
        final fdap fdapVar = new fdap() { // from class: afim
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ActionMode actionMode = (ActionMode) obj;
                actionMode.getClass();
                actionMode.finish();
                return fctx.a;
            }
        };
        optionalE.ifPresent(new Consumer() { // from class: afin
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.O.N();
    }

    public final void z() {
        MainActivity mainActivity = this.b;
        if (!mainActivity.isTaskRoot()) {
            mainActivity.finishAfterTransition();
        } else {
            n().a = 0;
            D();
        }
    }
}
