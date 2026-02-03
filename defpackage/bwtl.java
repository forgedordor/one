package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtl {
    public static final cqce a = cqce.g("BugleDatabase", "TombstoneManagerOperations");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public bwtl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.c = fcsuVar6;
        this.i = fcsuVar7;
        this.d = fcsuVar8;
    }

    public final void a(final MessageCoreData messageCoreData) {
        final cdww cdwwVar = (cdww) this.g.b();
        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#deleteProtocolSwitchTombstone");
        try {
            final ConversationIdType conversationIdTypeA = messageCoreData.A();
            ((Integer) cdwwVar.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new ejxr() { // from class: cdwb
                @Override // defpackage.ejxr
                public final Object get() {
                    String[] strArr = MessagesTable.a;
                    brdk brdkVar = new brdk();
                    brdkVar.f("deleteMessagesInConversation");
                    final ConversationIdType conversationIdType = conversationIdTypeA;
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    brdkVar.c(new Function() { // from class: cdwo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.m(conversationIdType);
                            brecVar.p(messageCoreData2.C());
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int iD = brdkVar.d();
                    ((bxlc) cdwwVar.b.b()).m(conversationIdType, ekgb.r(messageCoreData2.C()), new String[0]);
                    return Integer.valueOf(iD);
                }
            })).intValue();
            eieuVarK.close();
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("TombstoneManagerOperations deleted protocol switch tombstone");
            cqbdVarA.A("conversationId", messageCoreData.A());
            cqbdVarA.y("status", messageCoreData.k());
            cqbdVarA.r();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final ConversationIdType conversationIdType, int i, long j, final Boolean bool) {
        int i2;
        axcy axcyVarD = ((bbdl) this.e.b()).d();
        axcyVarD.getClass();
        ParticipantsTable.BindData bindDataA = axcyVarD.a();
        fcsu fcsuVar = this.f;
        List listK = ((bakt) fcsuVar.b()).K(conversationIdType);
        listK.getClass();
        long jG = ((bakt) fcsuVar.b()).g(conversationIdType);
        fctc fctcVarA = fctd.a(new fdae() { // from class: bwtk
            @Override // defpackage.fdae
            public final Object invoke() {
                Boolean bool2 = bool;
                boolean z = true;
                if (bool2 == null || !fdbq.f(bool2, true)) {
                    if (!((bvus) this.c.b()).j(conversationIdType)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        if (i != 234) {
            i2 = i;
        } else {
            if (!((Boolean) fctcVarA.a()).booleanValue()) {
                a.m("Attempting to add a downgrade to RCS tombstone, but found no E2EE tombstones");
                ((bwtj) this.i.b()).b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.NoE2eeUpgradeTombstoneInRcsGroup");
                return;
            }
            i2 = 234;
        }
        ((byeb) this.h.b()).k(Optional.empty(), conversationIdType, axcyVarD, bindDataA, listK, i2, j, jG);
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("inserted new conversation tombstone");
        cqbdVarA.A("conversationId", conversationIdType);
        cqbdVarA.y("tombstone", i2);
        cqbdVarA.z("time", j);
        cqbdVarA.r();
    }

    public final void c(MessageCoreData messageCoreData) {
        ((baxe) this.b.b()).P(messageCoreData);
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("updated message");
        cqbdVarA.A("messageId", messageCoreData.C());
        cqbdVarA.r();
    }

    public final void d(MessageCoreData messageCoreData, int i) {
        if (messageCoreData.k() == i) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Skipping tombstone update, both current and new tombstones are equal");
            cqbdVarA.y("currentTombstone", messageCoreData.k());
            cqbdVarA.y("newTombstone", i);
            cqbdVarA.r();
            return;
        }
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        conversationIdTypeA.getClass();
        int iK = messageCoreData.k();
        cqbd cqbdVarA2 = a.a();
        cqbdVarA2.I("TombstoneManagerOperations updated conversation creation tombstone");
        cqbdVarA2.A("conversationId", conversationIdTypeA);
        cqbdVarA2.y("oldTombstone", iK);
        cqbdVarA2.y("newTombstone", i);
        cqbdVarA2.r();
        messageCoreData.bU(i);
        ((baxe) this.b.b()).P(messageCoreData);
        ((bwtj) this.i.b()).b.e("Bugle.Tombstone.Generated", i);
    }
}
