package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajzc implements ajvr, ajsq {
    public static final eksp a = eksp.c("BugleConversation");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final eosc F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final byeq T;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final cogw j;
    public final eosc k;
    public final eosc l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final aqhc r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    private final ajxb z;

    public ajzc(ajxb ajxbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, cogw cogwVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, byeq byeqVar, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, akfs akfsVar, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, aqhc aqhcVar, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38) {
        this.z = ajxbVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.A = fcsuVar5;
        this.f = fcsuVar6;
        this.B = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
        this.C = fcsuVar10;
        this.D = fcsuVar11;
        this.E = fcsuVar12;
        this.i = fcsuVar13;
        this.j = cogwVar;
        this.k = eoscVar;
        this.l = eoscVar2;
        this.F = eoscVar3;
        this.T = byeqVar;
        this.G = fcsuVar14;
        this.H = fcsuVar15;
        this.I = fcsuVar16;
        akfsVar.a();
        this.J = fcsuVar17;
        this.K = fcsuVar18;
        this.m = fcsuVar19;
        this.L = fcsuVar20;
        this.n = fcsuVar21;
        this.M = fcsuVar22;
        this.o = fcsuVar23;
        this.p = fcsuVar24;
        this.q = fcsuVar25;
        this.r = aqhcVar;
        this.s = fcsuVar26;
        this.u = fcsuVar27;
        this.v = fcsuVar28;
        this.N = fcsuVar29;
        this.S = fcsuVar30;
        this.w = fcsuVar31;
        this.x = fcsuVar32;
        this.t = fcsuVar33;
        this.O = fcsuVar34;
        this.P = fcsuVar35;
        this.Q = fcsuVar36;
        this.R = fcsuVar37;
        this.y = fcsuVar38;
    }

    private final void W(final DefaultConversation defaultConversation, final ajlm ajlmVar) {
        Stream map = Collection.EL.stream((Set) this.E.b()).map(new Function() { // from class: ajyi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final ajzi ajziVar = (ajzi) obj;
                eieu eieuVarA = ajziVar.a();
                final DefaultConversation defaultConversation2 = defaultConversation;
                ajzc ajzcVar = this.a;
                final ajlm ajlmVar2 = ajlmVar;
                try {
                    eiju eijuVarH = eijx.h(new eooy() { // from class: ajyp
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            eksp ekspVar = ajzc.a;
                            return ajziVar.b(defaultConversation2, ajlmVar2);
                        }
                    }, ajzcVar.k);
                    eieuVarA.b(eijuVarH);
                    eieuVarA.close();
                    return eijuVarH;
                } catch (Throwable th) {
                    try {
                        eieuVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        if (ekgbVar.isEmpty()) {
            return;
        }
        eieu eieuVarK = eiiy.k("OpenConversationNotify");
        try {
            eiju eijuVarA = eijx.a(ekgbVar);
            eieuVarK.b(eijuVarA);
            auvh.h(eijuVarA);
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

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        return ((akbs) this.I.b()).a(conversationId, akblVar);
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, final Recipient recipient, crvz crvzVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ConversationRepository#subscribeToConversation");
        try {
            if (!((Boolean) ((cczi) crvx.a.get()).e()).booleanValue() || !recipient.B()) {
                eijuVarE = eijx.e(false);
            } else if (conversationId instanceof BugleConversationId) {
                BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                BugleConversation bugleConversationL = L(bugleConversationId, false);
                final ConversationIdType conversationIdType = bugleConversationId.a;
                eijuVarE = ((crvm) ((Optional) this.o.b()).orElseThrow()).b(bugleConversationL).h(new ejvr() { // from class: ajyv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        boolean zEquals = Objects.equals(bool, Boolean.TRUE);
                        ajzc ajzcVar = this.a;
                        crwi crwiVarA = zEquals ? ((crvm) ((Optional) ajzcVar.o.b()).orElseThrow()).a(crxh.SUBSCRIBE) : crwi.SUBSCRIBE_ERROR;
                        if (((Boolean) ((cczi) crvx.f.get()).e()).booleanValue() && crwiVarA != crwi.SUBSCRIBE_ERROR) {
                            return bool;
                        }
                        ((bycw) ((Optional) ajzcVar.p.b()).orElseThrow()).c(conversationIdType, crwiVarA, recipient.D());
                        return bool;
                    }
                }, this.l);
            } else {
                eijuVarE = eijx.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, final elka elkaVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#unarchiveConversation");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajxy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(((cpgf) this.a.f.b()).a(bugleConversationId.a, bvdk.UNARCHIVED, elkaVar));
                }
            }, this.l);
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

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, final Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ConversationRepository#unsubscribeFromConversation");
        try {
            if (!((Boolean) ((cczi) crvx.a.get()).e()).booleanValue() || !recipient.B()) {
                eijuVarE = eijx.e(false);
            } else if (conversationId instanceof BugleConversationId) {
                BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                BugleConversation bugleConversationL = L(bugleConversationId, false);
                final ConversationIdType conversationIdType = bugleConversationId.a;
                final eiju eijuVarC = ((crvm) ((Optional) this.o.b()).orElseThrow()).c(bugleConversationL, crwzVar, str, crvzVar);
                eiju eijuVarE2 = eijx.e(cpkr.a);
                if (z) {
                    cpjw cpjwVar = (cpjw) this.A.b();
                    cpki cpkiVarQ = cpkj.q();
                    ((cpju) cpkiVarQ).d = conversationId;
                    ((cpju) cpkiVarQ).b = true;
                    ((cpju) cpkiVarQ).g = elka.CONVERSATION_FROM_CHATBOT_UNSUBSCRIBE_ACTION;
                    ((cpju) cpkiVarQ).i = 3;
                    ((cpju) cpkiVarQ).j = 16;
                    eijuVarE2 = cpjwVar.a(cpkiVarQ.a().p());
                }
                eijuVarE = eijx.m(eijuVarC, eijuVarE2).b(new eooy() { // from class: ajxh
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        eiju eijuVar = eijuVarC;
                        boolean zBooleanValue = ((Boolean) eork.q(eijuVar)).booleanValue();
                        ajzc ajzcVar = this.a;
                        crwi crwiVarA = zBooleanValue ? ((crvm) ((Optional) ajzcVar.o.b()).orElseThrow()).a(crxh.UNSUBSCRIBE) : crwi.UNSUBSCRIBE_ERROR;
                        if (!((Boolean) ((cczi) crvx.f.get()).e()).booleanValue() || crwiVarA == crwi.UNSUBSCRIBE_ERROR) {
                            ((bycw) ((Optional) ajzcVar.p.b()).orElseThrow()).c(conversationIdType, crwiVarA, recipient.D());
                        }
                        return eijx.e((Boolean) eork.q(eijuVar));
                    }
                }, this.l);
            } else {
                eijuVarE = eijx.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju E(final ConversationId conversationId, final Uri uri) {
        eieu eieuVarK = eiiy.k("ConversationRepository#updateGroupIcon");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            eiju eijuVarI = ((ajvo) this.B.b()).a((BugleConversationId) conversationId).b().i(new eooz() { // from class: ajyd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ajts ajtsVar = (ajts) obj;
                    if (ajtsVar.z()) {
                        ((eksl) ((eksl) ajzc.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "updateGroupIcon", 952, "DefaultConversationRepository.java")).t("conversation no longer exists, skipping rename on conversation id = %s.", conversationId.b());
                        return eijx.e(true);
                    }
                    Uri uri2 = uri;
                    ajzc ajzcVar = this.a;
                    ejwl.b(bvdi.d(ajtsVar.A()), "Only RCS groups are supported for updating icon.");
                    return ((akhp) ajzcVar.n.b()).a(ajtsVar, uri2);
                }
            }, this.k);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        if (!(conversationId instanceof BugleConversationId)) {
            return eijx.d(new IllegalArgumentException("conversationId should be BugleConversationId."));
        }
        return ((akkd) this.J.b()).b(L((BugleConversationId) conversationId, false));
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, final elka elkaVar) {
        eiju eijuVarA;
        eieu eieuVarK = eiiy.k("ConversationRepository#deleteConversation");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            if (((arkv) this.N.b()).a()) {
                eijuVarA = this.z.a(bugleConversationId, false).f.b().i(new eooz() { // from class: ajxp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        avnh avnhVar = (avnh) this.a.e.b();
                        BugleConversationId bugleConversationId2 = bugleConversationId;
                        avnk avnkVarF = avnl.f();
                        avnkVarF.b(bugleConversationId2.a);
                        avnkVarF.f(elkaVar);
                        avnkVarF.d(SuperSortLabel.UNKNOWN);
                        avnkVarF.c(((ajts) obj).K().toEpochMilli());
                        avnkVarF.e(false);
                        return avnhVar.a(avnkVarF.a());
                    }
                }, this.k);
            } else {
                long epochMilli = this.j.f().toEpochMilli();
                avnh avnhVar = (avnh) this.e.b();
                avnk avnkVarF = avnl.f();
                avnkVarF.b(bugleConversationId.a);
                avnkVarF.f(elkaVar);
                avnkVarF.d(SuperSortLabel.UNKNOWN);
                avnkVarF.c(epochMilli);
                avnkVarF.e(false);
                eijuVarA = avnhVar.a(avnkVarF.a());
            }
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final anpj H(int i) {
        ajzu ajzuVar = (ajzu) this.D.b();
        fdjx fdjxVar = (fdjx) ajzuVar.a.b();
        fdjxVar.getClass();
        ((akbt) ajzuVar.b.b()).getClass();
        bbmo bbmoVar = (bbmo) ajzuVar.c.b();
        bbmoVar.getClass();
        akcd akcdVar = (akcd) ajzuVar.d.b();
        akcdVar.getClass();
        aroh arohVar = (aroh) ajzuVar.e.b();
        arohVar.getClass();
        return new ajzt(fdjxVar, bbmoVar, akcdVar, arohVar, i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, int i) {
        eieu eieuVarK = eiiy.k("ConversationRepository#markConversationsAsRead");
        try {
            eiju eijuVarA = ((akif) this.C.b()).a(ekgbVar, i);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, int i) {
        eieu eieuVarK = eiiy.k("ConversationRepository#markConversationsAsUnread");
        try {
            eiju eijuVarB = ((akif) this.C.b()).b(ekgbVar, i);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajsq
    public final ConversationId K(akln aklnVar) {
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        ejwl.a(aklmVarB == aklm.BUGLE);
        return new BugleConversationId(aklnVar.c);
    }

    @Override // defpackage.ajvr
    public final BugleConversation L(BugleConversationId bugleConversationId, boolean z) {
        return this.z.a(bugleConversationId, z);
    }

    @Override // defpackage.ajvr
    public final eiju M(ConversationId conversationId, final cbqz cbqzVar, final cbqx cbqxVar, final aoer aoerVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#addEncryptionProtocol");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            eiju eijuVarI = ((DefaultConversation) L((BugleConversationId) conversationId, false)).f.b().i(new eooz() { // from class: ajyw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ajts ajtsVar = (ajts) obj;
                    akiu akiuVar = (akiu) this.a.t.b();
                    ajtsVar.getClass();
                    cbqz cbqzVar2 = cbqzVar;
                    cbqzVar2.getClass();
                    return auvw.c(akiuVar.c, fcyi.a, fdjz.a, new akis(akiuVar, ajtsVar, cbqzVar2, cbqxVar, aoerVar, null));
                }
            }, this.k);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajvr
    public final eiju N(ConversationId conversationId, final cbqz cbqzVar, final aoer aoerVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#setEncryptionProtocol");
        try {
            ejwl.a(true);
            eiju eijuVarI = ((DefaultConversation) L((BugleConversationId) conversationId, false)).f.b().i(new eooz() { // from class: ajxt
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ajts ajtsVar = (ajts) obj;
                    akiu akiuVar = (akiu) this.a.t.b();
                    ajtsVar.getClass();
                    cbqz cbqzVar2 = cbqzVar;
                    cbqzVar2.getClass();
                    return auvw.c(akiuVar.c, fcyi.a, fdjz.a, new akit(akiuVar, ajtsVar, cbqzVar2, aoerVar, null));
                }
            }, this.k);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajvr
    public final eiju O(ConversationId conversationId, final int i) {
        eieu eieuVarK = eiiy.k("ConversationRepository#updateConversationJoinState");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajxw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ajzc ajzcVar = this.a;
                    bakt baktVar = (bakt) ajzcVar.d.b();
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.A(i);
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (!baktVar.aj(conversationIdType2, boteVar)) {
                        return null;
                    }
                    ((bxlc) ajzcVar.c.b()).d(conversationIdType2);
                    return null;
                }
            }, this.F);
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

    @Override // defpackage.ajvr
    public final eiju P(ConversationId conversationId, elwp elwpVar) {
        int i;
        eieu eieuVarK = eiiy.k("ConversationRepository#updateConversationSendMode");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            String[] strArr = botm.a;
            final bote boteVar = new bote();
            if (elwpVar == elwp.SEND_MODE_AUTO) {
                i = 0;
            } else if (elwpVar == elwp.SEND_MODE_XMS) {
                i = 1;
            } else {
                if (elwpVar != elwp.SEND_MODE_XMS_LATCH) {
                    throw new IllegalArgumentException("Value of sendMode is invalid");
                }
                i = 2;
            }
            boteVar.V(i);
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajyo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((bakt) this.a.d.b()).aj(conversationIdType, boteVar);
                    return null;
                }
            }, this.F);
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

    @Override // defpackage.ajvr
    public final eiju Q(ConversationId conversationId, final awjl awjlVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#setDestinationToken");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            eiju eijuVarF = eijx.f(new Runnable() { // from class: ajxj
                @Override // java.lang.Runnable
                public final void run() {
                    eksp ekspVar = ajzc.a;
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.p(awjlVar);
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (boteVar.f(conversationIdType2)) {
                        return;
                    }
                    eksl ekslVar = (eksl) ajzc.a.j();
                    ekslVar.X(cqnc.s, conversationIdType2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "setDestinationToken", 1602, "DefaultConversationRepository.java")).q("Failed to update conversation with destination token.");
                }
            }, this.F);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajvr
    public final eiju R(final BugleConversationId bugleConversationId, final String str) {
        return eijx.g(new Callable() { // from class: ajyq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.C(str);
                boteVar.D(bvdp.NAME_IS_MANUAL);
                ConversationIdType conversationIdType = bugleConversationId.a;
                boolean zF = boteVar.f(conversationIdType);
                if (zF) {
                    ((bxlc) this.a.c.b()).d(conversationIdType);
                }
                return Boolean.valueOf(zF);
            }
        }, this.l);
    }

    @Override // defpackage.ajvr
    public final BugleConversation S(cbqx cbqxVar) {
        ConversationIdType conversationIdTypeA = ((cbqj) this.P.b()).a(cbqxVar);
        if (conversationIdTypeA == null) {
            return null;
        }
        return this.z.a(new BugleConversationId(conversationIdTypeA), false);
    }

    @Override // defpackage.ajvr
    public final BugleConversation T(BugleConversationId bugleConversationId, ajlm ajlmVar) throws Throwable {
        eieu eieuVar;
        eieu eieuVarK = eiiy.k("ConversationRepository#openConversationForDelegation");
        try {
            boolean z = ajlmVar == ajlm.FOR_DISPLAY;
            ajxb ajxbVar = this.z;
            eosc eoscVar = (eosc) ajxbVar.a.b();
            eoscVar.getClass();
            anty antyVar = (anty) ajxbVar.b.b();
            antyVar.getClass();
            aofc aofcVar = (aofc) ajxbVar.c.b();
            aofcVar.getClass();
            ajvo ajvoVar = (ajvo) ajxbVar.d.b();
            ajvoVar.getClass();
            fcsu fcsuVar = ajxbVar.e;
            alzb alzbVar = (alzb) ajxbVar.f.b();
            alzbVar.getClass();
            amhm amhmVar = (amhm) ajxbVar.g.b();
            amhmVar.getClass();
            aqkk aqkkVar = (aqkk) ajxbVar.h.b();
            aqkkVar.getClass();
            anph anphVar = (anph) ajxbVar.i.b();
            anphVar.getClass();
            eieuVar = eieuVarK;
            try {
                DefaultConversation defaultConversation = new DefaultConversation(eoscVar, antyVar, aofcVar, ajvoVar, fcsuVar, alzbVar, amhmVar, aqkkVar, anphVar, ajxbVar.j, ajxbVar.k, ajxbVar.l, ajxbVar.m, ajxbVar.n, bugleConversationId, z, null);
                if (z) {
                    defaultConversation.o();
                } else {
                    W(defaultConversation, ajlmVar);
                }
                eieuVar.close();
                return defaultConversation;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    eieuVar.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            eieuVar = eieuVarK;
        }
    }

    public final DefaultConversation U(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 669, "DefaultConversationRepository.java")).q("Null conversationId after getOrCreateConversation.");
            throw new IllegalStateException("Null conversationId after getOrCreateConversation.");
        }
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 673, "DefaultConversationRepository.java")).t("Returning conversation with id = %s.", conversationIdType.a());
        return this.z.a(new BugleConversationId(conversationIdType), false);
    }

    public final eiju V(ConversationId conversationId, boolean z) {
        final auib auibVarA;
        ejwl.a(conversationId instanceof BugleConversationId);
        fcsu fcsuVar = this.O;
        if (((ardx) fcsuVar.b()).a()) {
            cifw cifwVar = (cifw) this.m.b();
            auibVarA = cifwVar.a();
            cifw.v(cifwVar, 20, 0, null, auibVarA, null, null, 0, null, null, 502);
        } else {
            auibVarA = auib.a;
        }
        eiju eijuVarA = ((ajwc) this.L.b()).a(L((BugleConversationId) conversationId, false), true != z ? 2 : 1, auibVarA);
        if (!((ardx) fcsuVar.b()).a()) {
            return eijuVarA;
        }
        ejvr ejvrVar = new ejvr() { // from class: ajyu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                ((cifw) this.a.m.b()).w(auibVarA, 3);
                throw illegalArgumentException;
            }
        };
        eosc eoscVar = this.k;
        return eijuVarA.e(IllegalArgumentException.class, ejvrVar, eoscVar).h(new ejvr() { // from class: ajyy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    ((cifw) this.a.m.b()).w(auibVarA, 27);
                }
                return bool;
            }
        }, eoscVar);
    }

    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#openConversation");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            boolean z = ajlmVar == ajlm.FOR_DISPLAY;
            DefaultConversation defaultConversationA = this.z.a(bugleConversationId, z);
            if (z) {
                defaultConversationA.o();
            } else {
                W(defaultConversationA, ajlmVar);
            }
            eieuVarK.close();
            return defaultConversationA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final /* synthetic */ ConversationId b(akln aklnVar) {
        return ajsp.a();
    }

    @Override // defpackage.ajln
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ajsp.b();
    }

    @Override // defpackage.ajln
    public final eiju d(ConversationId conversationId, final elka elkaVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#archiveConversation");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajxc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(((cpgf) this.a.f.b()).a(bugleConversationId.a, bvdk.ARCHIVED, elkaVar));
                }
            }, this.l);
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

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("ConversationRepository#clearDraftSnippet");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            eiju eijuVarA = this.T.a("DefaultConversationRepository#clearDraftSnippet", new ejxr() { // from class: ajxg
                @Override // defpackage.ejxr
                public final Object get() {
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("clearDraftSnippet");
                    boteVar.W(false);
                    ContentValues contentValues = boteVar.a;
                    contentValues.putNull("draft_snippet_text");
                    contentValues.putNull("draft_subject_text");
                    contentValues.putNull("draft_preview_content_type");
                    boteVar.t();
                    ajzc ajzcVar = this.a;
                    bakt baktVar = (bakt) ajzcVar.d.b();
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    boteVar.Z(((Long) baktVar.G(conversationIdType2).orElse(Long.valueOf(ajzcVar.j.f().toEpochMilli()))).longValue());
                    boteVar.ad(new Function() { // from class: ajye
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            eksp ekspVar = ajzc.a;
                            botlVar.r(conversationIdType2);
                            botlVar.ap(new dqty("conversations.show_draft", 1, 1));
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Boolean.valueOf(boteVar.b().e() > 0);
                }
            });
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju f(final aoer aoerVar, ConversationId conversationId) {
        ejwl.a(conversationId instanceof BugleConversationId);
        final BugleConversation bugleConversationL = L((BugleConversationId) conversationId, false);
        return ((DefaultConversation) bugleConversationL).f.b().i(new eooz() { // from class: ajxf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ajts ajtsVar = (ajts) obj;
                boolean z = false;
                if (ajtsVar.c().equals(ajlj.GROUP) && ajtsVar.S()) {
                    z = true;
                }
                BugleConversation bugleConversation = bugleConversationL;
                aoer aoerVar2 = aoerVar;
                ajzc ajzcVar = this.a;
                ejwl.b(z, "Conversation is not a RCS group");
                akhf akhfVar = (akhf) ajzcVar.y.b();
                aoerVar2.getClass();
                return auvw.c(akhfVar.a, fcyi.a, fdjz.a, new akhd(bugleConversation, akhfVar, aoerVar2, null));
            }
        }, this.k);
    }

    @Override // defpackage.ajln
    public final eiju g(final aoer aoerVar, ConversationId conversationId) {
        ejwl.a(conversationId instanceof BugleConversationId);
        return ((DefaultConversation) L((BugleConversationId) conversationId, false)).f.b().i(new eooz() { // from class: ajyc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ajts ajtsVar = (ajts) obj;
                boolean z = false;
                if (ajtsVar.c().equals(ajlj.GROUP) && ajtsVar.S()) {
                    z = true;
                }
                aoer aoerVar2 = aoerVar;
                ajzc ajzcVar = this.a;
                ejwl.b(z, "Conversation is not a RCS group");
                aoerVar2.getClass();
                eiju eijuVarE = eijx.e(akhg.a);
                eijuVarE.getClass();
                return eijuVarE;
            }
        }, this.k);
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#findConversation");
        try {
            eiju eijuVarA = ((aknm) this.K.b()).a(akzkVar);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        return ((akbe) this.M.b()).a(awjlVar).h(new ejvr() { // from class: ajxm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (conversationIdType == null || conversationIdType.b()) {
                    return null;
                }
                return this.a.U(conversationIdType).a;
            }
        }, this.k);
    }

    @Override // defpackage.ajln
    public final eiju j(ekgb ekgbVar) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("ConversationRepository#findConversation");
        try {
            if (ekgbVar.isEmpty()) {
                ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "findConversation", 402, "DefaultConversationRepository.java")).q("Unable to findConversation: Empty recipient list.");
                eijuVarH = eijx.d(new IllegalArgumentException("Unable to findConversation: Empty recipient list."));
            } else {
                eijuVarH = ((avpc) this.H.b()).k((ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: ajyl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((Recipient) obj).g();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).distinct().filter(new Predicate() { // from class: ajym
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        eksp ekspVar = ajzc.a;
                        ((alqm) obj).o();
                        return true;
                    }
                }).collect(ekcv.a)).h(new ejvr() { // from class: ajyn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = ajzc.a;
                        return ((Optional) obj).map(new Function() { // from class: ajxk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eksp ekspVar2 = ajzc.a;
                                return new BugleConversationId(((bojh) obj2).C());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, this.k);
            }
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

    @Override // defpackage.ajln
    public final eiju k() {
        return ((akkd) this.J.b()).a();
    }

    @Override // defpackage.ajln
    public final eiju l(ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("ConversationRepository#getMuteThreshold");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            eiju eijuVarH = ((DefaultConversation) L((BugleConversationId) conversationId, true)).f.b().h(new ejvr() { // from class: ajyf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((ajlk) obj).k().a(this.a.j.f());
                }
            }, this.k);
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

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        return ajll.a(this, Optional.empty(), ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, final aoer aoerVar, ajsm ajsmVar) {
        eiju eijuVarB = ((akbe) this.M.b()).b(awjlVar, ajsmVar);
        ejvr ejvrVar = new ejvr() { // from class: ajyg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.U((ConversationIdType) obj).a;
            }
        };
        eosc eoscVar = this.k;
        return eijuVarB.h(ejvrVar, eoscVar).i(new eooz() { // from class: ajyh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ajzc ajzcVar = this.a;
                final ConversationId conversationId = (ConversationId) obj;
                return ajzcVar.x(conversationId, aoerVar).h(new ejvr() { // from class: ajyx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = ajzc.a;
                        return conversationId;
                    }
                }, ajzcVar.k);
            }
        }, eoscVar);
    }

    @Override // defpackage.ajln
    public final /* synthetic */ eiju o(Optional optional, ekgb ekgbVar, String str) {
        return ajll.a(this, optional, ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju p(final Optional optional, final ekgb ekgbVar, final String str, final Uri uri) {
        eiju eijuVarI;
        eiju eijuVarA;
        eieu eieuVarK = eiiy.k("ConversationRepository#getOrCreateConversation");
        try {
            if (ekgbVar.isEmpty()) {
                ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 321, "DefaultConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                eijuVarI = eijx.d(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                eiju eijuVarE = eijx.e(false);
                if (ekgbVar.size() > 1) {
                    eksp ekspVar = a;
                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 329, "DefaultConversationRepository.java")).q("Attempting to create an RCS group conversation, verifying cached RCS availabilityfor participants.");
                    ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: ajxz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Recipient recipient = (Recipient) obj;
                            alqm alqmVarG = recipient.g();
                            return (alqmVarG.r() && alqmVarG.e().isPresent() && ((dggw) this.a.i.b()).v(((aubq) alqmVarG.e().get()).d)) ? eijx.e(true) : recipient.K();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.a);
                    if (optional.isEmpty()) {
                        ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "isRcsConversationCreationEnabledForSelfIdentity", 681, "DefaultConversationRepository.java")).q("Missing self identity when determining isRcsConversationCreationEnabled.");
                        eijuVarA = eijx.e(false);
                    } else {
                        final eiju eijuVarN = ((aoer) optional.get()).n(ajna.RICH);
                        final eiju eijuVarB = ((aoer) optional.get()).f().b();
                        eijuVarA = eijx.k(eijuVarN, eijuVarB).a(new Callable() { // from class: ajyk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                eksp ekspVar2 = ajzc.a;
                                boolean z = false;
                                if (((Boolean) eork.q(eijuVarN)).booleanValue() && ((aoio) eork.q(eijuVarB)).a()) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                        }, this.l);
                    }
                    ekfw ekfwVar = new ekfw();
                    ekfwVar.j(ekgbVar2);
                    ekfwVar.h(eijuVarA);
                    eijuVarE = eiju.g(eork.o(ekfwVar.g())).i(new eooz() { // from class: ajya
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            eksp ekspVar2 = ajzc.a;
                            boolean zNoneMatch = Collection.EL.stream((List) obj).noneMatch(new Predicate() { // from class: ajxi
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    eksp ekspVar3 = ajzc.a;
                                    return bool == null || !bool.booleanValue();
                                }
                            });
                            eksl ekslVar = (eksl) ((eksl) ajzc.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 349, "DefaultConversationRepository.java");
                            Boolean boolValueOf = Boolean.valueOf(zNoneMatch);
                            ekslVar.t("Verified cached RCS availability for the participants, isGroupRcs = %b.", boolValueOf);
                            return eijx.e(boolValueOf);
                        }
                    }, this.k);
                }
                eijuVarI = eijuVarE.i(new eooz() { // from class: ajyb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        auib auibVarA;
                        final auib auibVar;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        eieu eieuVarK2 = eiiy.k("ConversationRepository#getOrCreateConversationInternal");
                        ekgb ekgbVar3 = ekgbVar;
                        Optional optional2 = optional;
                        final ajzc ajzcVar = this.a;
                        try {
                            ((eksl) ((eksl) ajzc.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 553, "DefaultConversationRepository.java")).q("Starting getOrCreateConversationForService.");
                            boolean zA = ((ardv) ajzcVar.x.b()).a();
                            Uri uri2 = uri;
                            String str2 = str;
                            if (zA) {
                                if (zBooleanValue) {
                                    cifw cifwVar = (cifw) ajzcVar.m.b();
                                    boolean z = str2 != null;
                                    z = uri2 != null;
                                    auibVarA = cifwVar.a();
                                    ellx ellxVar = (ellx) elly.a.createBuilder();
                                    ellxVar.getClass();
                                    ellxVar.copyOnWrite();
                                    elly ellyVar = (elly) ellxVar.instance;
                                    ellyVar.b |= 1;
                                    ellyVar.c = z;
                                    ellxVar.copyOnWrite();
                                    elly ellyVar2 = (elly) ellxVar.instance;
                                    ellyVar2.b |= 2;
                                    ellyVar2.d = z;
                                    evsn evsnVarBuild = ellxVar.build();
                                    evsnVarBuild.getClass();
                                    cifw.v(cifwVar, 2, 0, null, auibVarA, null, null, 0, null, (elly) evsnVarBuild, 246);
                                    z = true;
                                    auibVar = auibVarA;
                                }
                                auibVar = null;
                            } else {
                                if (zBooleanValue) {
                                    cifw cifwVar2 = (cifw) ajzcVar.m.b();
                                    auibVarA = cifwVar2.a();
                                    cifw.v(cifwVar2, 2, 0, null, auibVarA, null, null, 0, null, null, 502);
                                    z = true;
                                    auibVar = auibVarA;
                                }
                                auibVar = null;
                            }
                            if (!((ardj) ajzcVar.w.b()).a() || !z) {
                                uri2 = null;
                            }
                            akag akagVar = (akag) ajzcVar.b.b();
                            aoer aoerVar = (aoer) optional2.orElse(null);
                            final boolean z2 = z;
                            eiju eijuVarA2 = akagVar.a(aoerVar, ekgbVar3, z2, str2, uri2, auibVar);
                            if (((apul) ajzcVar.u.b()).a()) {
                                eijuVarA2 = eijuVarA2.e(RuntimeException.class, new ejvr() { // from class: ajyz
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        int i;
                                        RuntimeException runtimeException = (RuntimeException) obj2;
                                        if (!z2) {
                                            throw runtimeException;
                                        }
                                        ajzc ajzcVar2 = ajzcVar;
                                        if (runtimeException instanceof NullPointerException) {
                                            i = 12;
                                        } else if (runtimeException instanceof IllegalArgumentException) {
                                            i = 13;
                                        } else {
                                            i = 14;
                                            if (((apuk) ajzcVar2.v.b()).a() && (runtimeException instanceof IllegalStateException)) {
                                                i = 28;
                                            }
                                        }
                                        auib auibVar2 = auibVar;
                                        cifw cifwVar3 = (cifw) ajzcVar2.m.b();
                                        auibVar2.getClass();
                                        cifwVar3.p(auibVar2, i);
                                        throw runtimeException;
                                    }
                                }, ajzcVar.k);
                            }
                            eiju eijuVar = eijuVarA2;
                            cdgt cdgtVar = (cdgt) ajzcVar.g.b();
                            fdae fdaeVar = new fdae() { // from class: ajza
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((eksl) ((eksl) ajzc.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 604, "DefaultConversationRepository.java")).q("get or create conversation timeout.");
                                    if (z2) {
                                        ajzc ajzcVar2 = ajzcVar;
                                        if (((apul) ajzcVar2.u.b()).a()) {
                                            auib auibVar2 = auibVar;
                                            cifw cifwVar3 = (cifw) ajzcVar2.m.b();
                                            auibVar2.getClass();
                                            cifwVar3.p(auibVar2, 11);
                                        }
                                    }
                                    return fctx.a;
                                }
                            };
                            Duration durationOfMillis = Duration.ofMillis(((Long) ((cczi) avbq.a.get()).e()).longValue());
                            ajzb ajzbVar = new ajzb();
                            durationOfMillis.getClass();
                            auvh.h(auvw.c(cdgtVar.a, fcyi.a, fdjz.a, new cdgs(cdgtVar, eijuVar, fdaeVar, durationOfMillis, ajzbVar, null)));
                            eooz eoozVar = new eooz() { // from class: ajxd
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return eijx.e(ajzcVar.U((ConversationIdType) obj2));
                                }
                            };
                            eosc eoscVar = ajzcVar.k;
                            eiju eijuVarE2 = eijuVar.i(eoozVar, eoscVar).e(RuntimeException.class, new ejvr() { // from class: ajxe
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    RuntimeException runtimeException = (RuntimeException) obj2;
                                    if (!z2) {
                                        throw runtimeException;
                                    }
                                    ajzc ajzcVar2 = ajzcVar;
                                    if (!((apul) ajzcVar2.u.b()).a()) {
                                        throw runtimeException;
                                    }
                                    int i = !(runtimeException instanceof IllegalStateException) ? !(runtimeException instanceof NullPointerException) ? runtimeException instanceof IllegalArgumentException ? 17 : 18 : 16 : 15;
                                    auib auibVar2 = auibVar;
                                    cifw cifwVar3 = (cifw) ajzcVar2.m.b();
                                    auibVar2.getClass();
                                    cifwVar3.p(auibVar2, i);
                                    throw runtimeException;
                                }
                            }, eoscVar);
                            eieuVarK2.close();
                            return eijuVarE2;
                        } finally {
                        }
                    }
                }, this.k);
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ajln
    public final eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient) {
        eieu eieuVarK = eiiy.k("ConversationRepository#incomingRichThemeUpdate");
        try {
            eiju eijuVarA = ((akcz) ((Optional) this.G.b()).orElseThrow()).a(L((BugleConversationId) conversationId, false), akcyVar, recipient);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju r(ConversationId conversationId) {
        eieu eieuVarK = eiiy.k("ConversationRepository#leaveConversation");
        try {
            eiju eijuVarV = V(conversationId, true);
            eieuVarK.close();
            return eijuVarV;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#leaveConversations");
        try {
            Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: ajyr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.V((ConversationId) obj, false);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            eiju eijuVarH = eijx.a((Iterable) map.collect(ekcv.a)).h(new ejvr() { // from class: ajys
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = ajzc.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: ajxl
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
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

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#muteConversation");
        try {
            eiju eijuVarA = ((akkg) this.S.b()).a(conversationId, cgrcVar, cgraVar);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        eiju eijuVarB;
        eieu eieuVarK = eiiy.k("ConversationRepository#outgoingRichThemeUpdate");
        try {
            if (conversationId instanceof BugleConversationId) {
                eijuVarB = ((akcz) ((Optional) this.G.b()).orElseThrow()).b(L((BugleConversationId) conversationId, false), akcyVar);
            } else {
                eijuVarB = eijx.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju v(final Recipient recipient) {
        eieu eieuVarK = eiiy.k("ConversationRepository#refreshAllConversationIconsForRecipient");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajyj
                /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((bakt) this.a.d.b()).R(recipient.F().a);
                    return true;
                }
            }, this.F);
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

    @Override // defpackage.ajln
    public final eiju w(final ConversationId conversationId, final String str) {
        eiju eijuVarI;
        eieu eieuVarK = eiiy.k("ConversationRepository#renameConversation");
        try {
            if (TextUtils.isEmpty(str)) {
                eijuVarI = eijx.d(new IllegalArgumentException("Unable to rename a conversation: Empty name."));
            } else {
                ejwl.a(conversationId instanceof BugleConversationId);
                final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                eijuVarI = ((ajvo) this.B.b()).a(bugleConversationId).b().i(new eooz() { // from class: ajxo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ajts ajtsVar = (ajts) obj;
                        boolean z = ajtsVar.z();
                        ConversationId conversationId2 = conversationId;
                        if (z) {
                            ((eksl) ((eksl) ajzc.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 875, "DefaultConversationRepository.java")).t("conversation no longer exists, skipping rename on conversation id = %s.", conversationId2.b());
                            return eijx.e(true);
                        }
                        final String str2 = str;
                        if (Objects.equals(ajtsVar.m(), str2)) {
                            ((eksl) ((eksl) ajzc.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 881, "DefaultConversationRepository.java")).t("Same name, skipping rename on conversation id = %s.", conversationId2.b());
                            return eijx.e(true);
                        }
                        final ajzc ajzcVar = this.a;
                        if (bvdi.d(ajtsVar.A())) {
                            return ((akhp) ajzcVar.n.b()).b(ajtsVar, str2);
                        }
                        final BugleConversationId bugleConversationId2 = bugleConversationId;
                        return ajzcVar.R(bugleConversationId2, str2).h(new ejvr() { // from class: ajxn
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                Boolean bool = (Boolean) obj2;
                                if (bool.booleanValue()) {
                                    ((bycz) ajzcVar.h.b()).g(bugleConversationId2.a, str2);
                                }
                                return bool;
                            }
                        }, ajzcVar.l);
                    }
                }, this.k);
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju x(final ConversationId conversationId, final aoer aoerVar) {
        eiju eijuVarI;
        eieu eieuVarK = eiiy.k("ConversationRepository#setActiveSelfIdentity");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            if (aoerVar.w()) {
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("setActiveSelfIdentity");
                boteVar.ad(new Function() { // from class: ajxu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar = ajzc.a;
                        botlVar.r(conversationIdType);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boteVar.n(aoerVar.h().c());
                eijuVarI = boteVar.b().i().i(new eooz() { // from class: ajxv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        boolean z = ((Integer) obj).intValue() > 0;
                        final ajzc ajzcVar = this.a;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final aoer aoerVar2 = aoerVar;
                        if (z) {
                            Stream map = Collection.EL.stream((Set) ajzcVar.q.b()).map(new Function() { // from class: ajyt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    final bakg bakgVar = (bakg) obj2;
                                    eieu eieuVarA = bakgVar.a();
                                    final ConversationIdType conversationIdType3 = conversationIdType2;
                                    ajzc ajzcVar2 = ajzcVar;
                                    final aoer aoerVar3 = aoerVar2;
                                    try {
                                        eiju eijuVarH = eijx.h(new eooy() { // from class: ajxq
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                eksp ekspVar = ajzc.a;
                                                return bakgVar.b(conversationIdType3, aoerVar3);
                                            }
                                        }, ajzcVar2.k);
                                        eieuVarA.b(eijuVarH);
                                        eieuVarA.close();
                                        return eijuVarH;
                                    } catch (Throwable th) {
                                        try {
                                            eieuVarA.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                            if (!ekgbVar.isEmpty()) {
                                eieu eieuVarK2 = eiiy.k("DefaultConversationRepository#notifyConversationActiveIdentityChangedListeners");
                                try {
                                    eiju eijuVarA = eijx.a(ekgbVar);
                                    eieuVarK2.b(eijuVarA);
                                    auvh.h(eijuVarA);
                                    eieuVarK2.close();
                                } catch (Throwable th) {
                                    try {
                                        eieuVarK2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            ConversationId conversationId2 = conversationId;
                            eksl ekslVar = (eksl) ajzc.a.j();
                            ekslVar.X(cqnc.t, conversationId2);
                            ekslVar.X(cqnc.y, aoerVar2.h());
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "setActiveSelfIdentity", 1075, "DefaultConversationRepository.java")).q("Self identity could not be set in conversation.");
                        }
                        if (ajzcVar.r.a()) {
                            fcsu fcsuVar = ajzcVar.s;
                            if (((Optional) fcsuVar.b()).isPresent() && z) {
                                return ((bycv) ((Optional) fcsuVar.b()).get()).a(conversationIdType2, aoerVar2.h());
                            }
                        }
                        return eijx.e(Boolean.valueOf(z));
                    }
                }, eoqg.a);
            } else {
                eijuVarI = eijx.e(false);
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar) {
        eieu eieuVarK = eiiy.k("ConversationRepository#setDraftSnippet");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            ejwl.a((str == null && str2 == null && amsvVar == null) ? false : true);
            ejwl.a(amsvVar == null || le.p(amsvVar.b()));
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.ap("setDraftSnippet");
            boteVar.W(true);
            boteVar.u(str);
            boteVar.v(str2);
            boteVar.r(amsvVar != null ? amsvVar.b() : null);
            boteVar.s(amsvVar != null ? amsvVar.e() : null);
            boteVar.Z(this.j.f().toEpochMilli());
            boteVar.ad(new Function() { // from class: ajxr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    eksp ekspVar = ajzc.a;
                    botlVar.r(conversationIdType);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eiju eijuVarH = boteVar.b().i().h(new ejvr() { // from class: ajxs
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = ajzc.a;
                    return Boolean.valueOf(((Integer) obj).intValue() > 0);
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

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, final String str, final Uri uri) {
        eieu eieuVarK = eiiy.k("ConversationRepository#setNameAndIcon");
        try {
            ejwl.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajxx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eksp ekspVar = ajzc.a;
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.C(str);
                    boteVar.z(uri.toString());
                    return Boolean.valueOf(boteVar.f(conversationIdType));
                }
            }, this.F);
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
}
