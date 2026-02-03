package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akml implements aknl, ajsq {
    public final akmt a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fdjx f;

    public akml(fdjx fdjxVar, fdjx fdjxVar2, akmt akmtVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.a = akmtVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        akblVar.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar) {
        recipient.getClass();
        crvzVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarB = ((ajvr) this.b.b()).B(((RbmConversationId) conversationId).b, recipient, crvzVar);
        eijuVarB.getClass();
        return eijuVarB;
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, elka elkaVar) {
        elkaVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarC = ((ajvr) this.b.b()).C(((RbmConversationId) conversationId).b, elkaVar);
        eijuVarC.getClass();
        return eijuVarC;
    }

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        crwzVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarD = ((ajvr) this.b.b()).D(((RbmConversationId) conversationId).b, recipient, crwzVar, str, z, crvzVar);
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju E(ConversationId conversationId, Uri uri) {
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Icon update not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("upgradeConversation not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, elka elkaVar) throws IOException {
        conversationId.getClass();
        elkaVar.getClass();
        eieu eieuVarA = eiiy.a("RbmConversationRepository#deleteConversation");
        try {
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            eiju eijuVarG = ((ajvr) this.b.b()).G(((RbmConversationId) conversationId).b, elkaVar);
            eijuVarG.getClass();
            fczl.a(eieuVarA, null);
            return eijuVarG;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarA, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ajln
    public final anpj H(int i) {
        return ((ajvr) this.b.b()).H(i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ajvr ajvrVar = (ajvr) this.b.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((RbmConversationId) conversationId).b);
        }
        eiju eijuVarI = ajvrVar.I(ekfv.a(arrayList), i);
        eijuVarI.getClass();
        return eijuVarI;
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ajvr ajvrVar = (ajvr) this.b.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((RbmConversationId) conversationId).b);
        }
        return ajvrVar.J(ekfv.a(arrayList), i);
    }

    @Override // defpackage.ajsq
    public final ConversationId K(akln aklnVar) {
        aklnVar.getClass();
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        if (aklmVarB == aklm.RBM) {
            return RbmConversationId.c(aklnVar.c);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.aknl
    public final eiju L(ConversationId conversationId, asqe asqeVar) {
        asqeVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new akmj(this, conversationId, asqeVar, null));
    }

    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) throws IOException {
        conversationId.getClass();
        ajlmVar.getClass();
        eieu eieuVarA = eiiy.a("RbmConversationRepository#openConversation");
        try {
            if (!(conversationId instanceof RbmConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            RbmConversation rbmConversationA = this.a.a(((ajvr) this.b.b()).T(((RbmConversationId) conversationId).b, ajlmVar));
            fczl.a(eieuVarA, null);
            return rbmConversationA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarA, th);
                throw th2;
            }
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
        elkaVar.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarD = ((ajvr) this.b.b()).d(((RbmConversationId) conversationId).b, elkaVar);
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        conversationId.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarE = ((ajvr) this.b.b()).e(((RbmConversationId) conversationId).b);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajln
    public final eiju f(aoer aoerVar, ConversationId conversationId) {
        aoerVar.getClass();
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("createInviteLink not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju g(aoer aoerVar, ConversationId conversationId) {
        aoerVar.getClass();
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("disableInviteLink not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        ekgb ekgbVar = akzkVar.a;
        if (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().A()) {
            return auvw.c(this.f, fcyi.a, fdjz.a, new akmf(this, akzkVar, null));
        }
        eiju eijuVarD = eijx.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        awjlVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new akmg(this, awjlVar, null));
    }

    @Override // defpackage.ajln
    @fcsv
    public final eiju j(ekgb ekgbVar) {
        ekgbVar.getClass();
        if (((ekoe) ekgbVar).c == 1 && ((Recipient) ekgbVar.get(0)).g().A()) {
            return auvw.c(this.f, fcyi.a, fdjz.a, new akme(this, ekgbVar, null));
        }
        eiju eijuVarD = eijx.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju k() {
        int i = ekgb.d;
        eiju eijuVarE = eijx.e(ekoe.a);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajln
    public final eiju l(ConversationId conversationId) {
        conversationId.getClass();
        if (conversationId instanceof RbmConversationId) {
            return ((ajvr) this.b.b()).l(((RbmConversationId) conversationId).b);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        ekgbVar.getClass();
        return p(Optional.empty(), ekgbVar, str, null);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar) {
        awjlVar.getClass();
        ajsmVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new akmi(this, awjlVar, aoerVar, ajsmVar, null));
    }

    @Override // defpackage.ajln
    public final /* synthetic */ eiju o(Optional optional, ekgb ekgbVar, String str) {
        return ajll.a(this, optional, ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju p(Optional optional, ekgb ekgbVar, String str, Uri uri) {
        optional.getClass();
        ekgbVar.getClass();
        if (uri != null) {
            eiju eijuVarD = eijx.d(new IllegalArgumentException("Rbm conversation does not support group icon."));
            eijuVarD.getClass();
            return eijuVarD;
        }
        if (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().A()) {
            return auvw.c(this.f, fcyi.a, fdjz.a, new akmh(this, optional, ekgbVar, str, null));
        }
        eiju eijuVarD2 = eijx.d(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        eijuVarD2.getClass();
        return eijuVarD2;
    }

    @Override // defpackage.ajln
    public final eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient) {
        recipient.getClass();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.ajln
    public final eiju r(ConversationId conversationId) {
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Leave not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        ekgbVar.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Leave not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        conversationId.getClass();
        cgrcVar.getClass();
        cgraVar.getClass();
        if (conversationId instanceof RbmConversationId) {
            return ((ajvr) this.b.b()).t(((RbmConversationId) conversationId).b, cgrcVar, cgraVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarU = ((ajvr) this.b.b()).u(((RbmConversationId) conversationId).b, akcyVar);
        eijuVarU.getClass();
        return eijuVarU;
    }

    @Override // defpackage.ajln
    public final eiju v(Recipient recipient) {
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju w(ConversationId conversationId, String str) {
        str.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Rename not supported for rbm conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju x(ConversationId conversationId, aoer aoerVar) {
        conversationId.getClass();
        aoerVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new akmk(conversationId, this, aoerVar, null));
    }

    @Override // defpackage.ajln
    public final eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar) {
        conversationId.getClass();
        if (conversationId instanceof RbmConversationId) {
            return ((ajvr) this.b.b()).y(((RbmConversationId) conversationId).b, str, str2, amsvVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, String str, Uri uri) {
        conversationId.getClass();
        if (!(conversationId instanceof RbmConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarZ = ((ajvr) this.b.b()).z(((RbmConversationId) conversationId).b, str, uri);
        eijuVarZ.getClass();
        return eijuVarZ;
    }
}
