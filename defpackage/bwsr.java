package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsr {
    private static final cqce a = cqce.g("BugleDatabase", "OnDraftTypeChangedGroupProcessor");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public bwsr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    private final void b(int i, bwso bwsoVar) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Setting new conversation creation tombstone");
        cqbdVarA.y("DraftMessageType", i);
        cqbdVarA.r();
        bwtr bwtrVarC = bwsoVar.c(bwsm.a(i));
        if (bwtrVarC != null) {
            ((bwtl) this.d.b()).d(bwsoVar.a, bwtrVarC.g);
        }
    }

    public final void a(ConversationIdType conversationIdType, int i) {
        bwsq bwsqVar;
        fcsu fcsuVar = this.b;
        MessageCoreData messageCoreDataP = ((baxe) fcsuVar.b()).p(conversationIdType);
        if (messageCoreDataP == null) {
            bwtj bwtjVar = (bwtj) this.c.b();
            cqbd cqbdVarA = bwtj.a.a();
            cqbdVarA.I("setConversationCreationTombstone skip insert, no messages in conversation");
            cqbdVarA.A("conversationId", conversationIdType);
            cqbdVarA.r();
            bwtjVar.b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.Empty.GroupConversation");
            return;
        }
        bwtg bwtgVarA = ((bwth) this.e.b()).a(messageCoreDataP);
        cqce cqceVar = a;
        cqbd cqbdVarA2 = cqceVar.a();
        cqbdVarA2.I("current last message");
        Class<?> cls = bwtgVarA.getClass();
        int i2 = fdcj.a;
        cqbdVarA2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new fdbi(cls).c());
        cqbdVarA2.y("status", bwtgVarA.a().k());
        cqbdVarA2.A("protocol", bwtgVarA.b());
        cqbdVarA2.r();
        if (bwtgVarA instanceof bwso) {
            bwso bwsoVar = (bwso) bwtgVarA;
            if (i == 30) {
                b(i, bwsoVar);
                return;
            }
            if (i == 40) {
                if (bwbv.g()) {
                    b(i, bwsoVar);
                    return;
                }
                return;
            } else {
                cqbd cqbdVarA3 = cqceVar.a();
                cqbdVarA3.I("setConversationCreationTombstone skip insert, non-RCS conversation");
                cqbdVarA3.A("conversationId", bwsoVar.a.A());
                cqbdVarA3.r();
                return;
            }
        }
        fctc fctcVar = bwtu.a;
        bwtu bwtuVarA = bwtt.a(bwsm.a(i));
        if (bwtuVarA == null) {
            cqbd cqbdVarA4 = cqceVar.a();
            cqbdVarA4.I("draftMessageType is not supported");
            cqbdVarA4.y("draftMessageType", i);
            cqbdVarA4.A("conversationId", bwtgVarA.a().A());
            cqbdVarA4.r();
            return;
        }
        if (bwtuVarA != bwtu.e || bwbv.g()) {
            if ((bwtgVarA instanceof bwsp) || (bwtgVarA instanceof bwse) || (bwtgVarA instanceof bwsl)) {
                if (bwtuVarA.a() == bwtgVarA.b()) {
                    cqbd cqbdVarA5 = cqceVar.a();
                    cqbdVarA5.I("Skipping tombstone insertion, both current and new tombstones are equal");
                    cqbdVarA5.A("current message protocol", bwtgVarA.b());
                    cqbdVarA5.y("newTombstone", bwtuVarA.i);
                    cqbdVarA5.r();
                    return;
                }
                cqbd cqbdVarA6 = cqceVar.a();
                cqbdVarA6.I("Inserting new tombstone, last message is different from current draft type");
                cqbdVarA6.A("current message protocol", bwtgVarA.b());
                int i3 = bwtuVarA.i;
                cqbdVarA6.y("newTombstone", i3);
                cqbdVarA6.r();
                bwtl bwtlVar = (bwtl) this.d.b();
                ConversationIdType conversationIdTypeA = bwtgVarA.a().A();
                conversationIdTypeA.getClass();
                bwtlVar.b(conversationIdTypeA, i3, bwtgVarA.a().o() + 1, null);
                return;
            }
            if (bwtgVarA instanceof bwte) {
                bwte bwteVar = (bwte) bwtgVarA;
                if (bwtuVarA.a() == bwteVar.b()) {
                    bwsqVar = bwsq.a;
                } else {
                    MessageCoreData messageCoreDataS = ((baxe) fcsuVar.b()).s(bwteVar.a.A());
                    bwsqVar = messageCoreDataS == null ? bwsq.b : bwtuVarA.a() == new bwsp(messageCoreDataS).b() ? bwsq.c : bwsq.d;
                }
                cqbd cqbdVarA7 = cqceVar.a();
                cqbdVarA7.I("insertOrUpdateProtocolSwitchTombstone");
                cqbdVarA7.A("scenario", bwsqVar);
                cqbdVarA7.r();
                int iOrdinal = bwsqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            ((bwtl) this.d.b()).a(bwteVar.a);
                            return;
                        } else {
                            if (iOrdinal != 3) {
                                throw new fctg();
                            }
                            ((bwtl) this.d.b()).d(bwteVar.a, bwtuVarA.i);
                            return;
                        }
                    }
                    cqbd cqbdVarA8 = cqceVar.a();
                    cqbdVarA8.I("setProtocolChangeTombstone found no messages before last tombstone; updating tombstone");
                    int i4 = bwtuVarA.i;
                    cqbdVarA8.y("newTombstoneStatus", i4);
                    cqbdVarA8.r();
                    ((bwtl) this.d.b()).d(bwteVar.a, i4);
                }
            }
        }
    }
}
