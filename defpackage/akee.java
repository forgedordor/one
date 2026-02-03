package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akee implements akez, ajsq, ajln {
    public final akel a;
    public final ajvr b;
    public final ccxr c;
    private final fdjx d;
    private final akfe e;

    public akee(fdjx fdjxVar, akel akelVar, ajvr ajvrVar, akfe akfeVar, ccxr ccxrVar) {
        fdjxVar.getClass();
        ajvrVar.getClass();
        akfeVar.getClass();
        this.d = fdjxVar;
        this.a = akelVar;
        this.b = ajvrVar;
        this.e = akfeVar;
        this.c = ccxrVar;
    }

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        akblVar.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar) {
        return this.b.B(conversationId, recipient, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, elka elkaVar) {
        elkaVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarC = this.b.C(((EmergencyConversationId) conversationId).c(), elkaVar);
        eijuVarC.getClass();
        return eijuVarC;
    }

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        return this.b.D(conversationId, recipient, crwzVar, str, z, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju E(ConversationId conversationId, Uri uri) {
        return this.b.E(conversationId, uri);
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("upgradeConversation not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, elka elkaVar) throws IOException {
        conversationId.getClass();
        elkaVar.getClass();
        eieu eieuVarH = eiiy.h("EmergencyConversationRepository#deleteConversation");
        try {
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            eiju eijuVarG = this.b.G(((EmergencyConversationId) conversationId).c(), elkaVar);
            eijuVarG.getClass();
            fczl.a(eieuVarH, null);
            return eijuVarG;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ajln
    public final anpj H(int i) {
        return this.b.H(i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((EmergencyConversationId) conversationId).c());
        }
        eiju eijuVarI = this.b.I(ekfv.a(arrayList), i);
        eijuVarI.getClass();
        return eijuVarI;
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((EmergencyConversationId) conversationId).c());
        }
        return this.b.J(ekfv.a(arrayList), i);
    }

    @Override // defpackage.ajsq
    public final ConversationId K(akln aklnVar) {
        aklnVar.getClass();
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        if (aklmVarB != aklm.EMERGENCY) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String str = aklnVar.c;
        str.getClass();
        return akeo.a(str);
    }

    @Override // defpackage.akez
    public final void L() {
        final akfe akfeVar = this.e;
        akfeVar.a.c(new Supplier() { // from class: akfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(akfeVar.a());
            }
        }, "LocationPermissionManagerImpl::Notify");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) {
        conversationId.getClass();
        ajlmVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        EmergencyConversation emergencyConversationA = this.a.a(this.b.a(((EmergencyConversationId) conversationId).c(), ajlmVar));
        auvw.k(this.d, null, null, new aked(this, emergencyConversationA, null), 3);
        return emergencyConversationA;
    }

    @Override // defpackage.ajln
    public final ConversationId b(akln aklnVar) {
        return this.b.b(aklnVar);
    }

    @Override // defpackage.ajln
    public final ConversationId c(byte[] bArr) {
        return this.b.c(bArr);
    }

    @Override // defpackage.ajln
    public final eiju d(ConversationId conversationId, elka elkaVar) {
        elkaVar.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarD = this.b.d(((EmergencyConversationId) conversationId).c(), elkaVar);
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        conversationId.getClass();
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarE = this.b.e(((EmergencyConversationId) conversationId).c());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajln
    public final eiju f(aoer aoerVar, ConversationId conversationId) {
        aoerVar.getClass();
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("createInviteLink not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju g(aoer aoerVar, ConversationId conversationId) {
        aoerVar.getClass();
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("disableInviteLink not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        ekgb ekgbVar = akzkVar.a;
        if (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().v()) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new akeb(this, akzkVar, null));
        }
        eiju eijuVarE = eijx.e(ekoe.a);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        return this.b.i(awjlVar);
    }

    @Override // defpackage.ajln
    @fcsv
    public final eiju j(ekgb ekgbVar) {
        ekgbVar.getClass();
        if (((ekoe) ekgbVar).c == 1 && ((Recipient) ekgbVar.get(0)).g().v()) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new akea(this, ekgbVar, null));
        }
        eiju eijuVarE = eijx.e(Optional.empty());
        eijuVarE.getClass();
        return eijuVarE;
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
        return this.b.l(conversationId);
    }

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        ekgbVar.getClass();
        return p(Optional.empty(), ekgbVar, str, null);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar) {
        return this.b.n(awjlVar, aoerVar, ajsmVar);
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
            eiju eijuVarD = eijx.d(new IllegalArgumentException("Emergency conversation does not support group icon."));
            eijuVarD.getClass();
            return eijuVarD;
        }
        if (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().v()) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new akec(this, optional, ekgbVar, str, null));
        }
        eiju eijuVarD2 = eijx.d(new IllegalArgumentException("Recipients don't contain exactly one emergency recipient"));
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
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Leave not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        ekgbVar.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Leave not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        return this.b.t(conversationId, cgrcVar, cgraVar);
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        if (!(conversationId instanceof EmergencyConversationId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarU = this.b.u(((EmergencyConversationId) conversationId).c(), akcyVar);
        eijuVarU.getClass();
        return eijuVarU;
    }

    @Override // defpackage.ajln
    public final eiju v(Recipient recipient) {
        return this.b.v(recipient);
    }

    @Override // defpackage.ajln
    public final eiju w(ConversationId conversationId, String str) {
        str.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("Rename not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajln
    public final eiju x(ConversationId conversationId, aoer aoerVar) throws IOException {
        conversationId.getClass();
        aoerVar.getClass();
        eieu eieuVarH = eiiy.h("EmergencyConversationRepository#setActiveSelfIdentity");
        try {
            if (!(conversationId instanceof EmergencyConversationId)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            eiju eijuVarX = this.b.x(((EmergencyConversationId) conversationId).c(), aoerVar);
            eijuVarX.getClass();
            fczl.a(eieuVarH, null);
            return eijuVarX;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ajln
    public final eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar) {
        conversationId.getClass();
        if (conversationId instanceof EmergencyConversationId) {
            return this.b.y(((EmergencyConversationId) conversationId).c(), str, str2, amsvVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, String str, Uri uri) {
        conversationId.getClass();
        eiju eijuVarD = eijx.d(new UnsupportedOperationException("setNameAndIcon not supported for emergency conversation"));
        eijuVarD.getClass();
        return eijuVarD;
    }
}
