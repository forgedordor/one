package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtd implements bydb {
    public static final cqce a = cqce.g("BugleDatabase", "ProtocolChangeTombstoneManager");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl");
    public final ains c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final dqsn g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final cmvy o;
    private final fcsu p;
    private final eosc q;
    private final fcsu r;
    private final fcsu s;

    public bwtd(ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, dqsn dqsnVar, cmvy cmvyVar, fcsu fcsuVar6, eosc eoscVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13) {
        this.c = ainsVar;
        this.d = fcsuVar;
        this.m = fcsuVar3;
        this.f = fcsuVar4;
        this.e = fcsuVar2;
        this.n = fcsuVar5;
        this.g = dqsnVar;
        this.o = cmvyVar;
        this.p = fcsuVar6;
        this.q = eoscVar;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
        this.r = fcsuVar10;
        this.k = fcsuVar11;
        this.s = fcsuVar12;
        this.l = fcsuVar13;
    }

    public static int a(boolean z, boolean z2) {
        if (z) {
            return z2 ? 216 : 215;
        }
        return 214;
    }

    public static boolean m(MessageCoreData messageCoreData) {
        return baui.g(messageCoreData.k());
    }

    private static int p(int i) {
        if (i == 215) {
            return 207;
        }
        if (i == 216 || i == 219 || i == 235 || i == 237) {
            return 213;
        }
        return i != 238 ? 206 : 207;
    }

    private final int q(MessageCoreData messageCoreData, int i) {
        if (((aquo) this.l.b()).a() && i == 264) {
            return 264;
        }
        if (messageCoreData.cX() && messageCoreData.cB()) {
            return 213;
        }
        return messageCoreData.cX() ? 207 : 206;
    }

    private final MessageCoreData r(MessageCoreData messageCoreData, boolean z) {
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        long jO = messageCoreData.o();
        return z ? ((baxe) this.e.b()).l(conversationIdTypeA, jO) : ((baxe) this.e.b()).k(conversationIdTypeA, jO);
    }

    private final boolean s(bajf bajfVar) {
        if (bajfVar == null) {
            return false;
        }
        Optional optionalK = bajfVar.k();
        if (optionalK.isEmpty()) {
            return false;
        }
        return t(bajfVar.Q(), bajfVar.P(), (alqm) optionalK.get());
    }

    private final boolean t(boolean z, boolean z2, alqm alqmVar) {
        return bwbt.a() && !z && !z2 && this.o.j(alqmVar.h());
    }

    private static boolean u(bajf bajfVar) {
        return bajfVar != null && bajfVar.Q() && bajfVar.E() == 2 && !bajfVar.P();
    }

    @Override // defpackage.bydb
    public final eiju b(final ConversationIdType conversationIdType, boolean z, final int i) {
        if (z) {
            return eijx.e(null);
        }
        ((bwtj) this.j.b()).a(1);
        final bwsk bwskVar = (bwsk) this.h.b();
        cqbd cqbdVarA = bwsk.a.a();
        cqbdVarA.I("onDraftTypeChanged");
        cqbdVarA.A("conversationId", conversationIdType);
        cqbdVarA.y("draftMessageType", i);
        cqbdVarA.r();
        eiju eijuVarB = ((byeq) bwskVar.c.b()).b("GroupProtocolChangeTombstoneManager#onDraftTypeChanged", new Runnable() { // from class: bwsh
            @Override // java.lang.Runnable
            public final void run() {
                ((bwsr) bwskVar.d.b()).a(conversationIdType, i);
            }
        });
        eijuVarB.getClass();
        return eijuVarB;
    }

    @Override // defpackage.bydb
    public final eiju c(final ConversationIdType conversationIdType) {
        ((bwtj) this.j.b()).a(8);
        final bwsk bwskVar = (bwsk) this.h.b();
        cqbd cqbdVarC = bwsk.a.c();
        cqbdVarC.I("onEncryptionStatusChanged");
        cqbdVarC.A("conversationId", conversationIdType);
        cqbdVarC.r();
        eiju eijuVarB = ((byeq) bwskVar.c.b()).b("GroupProtocolChangeTombstoneManager#onEncryptionStatusChanged", new Runnable() { // from class: bwsi
            @Override // java.lang.Runnable
            public final void run() {
                bwsk bwskVar2 = bwskVar;
                bapl baplVar = (bapl) bwskVar2.g.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                bajf bajfVarA = baplVar.a(conversationIdType2);
                if (bajfVarA != null) {
                    ((bwsr) bwskVar2.d.b()).a(conversationIdType2, true != bajfVarA.D() ? 30 : 40);
                }
            }
        });
        eijuVarB.getClass();
        return eijuVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwtd.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    public final void e(ConversationIdType conversationIdType, int i, long j) {
        axcy axcyVarD = ((bbdl) this.n.b()).d();
        ParticipantsTable.BindData bindDataA = axcyVarD.a();
        fcsu fcsuVar = this.m;
        List listK = ((bakt) fcsuVar.b()).K(conversationIdType);
        long jG = ((bakt) fcsuVar.b()).g(conversationIdType);
        int i2 = (i == 216 && ((baxe) this.e.b()).m(conversationIdType) == null) ? 219 : i;
        ((byeb) this.p.b()).k(Optional.empty(), conversationIdType, axcyVarD, bindDataA, listK, i2, j, jG);
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertNewTombstone", 1168, "ProtocolChangeTombstoneManagerImpl.java")).v("inserted new conversation tombstone. Tombstone: %s, time: %s", i2, j);
    }

    public final void f(MessageCoreData messageCoreData, int i, bwss bwssVar, long j) {
        int i2;
        fcsu fcsuVar = this.e;
        MessageCoreData messageCoreDataT = ((baxe) fcsuVar.b()).t(messageCoreData.A(), messageCoreData.C());
        if (messageCoreDataT == null) {
            int iOrdinal = bwssVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 206;
            } else if (iOrdinal == 1) {
                i2 = 207;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unknown tombstone protocol");
                }
                i2 = 213;
            }
            int iP = p(i);
            ((byeb) this.p.b()).p(Optional.empty(), messageCoreData.A(), ((bakt) this.m.b()).K(messageCoreData.A()), iP, j);
            this.c.e("Bugle.Tombstone.Generated", i2);
            return;
        }
        int iK = messageCoreDataT.k();
        if (baui.d(iK)) {
            if (bwss.b(iK) == bwssVar) {
                return;
            }
            if (((appm) this.k.b()).a()) {
                h(messageCoreDataT, bmsp.t);
            }
            ((cdww) this.f.b()).a(messageCoreDataT.C());
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, messageCoreDataT.A());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneAtConversationBottomIfNeeded", 1073, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted existing bottom tombstone. Tombstone: %s", messageCoreDataT.k());
            messageCoreDataT = ((baxe) fcsuVar.b()).t(messageCoreData.A(), messageCoreData.C());
        }
        if (messageCoreDataT != null) {
            if (m(messageCoreDataT)) {
                int iQ = q(messageCoreData, messageCoreDataT.k());
                if (iQ != messageCoreDataT.k()) {
                    messageCoreDataT.bU(iQ);
                    ((baxe) fcsuVar.b()).P(messageCoreDataT);
                    this.c.e("Bugle.Tombstone.Generated", iQ);
                    return;
                }
                return;
            }
            bwss bwssVarA = bwss.a(messageCoreDataT);
            if (bwssVarA != bwssVar) {
                this.c.e("Bugle.Tombstone.Generated", bwtn.a(bwssVarA, bwssVar).j);
                e(messageCoreData.A(), i, j);
            }
        }
    }

    @Override // defpackage.bydb
    public final void g(MessageCoreData messageCoreData) throws Throwable {
        Throwable th;
        int i;
        Throwable th2;
        Optional optionalOf;
        Throwable th3;
        ejwl.l(this.g.i());
        eieu eieuVarK = eiiy.k("ProtocolChangeTombstoneManager#getTombstoneManagerValidity");
        try {
            if (bwbt.a() && !messageCoreData.cF()) {
                final ConversationIdType conversationIdTypeA = messageCoreData.A();
                botb botbVarE = botm.e();
                botbVarE.A("ProtocolChangeTombstoneManager#getTombstoneManagerValidityConversationData");
                bopp boppVar = botm.c;
                i = 1;
                botbVarE.c(boppVar.a, boppVar.O, boppVar.R, boppVar.y);
                botbVarE.i(new Function() { // from class: bwtc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.r(conversationIdTypeA);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bopr boprVar = (bopr) botbVarE.b().p();
                try {
                    if (boprVar.moveToFirst()) {
                        try {
                            optionalOf = Optional.of((bojh) boprVar.cQ());
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                try {
                                    boprVar.close();
                                    throw th2;
                                } catch (Throwable th5) {
                                    th2.addSuppressed(th5);
                                    throw th2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    eieuVarK.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        optionalOf = Optional.empty();
                    }
                    try {
                        if (optionalOf.isEmpty()) {
                            boprVar.close();
                        } else {
                            Object obj = optionalOf.get();
                            if (((bojh) obj).k() != 2 || ((bojh) obj).an()) {
                                Object obj2 = optionalOf.get();
                                alqm alqmVarC = ((alrj) this.s.b()).c(((bojh) obj2).ab(), new ejxr() { // from class: bwsy
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        return Optional.empty();
                                    }
                                });
                                if (bwbt.a() && !bvdi.b(((bojh) obj2).k()) && !((bojh) obj2).an()) {
                                    if (this.o.j(alqmVarC.h())) {
                                        boprVar.close();
                                        eieuVarK.close();
                                        i = 2;
                                    }
                                }
                                boprVar.close();
                            } else {
                                boprVar.close();
                                eieuVarK.close();
                            }
                        }
                        eieuVarK.close();
                        i = 3;
                    } catch (Throwable th8) {
                        th = th8;
                        eieuVarK.close();
                        throw th;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                }
            } else {
                eieuVarK.close();
                i = 3;
            }
            if (i == 3) {
                ekrw ekrwVarE = b.e();
                ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneOnMessagePendingInsertion", 739, "ProtocolChangeTombstoneManagerImpl.java")).q("Skip insertOrUpdateTombstoneOnMessagePendingInsertion due to invalid conversation or message type.");
                return;
            }
            ekrw ekrwVarE2 = b.e();
            ekrwVarE2.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarE2;
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneOnMessagePendingInsertion", 748, "ProtocolChangeTombstoneManagerImpl.java")).q("insertOrUpdateTombstoneOnMessagePendingInsertion");
            int i2 = i - 1;
            eieu eieuVarK2 = eiiy.k("ProtocolChangeTombstoneManager#insertOrUpdateTombstoneOnMessagePendingInsertion");
            if (i2 == 0) {
                try {
                    bwsk bwskVar = (bwsk) this.h.b();
                    messageCoreData.getClass();
                    bwsk.a.m("Invoking insertOrUpdateTombstone for groups");
                    ((bwtj) bwskVar.h.b()).a(9);
                    bwsn bwsnVarB = bwsm.b(messageCoreData);
                    fctc fctcVar = bwtu.a;
                    bwtu bwtuVarA = bwtt.a(bwsnVarB);
                    if (bwtuVarA != null) {
                        ((bwtf) bwskVar.e.b()).a(messageCoreData, bwtuVarA, messageCoreData.o() - 1);
                    }
                    eieuVarK2.close();
                } catch (Throwable th10) {
                    th = th10;
                    th3 = th;
                    eieuVarK2.close();
                    throw th3;
                }
            }
            try {
                ((bwtj) this.j.b()).b(9);
                try {
                    f(messageCoreData, a(messageCoreData.cX(), messageCoreData.cB()), bwss.a(messageCoreData), (-1) + messageCoreData.o());
                    eieuVarK2.close();
                } catch (Throwable th11) {
                    th = th11;
                    th3 = th;
                    try {
                        eieuVarK2.close();
                        throw th3;
                    } catch (Throwable th12) {
                        th3.addSuppressed(th12);
                        throw th3;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
            }
        } catch (Throwable th14) {
            th = th14;
        }
    }

    public final void h(MessageCoreData messageCoreData, bmsp bmspVar) {
        ((bypl) this.r.b()).a(messageCoreData.C().b(), bmspVar);
    }

    @Override // defpackage.bydb
    public final void i(final MessageCoreData messageCoreData) {
        boolean z;
        bajf bajfVarA;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        boolean zA = bwbt.a();
        final boolean z2 = false;
        if (zA) {
            bajfVarA = ((axgh) this.d.b()).a(conversationIdTypeA);
            boolean zU = u(bajfVarA);
            z = true;
            if (!s(bajfVarA) && !zU) {
                z = false;
            }
            z2 = zU;
        } else {
            z = zA;
            bajfVarA = null;
        }
        if (bajfVarA == null || !z) {
            ((baxe) this.e.b()).P(messageCoreData);
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, conversationIdTypeA);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 519, "ProtocolChangeTombstoneManagerImpl.java")).q("Skip updateMessageWithSurroundingTombstones. Conversation not valid for protocolTombstones.");
            return;
        }
        ekrw ekrwVarE2 = b.e();
        ekrwVarE2.X(eksq.a, "BugleE2eeEtouffee");
        ekrd ekrdVar2 = (ekrd) ekrwVarE2;
        ekrdVar2.X(cqnc.b, messageCoreData.C());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 528, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithSurroundingTombstones");
        this.g.d("ProtocolChangeTombstoneManagerImpl#updateMessageWithSurroundingTombstones", new Runnable() { // from class: bwsw
            @Override // java.lang.Runnable
            public final void run() {
                bwtd bwtdVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (!z2) {
                    ((bwtj) bwtdVar.j.b()).b(5);
                    fcsu fcsuVar = bwtdVar.e;
                    MessageCoreData messageCoreDataW = ((baxe) fcsuVar.b()).w(messageCoreData2.C());
                    if (messageCoreDataW == null) {
                        ((baxe) fcsuVar.b()).P(messageCoreData2);
                        return;
                    }
                    messageCoreData2.C();
                    bwtdVar.d(messageCoreDataW);
                    bwtdVar.f(messageCoreData2, bwtd.a(messageCoreData2.cX(), messageCoreData2.cB()), bwss.a(messageCoreData2), messageCoreData2.o() - 1);
                    if (messageCoreData2.cI() && !messageCoreData2.J().ai() && messageCoreDataW.J().ai()) {
                        ekrw ekrwVarE3 = bwtd.b.e();
                        ekrwVarE3.X(eksq.a, "BugleE2eeEtouffee");
                        ekrd ekrdVar3 = (ekrd) ekrwVarE3;
                        ekrdVar3.X(cqnc.b, messageCoreData2.C());
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateReadStatusIfNeeded", 1249, "ProtocolChangeTombstoneManagerImpl.java")).q("Marked message as read");
                        messageCoreData2.bB(true);
                    }
                    ((baxe) fcsuVar.b()).P(messageCoreData2);
                    ekrw ekrwVarE4 = bwtd.b.e();
                    ekrwVarE4.X(eksq.a, "BugleE2eeEtouffee");
                    ekrd ekrdVar4 = (ekrd) ekrwVarE4;
                    ekrdVar4.X(cqnc.b, messageCoreData2.C());
                    ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstonesBody", 585, "ProtocolChangeTombstoneManagerImpl.java")).q("updated message");
                    return;
                }
                ((bwtj) bwtdVar.j.b()).a(5);
                bwsk bwskVar = (bwsk) bwtdVar.h.b();
                messageCoreData2.getClass();
                bwsk.a.m("Invoking updateMessageWithSurroundingTombstones");
                bwsg bwsgVar = (bwsg) bwskVar.f.b();
                MessageCoreData messageCoreDataW2 = ((baxe) bwsgVar.b.b()).w(messageCoreData2.C());
                if (messageCoreDataW2 == null) {
                    ((bwtl) bwsgVar.c.b()).c(messageCoreData2);
                    return;
                }
                fcsu fcsuVar2 = bwsgVar.d;
                ((bwtf) fcsuVar2.b()).b(messageCoreDataW2);
                fctc fctcVar = bwtu.a;
                bwtu bwtuVarA = bwtt.a(bwsm.b(messageCoreData2));
                if (bwtuVarA != null) {
                    ((bwtf) fcsuVar2.b()).a(messageCoreData2, bwtuVarA, messageCoreData2.o() - 1);
                }
                fcsu fcsuVar3 = bwsgVar.c;
                if (messageCoreData2.cI() && !messageCoreData2.J().ai() && messageCoreDataW2.J().ai()) {
                    cqbd cqbdVarC = bwtl.a.c();
                    cqbdVarC.A("messageId", messageCoreData2.C());
                    cqbdVarC.I("Marked message as read");
                    cqbdVarC.r();
                    messageCoreData2.bB(true);
                }
                ((bwtl) fcsuVar3.b()).c(messageCoreData2);
            }
        });
    }

    @Override // defpackage.bydb
    public final void j(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData) {
        ((bwtj) this.j.b()).b(4);
        i(messageCoreData);
        this.g.d("ProtocolChangeTombstoneManagerImpl#updateTombstonesAfterMessageMove", new Runnable() { // from class: bwsu
            @Override // java.lang.Runnable
            public final void run() {
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                ConversationIdType conversationIdType2 = conversationIdType;
                if (conversationIdTypeA.equals(conversationIdType2)) {
                    return;
                }
                bwtd bwtdVar = this.a;
                MessageCoreData messageCoreDataP = ((baxe) bwtdVar.e.b()).p(conversationIdType2);
                if (messageCoreDataP == null || !baui.d(messageCoreDataP.k())) {
                    return;
                }
                if (((appm) bwtdVar.k.b()).a()) {
                    bwtdVar.h(messageCoreDataP, bmsp.q);
                }
                ((cdww) bwtdVar.f.b()).a(messageCoreDataP.C());
            }
        });
    }

    @Override // defpackage.bydb
    public final void k(List list) {
        if (bwbt.a()) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateTombstonesBeforeDelete", 408, "ProtocolChangeTombstoneManagerImpl.java")).q("updateTombstonesBeforeDelete");
            final MessageCoreData messageCoreData = (MessageCoreData) Collections.max(list, Comparator.CC.comparing(new Function() { // from class: bwta
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((MessageCoreData) obj).o());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            this.g.d("ProtocolChangeTombstoneManagementImpl#updateTombstonesBeforeDelete", new Runnable() { // from class: bwtb
                @Override // java.lang.Runnable
                public final void run() {
                    bwtd bwtdVar = this.a;
                    axgh axghVar = (axgh) bwtdVar.d.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bajf bajfVarA = axghVar.a(messageCoreData2.A());
                    if (bajfVarA == null || !bajfVarA.Q() || bajfVarA.E() != 2) {
                        ((bwtj) bwtdVar.j.b()).b(2);
                        bwtdVar.d(messageCoreData2);
                        return;
                    }
                    ((bwtj) bwtdVar.j.b()).a(2);
                    bwsk bwskVar = (bwsk) bwtdVar.h.b();
                    messageCoreData2.getClass();
                    bwsk.a.m("Invoking updateTombstonesBeforeDelete");
                    ((bwtf) bwskVar.e.b()).b(messageCoreData2);
                }
            });
        }
    }

    @Override // defpackage.bydb
    public final void l(final MessageCoreData messageCoreData) {
        if (bwbt.a()) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateTombstonesBeforeResend", 447, "ProtocolChangeTombstoneManagerImpl.java")).q("updateTombstonesBeforeResend");
            this.g.d("ProtocolChangeTombstoneManagerImpl#updateTombstonesBeforeResend", new Runnable() { // from class: bwsz
                @Override // java.lang.Runnable
                public final void run() {
                    bwtd bwtdVar = this.a;
                    axgh axghVar = (axgh) bwtdVar.d.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bajf bajfVarA = axghVar.a(messageCoreData2.A());
                    if (bajfVarA == null || !bajfVarA.Q() || bajfVarA.E() != 2) {
                        ((bwtj) bwtdVar.j.b()).b(3);
                        bwtdVar.d(messageCoreData2);
                    } else {
                        ((bwtj) bwtdVar.j.b()).a(3);
                        bwsk bwskVar = (bwsk) bwtdVar.h.b();
                        bwsk.a.m("Invoking updateTombstonesBeforeResend");
                        ((bwtf) bwskVar.e.b()).b(messageCoreData2);
                    }
                }
            });
        }
    }

    @Override // defpackage.bydb
    public final boolean n(final MessageCoreData messageCoreData, final brdu brduVar, final Optional optional) {
        bajf bajfVarA = ((axgh) this.d.b()).a(messageCoreData.A());
        if (u(bajfVarA)) {
            ((bwtj) this.j.b()).a(6);
            final bwsk bwskVar = (bwsk) this.h.b();
            messageCoreData.getClass();
            cqbd cqbdVarA = bwsk.a.a();
            cqbdVarA.I("updateMessageWithBuilderAndSurroundingTombstones");
            cqbdVarA.A("messageId", messageCoreData.C());
            cqbdVarA.r();
            Object objC = ((dqsn) bwskVar.b.b()).c("GroupProtocolChangeTombstoneManagerDelegate#updateMessageWithBuilderAndSurroundingTombstones", new ejxr() { // from class: bwsj
                @Override // defpackage.ejxr
                public final Object get() {
                    bwsg bwsgVar = (bwsg) bwskVar.f.b();
                    baxe baxeVar = (baxe) bwsgVar.b.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    MessageCoreData messageCoreDataW = baxeVar.w(messageCoreData2.C());
                    brdu brduVar2 = brduVar;
                    boolean zV = false;
                    if (messageCoreDataW != null) {
                        ((bwtf) bwsgVar.d.b()).b(messageCoreDataW);
                        long jO = messageCoreData2.o();
                        try {
                            jO = brduVar2.c();
                        } catch (RuntimeException e) {
                            bwsg.a.s("receivedTimestamp not in builder, using existing receivedTimestamp", e);
                        }
                        fctc fctcVar = bwtu.a;
                        bwtu bwtuVarA = bwtt.a(bwsm.b(messageCoreData2));
                        if (bwtuVarA != null) {
                            ((bwtf) bwsgVar.d.b()).a(messageCoreData2, bwtuVarA, (-1) + jO);
                            bwtl bwtlVar = (bwtl) bwsgVar.c.b();
                            cqce cqceVar = bwtl.a;
                            cqbd cqbdVarA2 = cqceVar.a();
                            cqbdVarA2.I("updated message");
                            cqbdVarA2.A("messageId", messageCoreData2.C());
                            cqbdVarA2.r();
                            if (MessageData.cU(brduVar2.a())) {
                                Optional optional2 = optional;
                                ajqy ajqyVarQ = ajrb.q(brduVar2, Optional.of(cqceVar));
                                ajqyVarQ.c(messageCoreData2.C());
                                ajqyVarQ.i(Instant.ofEpochMilli(jO));
                                ((ajqm) ajqyVarQ).f = optional2;
                                zV = ((ajrc) bwtlVar.d.b()).d(ajqyVarQ.a());
                            } else {
                                zV = ((baxe) bwtlVar.b.b()).V(messageCoreData2.A(), messageCoreData2.C(), brduVar2);
                            }
                        }
                    }
                    return Boolean.valueOf(zV);
                }
            });
            objC.getClass();
            return ((Boolean) objC).booleanValue();
        }
        if (bajfVarA != null && bwbt.a() && s(bajfVarA)) {
            ((bwtj) this.j.b()).b(6);
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithBuilderAndSurroundingTombstones", 629, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithBuilderAndSurroundingTombstones");
            return ((Boolean) this.g.c("ProtocolChangeTombstoneManagerImpl#updateMessageWithBuilderAndSurroundingTombstones", new ejxr() { // from class: bwsv
                @Override // defpackage.ejxr
                public final Object get() {
                    bwtd bwtdVar = this.a;
                    fcsu fcsuVar = bwtdVar.e;
                    baxe baxeVar = (baxe) fcsuVar.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    MessageCoreData messageCoreDataW = baxeVar.w(messageCoreData2.C());
                    if (messageCoreDataW == null) {
                        return false;
                    }
                    brdu brduVar2 = brduVar;
                    int iA = bwtd.a(messageCoreData2.cX(), messageCoreData2.cB());
                    bwtdVar.d(messageCoreDataW);
                    cqce cqceVar = bwtd.a;
                    long jA = byda.a(messageCoreData2, brduVar2, cqceVar);
                    bwtdVar.f(messageCoreData2, iA, bwss.a(messageCoreData2), messageCoreData2.o() - 1);
                    if (!MessageData.cU(brduVar2.a())) {
                        return Boolean.valueOf(((baxe) fcsuVar.b()).V(messageCoreData2.A(), messageCoreData2.C(), brduVar2));
                    }
                    Optional optional2 = optional;
                    ajqy ajqyVarQ = ajrb.q(brduVar2, Optional.of(cqceVar));
                    ajqyVarQ.c(messageCoreData2.C());
                    ajqyVarQ.i(Instant.ofEpochMilli(jA));
                    ((ajqm) ajqyVarQ).f = optional2;
                    return Boolean.valueOf(((ajrc) bwtdVar.i.b()).d(ajqyVarQ.a()));
                }
            })).booleanValue();
        }
        if (!MessageData.cU(messageCoreData.k())) {
            return ((baxe) this.e.b()).V(messageCoreData.A(), messageCoreData.C(), brduVar);
        }
        ajrc ajrcVar = (ajrc) this.i.b();
        cqce cqceVar = a;
        ajqy ajqyVarQ = ajrb.q(brduVar, Optional.of(cqceVar));
        ajqyVarQ.c(messageCoreData.C());
        ajqyVarQ.i(Instant.ofEpochMilli(byda.a(messageCoreData, brduVar, cqceVar)));
        ((ajqm) ajqyVarQ).f = optional;
        return ajrcVar.d(ajqyVarQ.a());
    }

    @Override // defpackage.bydb
    public final eiju o(final ConversationIdType conversationIdType, alqm alqmVar, boolean z, final int i) {
        if (t(false, z, alqmVar)) {
            return eijx.g(new Callable() { // from class: bwst
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final bwtd bwtdVar = this.a;
                    ((bwtj) bwtdVar.j.b()).b(1);
                    ekrw ekrwVarE = bwtd.b.e();
                    ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
                    ekrd ekrdVar = (ekrd) ekrwVarE;
                    ekrz ekrzVar = cqnc.s;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    ekrdVar.X(ekrzVar, conversationIdType2);
                    ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", 191, "ProtocolChangeTombstoneManagerImpl.java");
                    final int i2 = i;
                    ekrdVar2.r("insertProtocolTombstoneIfDraftTypeChanged, with draftMessageType: %d", i2);
                    bwtdVar.g.d("ProtocolChangeTombstoneManagerImpl#insertProtocolTombstoneIfDraftTypeChanged", new Runnable() { // from class: bwsx
                        /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 598
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bwsx.run():void");
                        }
                    });
                    return null;
                }
            }, this.q);
        }
        ekrw ekrwVarE = b.e();
        ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", 176, "ProtocolChangeTombstoneManagerImpl.java")).H("Skip insert protocol tombstone. Conversation not valid for protocolTombstones. isGroup: %b, hasBot: %b", false, z);
        return eijx.e(null);
    }
}
