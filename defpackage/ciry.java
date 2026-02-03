package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciry extends cayv {
    public static final cqce a = cqce.g("BugleDataModel", "ProcessRcsGroupNotifyHandler");
    public final cicm b;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final cogw f;
    public final byeb g;
    public final bxlc h;
    public final ains i;
    public final fcsu j;
    public final cikj k;
    private final dqsn l;
    private final fcsu m;
    private final bxkp n;
    private final bbdl o;

    public ciry(eosc eoscVar, eosc eoscVar2, cicm cicmVar, dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, bxkp bxkpVar, byeb byebVar, bbdl bbdlVar, cikj cikjVar, bxlc bxlcVar, ains ainsVar, fcsu fcsuVar3) {
        this.c = eoscVar;
        this.d = eoscVar2;
        this.b = cicmVar;
        this.l = dqsnVar;
        this.m = fcsuVar;
        this.e = fcsuVar2;
        this.f = cogwVar;
        this.n = bxkpVar;
        this.g = byebVar;
        this.o = bbdlVar;
        this.k = cikjVar;
        this.h = bxlcVar;
        this.i = ainsVar;
        this.j = fcsuVar3;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ProcessRcsGroupNotifyHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cisa.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cisa cisaVar = (cisa) evuhVar;
        return eijx.g(new Callable() { // from class: cirw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cisa cisaVar2 = cisaVar;
                String str = cisaVar2.c;
                String str2 = cisaVar2.d;
                cicq cicqVarW = cicr.w();
                cicqVarW.j(false);
                cicqVarW.q(true);
                cicqVarW.w(emaf.GROUP_NOTIFICATION_VANILLA_RCS);
                cicqVarW.p(false);
                cicqVarW.u(str);
                cicqVarW.s(str2);
                cicqVarW.n(cisaVar2.e);
                cpeb cpebVarC = this.a.b.c(cicqVarW.D());
                if (cpebVarC != null) {
                    return Optional.of(cpebVarC);
                }
                ciry.a.n("Conversation not found for incoming RCS group NOTIFY");
                return Optional.empty();
            }
        }, this.d).i(new eooz() { // from class: ciro
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(cbcw.k());
                }
                final cisa cisaVar2 = cisaVar;
                final ciry ciryVar = this.a;
                final cpeb cpebVar = (cpeb) optional.get();
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                final ConversationIdType conversationIdTypeA = cpebVar.a();
                final String str = cisaVar2.e;
                final boolean z = 1 == (cisaVar2.b & 1);
                eiju eijuVarE = eijx.e(conversationIdTypeA);
                final cikj cikjVar = ciryVar.k;
                final chwq chwqVar = cikjVar.b;
                chwqVar.getClass();
                ejvr ejvrVar = new ejvr() { // from class: cikf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return chwqVar.o((ConversationIdType) obj2);
                    }
                };
                eosd eosdVar = cikjVar.d;
                final eiju eijuVarH = eijuVarE.h(ejvrVar, eosdVar);
                final eiju eijuVarG = eijx.g(new Callable() { // from class: cikg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bojh bojhVarR = ((bakt) cikjVar.c.b()).r(conversationIdTypeA);
                        bojhVarR.getClass();
                        return Boolean.valueOf(cikv.a(str, bojhVarR.Y(), bojhVarR.H()));
                    }
                }, eosdVar);
                eijw eijwVarK = eijx.k(eijuVarH, eijuVarG);
                eooy eooyVar = new eooy() { // from class: cikh
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final String str2 = (String) eork.q(eijuVarH);
                        final cikk cikkVar = new cikk(((Boolean) eork.q(eijuVarG)).booleanValue(), z);
                        Callable callable = new Callable() { // from class: cikt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                emaa emaaVar = (emaa) emab.a.createBuilder();
                                emaaVar.copyOnWrite();
                                emab emabVar = (emab) emaaVar.instance;
                                emabVar.b |= 2;
                                cikk cikkVar2 = (cikk) cikkVar;
                                emabVar.d = cikkVar2.a;
                                emaaVar.copyOnWrite();
                                emab emabVar2 = (emab) emaaVar.instance;
                                emabVar2.b |= 1;
                                emabVar2.c = cikkVar2.b;
                                return (emab) emaaVar.build();
                            }
                        };
                        final ciku cikuVar = cikjVar.f;
                        eosd eosdVar2 = cikuVar.f;
                        return eijx.g(callable, eosdVar2).i(new eooz() { // from class: cikn
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final emab emabVar = (emab) obj2;
                                final ciku cikuVar2 = cikuVar;
                                Callable callable2 = new Callable() { // from class: cikq
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return Integer.valueOf(cikuVar2.b.a(chvn.t));
                                    }
                                };
                                eosd eosdVar3 = cikuVar2.e;
                                eiju eijuVarG2 = eijx.g(callable2, eosdVar3);
                                final aimw aimwVar = cikuVar2.c;
                                aimwVar.getClass();
                                eiju eijuVarH2 = eijuVarG2.h(new ejvr() { // from class: cikr
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        return aimwVar.a(((Integer) obj3).intValue());
                                    }
                                }, eosdVar3);
                                final String str3 = str2;
                                ejvr ejvrVar2 = new ejvr() { // from class: ciks
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        elpy elpyVar = (elpy) obj3;
                                        ellv ellvVar = (ellv) elmc.b.createBuilder();
                                        ellvVar.copyOnWrite();
                                        elmc elmcVar = (elmc) ellvVar.instance;
                                        elmcVar.d = 7;
                                        elmcVar.c |= 1;
                                        ellvVar.copyOnWrite();
                                        elmc elmcVar2 = (elmc) ellvVar.instance;
                                        elpyVar.getClass();
                                        elmcVar2.g = elpyVar;
                                        elmcVar2.c |= 8;
                                        enwr enwrVarD = ((chza) ((cqbm) cikuVar2.d.b()).a()).d();
                                        ellvVar.copyOnWrite();
                                        elmc elmcVar3 = (elmc) ellvVar.instance;
                                        elmcVar3.h = enwrVarD.N;
                                        elmcVar3.c |= 16;
                                        ellvVar.copyOnWrite();
                                        elmc elmcVar4 = (elmc) ellvVar.instance;
                                        String str4 = str3;
                                        str4.getClass();
                                        elmcVar4.c |= 64;
                                        elmcVar4.j = str4;
                                        return ellvVar;
                                    }
                                };
                                eosd eosdVar4 = cikuVar2.f;
                                return eijuVarH2.h(ejvrVar2, eosdVar4).h(new ejvr() { // from class: cikp
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ellv ellvVar = (ellv) obj3;
                                        ellvVar.copyOnWrite();
                                        elmc elmcVar = (elmc) ellvVar.instance;
                                        evsy evsyVar = elmc.a;
                                        emab emabVar2 = emabVar;
                                        emabVar2.getClass();
                                        elmcVar.k = emabVar2;
                                        elmcVar.c |= 256;
                                        elmc elmcVar2 = (elmc) ellvVar.build();
                                        ellg ellgVar = (ellg) ellh.a.createBuilder();
                                        ellf ellfVar = ellf.BUGLE_GROUP;
                                        ellgVar.copyOnWrite();
                                        ellh ellhVar = (ellh) ellgVar.instance;
                                        ellhVar.j = ellfVar.f11do;
                                        ellhVar.b |= 1;
                                        ellgVar.copyOnWrite();
                                        ellh ellhVar2 = (ellh) ellgVar.instance;
                                        elmcVar2.getClass();
                                        ellhVar2.B = elmcVar2;
                                        ellhVar2.b |= 4194304;
                                        return (ellh) ellgVar.build();
                                    }
                                }, eosdVar4);
                            }
                        }, eosdVar2).i(new eooz() { // from class: ciko
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final ellh ellhVar = (ellh) obj2;
                                final ciku cikuVar2 = cikuVar;
                                return eijx.f(new Runnable() { // from class: cikm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((aill) cikuVar2.a.b()).j((ellg) ellhVar.toBuilder());
                                    }
                                }, cikuVar2.e);
                            }
                        }, eosdVar2);
                    }
                };
                eosd eosdVar2 = cikjVar.e;
                listenableFutureArr[0] = eijwVarK.b(eooyVar, eosdVar2).e(Exception.class, new ejvr() { // from class: ciki
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cikj.a.s("Failed to log group rename notify event.", (Exception) obj2);
                        return null;
                    }
                }, eosdVar2);
                Callable callable = new Callable() { // from class: cirs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        botb botbVarE = botm.e();
                        botbVarE.A("getConversationData");
                        botbVarE.c(new bopq[0]);
                        final cpeb cpebVar2 = cpebVar;
                        botbVarE.i(new Function() { // from class: cirv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar = (botl) obj2;
                                botlVar.r(cpebVar2.a());
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return (bojh) botbVarE.b().l();
                    }
                };
                eosc eoscVar = ciryVar.d;
                listenableFutureArr[1] = eijx.g(callable, eoscVar).h(new ejvr() { // from class: cirp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bojh bojhVar = (bojh) obj2;
                        String[] strArr = botm.a;
                        bote boteVar = new bote();
                        boteVar.ap("updateGroupMetadata");
                        final cpeb cpebVar2 = cpebVar;
                        boteVar.ad(new Function() { // from class: cirr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                botl botlVar = (botl) obj3;
                                botlVar.r(cpebVar2.a());
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boteVar.A(0);
                        boteVar.x(avoe.NONE);
                        boteVar.b().e();
                        ciry ciryVar2 = ciryVar;
                        ciryVar2.h.d(cpebVar2.a());
                        if (bojhVar == null) {
                            return null;
                        }
                        if (bojhVar.n() == 4) {
                            ciryVar2.i.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Enabled.Counts");
                            return null;
                        }
                        if (bojhVar.n() != 7) {
                            return null;
                        }
                        ciryVar2.i.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Enabled.Counts");
                        return null;
                    }
                }, eoscVar);
                listenableFutureArr[2] = eijx.f(new Runnable() { // from class: ciru
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ciry ciryVar2 = ciryVar;
                        fcsu fcsuVar = ciryVar2.e;
                        cpeb cpebVar2 = cpebVar;
                        ConversationIdType conversationIdTypeA2 = cpebVar2.a();
                        evtg<cirm> evtgVar = cisaVar2.f;
                        List listK = ((bakt) fcsuVar.b()).K(conversationIdTypeA2);
                        HashMap map = new HashMap();
                        for (cirm cirmVar : evtgVar) {
                            map.put(cssr.b(cirmVar.b), cirmVar);
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            String strT = ((ParticipantsTable.BindData) it.next()).T();
                            if (ejwk.c(strT) || map.containsKey(strT)) {
                                cirm cirmVar2 = (cirm) map.remove(strT);
                                if (cirmVar2 != null && cirmVar2.d) {
                                    arrayList.add(cirmVar2);
                                }
                            } else {
                                cirl cirlVar = (cirl) cirm.a.createBuilder();
                                cirlVar.copyOnWrite();
                                cirm cirmVar3 = (cirm) cirlVar.instance;
                                strT.getClass();
                                cirmVar3.b = strT;
                                arrayList.add((cirm) cirlVar.build());
                            }
                        }
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        for (cirm cirmVar4 : map.values()) {
                            if (!cirmVar4.d) {
                                ekfwVar.h(cirmVar4);
                            }
                        }
                        cirk cirkVar = new cirk(ekgb.n(arrayList), ekfwVar.g());
                        long epochMilli = ciryVar2.f.f().toEpochMilli();
                        HashSet hashSet = new HashSet();
                        ekgb ekgbVar = cirkVar.b;
                        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
                            ciryVar2.k(cpebVar2, 50020, epochMilli, (cirm) ekgbVar.get(i2), hashSet);
                        }
                        ekgb ekgbVar2 = cirkVar.a;
                        int size = ekgbVar2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ciryVar2.k(cpebVar2, 50021, epochMilli, (cirm) ekgbVar2.get(i3), hashSet);
                        }
                    }
                }, eoscVar);
                return eijx.k(listenableFutureArr).b(new eooy() { // from class: cirq
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final cpeb cpebVar2 = cpebVar;
                        final cisa cisaVar3 = cisaVar2;
                        return eijx.g(new Callable() { // from class: cirt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cish cishVar;
                                ConversationIdType conversationIdTypeA2 = cpebVar2.a();
                                cisa cisaVar4 = cisaVar3;
                                String str2 = cisaVar4.e;
                                if ((cisaVar4.b & 1) != 0) {
                                    cishVar = cisaVar4.g;
                                    if (cishVar == null) {
                                        cishVar = cish.a;
                                    }
                                } else {
                                    cishVar = null;
                                }
                                cili ciliVar = (cili) cilj.a.createBuilder();
                                ciliVar.copyOnWrite();
                                cilj ciljVar = (cilj) ciliVar.instance;
                                str2.getClass();
                                ciljVar.d = str2;
                                String strA = conversationIdTypeA2.a();
                                ciliVar.copyOnWrite();
                                cilj ciljVar2 = (cilj) ciliVar.instance;
                                strA.getClass();
                                ciljVar2.h = strA;
                                if (cishVar != null) {
                                    if ((cishVar.b & 1) != 0) {
                                        evvp evvpVar = cishVar.c;
                                        if (evvpVar == null) {
                                            evvpVar = evvp.a;
                                        }
                                        ciliVar.copyOnWrite();
                                        cilj ciljVar3 = (cilj) ciliVar.instance;
                                        evvpVar.getClass();
                                        ciljVar3.f = evvpVar;
                                        ciljVar3.b |= 1;
                                    }
                                    String str3 = cishVar.d;
                                    ciliVar.copyOnWrite();
                                    cilj ciljVar4 = (cilj) ciliVar.instance;
                                    str3.getClass();
                                    ciljVar4.g = str3;
                                }
                                cbcu cbcuVarF = cbcu.f("update_rcs_group_name", ciliVar.build());
                                cbcv cbcvVarH = cbcw.h();
                                cbcvVarH.b(true);
                                cbcvVarH.c(false);
                                ((caxp) cbcvVarH).a = ekgb.r(cbcuVarF);
                                return cbcvVarH.a();
                            }
                        }, ciryVar.d);
                    }
                }, ciryVar.c);
            }
        }, this.c);
    }

    public final void k(final cpeb cpebVar, final int i, final long j, final cirm cirmVar, Set set) {
        String str = cirmVar.b;
        String str2 = cirmVar.c;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        brvp brvpVarF = bbbd.f(str);
        final int i2 = i != 50020 ? BasePaymentResult.ERROR_REQUEST_TIMEOUT : BasePaymentResult.ERROR_REQUEST_FAILED;
        final axcy axcyVarD = this.o.d();
        brvp brvpVarF2 = bbbd.f(str2);
        brvpVarF2.v(((bbca) this.m.b()).j(brvpVarF2));
        if (!set.contains(brvpVarF.g)) {
            this.n.e(brvpVarF, 4);
            set.add(brvpVarF.g);
        }
        if (!set.contains(brvpVarF2.g)) {
            this.n.e(brvpVarF2, 4);
            set.add(brvpVarF2.g);
        }
        final ParticipantsTable.BindData bindDataA = brvpVarF.a();
        final ParticipantsTable.BindData bindDataA2 = brvpVarF2.a();
        this.l.d("insertTombstoneForUser#insertTombstoneForUser", new Runnable() { // from class: cirn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zAn;
                int i3 = i;
                ParticipantsTable.BindData bindData = bindDataA;
                ParticipantsTable.BindData bindData2 = bindDataA2;
                ciry ciryVar = this.a;
                cpeb cpebVar2 = cpebVar;
                if (i3 == 50021) {
                    zAn = ((bakt) ciryVar.e.b()).ai(bindData, cpebVar2.a(), true);
                    if (zAn) {
                        cqbd cqbdVarA = ciry.a.a();
                        cqbdVarA.j(((bbcc) ciryVar.j.b()).a(bindData, true));
                        cqbdVarA.I("left");
                        cqbdVarA.c(cpebVar2.a());
                        cqbdVarA.r();
                    } else {
                        cqbd cqbdVarB = ciry.a.b();
                        cqbdVarB.I("Failed to remove");
                        cqbdVarB.j(((bbcc) ciryVar.j.b()).a(bindData, true));
                        cqbdVarB.I("from");
                        cqbdVarB.c(cpebVar2.a());
                        cqbdVarB.r();
                    }
                } else {
                    zAn = ((bakt) ciryVar.e.b()).an(bindData, cpebVar2.a());
                    if (zAn) {
                        cqbd cqbdVarA2 = ciry.a.a();
                        fcsu fcsuVar = ciryVar.j;
                        cqbdVarA2.j(((bbcc) fcsuVar.b()).a(bindData2, true));
                        cqbdVarA2.I("added");
                        cqbdVarA2.j(((bbcc) fcsuVar.b()).a(bindData, true));
                        cqbdVarA2.I("to");
                        cqbdVarA2.c(cpebVar2.a());
                        cqbdVarA2.r();
                    } else {
                        cqbd cqbdVarB2 = ciry.a.b();
                        cqbdVarB2.I("Failed to add");
                        fcsu fcsuVar2 = ciryVar.j;
                        cqbdVarB2.j(((bbcc) fcsuVar2.b()).a(bindData, true));
                        cqbdVarB2.I("referred by");
                        cqbdVarB2.j(((bbcc) fcsuVar2.b()).a(bindData2, true));
                        cqbdVarB2.I("to");
                        cqbdVarB2.c(cpebVar2.a());
                        cqbdVarB2.r();
                    }
                }
                cirm cirmVar2 = cirmVar;
                if (zAn && !cirmVar2.d) {
                    long j2 = j;
                    int i4 = i2;
                    axcy axcyVar = axcyVarD;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bindData);
                    ciryVar.g.k(Optional.empty(), cpebVar2.a(), axcyVar, bindData2, arrayList, i4, j2, -1L);
                    return;
                }
                if (cirmVar2.d) {
                    cqbd cqbdVarA3 = ciry.a.a();
                    cqbdVarA3.I("Not inserting tombstone because of self participant removal. This will happen in the scenario where the conversation is recovered from Telephony and enabled again.");
                    cqbdVarA3.r();
                } else {
                    cqbd cqbdVarB3 = ciry.a.b();
                    cqbdVarB3.I("Not inserting tombstone because of unsuccessful add/remove of participant.");
                    cqbdVarB3.r();
                }
            }
        });
    }
}
