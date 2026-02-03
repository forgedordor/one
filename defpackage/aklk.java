package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aklk implements ajsq {
    public final akks a;
    public final fcsu b;
    private final eosc c;

    public aklk(eosc eoscVar, akks akksVar, fcsu fcsuVar) {
        this.c = eoscVar;
        this.a = akksVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        return eijx.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar) {
        return ((ajvr) this.b.b()).B(conversationId, recipient, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, elka elkaVar) {
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).C(((PenpalBotConversationId) conversationId).b, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        return ((ajvr) this.b.b()).D(conversationId, recipient, crwzVar, str, false, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju E(ConversationId conversationId, Uri uri) {
        return eijx.d(new UnsupportedOperationException("Icon update not supported for penpal conversation"));
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("upgradeConversation not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, elka elkaVar) {
        eieu eieuVarK = eiiy.k("PenpalBotConversationRepository#deleteConversation");
        try {
            ejwl.a(conversationId instanceof PenpalBotConversationId);
            eiju eijuVarG = ((ajvr) this.b.b()).G(((PenpalBotConversationId) conversationId).b, elkaVar);
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
    public final anpj H(int i) {
        return ((ajvr) this.b.b()).H(i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, int i) {
        ajvr ajvrVar = (ajvr) this.b.b();
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: akli
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                ejwl.a(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        return ajvrVar.I((ekgb) map.collect(ekcv.a), i);
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, int i) {
        ajvr ajvrVar = (ajvr) this.b.b();
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: aklg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                ejwl.a(conversationId instanceof PenpalBotConversationId);
                return ((PenpalBotConversationId) conversationId).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        return ajvrVar.J((ekgb) map.collect(ekcv.a), i);
    }

    @Override // defpackage.ajsq
    public final ConversationId K(akln aklnVar) {
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        ejwl.a(aklmVarB == aklm.PENPAL_BOT);
        return PenpalBotConversationId.c(aklnVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) {
        eieu eieuVarK = eiiy.k("PenpalBotConversationRepository#openConversation");
        try {
            ejwl.a(conversationId instanceof PenpalBotConversationId);
            fcsu fcsuVar = this.b;
            PenpalBotConversation penpalBotConversationA = this.a.a(((ajvr) fcsuVar.b()).a(((PenpalBotConversationId) conversationId).b, ajlmVar), (ajln) fcsuVar.b());
            eieuVarK.close();
            return penpalBotConversationA;
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
    public final eiju d(ConversationId conversationId, elka elkaVar) {
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).d(((PenpalBotConversationId) conversationId).b, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).e(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.ajln
    public final eiju f(aoer aoerVar, ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("createInviteLink not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju g(aoer aoerVar, ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("disableInviteLink not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        ekgb ekgbVar = akzkVar.a;
        return (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().z()) ? ((ajvr) this.b.b()).h(akzkVar).h(new ejvr() { // from class: aklj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream map = Collection.EL.stream((ekgb) obj).map(new Function() { // from class: aklh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj2)).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        }, this.c) : eijx.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        return ((ajvr) this.b.b()).i(awjlVar).h(new ejvr() { // from class: akle
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ConversationId conversationId = (ConversationId) obj;
                if (conversationId == null) {
                    return null;
                }
                return PenpalBotConversationId.c(conversationId.b());
            }
        }, this.c);
    }

    @Override // defpackage.ajln
    public final eiju j(ekgb ekgbVar) {
        return (((ekoe) ekgbVar).c == 1 && ((Recipient) ekgbVar.get(0)).g().z()) ? ((ajvr) this.b.b()).j(ekgbVar).h(new ejvr() { // from class: aklb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Optional) obj).map(new Function() { // from class: aklc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new PenpalBotConversationId(((BugleConversationId) ((ConversationId) obj2)).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.c) : eijx.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.ajln
    public final eiju k() {
        int i = ekgb.d;
        return eijx.e(ekoe.a);
    }

    @Override // defpackage.ajln
    public final eiju l(ConversationId conversationId) {
        return ((ajvr) this.b.b()).l(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        return ajll.a(this, Optional.empty(), ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar) {
        return ((ajvr) this.b.b()).n(awjlVar, aoerVar, ajsmVar).h(new ejvr() { // from class: akld
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return PenpalBotConversationId.c(((ConversationId) obj).b());
            }
        }, this.c);
    }

    @Override // defpackage.ajln
    public final /* synthetic */ eiju o(Optional optional, ekgb ekgbVar, String str) {
        return ajll.a(this, optional, ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju p(Optional optional, ekgb ekgbVar, String str, Uri uri) {
        return uri != null ? eijx.d(new IllegalArgumentException("Penpal conversation does not support group icon.")) : (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().z()) ? ((ajvr) this.b.b()).o(optional, ekgbVar, str).h(new ejvr() { // from class: aklf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aklk aklkVar = this.a;
                ajln ajlnVar = (ajln) aklkVar.b.b();
                return aklkVar.a.a((BugleConversation) ((Conversation) obj), ajlnVar);
            }
        }, this.c) : eijx.d(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.ajln
    public final eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient) {
        ejwl.a(false);
        return ((ajvr) this.b.b()).q(((PenpalBotConversationId) conversationId).b, akcyVar, recipient);
    }

    @Override // defpackage.ajln
    public final eiju r(ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("Leave not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        return eijx.d(new UnsupportedOperationException("Leave not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        return ((ajvr) this.b.b()).t(((PenpalBotConversationId) conversationId).b, cgrcVar, cgraVar);
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).u(((PenpalBotConversationId) conversationId).b, akcyVar);
    }

    @Override // defpackage.ajln
    public final eiju v(Recipient recipient) {
        return eijx.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for penpal bot conversation"));
    }

    @Override // defpackage.ajln
    public final eiju w(ConversationId conversationId, String str) {
        return eijx.d(new UnsupportedOperationException("Rename not supported for penpal conversation"));
    }

    @Override // defpackage.ajln
    public final eiju x(ConversationId conversationId, aoer aoerVar) {
        eieu eieuVarK = eiiy.k("PenpalBotConversationRepository#setActiveSelfIdentity");
        try {
            ejwl.a(conversationId instanceof PenpalBotConversationId);
            eiju eijuVarX = ((ajvr) this.b.b()).x(((PenpalBotConversationId) conversationId).b, aoerVar);
            eieuVarK.close();
            return eijuVarX;
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
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).y(((PenpalBotConversationId) conversationId).b, str, str2, amsvVar);
    }

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, String str, Uri uri) {
        ejwl.a(conversationId instanceof PenpalBotConversationId);
        return ((ajvr) this.b.b()).z(((PenpalBotConversationId) conversationId).b, str, uri);
    }
}
