package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtf {
    private static final cqce a = cqce.g("BugleDatabase", "SurroundingTombstoneUpdater");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public bwtf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
    }

    private final MessageCoreData d(MessageCoreData messageCoreData) {
        return ((baxe) this.b.b()).k(messageCoreData.A(), messageCoreData.o());
    }

    private static final cqbd e() {
        return a.c();
    }

    public final void a(MessageCoreData messageCoreData, bwtu bwtuVar, long j) {
        boolean z;
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.I("insertOrUpdateTombstoneAtConversationBottomIfNeeded");
        int i = bwtuVar.i;
        cqbdVarA.y("protocolSwitchTombstone status", i);
        cqbdVarA.A("protocol", bwtuVar.a());
        cqbdVarA.r();
        bwsn bwsnVarA = bwtuVar.a();
        bwsn bwsnVar = bwsn.d;
        if (bwsnVarA != bwsnVar || bwbv.g()) {
            fcsu fcsuVar = this.c;
            MessageCoreData messageCoreDataA = ((bvus) fcsuVar.b()).a(messageCoreData.A(), messageCoreData.C());
            if (messageCoreDataA == null) {
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("Found a conversation with no latest message");
                cqbdVarA2.A("conversationId", messageCoreData.A());
                cqbdVarA2.r();
                cqbd cqbdVarE = e();
                cqbdVarE.I("inserting a new group tombstone");
                cqbdVarE.A("conversationId", messageCoreData.A());
                cqbdVarE.r();
                fctc fctcVar = bwtr.a;
                bwsn bwsnVarB = bwsm.b(messageCoreData);
                bwsnVarB.getClass();
                int iOrdinal = bwsnVarB.ordinal();
                bwtr bwtrVar = null;
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        bwtrVar = bwtr.b;
                    } else {
                        if (iOrdinal != 3) {
                            throw new fctg();
                        }
                        bwtrVar = bwtr.c;
                    }
                }
                if (bwtrVar == null) {
                    return;
                }
                List listK = ((bakt) this.d.b()).K(messageCoreData.A());
                listK.getClass();
                ((byeb) this.e.b()).p(Optional.empty(), messageCoreData.A(), listK, bwtrVar.g, messageCoreData.o() - 1);
                return;
            }
            fcsu fcsuVar2 = this.g;
            bwtg bwtgVarA = ((bwth) fcsuVar2.b()).a(messageCoreDataA);
            cqbd cqbdVarA3 = cqceVar.a();
            cqbdVarA3.I("latest message found");
            Class<?> cls = bwtgVarA.getClass();
            int i2 = fdcj.a;
            cqbdVarA3.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new fdbi(cls).c());
            cqbdVarA3.y("status", bwtgVarA.a().k());
            cqbdVarA3.A("protocol", bwtgVarA.b());
            cqbdVarA3.r();
            if (bwtgVarA.b() == bwtuVar.a() && !(bwtgVarA instanceof bwso)) {
                cqbd cqbdVarA4 = cqceVar.a();
                cqbdVarA4.I("protocols are matching. returning");
                cqbdVarA4.r();
                return;
            }
            if (bwtgVarA instanceof bwte) {
                bwte bwteVar = (bwte) bwtgVarA;
                boolean z2 = bwteVar.b() == bwsnVar;
                cqbd cqbdVarE2 = e();
                cqbdVarE2.I("latest message is protocol switch tombstone. Deleting and updating current latest message.");
                cqbdVarE2.r();
                ((bwtl) this.f.b()).a(bwteVar.a);
                boolean z3 = z2;
                messageCoreDataA = ((bvus) fcsuVar.b()).a(messageCoreData.A(), messageCoreData.C());
                z = z3;
            } else {
                z = false;
            }
            if (messageCoreDataA == null) {
                cqbd cqbdVarE3 = e();
                cqbdVarE3.I("Couldn't find latest message. Inserting a new protocol switch tombstone");
                cqbdVarE3.A("tombstone status", bwtuVar.a());
                cqbdVarE3.r();
                bwtl bwtlVar = (bwtl) this.f.b();
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                conversationIdTypeA.getClass();
                bwtlVar.b(conversationIdTypeA, i, j, Boolean.valueOf(z));
                return;
            }
            bwtg bwtgVarA2 = ((bwth) fcsuVar2.b()).a(messageCoreDataA);
            cqbd cqbdVarA5 = cqceVar.a();
            cqbdVarA5.I("current latest message");
            cqbdVarA5.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new fdbi(bwtgVarA2.getClass()).c());
            cqbdVarA5.y("status", bwtgVarA2.a().k());
            cqbdVarA5.A("protocol", bwtgVarA2.b());
            cqbdVarA5.r();
            if (bwtgVarA2 instanceof bwso) {
                cqbd cqbdVarE4 = e();
                cqbdVarE4.I("current latest message is new conversation tombstone. Attempting to update the tombstone");
                cqbdVarE4.r();
                bwso bwsoVar = (bwso) bwtgVarA2;
                bwtr bwtrVarC = bwsoVar.c(bwsm.b(messageCoreData));
                if (bwtrVarC != null) {
                    ((bwtl) this.f.b()).d(bwsoVar.a, bwtrVarC.g);
                }
                if (((apvg) this.h.b()).a() && bwtuVar.a() == bwsn.b && bwsoVar.b() == bwsnVar) {
                    bwtl bwtlVar2 = (bwtl) this.f.b();
                    ConversationIdType conversationIdTypeA2 = messageCoreData.A();
                    conversationIdTypeA2.getClass();
                    bwtlVar2.b(conversationIdTypeA2, i, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            if (!((apvg) this.h.b()).a()) {
                if (bwtgVarA2.b() != bwtuVar.a()) {
                    cqbd cqbdVarE5 = e();
                    cqbdVarE5.I("current latest message protocol is different from the target protocol");
                    cqbdVarE5.A("latest message protocol", bwtgVarA2.b());
                    cqbdVarE5.A("target tombstone status", bwtuVar.a());
                    cqbdVarE5.r();
                    bwtl bwtlVar3 = (bwtl) this.f.b();
                    ConversationIdType conversationIdTypeA3 = messageCoreData.A();
                    conversationIdTypeA3.getClass();
                    bwtlVar3.b(conversationIdTypeA3, i, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            bwsn bwsnVarB2 = bwtgVarA2.b();
            bwsn bwsnVarA2 = bwtuVar.a();
            bwsn bwsnVar2 = bwsn.b;
            boolean z4 = bwsnVarB2 == bwsnVar2 && bwsnVarA2 == bwsn.c;
            boolean z5 = bwsnVarB2 == bwsn.c && bwsnVarA2 == bwsnVar2;
            if (z4 || z5 || bwsnVarB2 == bwsnVarA2) {
                return;
            }
            cqbd cqbdVarE6 = e();
            cqbdVarE6.I("current latest message protocol is different from the target protocol");
            cqbdVarE6.A("latest message protocol", bwtgVarA2.b());
            cqbdVarE6.A("target tombstone status", bwtuVar.a());
            cqbdVarE6.r();
            bwtl bwtlVar4 = (bwtl) this.f.b();
            ConversationIdType conversationIdTypeA4 = messageCoreData.A();
            conversationIdTypeA4.getClass();
            bwtlVar4.b(conversationIdTypeA4, i, j, Boolean.valueOf(z));
        }
    }

    public final void b(MessageCoreData messageCoreData) {
        cqbd cqbdVarE = e();
        cqbdVarE.I("Update previous tombstone");
        cqbdVarE.r();
        MessageCoreData messageCoreDataL = ((baxe) this.b.b()).l(messageCoreData.A(), messageCoreData.o());
        if (messageCoreDataL == null) {
            return;
        }
        fcsu fcsuVar = this.g;
        bwtg bwtgVarA = ((bwth) fcsuVar.b()).a(messageCoreDataL);
        cqbd cqbdVarE2 = e();
        cqbdVarE2.I("updatePreviousTombstone: tombstone");
        Class<?> cls = bwtgVarA.getClass();
        int i = fdcj.a;
        cqbdVarE2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new fdbi(cls).c());
        cqbdVarE2.y("status", bwtgVarA.a().k());
        cqbdVarE2.A("protocol", bwtgVarA.b());
        cqbdVarE2.r();
        if (!(bwtgVarA instanceof bwso)) {
            if (bwtgVarA instanceof bwte) {
                bwte bwteVar = (bwte) bwtgVarA;
                MessageCoreData messageCoreDataD = d(messageCoreData);
                if (messageCoreDataD != null) {
                    if (bwti.a(messageCoreDataD.k()) || bwteVar.b() != bwsm.b(messageCoreDataD)) {
                        ((bwtl) this.f.b()).a(bwteVar.a);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        bwso bwsoVar = (bwso) bwtgVarA;
        a.m("updateNewConversationTombstoneBasedOnCurrentOrNextMessage");
        bwth bwthVar = (bwth) fcsuVar.b();
        MessageCoreData messageCoreDataD2 = d(messageCoreData);
        if (messageCoreDataD2 != null) {
            messageCoreData = messageCoreDataD2;
        }
        bwtg bwtgVarA2 = bwthVar.a(messageCoreData);
        if (bwtgVarA2.b() != bwsn.d || bwbv.g()) {
            if (bwtgVarA2 instanceof bwte) {
                bwte bwteVar2 = (bwte) bwtgVarA2;
                cqbd cqbdVarE3 = e();
                cqbdVarE3.I("updateProtocolForNewConversationTombstoneToMatchProtocolSwitchTombstone");
                cqbdVarE3.A("protocolSwitchTombstone protocol", bwteVar2.b());
                cqbdVarE3.A("newConversationTombstone protocol", bwsoVar.b());
                cqbdVarE3.r();
                bwtr bwtrVarC = bwsoVar.c(bwteVar2.b());
                if (bwtrVarC != null) {
                    ((bwtl) this.f.b()).d(bwsoVar.a, bwtrVarC.g);
                }
                ((bwtl) this.f.b()).a(bwteVar2.a);
                return;
            }
            if (bwtgVarA2 instanceof bwsp) {
                bwsp bwspVar = (bwsp) bwtgVarA2;
                cqbd cqbdVarE4 = e();
                cqbdVarE4.I("updateProtocolForNewConversationTombstoneToMatchNonTombstoneMessage");
                cqbdVarE4.A("nonTombstone protocol", bwspVar.b());
                cqbdVarE4.A("newConversationTombstone protocol", bwsoVar.b());
                cqbdVarE4.r();
                bwtr bwtrVarC2 = bwsoVar.c(bwsm.b(bwspVar.a));
                if (bwtrVarC2 == null || bwsoVar.b() == bwtrVarC2.a()) {
                    return;
                }
                ((bwtl) this.f.b()).d(bwsoVar.a, bwtrVarC2.g);
            }
        }
    }
}
