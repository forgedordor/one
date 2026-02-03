package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.aprz;
import defpackage.apsk;
import defpackage.aqad;
import defpackage.aqca;
import defpackage.aqcb;
import defpackage.aqcd;
import defpackage.aqmq;
import defpackage.axxu;
import defpackage.ayps;
import defpackage.aypu;
import defpackage.aypz;
import defpackage.ayqp;
import defpackage.baea;
import defpackage.baeb;
import defpackage.bael;
import defpackage.baes;
import defpackage.bvfd;
import defpackage.bvfk;
import defpackage.bvkr;
import defpackage.bvpy;
import defpackage.bvtw;
import defpackage.bvtx;
import defpackage.bvty;
import defpackage.bvtz;
import defpackage.caxr;
import defpackage.cfeh;
import defpackage.cogw;
import defpackage.dzfh;
import defpackage.dzub;
import defpackage.dzuc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejye;
import defpackage.ejyk;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.eooy;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.eosd;
import defpackage.eoss;
import defpackage.epbl;
import defpackage.epbz;
import defpackage.epca;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.ezjn;
import defpackage.ezol;
import defpackage.fcsu;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessMessageUpdateAsyncAction extends Action<ezjn> {
    public static final Parcelable.Creator<Action<ezjn>> CREATOR;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction");
    public static final dzfh b = new dzfh("ProcessMessageUpdateAsyncActionTimer");
    public static final ejye c;
    private final ayqp A;
    private final aypz B;
    private final ayps C;
    private final fcsu D;
    private final eosc E;
    private final eosc F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final Executor M;
    public final bvkr d;
    public final fcsu e;
    public final fcsu f;
    public final baeb g;
    public final bael h;
    public final baes i;
    public final ains j;
    public final eosc k;
    public final fcsu l;
    public final cogw m;
    public final fcsu n;
    public final fcsu o;
    public final aqad p;
    public final aqmq q;
    public final fcsu r;
    public final cfeh s;

    /* compiled from: PG */
    public interface a {
        aypu bf();
    }

    static {
        ejyk ejykVar = new ejyk();
        ejykVar.f(100L);
        ejykVar.e(10L, TimeUnit.MINUTES);
        c = ejykVar.a();
        CREATOR = new axxu();
    }

    public ProcessMessageUpdateAsyncAction(bvkr bvkrVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, cfeh cfehVar, fcsu fcsuVar3, ains ainsVar, ayps aypsVar, aypz aypzVar, ayqp ayqpVar, baeb baebVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar4, bael baelVar, baes baesVar, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8, aqmq aqmqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, aqad aqadVar, ezol ezolVar, String str, Uri uri) {
        super(elgm.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bvkrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.s = cfehVar;
        this.D = fcsuVar3;
        this.j = ainsVar;
        this.E = eoscVar;
        this.k = eoscVar2;
        this.F = eoscVar3;
        this.l = fcsuVar5;
        this.G = fcsuVar6;
        this.m = cogwVar;
        this.C = aypsVar;
        this.B = aypzVar;
        this.A = ayqpVar;
        this.g = baebVar;
        this.h = baelVar;
        this.i = baesVar;
        this.n = fcsuVar8;
        this.q = aqmqVar;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
        this.K = fcsuVar11;
        this.H = fcsuVar7;
        this.o = fcsuVar14;
        this.p = aqadVar;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.M = (Executor) fcsuVar4.b();
        } else {
            this.M = new eoss(eoscVar3);
        }
        this.r = fcsuVar12;
        this.L = fcsuVar13;
        ekrg ekrgVar = a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleAction");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "<init>", 451, "ProcessMessageUpdateAsyncAction.java")).q("Showing notification for processing message update.");
        if (optional.isEmpty()) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleAction");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "<init>", 453, "ProcessMessageUpdateAsyncAction.java")).q("Ditto foreground service is not available in this device");
            return;
        }
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.v("conversation_id_key", uri.getPathSegments().get(r3.size() - 2));
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            this.v.v("message_id_key", lastPathSegment);
        }
    }

    public static void j(epbz epbzVar, epbl epblVar) {
        epbl epblVar2 = (epbl) c.b(epblVar.c);
        if (epblVar2 == null || !epblVar2.equals(epblVar)) {
            epbzVar.a(epblVar);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessMessageUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessMessageUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        if (((aqcb) this.I.b()).a() || ((aqca) this.J.b()).a()) {
            if (((bvpy) this.K.b()).b()) {
                ekrw ekrwVarG = a.g();
                ekrwVarG.X(eksq.a, "BugleAction");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "executeActionInternal", 666, "ProcessMessageUpdateAsyncAction.java")).q("Ditto Push Updates Rate limit exceeded, Ignoring Message Update");
                if (((apsk) this.r.b()).a()) {
                    this.j.e("Bugle.Ditto.MessageUpdate.Action.Count", 1);
                }
                if (((aqca) this.J.b()).a()) {
                    return eijx.e(null);
                }
            } else if (((apsk) this.r.b()).a()) {
                this.j.e("Bugle.Ditto.MessageUpdate.Action.Count", 2);
            }
        }
        if (((apsk) this.r.b()).a()) {
            this.j.e("Bugle.Ditto.MessageUpdate.Schedule.Count", 1);
            cogw cogwVar = this.m;
            fcsu fcsuVar = this.L;
            final long jA = cogwVar.a();
            ((eosd) fcsuVar.b()).schedule(new Runnable() { // from class: axxh
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = this.a;
                    ains ainsVar = processMessageUpdateAsyncAction.j;
                    ainsVar.e("Bugle.Ditto.MessageUpdate.Schedule.Count", 2);
                    ainsVar.g("Bugle.Ditto.MessageUpdate.Schedule.Latency", processMessageUpdateAsyncAction.m.a() - jA);
                }
            }, 500L, TimeUnit.MILLISECONDS);
        }
        Boolean bool = (Boolean) bvfk.a.e();
        if (bool.booleanValue()) {
            this.j.e("Bugle.Ditto.Action.Success.Metrics.Counts", 13);
        }
        final dzub dzubVarD = ((dzuc) this.n.b()).d();
        eiju eijuVarE = eijx.h(new eooy() { // from class: axxi
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                epbz epbzVar;
                bgvb bgvbVar;
                epbl epblVarN;
                bfrj bfrjVar;
                epbl epblVarN2;
                final ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = this.a;
                if (((apsk) processMessageUpdateAsyncAction.r.b()).a()) {
                    long jE = processMessageUpdateAsyncAction.v.e("update_timestamp_key", Long.MAX_VALUE);
                    if (jE != Long.MAX_VALUE) {
                        cogw cogwVar2 = processMessageUpdateAsyncAction.m;
                        if (cogwVar2.a() >= jE) {
                            processMessageUpdateAsyncAction.j.g("Bugle.Ditto.MessageUpdate.Queue.Latency", cogwVar2.a() - jE);
                        }
                    }
                }
                aymo aymoVar = processMessageUpdateAsyncAction.v;
                bvkr bvkrVar = processMessageUpdateAsyncAction.d;
                final String strL = aymoVar.l("request_id_key");
                final byte[] bArrA = aymoVar.A("desktop_id_key");
                final ekgb ekgbVarL = bvkrVar.l();
                if (ekgbVarL.isEmpty()) {
                    return eijx.e(null);
                }
                final long jE2 = aymoVar.e("message_timestamp_key", Long.MAX_VALUE);
                if (processMessageUpdateAsyncAction.p.a()) {
                    if (processMessageUpdateAsyncAction.q.a()) {
                        final ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id_key"));
                        final MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id_key"));
                        final epbz epbzVar2 = (epbz) epca.a.createBuilder();
                        eiju eijuVarB = ((cexq) processMessageUpdateAsyncAction.o.b()).b(conversationIdTypeB);
                        ejvr ejvrVar = new ejvr() { // from class: axxf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                bfrj bfrjVar2;
                                epbl epblVarN3;
                                String str = "getMessageUpdateResponseAsync";
                                ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction2 = processMessageUpdateAsyncAction;
                                ConversationIdType conversationIdType = conversationIdTypeB;
                                MessageIdType messageIdType = messageIdTypeB;
                                epbz epbzVar3 = epbzVar2;
                                ekgb ekgbVar = (ekgb) obj;
                                if (conversationIdType.b() || messageIdType.c()) {
                                    long j = jE2;
                                    aymo aymoVar2 = processMessageUpdateAsyncAction2.v;
                                    baes baesVar = processMessageUpdateAsyncAction2.i;
                                    boolean z = aymoVar2.z("is_standalone_push_key", false);
                                    bfrjVar2 = (bfrj) baesVar.b(j, z, ((Integer) bvfd.c.e()).intValue() + 1).p();
                                    if (z) {
                                        try {
                                            if (bfrjVar2.getCount() > 0) {
                                                processMessageUpdateAsyncAction2.j.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bfrjVar2.getCount());
                                            }
                                        } finally {
                                        }
                                    }
                                    ekrg ekrgVar = ProcessMessageUpdateAsyncAction.a;
                                    ekrw ekrwVarH = ekrgVar.h();
                                    ekrz ekrzVar = eksq.a;
                                    ekrwVarH.X(ekrzVar, "BugleAction");
                                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponseAsync", 893, "ProcessMessageUpdateAsyncAction.java")).r("%d messages need retrying.", bfrjVar2.getCount());
                                    while (bfrjVar2.moveToNext()) {
                                        final baea baeaVarC = processMessageUpdateAsyncAction2.g.c(bfrjVar2);
                                        if (!avbn.d.contains(Integer.valueOf(baeaVarC.e()))) {
                                            processMessageUpdateAsyncAction2.l(baeaVarC, messageIdType);
                                            ekrw ekrwVarH2 = ekrgVar.h();
                                            ekrwVarH2.X(ekrzVar, "BugleAction");
                                            String str2 = str;
                                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", str, 901, "ProcessMessageUpdateAsyncAction.java")).t("Re-pushed messageId: %s", baeaVarC.r());
                                            ProcessMessageUpdateAsyncAction.j(epbzVar3, ((cehg) processMessageUpdateAsyncAction2.e.b()).r(baeaVarC, z, Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: axxc
                                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                                    return Predicate$CC.$default$and(this, predicate);
                                                }

                                                @Override // java.util.function.Predicate
                                                /* renamed from: negate */
                                                public final /* synthetic */ Predicate mo538negate() {
                                                    return Predicate$CC.$default$negate(this);
                                                }

                                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                                    return Predicate$CC.$default$or(this, predicate);
                                                }

                                                @Override // java.util.function.Predicate
                                                public final boolean test(Object obj2) {
                                                    ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                                    epcm epcmVar = ((epcj) obj2).c;
                                                    if (epcmVar == null) {
                                                        epcmVar = epcm.a;
                                                    }
                                                    return epcmVar.d.equals(baeaVarC.x());
                                                }
                                            }).findFirst()));
                                            str = str2;
                                        }
                                    }
                                    bfrjVar2.close();
                                    return epbzVar3;
                                }
                                bfrjVar2 = (bfrj) processMessageUpdateAsyncAction2.i.a(messageIdType).p();
                                try {
                                    if (!bfrjVar2.moveToNext() || bfrjVar2.n()) {
                                        epblVarN3 = (!((Boolean) MessagesTable.h(messageIdType, new axxt(), new Supplier() { // from class: axxe
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                                return false;
                                            }
                                        })).booleanValue() || bqfo.b(messageIdType).isPresent()) ? ((cehg) processMessageUpdateAsyncAction2.e.b()).n(conversationIdType, messageIdType) : null;
                                    } else {
                                        final baea baeaVarC2 = processMessageUpdateAsyncAction2.g.c(bfrjVar2);
                                        if (avbn.d.contains(Integer.valueOf(baeaVarC2.e()))) {
                                            bfrjVar2.close();
                                            return epbzVar3;
                                        }
                                        processMessageUpdateAsyncAction2.l(baeaVarC2, messageIdType);
                                        epblVarN3 = ((cehg) processMessageUpdateAsyncAction2.e.b()).p(baeaVarC2, Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: axxd
                                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                                return Predicate$CC.$default$and(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            /* renamed from: negate */
                                            public final /* synthetic */ Predicate mo538negate() {
                                                return Predicate$CC.$default$negate(this);
                                            }

                                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                                return Predicate$CC.$default$or(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            public final boolean test(Object obj2) {
                                                ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                                epcm epcmVar = ((epcj) obj2).c;
                                                if (epcmVar == null) {
                                                    epcmVar = epcm.a;
                                                }
                                                return epcmVar.d.equals(baeaVarC2.x());
                                            }
                                        }).findFirst());
                                    }
                                    bfrjVar2.close();
                                    if (epblVarN3 != null) {
                                        ProcessMessageUpdateAsyncAction.j(epbzVar3, epblVarN3);
                                    }
                                    return epbzVar3;
                                } finally {
                                }
                            }
                        };
                        eosc eoscVar = processMessageUpdateAsyncAction.k;
                        return eijuVarB.h(ejvrVar, eoscVar).i(new eooz() { // from class: axxp
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return processMessageUpdateAsyncAction.h((epbz) obj, bArrA, strL, jE2, ekgbVarL);
                            }
                        }, eoscVar);
                    }
                    final ConversationIdType conversationIdTypeB2 = barn.b(aymoVar.l("conversation_id_key"));
                    final MessageIdType messageIdTypeB2 = bary.b(aymoVar.l("message_id_key"));
                    final epbz epbzVar3 = (epbz) epca.a.createBuilder();
                    eiju eijuVarB2 = ((cexq) processMessageUpdateAsyncAction.o.b()).b(conversationIdTypeB2);
                    ejvr ejvrVar2 = new ejvr() { // from class: axwz
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            bgvb bgvbVar2;
                            epbl epblVarN3;
                            String str = "getMessageUpdateResponseLegacyAsync";
                            ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction2 = processMessageUpdateAsyncAction;
                            ConversationIdType conversationIdType = conversationIdTypeB2;
                            MessageIdType messageIdType = messageIdTypeB2;
                            epbz epbzVar4 = epbzVar3;
                            ekgb ekgbVar = (ekgb) obj;
                            if (conversationIdType.b() || messageIdType.c()) {
                                long j = jE2;
                                aymo aymoVar2 = processMessageUpdateAsyncAction2.v;
                                bael baelVar = processMessageUpdateAsyncAction2.h;
                                boolean z = aymoVar2.z("is_standalone_push_key", false);
                                bgvbVar2 = (bgvb) baelVar.c(j, z).p();
                                if (z) {
                                    try {
                                        if (bgvbVar2.getCount() > 0) {
                                            processMessageUpdateAsyncAction2.j.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bgvbVar2.getCount());
                                        }
                                    } finally {
                                    }
                                }
                                ekrg ekrgVar = ProcessMessageUpdateAsyncAction.a;
                                ekrw ekrwVarH = ekrgVar.h();
                                ekrz ekrzVar = eksq.a;
                                ekrwVarH.X(ekrzVar, "BugleAction");
                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponseLegacyAsync", 1063, "ProcessMessageUpdateAsyncAction.java")).r("%d messages need retrying.", bgvbVar2.getCount());
                                while (bgvbVar2.moveToNext()) {
                                    final baea baeaVarE = processMessageUpdateAsyncAction2.g.e(bgvbVar2);
                                    if (!avbn.d.contains(Integer.valueOf(baeaVarE.e()))) {
                                        processMessageUpdateAsyncAction2.l(baeaVarE, messageIdType);
                                        ekrw ekrwVarH2 = ekrgVar.h();
                                        ekrwVarH2.X(ekrzVar, "BugleAction");
                                        String str2 = str;
                                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", str, 1071, "ProcessMessageUpdateAsyncAction.java")).t("Re-pushed messageId: %s", baeaVarE.r());
                                        ProcessMessageUpdateAsyncAction.j(epbzVar4, ((cehg) processMessageUpdateAsyncAction2.e.b()).r(baeaVarE, z, Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: axxr
                                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                                return Predicate$CC.$default$and(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            /* renamed from: negate */
                                            public final /* synthetic */ Predicate mo538negate() {
                                                return Predicate$CC.$default$negate(this);
                                            }

                                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                                return Predicate$CC.$default$or(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            public final boolean test(Object obj2) {
                                                ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                                epcm epcmVar = ((epcj) obj2).c;
                                                if (epcmVar == null) {
                                                    epcmVar = epcm.a;
                                                }
                                                return epcmVar.d.equals(baeaVarE.x());
                                            }
                                        }).findFirst()));
                                        str = str2;
                                    }
                                }
                                bgvbVar2.close();
                                return epbzVar4;
                            }
                            bgvbVar2 = (bgvb) processMessageUpdateAsyncAction2.h.b(messageIdType).p();
                            try {
                                if (bgvbVar2.moveToNext()) {
                                    final baea baeaVarE2 = processMessageUpdateAsyncAction2.g.e(bgvbVar2);
                                    if (avbn.d.contains(Integer.valueOf(baeaVarE2.e()))) {
                                        bgvbVar2.close();
                                        return epbzVar4;
                                    }
                                    processMessageUpdateAsyncAction2.l(baeaVarE2, messageIdType);
                                    epblVarN3 = ((cehg) processMessageUpdateAsyncAction2.e.b()).p(baeaVarE2, Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: axxs
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj2) {
                                            ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                            epcm epcmVar = ((epcj) obj2).c;
                                            if (epcmVar == null) {
                                                epcmVar = epcm.a;
                                            }
                                            return epcmVar.d.equals(baeaVarE2.x());
                                        }
                                    }).findFirst());
                                } else {
                                    epblVarN3 = (!((Boolean) MessagesTable.h(messageIdType, new axxt(), new Supplier() { // from class: axxa
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                            return false;
                                        }
                                    })).booleanValue() || bqfo.b(messageIdType).isPresent()) ? ((cehg) processMessageUpdateAsyncAction2.e.b()).n(conversationIdType, messageIdType) : null;
                                }
                                bgvbVar2.close();
                                if (epblVarN3 != null) {
                                    ProcessMessageUpdateAsyncAction.j(epbzVar4, epblVarN3);
                                }
                                return epbzVar4;
                            } finally {
                            }
                        }
                    };
                    eosc eoscVar2 = processMessageUpdateAsyncAction.k;
                    return eijuVarB2.h(ejvrVar2, eoscVar2).i(new eooz() { // from class: axxq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return processMessageUpdateAsyncAction.h((epbz) obj, bArrA, strL, jE2, ekgbVarL);
                        }
                    }, eoscVar2);
                }
                if (processMessageUpdateAsyncAction.q.a()) {
                    aymo aymoVar2 = processMessageUpdateAsyncAction.v;
                    ConversationIdType conversationIdTypeB3 = barn.b(aymoVar2.l("conversation_id_key"));
                    MessageIdType messageIdTypeB3 = bary.b(aymoVar2.l("message_id_key"));
                    epbzVar = (epbz) epca.a.createBuilder();
                    if (conversationIdTypeB3.b() || messageIdTypeB3.c()) {
                        boolean z = aymoVar2.z("is_standalone_push_key", false);
                        bfrjVar = (bfrj) processMessageUpdateAsyncAction.i.b(jE2, z, ((Integer) bvfd.c.e()).intValue() + 1).p();
                        if (z) {
                            try {
                                if (bfrjVar.getCount() > 0) {
                                    processMessageUpdateAsyncAction.j.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bfrjVar.getCount());
                                }
                            } finally {
                            }
                        }
                        ekrg ekrgVar = ProcessMessageUpdateAsyncAction.a;
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH.X(ekrzVar, "BugleAction");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponse", 990, "ProcessMessageUpdateAsyncAction.java")).r("%d messages need retrying.", bfrjVar.getCount());
                        while (bfrjVar.moveToNext()) {
                            baea baeaVarC = processMessageUpdateAsyncAction.g.c(bfrjVar);
                            if (!avbn.d.contains(Integer.valueOf(baeaVarC.e()))) {
                                processMessageUpdateAsyncAction.l(baeaVarC, messageIdTypeB3);
                                ekrw ekrwVarH2 = ekrgVar.h();
                                ekrwVarH2.X(ekrzVar, "BugleAction");
                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponse", 998, "ProcessMessageUpdateAsyncAction.java")).t("Re-pushed messageId: %s", baeaVarC.r());
                                ProcessMessageUpdateAsyncAction.j(epbzVar, ((cehg) processMessageUpdateAsyncAction.e.b()).q(baeaVarC, z));
                            }
                        }
                        bfrjVar.close();
                    } else {
                        bfrjVar = (bfrj) processMessageUpdateAsyncAction.i.a(messageIdTypeB3).p();
                        try {
                            if (!bfrjVar.moveToNext() || bfrjVar.n()) {
                                epblVarN2 = (!((Boolean) MessagesTable.h(messageIdTypeB3, new axxt(), new Supplier() { // from class: axxb
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                                        return false;
                                    }
                                })).booleanValue() || bqfo.b(messageIdTypeB3).isPresent()) ? ((cehg) processMessageUpdateAsyncAction.e.b()).n(conversationIdTypeB3, messageIdTypeB3) : null;
                            } else {
                                baea baeaVarC2 = processMessageUpdateAsyncAction.g.c(bfrjVar);
                                if (avbn.d.contains(Integer.valueOf(baeaVarC2.e()))) {
                                    bfrjVar.close();
                                } else {
                                    processMessageUpdateAsyncAction.l(baeaVarC2, messageIdTypeB3);
                                    epblVarN2 = ((cehg) processMessageUpdateAsyncAction.e.b()).o(baeaVarC2);
                                }
                            }
                            bfrjVar.close();
                            if (epblVarN2 != null) {
                                ProcessMessageUpdateAsyncAction.j(epbzVar, epblVarN2);
                            }
                        } finally {
                        }
                    }
                } else {
                    ConversationIdType conversationIdTypeB4 = barn.b(aymoVar.l("conversation_id_key"));
                    MessageIdType messageIdTypeB4 = bary.b(aymoVar.l("message_id_key"));
                    epbzVar = (epbz) epca.a.createBuilder();
                    if (conversationIdTypeB4.b() || messageIdTypeB4.c()) {
                        boolean z2 = aymoVar.z("is_standalone_push_key", false);
                        bgvbVar = (bgvb) processMessageUpdateAsyncAction.h.c(jE2, z2).p();
                        if (z2) {
                            try {
                                if (bgvbVar.getCount() > 0) {
                                    processMessageUpdateAsyncAction.j.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bgvbVar.getCount());
                                }
                            } finally {
                            }
                        }
                        ekrg ekrgVar2 = ProcessMessageUpdateAsyncAction.a;
                        ekrw ekrwVarH3 = ekrgVar2.h();
                        ekrz ekrzVar2 = eksq.a;
                        ekrwVarH3.X(ekrzVar2, "BugleAction");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponseLegacy", 1158, "ProcessMessageUpdateAsyncAction.java")).r("%d messages need retrying.", bgvbVar.getCount());
                        while (bgvbVar.moveToNext()) {
                            baea baeaVarE = processMessageUpdateAsyncAction.g.e(bgvbVar);
                            if (!avbn.d.contains(Integer.valueOf(baeaVarE.e()))) {
                                processMessageUpdateAsyncAction.l(baeaVarE, messageIdTypeB4);
                                ekrw ekrwVarH4 = ekrgVar2.h();
                                ekrwVarH4.X(ekrzVar2, "BugleAction");
                                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getMessageUpdateResponseLegacy", 1166, "ProcessMessageUpdateAsyncAction.java")).t("Re-pushed messageId: %s", baeaVarE.r());
                                ProcessMessageUpdateAsyncAction.j(epbzVar, ((cehg) processMessageUpdateAsyncAction.e.b()).q(baeaVarE, z2));
                            }
                        }
                        bgvbVar.close();
                    } else {
                        bgvbVar = (bgvb) processMessageUpdateAsyncAction.h.b(messageIdTypeB4).p();
                        try {
                            if (bgvbVar.moveToNext()) {
                                baea baeaVarE2 = processMessageUpdateAsyncAction.g.e(bgvbVar);
                                if (avbn.d.contains(Integer.valueOf(baeaVarE2.e()))) {
                                    bgvbVar.close();
                                } else {
                                    processMessageUpdateAsyncAction.l(baeaVarE2, messageIdTypeB4);
                                    epblVarN = ((cehg) processMessageUpdateAsyncAction.e.b()).o(baeaVarE2);
                                }
                            } else {
                                epblVarN = (!((Boolean) MessagesTable.h(messageIdTypeB4, new axxt(), new Supplier() { // from class: axxg
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        ekrg ekrgVar3 = ProcessMessageUpdateAsyncAction.a;
                                        return false;
                                    }
                                })).booleanValue() || bqfo.b(messageIdTypeB4).isPresent()) ? ((cehg) processMessageUpdateAsyncAction.e.b()).n(conversationIdTypeB4, messageIdTypeB4) : null;
                            }
                            bgvbVar.close();
                            if (epblVarN != null) {
                                ProcessMessageUpdateAsyncAction.j(epbzVar, epblVarN);
                            }
                        } finally {
                        }
                    }
                }
                return processMessageUpdateAsyncAction.h(epbzVar, bArrA, strL, jE2, ekgbVarL);
            }
        }, ((aqcd) this.H.b()).a() ? this.M : this.F).e(Throwable.class, new ejvr() { // from class: axxj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dzuc dzucVar = (dzuc) this.a.n.b();
                dzub dzubVar = dzubVarD;
                dzubVar.getClass();
                dzucVar.f(dzubVar, ProcessMessageUpdateAsyncAction.b, null, dzua.ERROR);
                ekrw ekrwVarJ = ProcessMessageUpdateAsyncAction.a.j();
                ekrwVarJ.X(eksq.a, "BugleAction");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "executeActionInternal", (char) 721, "ProcessMessageUpdateAsyncAction.java")).q("Action failed.");
                return null;
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: axxl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezjn ezjnVar = (ezjn) obj;
                dzuc dzucVar = (dzuc) this.a.n.b();
                dzub dzubVar = dzubVarD;
                dzubVar.getClass();
                dzucVar.f(dzubVar, ProcessMessageUpdateAsyncAction.b, null, dzua.SUCCESS);
                return ezjnVar;
            }
        };
        eosc eoscVar = this.E;
        eiju eijuVarH = eijuVarE.h(ejvrVar, eoscVar);
        if (bool.booleanValue()) {
            eijuVarH.h(new ejvr() { // from class: axxm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ezjn ezjnVar = (ezjn) obj;
                    this.a.j.e("Bugle.Ditto.Action.Success.Metrics.Counts", 14);
                    return ezjnVar;
                }
            }, eoscVar);
        }
        return eijx.e(null);
    }

    public final eiju h(final epbz epbzVar, byte[] bArr, String str, long j, ekgb ekgbVar) {
        if (((epca) epbzVar.instance).b.size() == 0) {
            return eijx.e(null);
        }
        if (this.v.z("is_standalone_push_key", false)) {
            if (bArr == null || str == null) {
                return eijx.e(null);
            }
            try {
                ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, bArr, evrr.a());
                if (((epca) epbzVar.instance).b.size() > ((Integer) bvfd.c.e()).intValue()) {
                    ekrw ekrwVarE = a.e();
                    ekrwVarE.X(eksq.a, "BugleAction");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getInboxSendResponse", 829, "ProcessMessageUpdateAsyncAction.java")).q("Notify Ditto to refresh since there are too many messages needs to repush");
                    return this.B.f(10, ezolVar, str);
                }
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "BugleAction");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getInboxSendResponse", 833, "ProcessMessageUpdateAsyncAction.java")).q("Send corresponding conversation update");
                this.C.a(ezolVar, str, j).B(this);
            } catch (evtj e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "BugleAction");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "getInboxSendResponse", (char) 824, "ProcessMessageUpdateAsyncAction.java")).q("Couldn't parse protobuff.");
                return eijx.e(null);
            }
        }
        if (((apsk) this.r.b()).a()) {
            long jE = this.v.e("update_timestamp_key", Long.MAX_VALUE);
            if (jE != Long.MAX_VALUE) {
                cogw cogwVar = this.m;
                if (cogwVar.a() >= jE) {
                    this.j.g("Bugle.Ditto.MessageUpdate.Total.Latency", cogwVar.a() - jE);
                }
            }
        }
        return bvkr.D(ekgbVar, new Function() { // from class: axxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfeg cfegVarA;
                bvix bvixVar = (bvix) obj;
                ezol ezolVarD = bvixVar.d();
                String strE = bvixVar.e();
                ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = this.a;
                boolean zA = ((cdio) processMessageUpdateAsyncAction.l.b()).a();
                epbz epbzVar2 = epbzVar;
                if (zA) {
                    cfef cfefVarA = processMessageUpdateAsyncAction.s.a(bvixVar.c(), epby.GET_UPDATES);
                    cfefVarA.c = strE;
                    eozc eozcVar = (eozc) eoze.a.createBuilder();
                    eozcVar.copyOnWrite();
                    eoze eozeVar = (eoze) eozcVar.instance;
                    epca epcaVar = (epca) epbzVar2.build();
                    epcaVar.getClass();
                    eozeVar.c = epcaVar;
                    eozeVar.b = 3;
                    cfefVarA.b(eozcVar.build());
                    cfefVarA.c();
                    cfefVarA.i = ezjh.STATUS;
                    cfegVarA = cfefVarA.a();
                } else {
                    cfef cfefVarC = processMessageUpdateAsyncAction.s.c(ezolVarD, Optional.empty(), epby.GET_UPDATES);
                    cfefVarC.c = strE;
                    eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                    eozcVar2.copyOnWrite();
                    eoze eozeVar2 = (eoze) eozcVar2.instance;
                    epca epcaVar2 = (epca) epbzVar2.build();
                    epcaVar2.getClass();
                    eozeVar2.c = epcaVar2;
                    eozeVar2.b = 3;
                    cfefVarC.b(eozcVar2.build());
                    cfefVarC.c();
                    cfefVarC.i = ezjh.STATUS;
                    cfegVarA = cfefVarC.a();
                }
                fcsu fcsuVar = processMessageUpdateAsyncAction.f;
                if (((Optional) fcsuVar.b()).isEmpty()) {
                    return eijx.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                }
                eiju eijuVarA = ((cfya) ((Optional) fcsuVar.b()).get()).a(cfegVarA);
                cfegVarA.q(eijuVarA);
                return eijuVarA;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: axxn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                epbz epbzVar2 = epbzVar;
                ejye ejyeVar = ProcessMessageUpdateAsyncAction.c;
                ((ejzn) ejyeVar).a.putAll(ekmi.d(DesugarCollections.unmodifiableList(((epca) epbzVar2.instance).b), new ejvr() { // from class: axxo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ((epbl) obj2).c;
                    }
                }));
                return null;
            }
        }, this.E);
    }

    public final void l(baea baeaVar, MessageIdType messageIdType) {
        if (Instant.ofEpochMilli(baeaVar.h()).isAfter(this.m.f().minus(Duration.ofDays(((Long) this.G.b()).longValue())))) {
            if (!((Boolean) bvtw.a.e()).booleanValue()) {
                this.A.b(baeaVar).s();
                return;
            }
            bvtz bvtzVar = (bvtz) this.D.b();
            bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
            bvtxVar.b(messageIdType.b());
            bvty bvtyVar = (bvty) bvtxVar.build();
            caxr caxrVar = new caxr();
            caxrVar.b = "blobstore-".concat(String.valueOf(messageIdType.b()));
            bvtzVar.b(bvtyVar, caxrVar.a());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessMessageUpdateAsyncAction(bvkr bvkrVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, cfeh cfehVar, fcsu fcsuVar3, ains ainsVar, ayps aypsVar, aypz aypzVar, ayqp ayqpVar, baeb baebVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar4, bael baelVar, baes baesVar, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8, aqmq aqmqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, aqad aqadVar, fcsu fcsuVar15, ezol ezolVar, String str, Uri uri, long j) {
        super(elgm.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bvkrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.s = cfehVar;
        this.D = fcsuVar3;
        this.j = ainsVar;
        this.E = eoscVar;
        this.k = eoscVar2;
        this.F = eoscVar3;
        this.l = fcsuVar5;
        this.G = fcsuVar6;
        this.m = cogwVar;
        this.C = aypsVar;
        this.B = aypzVar;
        this.A = ayqpVar;
        this.g = baebVar;
        this.h = baelVar;
        this.i = baesVar;
        this.n = fcsuVar8;
        this.q = aqmqVar;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
        this.K = fcsuVar11;
        this.H = fcsuVar7;
        this.o = fcsuVar14;
        this.p = aqadVar;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.M = (Executor) fcsuVar4.b();
        } else {
            this.M = new eoss(eoscVar3);
        }
        this.r = fcsuVar12;
        this.L = fcsuVar13;
        ekrg ekrgVar = a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleAction");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "<init>", 549, "ProcessMessageUpdateAsyncAction.java")).q("Showing notification for processing message update.");
        if (optional.isEmpty()) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleAction");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "<init>", 551, "ProcessMessageUpdateAsyncAction.java")).q("Ditto foreground service is not available in this device");
            return;
        }
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.v("conversation_id_key", uri.getPathSegments().get(r6.size() - 2));
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            this.v.v("message_id_key", lastPathSegment);
        }
        if (((aprz) fcsuVar15.b()).a()) {
            this.v.s("update_timestamp_key", cogwVar.a());
        } else {
            this.v.s("update_timestamp_key", j);
        }
    }

    public ProcessMessageUpdateAsyncAction(bvkr bvkrVar, fcsu fcsuVar, fcsu fcsuVar2, cfeh cfehVar, fcsu fcsuVar3, ains ainsVar, ayps aypsVar, aypz aypzVar, ayqp ayqpVar, baeb baebVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar4, bael baelVar, baes baesVar, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8, aqmq aqmqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, aqad aqadVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bvkrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.s = cfehVar;
        this.D = fcsuVar3;
        this.j = ainsVar;
        this.E = eoscVar;
        this.k = eoscVar2;
        this.F = eoscVar3;
        this.l = fcsuVar5;
        this.G = fcsuVar6;
        this.m = cogwVar;
        this.C = aypsVar;
        this.B = aypzVar;
        this.A = ayqpVar;
        this.g = baebVar;
        this.h = baelVar;
        this.i = baesVar;
        this.n = fcsuVar8;
        this.q = aqmqVar;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
        this.K = fcsuVar11;
        this.H = fcsuVar7;
        this.o = fcsuVar14;
        this.p = aqadVar;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.M = (Executor) fcsuVar4.b();
        } else {
            this.M = new eoss(eoscVar3);
        }
        this.r = fcsuVar12;
        this.L = fcsuVar13;
    }

    public ProcessMessageUpdateAsyncAction(bvkr bvkrVar, fcsu fcsuVar, fcsu fcsuVar2, cfeh cfehVar, fcsu fcsuVar3, ains ainsVar, ayps aypsVar, aypz aypzVar, ayqp ayqpVar, baeb baebVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar4, bael baelVar, baes baesVar, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8, aqmq aqmqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, aqad aqadVar, ezol ezolVar, String str, long j) {
        super(elgm.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bvkrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.s = cfehVar;
        this.D = fcsuVar3;
        this.j = ainsVar;
        this.E = eoscVar;
        this.k = eoscVar2;
        this.F = eoscVar3;
        this.C = aypsVar;
        this.B = aypzVar;
        this.A = ayqpVar;
        this.g = baebVar;
        this.h = baelVar;
        this.i = baesVar;
        this.l = fcsuVar5;
        this.G = fcsuVar6;
        this.m = cogwVar;
        this.o = fcsuVar14;
        this.p = aqadVar;
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.s("message_timestamp_key", j);
        this.n = fcsuVar8;
        this.q = aqmqVar;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
        this.K = fcsuVar11;
        this.H = fcsuVar7;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.M = (Executor) fcsuVar4.b();
        } else {
            this.M = new eoss(eoscVar3);
        }
        this.r = fcsuVar12;
        this.L = fcsuVar13;
    }

    public ProcessMessageUpdateAsyncAction(bvkr bvkrVar, fcsu fcsuVar, fcsu fcsuVar2, cfeh cfehVar, fcsu fcsuVar3, ains ainsVar, ayps aypsVar, aypz aypzVar, ayqp ayqpVar, baeb baebVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar4, bael baelVar, baes baesVar, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, fcsu fcsuVar7, fcsu fcsuVar8, aqmq aqmqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, aqad aqadVar, ezol ezolVar, String str, long j, byte[] bArr) {
        super(elgm.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bvkrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.s = cfehVar;
        this.D = fcsuVar3;
        this.j = ainsVar;
        this.E = eoscVar;
        this.k = eoscVar2;
        this.F = eoscVar3;
        this.C = aypsVar;
        this.B = aypzVar;
        this.A = ayqpVar;
        this.g = baebVar;
        this.h = baelVar;
        this.i = baesVar;
        this.l = fcsuVar5;
        this.G = fcsuVar6;
        this.m = cogwVar;
        this.q = aqmqVar;
        this.o = fcsuVar14;
        this.p = aqadVar;
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.s("message_timestamp_key", j);
        this.v.p("is_standalone_push_key", true);
        this.n = fcsuVar8;
        this.I = fcsuVar9;
        this.J = fcsuVar10;
        this.K = fcsuVar11;
        this.H = fcsuVar7;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.M = (Executor) fcsuVar4.b();
        } else {
            this.M = new eoss(eoscVar3);
        }
        this.r = fcsuVar12;
        this.L = fcsuVar13;
    }
}
