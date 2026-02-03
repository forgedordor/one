package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aill;
import defpackage.alqm;
import defpackage.alvr;
import defpackage.alvx;
import defpackage.avos;
import defpackage.ayji;
import defpackage.ayjj;
import defpackage.ayqd;
import defpackage.baqt;
import defpackage.bopr;
import defpackage.botb;
import defpackage.botm;
import defpackage.cczi;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cdww;
import defpackage.ciup;
import defpackage.ciur;
import defpackage.ciux;
import defpackage.cmot;
import defpackage.cmqf;
import defpackage.cnod;
import defpackage.cnqj;
import defpackage.cnqk;
import defpackage.cnwj;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.csq;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwk;
import defpackage.ejxr;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.ekif;
import defpackage.ekih;
import defpackage.ekno;
import defpackage.ekoj;
import defpackage.ekqg;
import defpackage.elgm;
import defpackage.ellf;
import defpackage.ellg;
import defpackage.ellh;
import defpackage.enqq;
import defpackage.eobf;
import defpackage.eobh;
import defpackage.eobi;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SyncTelephonyThreadsAction extends SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    public static final cqce a = cqce.g("BugleDataModel", "SyncTelephonyThreadsAction");
    static final cczv b = cdag.p(182829887);
    static final ejxr c = cdag.w(179796087, "query_rcs_group_telephony_data_on_demand");
    private static final ekih e;
    public final fcsu d;
    private final fcsu f;
    private final fcsu g;
    private final cmot h;
    private final fcsu i;
    private final fcsu j;
    private final ciux k;
    private final fcsu l;
    private final fcsu m;

    /* compiled from: PG */
    public interface SyncTelephonyThreadsActionInjector {
        ayjj il();
    }

    static {
        Comparator comparator = ekih.a;
        ekif ekifVar = new ekif(ekno.a);
        ekifVar.i(1, eobh.BUCKET_ZERO);
        ekifVar.i(2, eobh.BUCKET_1_TO_2);
        ekifVar.i(4, eobh.BUCKET_2_TO_4);
        ekifVar.i(8, eobh.BUCKET_4_TO_8);
        ekifVar.i(16, eobh.BUCKET_8_TO_16);
        ekifVar.i(32, eobh.BUCKET_16_TO_32);
        ekifVar.i(64, eobh.BUCKET_32_TO_64);
        ekifVar.i(128, eobh.BUCKET_64_TO_128);
        ekifVar.i(256, eobh.BUCKET_128_TO_256);
        ekifVar.i(512, eobh.BUCKET_256_TO_512);
        ekifVar.i(1024, eobh.BUCKET_512_TO_1024);
        ekifVar.i(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY), eobh.BUCKET_1024_OR_MORE);
        e = ekifVar.c();
        CREATOR = new ayji();
    }

    public SyncTelephonyThreadsAction(fcsu<cmqf> fcsuVar, fcsu<baqt> fcsuVar2, fcsu<cdww> fcsuVar3, cmot cmotVar, fcsu<cnod> fcsuVar4, fcsu<ayqd> fcsuVar5, ciux ciuxVar, fcsu<aill> fcsuVar6, fcsu<cnwj> fcsuVar7) {
        super(elgm.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = ciuxVar;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
    }

    private static eobh l(int i) {
        ekih ekihVar = e;
        ekqg ekqgVarListIterator = ekihVar.c.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Integer num = (Integer) ekqgVarListIterator.next();
            if (i < num.intValue()) {
                return (eobh) ekihVar.get(num);
            }
        }
        return eobh.UNKNOWN;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SyncTelephonyThreadsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncTelephonyThreads.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        ekgp ekgpVarC;
        boolean zEquals;
        Bundle bundle = null;
        if (((cnod) this.i.b()).d()) {
            a.p("Not starting SyncTelephonyThreadsAction because reverse telephony sync is running.");
            return null;
        }
        if (((Boolean) avos.a.e()).booleanValue()) {
            a.p("Not starting SyncTelephonyThreadsAction because BCM is used.");
            return null;
        }
        boolean z = false;
        boolean z2 = this.v.z("force_full_sync", false);
        cqce cqceVar = a;
        cqceVar.m("check and delete obsolete threads");
        eobf eobfVar = (eobf) eobi.a.createBuilder();
        eobfVar.copyOnWrite();
        eobi eobiVar = (eobi) eobfVar.instance;
        int i = 1;
        eobiVar.b |= 1;
        eobiVar.c = false;
        try {
            csq csqVar = new csq();
            botb botbVarE = botm.e();
            botbVarE.A("getObsoleteThreads");
            botbVarE.i(new Function() { // from class: ayjg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    cqce cqceVar2 = SyncTelephonyThreadsAction.a;
                    botlVar.ap(new dqpj("conversations.sms_thread_id", 7, Long.valueOf(cnqk.a(new cnqj(0L)))));
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.f(new Function() { // from class: ayjh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bopp boppVar = (bopp) obj;
                    cqce cqceVar2 = SyncTelephonyThreadsAction.a;
                    return new bopq[]{boppVar.a, boppVar.b, boppVar.M, boppVar.O, boppVar.ah, boppVar.aa};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                ejxr ejxrVar = c;
                if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
                    ekgpVarC = ekoj.a;
                } else {
                    ciux ciuxVar = this.k;
                    ekgi ekgiVar = new ekgi();
                    for (Map.Entry entry : ciuxVar.b.F().entrySet()) {
                        alqm alqmVar = (alqm) entry.getValue();
                        cczv cczvVar = alvx.a;
                        ciur ciurVarA = ciuxVar.c.a(ejwk.b(alqmVar.k(((Boolean) new alvr().get()).booleanValue())));
                        if (ciurVarA != null) {
                            ekgiVar.i((Long) entry.getKey(), ciurVarA);
                        }
                    }
                    ekgpVarC = ekgiVar.c();
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (boprVar.moveToNext()) {
                    if (boprVar.v()) {
                        cqbd cqbdVarC = cqceVar.c();
                        cqbdVarC.I("Skipping conversation because it's awaiting reverse sync");
                        cqbdVarC.c(boprVar.h());
                        cqbdVarC.r();
                        int i5 = ((eobi) eobfVar.instance).g + i;
                        eobfVar.copyOnWrite();
                        eobi eobiVar2 = (eobi) eobfVar.instance;
                        eobiVar2.b |= 16;
                        eobiVar2.g = i5;
                        bundle = bundle;
                    } else {
                        Bundle bundle2 = bundle;
                        int iC = boprVar.c();
                        if (iC == 0) {
                            i2++;
                        } else if (iC == i) {
                            i3++;
                        } else if (iC == 2) {
                            i4++;
                        }
                        if (boprVar.c() == 2) {
                            if (boprVar.k().d()) {
                                cqbd cqbdVarE = cqceVar.e();
                                cqbdVarE.I("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found because thread was empty");
                                cqbdVarE.c(boprVar.h());
                                cqbdVarE.n(boprVar.k());
                                cqbdVarE.r();
                            } else {
                                Optional.empty();
                                Optional optionalOfNullable = ((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() ? ((ciup) this.k.a(boprVar.k())).a : Optional.ofNullable((ciur) ekgpVarC.get(Long.valueOf(cnqk.a(boprVar.k()))));
                                if (optionalOfNullable.isEmpty()) {
                                    cqbd cqbdVarE2 = cqceVar.e();
                                    cqbdVarE2.I("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found");
                                    cqbdVarE2.c(boprVar.h());
                                    cqbdVarE2.n(boprVar.k());
                                    cqbdVarE2.r();
                                } else if (ejwk.c(boprVar.u())) {
                                    cqbd cqbdVarE3 = cqceVar.e();
                                    cqbdVarE3.I("telephonyThreadMatchesForRcsGroups: local conversation data does not have a valid RCS group ID.");
                                    cqbdVarE3.c(boprVar.h());
                                    cqbdVarE3.n(boprVar.k());
                                    cqbdVarE3.A("remote rcs group id", ((ciur) optionalOfNullable.get()).b());
                                    cqbdVarE3.r();
                                    zEquals = true;
                                } else {
                                    cqbd cqbdVarA = cqceVar.a();
                                    cqbdVarA.I("telephonyThreadMatchesForRcsGroups");
                                    cqbdVarA.c(boprVar.h());
                                    cqbdVarA.n(boprVar.k());
                                    cqbdVarA.A("local rcs group id", boprVar.u());
                                    cqbdVarA.A("remote rcs group id", ((ciur) optionalOfNullable.get()).b());
                                    cqbdVarA.r();
                                    zEquals = ((ciur) optionalOfNullable.get()).b().equals(boprVar.u());
                                }
                            }
                            zEquals = z;
                        } else {
                            long jG = this.h.g(((baqt) this.f.b()).a(boprVar.h(), false));
                            cqbd cqbdVarA2 = cqceVar.a();
                            cqbdVarA2.I("telephonyThreadMatches");
                            cqbdVarA2.c(boprVar.h());
                            cqbdVarA2.A("local thread id", boprVar.k());
                            cqbdVarA2.z("remote thread id", jG);
                            cqbdVarA2.r();
                            zEquals = cnqj.b(jG).equals(boprVar.k());
                        }
                        if (!zEquals) {
                            cqbd cqbdVarE4 = cqceVar.e();
                            cqbdVarE4.I("Found a threadId mismatch");
                            cqbdVarE4.y("convType", boprVar.c());
                            cqbdVarE4.c(boprVar.h());
                            cqbdVarE4.n(boprVar.k());
                            cqbdVarE4.r();
                            int iC2 = boprVar.c();
                            if (iC2 == 0) {
                                int i6 = ((eobi) eobfVar.instance).d + 1;
                                eobfVar.copyOnWrite();
                                eobi eobiVar3 = (eobi) eobfVar.instance;
                                eobiVar3.b |= 2;
                                eobiVar3.d = i6;
                            } else if (iC2 == 1) {
                                int i7 = ((eobi) eobfVar.instance).e + 1;
                                eobfVar.copyOnWrite();
                                eobi eobiVar4 = (eobi) eobfVar.instance;
                                eobiVar4.b |= 4;
                                eobiVar4.e = i7;
                            } else if (iC2 != 2) {
                                cqbd cqbdVarE5 = cqceVar.e();
                                cqbdVarE5.I("Found unexpected conversation type.");
                                cqbdVarE5.y("conversationType", boprVar.c());
                                cqbdVarE5.r();
                            } else {
                                int i8 = ((eobi) eobfVar.instance).f + 1;
                                eobfVar.copyOnWrite();
                                eobi eobiVar5 = (eobi) eobfVar.instance;
                                eobiVar5.b |= 8;
                                eobiVar5.f = i8;
                            }
                            csqVar.put(Long.valueOf(cnqk.a(boprVar.k())), boprVar.h());
                        }
                        bundle = bundle2;
                        z = false;
                        i = 1;
                    }
                }
                Bundle bundle3 = bundle;
                if (((Boolean) b.e()).booleanValue()) {
                    if (((eobi) eobfVar.instance).d > 0) {
                        eobh eobhVarL = l(i2);
                        eobfVar.copyOnWrite();
                        eobi eobiVar6 = (eobi) eobfVar.instance;
                        eobiVar6.i = eobhVarL.n;
                        eobiVar6.b |= 64;
                    }
                    if (((eobi) eobfVar.instance).e > 0) {
                        eobh eobhVarL2 = l(i3);
                        eobfVar.copyOnWrite();
                        eobi eobiVar7 = (eobi) eobfVar.instance;
                        eobiVar7.j = eobhVarL2.n;
                        eobiVar7.b |= 128;
                    }
                    if (((eobi) eobfVar.instance).f > 0) {
                        eobh eobhVarL3 = l(i4);
                        eobfVar.copyOnWrite();
                        eobi eobiVar8 = (eobi) eobfVar.instance;
                        eobiVar8.k = eobhVarL3.n;
                        eobiVar8.b |= 256;
                    }
                }
                boprVar.close();
                int i9 = 0;
                for (Long l : csqVar.keySet()) {
                    ConversationIdType conversationIdType = (ConversationIdType) csqVar.get(l);
                    long jLongValue = l.longValue();
                    if (((cdww) this.g.b()).d(conversationIdType, Long.MAX_VALUE).c()) {
                        cqbd cqbdVarC2 = a.c();
                        cqbdVarC2.I("Deleted local");
                        cqbdVarC2.c(conversationIdType);
                        cqbdVarC2.z("threadId", jLongValue);
                        cqbdVarC2.r();
                    } else {
                        cqbd cqbdVarB = a.b();
                        cqbdVarB.I("failed to delete local");
                        cqbdVarB.c(conversationIdType);
                        cqbdVarB.z("threadId", jLongValue);
                        cqbdVarB.r();
                        i9++;
                    }
                }
                eobfVar.copyOnWrite();
                eobi eobiVar9 = (eobi) eobfVar.instance;
                eobiVar9.b |= 32;
                eobiVar9.h = i9;
                eobfVar.copyOnWrite();
                eobi eobiVar10 = (eobi) eobfVar.instance;
                eobiVar10.b |= 1;
                eobiVar10.c = true;
                boolean zIsEmpty = csqVar.isEmpty();
                if (!zIsEmpty) {
                    ((ayqd) this.j.b()).g();
                }
                Optional optionalEmpty = Optional.empty();
                if (!zIsEmpty) {
                    optionalEmpty = Optional.of(enqq.SYNC_TELEPHONY_THREADS_FOUND_OBSOLETE_THREADS);
                } else if (z2) {
                    optionalEmpty = Optional.of(enqq.SYNC_TELEPHONY_THREADS_FORCE_FULL_SYNC);
                } else if (((cnwj) this.m.b()).a().isPresent()) {
                    optionalEmpty = Optional.of(enqq.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
                }
                optionalEmpty.ifPresent(new Consumer() { // from class: ayjf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        enqq enqqVar = (enqq) obj;
                        cqbd cqbdVarC3 = SyncTelephonyThreadsAction.a.c();
                        cqbdVarC3.I("force full sync");
                        cqbdVarC3.A("sync reason", enqqVar);
                        cqbdVarC3.r();
                        ((cmqf) this.a.d.b()).k(enqqVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return bundle3;
            } finally {
            }
        } finally {
            h((eobi) eobfVar.build());
        }
    }

    public final void h(eobi eobiVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.SYNC_TELEPHONY_THREADS;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eobiVar.getClass();
        ellhVar2.aK = eobiVar;
        ellhVar2.e |= 16384;
        ((aill) this.l.b()).j(ellgVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SyncTelephonyThreadsAction(fcsu<cmqf> fcsuVar, fcsu<baqt> fcsuVar2, fcsu<cdww> fcsuVar3, cmot cmotVar, fcsu<cnod> fcsuVar4, fcsu<ayqd> fcsuVar5, ciux ciuxVar, fcsu<aill> fcsuVar6, fcsu<cnwj> fcsuVar7, Parcel parcel) {
        super(parcel, elgm.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = ciuxVar;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
    }

    public SyncTelephonyThreadsAction(fcsu<cmqf> fcsuVar, fcsu<baqt> fcsuVar2, fcsu<cdww> fcsuVar3, cmot cmotVar, fcsu<cnod> fcsuVar4, fcsu<ayqd> fcsuVar5, ciux ciuxVar, fcsu<aill> fcsuVar6, fcsu<cnwj> fcsuVar7, boolean z) {
        super(elgm.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = ciuxVar;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
        this.v.p("force_full_sync", z);
    }
}
