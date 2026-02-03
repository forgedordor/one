package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnp extends fcyz implements fdat {
    final /* synthetic */ cdoa a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnp(fcxy fcxyVar, cdoa cdoaVar) {
        super(2, fcxyVar);
        this.a = cdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        akbj akbjVar;
        fctl.b(obj);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boic boicVar = boiv.c;
        boid boidVar = boicVar.a;
        boiqVar.c(boidVar);
        boiqVar.A("ParentAllowlistUpdateHandler#conversationIdToParticipantsDataQuery");
        boiqVar.s();
        boiqVar.E(dqts.i(ParticipantsTable.e().b(), ParticipantsTable.c.a, boicVar.b).g());
        boiqVar.H(dqts.i(bros.a().b(), bros.c.a, boidVar).g());
        ekqh it = boiqVar.b().z().iterator();
        it.getClass();
        while (it.hasNext()) {
            bohm bohmVar = (bohm) it.next();
            ConversationIdType conversationIdTypeN = bohmVar.n();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bohmVar.ax("participants", ParticipantsTable.BindData.class);
            if (bindData == null) {
                ekrw ekrwVarJ = cdoa.a.j();
                ekrwVarJ.X(eksq.a, "BugleTrustedContacts");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.S, "ParentAllowlistUpdateHandler");
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$loadParticipantsForAllConversationsUsingConversationToParticipants$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 253, "ParentAllowlistUpdateHandler.kt")).t("There is no participant for conversation with id: %s.", conversationIdTypeN.a());
            } else {
                cdoa cdoaVar = this.a;
                if (cdoaVar.m.a()) {
                    brns brnsVar = (brns) bohmVar.ax("parent_disallowed_conversations", brns.class);
                    if (brnsVar == null) {
                        akbjVar = new akbj(akbk.b);
                    } else {
                        akbk akbkVarK = brnsVar.k();
                        akbkVarK.getClass();
                        akbjVar = new akbj(akbkVarK);
                    }
                    map2.put(conversationIdTypeN, akbjVar);
                } else if (bohmVar.ax("parent_disallowed_conversations", brns.class) != null) {
                    hashSet.add(conversationIdTypeN);
                }
                alqm alqmVarQ = ((alrj) cdoaVar.d.b()).q(bindData);
                Map.EL.putIfAbsent(map, conversationIdTypeN, new HashSet());
                Object obj2 = map.get(conversationIdTypeN);
                obj2.getClass();
                ((HashSet) obj2).add(alqmVarQ);
                hashSet2.add(alqmVarQ);
            }
        }
        return this.a.m.a() ? new cdnj(map, null, hashSet2, map2, 2) : new cdnj(map, hashSet, hashSet2, null, 8);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdnp cdnpVar = new cdnp(fcxyVar, this.a);
        cdnpVar.b = obj;
        return cdnpVar;
    }
}
