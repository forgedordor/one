package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilg {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final Context b;
    public final eosc c;
    public final fcsu d;
    public final cmqj e;
    public final fcsu f;
    public final bxlc g;
    public final cicm h;
    public final ciuv i;
    public final fcsu j;
    public final fcsu k;
    public final ardl l;
    private final bafa m;
    private final fcsu n;

    public cilg(Context context, eosc eoscVar, fcsu fcsuVar, cmqj cmqjVar, fcsu fcsuVar2, bxlc bxlcVar, bafa bafaVar, cicm cicmVar, ciuv ciuvVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ardl ardlVar) {
        this.b = context;
        this.c = eoscVar;
        this.d = fcsuVar;
        this.e = cmqjVar;
        this.f = fcsuVar2;
        this.g = bxlcVar;
        this.m = bafaVar;
        this.h = cicmVar;
        this.i = ciuvVar;
        this.j = fcsuVar3;
        this.n = fcsuVar4;
        this.k = fcsuVar5;
        this.l = ardlVar;
    }

    public static ParticipantsTable.BindData b(final String str) {
        if (ejwk.c(str)) {
            return null;
        }
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getOriginatorBindData");
        bsboVarE.h(new Function() { // from class: cila
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                eksp ekspVar = cilg.a;
                bsbxVar.r(str);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.d(new bsbl(ParticipantsTable.c.d, false));
        bsboVarE.y(1);
        brzj brzjVar = (brzj) bsboVarE.b().p();
        try {
            ParticipantsTable.BindData bindData = brzjVar.moveToFirst() ? (ParticipantsTable.BindData) brzjVar.cQ() : null;
            brzjVar.close();
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "getOriginatorBindData", 556, "RcsGroupNameUpdater.java")).t("Originator MSISDN participant subIds: %s", new ekri() { // from class: cilb
                @Override // defpackage.ekri
                public final Object a() {
                    eksp ekspVar = cilg.a;
                    bsbo bsboVarE2 = ParticipantsTable.e();
                    bsboVarE2.A("getLoggableOriginatorParticipantSubIds");
                    final String str2 = str;
                    bsboVarE2.h(new Function() { // from class: cikz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar = (bsbx) obj;
                            eksp ekspVar2 = cilg.a;
                            bsbxVar.r(str2);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsboVarE2.d(new bsbl(ParticipantsTable.c.d, false));
                    return bsboVarE2.b().g();
                }
            });
            return bindData;
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bote a(String str, ConversationIdType conversationIdType) {
        if (!str.isEmpty()) {
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.al();
            boteVar.ap("getUpdateValues-conversations2");
            boteVar.C(str);
            boteVar.D(bvdp.NAME_IS_MANUAL);
            return boteVar;
        }
        bbfo bbfoVarA = ((bbfq) this.n.b()).a(ekgb.n(((bakt) this.d.b()).K(conversationIdType)));
        String[] strArr2 = botm.a;
        bote boteVar2 = new bote();
        boteVar2.ap("getUpdateValues-conversations1");
        boteVar2.C(this.m.a(bbfoVarA));
        boteVar2.D(bvdp.NAME_IS_AUTOMATIC);
        return boteVar2;
    }

    public final eiju c(final cilj ciljVar) {
        return eijx.h(new eooy() { // from class: cikx
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ConversationIdType conversationIdTypeA;
                long jA;
                bote boteVarA;
                String strD;
                final cilj ciljVar2 = ciljVar;
                if (ciljVar2.h.isEmpty() && ciljVar2.c.isEmpty()) {
                    ((eksl) ((eksl) cilg.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 292, "RcsGroupNameUpdater.java")).q("No conversation ID or group ID provided when updating the group name");
                } else {
                    evvp evvpVar = ciljVar2.f;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    if (evxc.a(evvpVar) >= 0) {
                        String str = ciljVar2.d;
                        evvp evvpVar2 = ciljVar2.f;
                        if (evvpVar2 == null) {
                            evvpVar2 = evvp.a;
                        }
                        final cilg cilgVar = this.a;
                        if (ciljVar2.h.isEmpty()) {
                            String str2 = ciljVar2.c;
                            long j = ciljVar2.e;
                            cicq cicqVarW = cicr.w();
                            cicqVarW.j(false);
                            cicqVarW.p(false);
                            cicqVarW.q(true);
                            cicqVarW.w(emaf.GROUP_NOTIFICATION);
                            if (!str2.isEmpty()) {
                                cicqVarW.u(str2);
                            }
                            if (j != -1) {
                                cicqVarW.z(j);
                            }
                            conversationIdTypeA = cilgVar.h.a(cicqVarW.D());
                        } else {
                            conversationIdTypeA = barn.b(ciljVar2.h);
                        }
                        if (conversationIdTypeA.b()) {
                            eksl ekslVar = (eksl) cilg.a.j();
                            ekslVar.X(cqnc.s, conversationIdTypeA);
                            ekslVar.X(cqnc.N, ciljVar2.c);
                            ekslVar.X(cqnc.L, Long.valueOf(ciljVar2.e));
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 156, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation and thread id");
                            return eijx.e(cbcw.k());
                        }
                        botb botbVarE = botm.e();
                        botbVarE.A("getProjectedConversationData");
                        botbVarE.f(new Function() { // from class: cild
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bopp boppVar = (bopp) obj;
                                return cilgVar.l.a() ? new bopq[]{boppVar.b, boppVar.aa, boppVar.c, boppVar.d, boppVar.ae, boppVar.A, boppVar.ao, boppVar.N} : new bopq[]{boppVar.b, boppVar.aa, boppVar.c, boppVar.d, boppVar.ae, boppVar.A};
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        botbVarE.i(new Function() { // from class: cile
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                botl botlVar = (botl) obj;
                                eksp ekspVar = cilg.a;
                                botlVar.r(conversationIdTypeA);
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bojh bojhVar = (bojh) botbVarE.b().l();
                        if (bojhVar == null) {
                            eksl ekslVar2 = (eksl) cilg.a.j();
                            ekslVar2.X(cqnc.s, conversationIdTypeA);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 166, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation data");
                            return eijx.e(cbcw.k());
                        }
                        final String strAe = bojhVar.ae();
                        if (strAe == null) {
                            eksl ekslVar3 = (eksl) cilg.a.j();
                            ekslVar3.X(cqnc.s, conversationIdTypeA);
                            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 174, "RcsGroupNameUpdater.java")).q("Conversation has null group ID");
                            return eijx.e(cbcw.k());
                        }
                        if (cikv.a(str, bojhVar.Y(), bojhVar.H())) {
                            long jW = bojhVar.w();
                            evvp evvpVar3 = evvp.a;
                            if (evvpVar3.equals(evvpVar2) || evxc.a(evvpVar2) >= jW) {
                                if (evvpVar3.equals(evvpVar2)) {
                                    boteVarA = cilgVar.a(str, conversationIdTypeA);
                                    jA = -1;
                                } else {
                                    jA = evxc.a(evvpVar2);
                                    boteVarA = cilgVar.a(str, conversationIdTypeA);
                                    int iIntValue = botm.g().intValue();
                                    int iIntValue2 = botm.g().intValue();
                                    if (iIntValue2 < 46050) {
                                        dqru.x("rcs_subject_change_timestamp_ms", iIntValue2);
                                    }
                                    if (iIntValue >= 46050) {
                                        boteVarA.a.put("rcs_subject_change_timestamp_ms", Long.valueOf(jA));
                                    }
                                }
                                cnqj cnqjVarN = bojhVar.N();
                                if (cnqjVarN.d()) {
                                    ekrw ekrwVarN = cilg.a.n();
                                    ekrwVarN.X(cqnc.s, conversationIdTypeA);
                                    ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 208, "RcsGroupNameUpdater.java")).q("Ignoring telephony group rename for empty thread id");
                                    strD = null;
                                } else {
                                    strD = cilgVar.e.D(cnqjVarN);
                                    if (strD == null) {
                                        eksl ekslVar4 = (eksl) cilg.a.j();
                                        ekslVar4.X(cqnc.u, cnqjVarN);
                                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 216, "RcsGroupNameUpdater.java")).q("Failed to retrieve recipient id for thread id");
                                        return eijx.e(cbcw.k());
                                    }
                                }
                                ejwl.b(ciljVar2.i > 0, "Invalid subscription Id while attempting group rename.");
                                final axcy axcyVarF = ((bbdl) cilgVar.j.b()).f(ciljVar2.i);
                                boolean z = (cilgVar.l.a() && ciljVar2.g.isEmpty() && (!bojhVar.P().isPresent() || bojhVar.n() == 4)) ? false : true;
                                ekrw ekrwVarN2 = cilg.a.n();
                                ekrwVarN2.X(cqnc.s, conversationIdTypeA);
                                ekrwVarN2.X(cqnc.u, cnqjVarN);
                                ekrwVarN2.X(cqnc.N, strAe);
                                ekrwVarN2.X(cill.a, strD);
                                ekrz ekrzVar = cill.b;
                                String strD2 = boteVarA.d();
                                strD2.getClass();
                                ekrwVarN2.X(ekrzVar, strD2);
                                ekrwVarN2.X(cill.c, boteVarA.c());
                                ekrwVarN2.X(cill.d, Long.valueOf(jA));
                                ekrwVarN2.X(cill.e, ciljVar2.g);
                                ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 238, "RcsGroupNameUpdater.java")).q("Updating conversation name");
                                SelfIdentityId selfIdentityIdC = aofa.c(bojhVar.T());
                                final bote boteVar = boteVarA;
                                final ConversationIdType conversationIdType = conversationIdTypeA;
                                final String str3 = strD;
                                final boolean z2 = z;
                                return (selfIdentityIdC == null ? eijx.e(Optional.empty()) : ((chtk) cilgVar.k.b()).d(selfIdentityIdC)).h(new ejvr() { // from class: cilc
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        String str4 = ciljVar2.g;
                                        cikw cikwVar = new cikw(conversationIdType, strAe, str3);
                                        String str5 = (String) ((Optional) obj).map(new Function() { // from class: ciky
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((aubq) obj2).d;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).orElse(null);
                                        bote boteVar2 = boteVar;
                                        boteVar2.d().getClass();
                                        if (TextUtils.isEmpty(str5)) {
                                            ((eksl) ((eksl) cilg.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 465, "RcsGroupNameUpdater.java")).q("Failed to retrieve the local MSISDN");
                                            return cbcw.m();
                                        }
                                        cilg cilgVar2 = cilgVar;
                                        bakt baktVar = (bakt) cilgVar2.d.b();
                                        final ConversationIdType conversationIdType2 = cikwVar.a;
                                        if (!baktVar.aj(conversationIdType2, boteVar2)) {
                                            ((eksl) ((eksl) cilg.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 471, "RcsGroupNameUpdater.java")).q("updateConversationRowIfExists failed when updating conversation name");
                                            return cbcw.k();
                                        }
                                        final String strD3 = boteVar2.d();
                                        strD3.getClass();
                                        bvdp bvdpVarC = boteVar2.c();
                                        String str6 = cikwVar.c;
                                        bvdp bvdpVar = bvdp.NAME_IS_AUTOMATIC;
                                        if (str6 != null) {
                                            ((eksl) cilg.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "onSuccessfulDatabaseUpdate", 507, "RcsGroupNameUpdater.java")).r("TelephonyManagerInterface updated %s rows when updating the canonical address", cilgVar2.e.c(cilgVar2.b.getContentResolver(), str6, cilgVar2.i.a(str5, cikwVar.b, bvdpVarC == bvdpVar ? "" : strD3)));
                                        }
                                        if (z2) {
                                            final axcy axcyVar = axcyVarF;
                                            if (bvdpVarC == bvdpVar) {
                                                final byeb byebVar = (byeb) cilgVar2.f.b();
                                                final ParticipantsTable.BindData bindDataB = cilg.b(str4);
                                                byebVar.j.d("TombstoneInserter#insertRcsGroupNameClearTombstone", new Runnable() { // from class: bydo
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ekgb ekgbVarR;
                                                        axcy axcyVar2 = axcyVar;
                                                        ParticipantsTable.BindData bindData = bindDataB;
                                                        Optional optionalEmpty = Optional.empty();
                                                        ParticipantsTable.BindData bindDataA = bindData != null ? bindData : axcyVar2.a();
                                                        if (bindData != null) {
                                                            ekgbVarR = ekgb.r(bindData);
                                                        } else {
                                                            int i = ekgb.d;
                                                            ekgbVarR = ekoe.a;
                                                        }
                                                        ekgb ekgbVar = ekgbVarR;
                                                        ConversationIdType conversationIdType3 = conversationIdType2;
                                                        byeb byebVar2 = byebVar;
                                                        byebVar2.l(optionalEmpty, conversationIdType3, axcyVar2, bindDataA, ekgbVar, 218, byebVar2.f.f().toEpochMilli(), -1L, null);
                                                    }
                                                });
                                            } else {
                                                final byeb byebVar2 = (byeb) cilgVar2.f.b();
                                                final ParticipantsTable.BindData bindDataB2 = cilg.b(str4);
                                                byebVar2.j.d("TombstoneInserter#insertRcsGroupRenameTombstone", new Runnable() { // from class: bydp
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ekgb ekgbVarR;
                                                        axcy axcyVar2 = axcyVar;
                                                        ParticipantsTable.BindData bindData = bindDataB2;
                                                        Optional optionalEmpty = Optional.empty();
                                                        ParticipantsTable.BindData bindDataA = bindData != null ? bindData : axcyVar2.a();
                                                        if (bindData != null) {
                                                            ekgbVarR = ekgb.r(bindData);
                                                        } else {
                                                            int i = ekgb.d;
                                                            ekgbVarR = ekoe.a;
                                                        }
                                                        ekgb ekgbVar = ekgbVarR;
                                                        String str7 = strD3;
                                                        ConversationIdType conversationIdType3 = conversationIdType2;
                                                        byeb byebVar3 = byebVar2;
                                                        byebVar3.l(optionalEmpty, conversationIdType3, axcyVar2, bindDataA, ekgbVar, 217, byebVar3.f.f().toEpochMilli(), -1L, str7);
                                                    }
                                                });
                                            }
                                        }
                                        cilgVar2.g.d(conversationIdType2);
                                        return cbcw.i();
                                    }
                                }, cilgVar.c);
                            }
                        }
                        ekrw ekrwVarN3 = cilg.a.n();
                        ekrwVarN3.X(cqnc.s, conversationIdTypeA);
                        ekrwVarN3.X(cill.b, str);
                        ekrwVarN3.X(cill.c, bojhVar.H());
                        ekrz ekrzVar2 = cill.d;
                        ekrwVarN3.X(ekrzVar2, Long.valueOf(evxc.a(evvpVar2)));
                        ekrwVarN3.X(ekrzVar2, Long.valueOf(bojhVar.w()));
                        ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 188, "RcsGroupNameUpdater.java")).q("No name update applicable");
                        return eijx.e(cbcw.i());
                    }
                    eksl ekslVar5 = (eksl) cilg.a.j();
                    ekslVar5.X(cqnc.r, ciljVar2.h);
                    ekslVar5.X(cqnc.N, ciljVar2.c);
                    ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 303, "RcsGroupNameUpdater.java")).q("Negative timestamp provided when updating the group name");
                }
                return eijx.e(cbcw.k());
            }
        }, this.c);
    }
}
