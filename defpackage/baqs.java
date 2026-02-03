package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqs implements baqm {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl");
    public final fcsu a;
    public final alrj b;
    public final bbdl c;
    private final dghj e;
    private final fcyh f;
    private final fdjx g;

    public baqs(fcsu fcsuVar, alrj alrjVar, dghj dghjVar, bbdl bbdlVar, fcyh fcyhVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        alrjVar.getClass();
        dghjVar.getClass();
        bbdlVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = alrjVar;
        this.e = dghjVar;
        this.c = bbdlVar;
        this.f = fcyhVar;
        this.g = fdjxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(ConversationIdType conversationIdType, boolean z) {
        List listI = i(conversationIdType, z);
        bojh bojhVarR = ((bakt) this.a.b()).r(conversationIdType);
        if (bojhVarR != null && bvdi.d(bojhVarR.k())) {
            SelfIdentityId selfIdentityIdC = aofa.c(bojhVarR.T());
            if (selfIdentityIdC == null) {
                ekrw ekrwVarJ = d.j();
                ekrwVarJ.X(eksq.a, "BugleConversation");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "doGetParticipantsExcludingConversationCurrentSelf", 147, "ConversationParticipantsProviderImpl.kt")).t("Current self id is not present for RCS group conversation[%s].", conversationIdType);
                return listI;
            }
            axcy axcyVarC = this.c.c(selfIdentityIdC);
            if (axcyVarC == null) {
                ekrw ekrwVarJ2 = d.j();
                ekrwVarJ2.X(eksq.a, "BugleConversation");
                ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "getCurrentSelfParticipantMessagingIdentity", 177, "ConversationParticipantsProviderImpl.kt")).t("No subscription associated with currentSelfId[%s].", selfIdentityIdC);
            }
            alqm alqmVarH = axcyVarC != null ? h(axcyVarC) : null;
            if (alqmVarH != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (!fdbq.f(this.b.q((ParticipantsTable.BindData) obj), alqmVarH)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return listI;
    }

    @Override // defpackage.baqm
    public final eiju a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new baqo(this, conversationIdType, null));
    }

    @Override // defpackage.baqm
    public final eiju b(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new baqq(this, conversationIdType, null));
    }

    @Override // defpackage.baqm
    public final Object c(ConversationIdType conversationIdType, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new baqp(null, this, conversationIdType), fcxyVar);
    }

    @Override // defpackage.baqm
    public final Object d(ConversationIdType conversationIdType, aubq aubqVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new baqr(null, this, conversationIdType, aubqVar), fcxyVar);
    }

    @Override // defpackage.baqm
    public final List e(ConversationIdType conversationIdType) {
        ecem.b();
        return i(conversationIdType, false);
    }

    @Override // defpackage.baqm
    public final List f(ConversationIdType conversationIdType, boolean z) {
        conversationIdType.getClass();
        ecem.b();
        return k(conversationIdType, z);
    }

    @Override // defpackage.baqm
    public final boolean g(ConversationIdType conversationIdType, aubq aubqVar) {
        conversationIdType.getClass();
        aubqVar.getClass();
        List listK = ((bakt) this.a.b()).K(conversationIdType);
        if (listK.isEmpty()) {
            ekrw ekrwVarJ = d.j();
            ekrwVarJ.X(eksq.a, "BugleConversation");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "isParticipantInGroupRcsConversationBlocking", 82, "ConversationParticipantsProviderImpl.kt")).q("The conversation does not contain any participants.");
            return false;
        }
        ekgb ekgbVarY = this.b.y(listK);
        ekgbVarY.getClass();
        ArrayList arrayList = new ArrayList();
        ekqh it = ekgbVarY.iterator();
        while (it.hasNext()) {
            Optional optionalE = ((alqm) it.next()).e();
            optionalE.getClass();
            aubq aubqVar2 = (aubq) fdct.b(optionalE);
            if (aubqVar2 != null) {
                arrayList.add(aubqVar2);
            }
        }
        return arrayList.contains(aubqVar);
    }

    public final alqm h(axcy axcyVar) {
        if (axcyVar.i()) {
            return (alqm) fdct.b(axcyVar.b());
        }
        dggk dggkVarB = this.e.b(axcyVar.e());
        if (dggkVarB != null) {
            return this.b.c(dggkVarB.a, new ejxr() { // from class: baqn
                @Override // defpackage.ejxr
                public final Object get() {
                    return Optional.empty();
                }
            });
        }
        ekrw ekrwVarE = d.e();
        ekrwVarE.X(eksq.a, "BugleConversation");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "toMessagingIdentity", BasePaymentResult.ERROR_REQUEST_FAILED, "ConversationParticipantsProviderImpl.kt")).q("No associated RCS provisioning, fallback on subscription.");
        return (alqm) fdct.b(axcyVar.b());
    }

    public final List i(ConversationIdType conversationIdType, boolean z) {
        List listL = ((bakt) this.a.b()).L(conversationIdType, z);
        listL.getClass();
        return listL;
    }
}
