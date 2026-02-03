package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class catu extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler");
    static final cczi b;
    static final cczi c;
    public final fcsu A;
    public final fcsu B;
    public final eygg C;
    public final fcsu D;
    private final eosc F;
    private final fcsu G;
    private final fcsu H;
    public final cqce d = cqce.g("BugleDataModel", "DeleteConversationHandler");
    public final fcsu e;
    public final Context f;
    public final eosc g;
    public final dqsn h;
    public final cauk i;
    public final cata j;
    public final cauf k;
    public final cdyk l;
    public final auuh m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final aijz t;
    public final Optional u;
    public final fcsu v;
    public final ajfo w;
    public final bxlc x;
    public final bbfn y;
    public final coia z;

    static {
        cdag.w(216833586, "cancel_file_transfer_messages_first");
        b = cdag.e(cdag.b, "max_message_deletes_per_proto", 100);
        c = cdag.e(cdag.b, "max_parts_cleanup_per_proto", 100);
    }

    public catu(Context context, eosc eoscVar, eosc eoscVar2, dqsn dqsnVar, cauk caukVar, cata cataVar, cauf caufVar, cdyk cdykVar, auuh auuhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, aijz aijzVar, Optional optional, fcsu fcsuVar7, ajfo ajfoVar, bxlc bxlcVar, bbfn bbfnVar, coia coiaVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, eygg eyggVar, fcsu fcsuVar13) {
        this.f = context;
        this.F = eoscVar;
        this.g = eoscVar2;
        this.h = dqsnVar;
        this.i = caukVar;
        this.j = cataVar;
        this.k = caufVar;
        this.l = cdykVar;
        this.m = auuhVar;
        this.n = fcsuVar;
        this.o = fcsuVar2;
        this.p = fcsuVar3;
        this.q = fcsuVar4;
        this.r = fcsuVar5;
        this.s = fcsuVar6;
        this.t = aijzVar;
        this.u = optional;
        this.v = fcsuVar7;
        this.w = ajfoVar;
        this.x = bxlcVar;
        this.y = bbfnVar;
        this.z = coiaVar;
        this.e = fcsuVar8;
        this.A = fcsuVar9;
        this.B = fcsuVar10;
        this.G = fcsuVar11;
        this.H = fcsuVar12;
        this.C = eyggVar;
        this.D = fcsuVar13;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).c = elgm.DELETE_CONVERSATION_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DeleteConversationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return catx.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final catx catxVar = (catx) evuhVar;
        final ConversationIdType conversationIdTypeB = barn.b(catxVar.b);
        if (conversationIdTypeB.b()) {
            this.d.n("conversationId is empty.");
            return eijx.e(cbcw.k());
        }
        if (catxVar.e == elka.CONVERSATION_FROM_COMPOSE.u && catxVar.d) {
            try {
                cpyi cpyiVarT = ((bakt) this.p.b()).t(conversationIdTypeB);
                if (cpyiVarT == null) {
                    cqbd cqbdVarE = this.d.e();
                    cqbdVarE.I("Skip deleting conversation since it appears it's not in database.");
                    cqbdVarE.A("conversationId", catxVar.b);
                    cqbdVarE.r();
                } else if (cpyiVarT.equals(cpyi.CMS_RESTORE_IN_PROGRESS) || cpyiVarT.equals(cpyi.RESTORED_FROM_CMS) || cpyiVarT.equals(cpyi.MERGED_FROM_CMS)) {
                    if (autx.m(((aurx) this.H.b()).c())) {
                        cqbd cqbdVarC = this.d.c();
                        cqbdVarC.I("Skip deleting conversation during initial restore for background task.");
                        cqbdVarC.A("conversationId", catxVar.b);
                        cqbdVarC.r();
                    }
                }
                return eijx.e(cbcw.i());
            } catch (evtj e) {
                cqbd cqbdVarE2 = this.d.e();
                cqbdVarE2.A("conversationId", catxVar.b);
                cqbdVarE2.I("Unable to parse CmsSettingsData, will delete conversation.");
                cqbdVarE2.s(e);
            }
        }
        eooy eooyVar = new eooy() { // from class: cats
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                if (catxVar.d) {
                    int i = ekgb.d;
                    return eijx.e(ekoe.a);
                }
                final ConversationIdType conversationIdType = conversationIdTypeB;
                final coia coiaVar = this.a.z;
                if (!coiaVar.e.a()) {
                    return eijx.h(new eooy() { // from class: cohm
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("getOngoingFileTransferMessages");
                            final ConversationIdType conversationIdType2 = conversationIdType;
                            brdrVarD.h(new Function() { // from class: cojw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brec brecVar = (brec) obj;
                                    eksp ekspVar = cokd.a;
                                    brecVar.m(conversationIdType2);
                                    brecVar.J(3);
                                    brecVar.ah(avbn.g);
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.d(new brdo(MessagesTable.c.i, true));
                            Stream streamE = brdrVarD.b().E();
                            coia coiaVar2 = coiaVar;
                            final cokd cokdVar = coiaVar2.c;
                            try {
                                Stream streamFilter = streamE.map(new Function() { // from class: cojx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return cokdVar.a(((MessagesTable.BindData) obj).E());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).filter(new Predicate() { // from class: cojy
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
                                    public final boolean test(Object obj) {
                                        return ((cokf) obj).c();
                                    }
                                });
                                int i2 = ekgb.d;
                                ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
                                if (streamE != null) {
                                    streamE.close();
                                }
                                return coiaVar2.b(ekgbVar);
                            } catch (Throwable th) {
                                if (streamE != null) {
                                    try {
                                        streamE.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    }, coiaVar.b);
                }
                eooy eooyVar2 = new eooy() { // from class: cohz
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        coia coiaVar2 = coiaVar;
                        baxe baxeVar = (baxe) coiaVar2.c.c.b();
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("FileTransferDatabaseOperations#retrieveOngoingFileTransferMessagesInConversation");
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        brdrVarD.h(new Function() { // from class: cojz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                eksp ekspVar = cokd.a;
                                brecVar.m(conversationIdType2);
                                brecVar.J(3);
                                brecVar.ah(avbn.g);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return eijx.i(coiaVar2.c(baxeVar.K(brdrVarD.b())));
                    }
                };
                eosc eoscVar = coiaVar.b;
                return eijx.h(eooyVar2, eoscVar).h(new cohl(coiaVar), eoscVar);
            }
        };
        eosc eoscVar = this.F;
        return eijx.h(eooyVar, eoscVar).i(new eooz() { // from class: catt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cgur cgurVar = (cgur) this.a.C.b();
                return auvw.c(cgurVar.i, fcyi.a, fdjz.a, new cguq(cgurVar, conversationIdTypeB, null));
            }
        }, eoscVar).i(new eooz() { // from class: catk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final catu catuVar = this.a;
                final ConversationIdType conversationIdType = conversationIdTypeB;
                final catx catxVar2 = catxVar;
                return eijx.g(new Callable() { // from class: catl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final catu catuVar2 = catuVar;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final catx catxVar3 = catxVar2;
                        return (cbcw) catuVar2.h.c("DeleteConversationHandler.deleteLocallyAndQueue", new ejxr() { // from class: catj
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ejxr
                            public final Object get() {
                                cnqj cnqjVar;
                                String[] strArrF;
                                boolean zC;
                                cbcw cbcwVarJ;
                                final catu catuVar3 = catuVar2;
                                cqbd cqbdVarC2 = catuVar3.d.c();
                                cqbdVarC2.I("Deleting conversation ");
                                final ConversationIdType conversationIdType3 = conversationIdType2;
                                cqbdVarC2.c(conversationIdType3);
                                cqbdVarC2.r();
                                catx catxVar4 = catxVar3;
                                try {
                                    int i = catxVar4.e;
                                    final boolean zS = ((baxe) catuVar3.q.b()).S(conversationIdType3);
                                    final bvdk bvdkVarS = ((bakt) catuVar3.p.b()).s(conversationIdType3);
                                    final elki elkiVarE = catuVar3.t.e(conversationIdType3);
                                    final elka elkaVarB = elka.b(i);
                                    if (((Boolean) ((cczi) crvx.a.get()).e()).booleanValue()) {
                                        ekgb ekgbVarE = bbca.e(conversationIdType3);
                                        if (ekgbVarE.size() == 1) {
                                            ((crwg) catuVar3.D.b()).b(((crwr) catuVar3.r.b()).a(Long.parseLong(((ParticipantsTable.BindData) ekgbVarE.get(0)).R())));
                                        }
                                    }
                                    ((cryo) catuVar3.B.b()).e(conversationIdType3, csof.b(conversationIdType3));
                                    Runnable runnable = new Runnable() { // from class: cato
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((avnq) catuVar3.v.b()).a(elkiVarE, conversationIdType3, elkaVarB, zS, bvdkVarS);
                                        }
                                    };
                                    final long j = catxVar4.c;
                                    try {
                                        cnqjVar = ((bxjh) catuVar3.s.b()).a(conversationIdType3);
                                    } catch (ejyc unused) {
                                        cnqjVar = new cnqj();
                                    }
                                    SuperSortLabel superSortLabelA = SuperSortLabel.a(catxVar4.f);
                                    fcsu fcsuVar = catuVar3.o;
                                    boolean zD = ((auue) fcsuVar.b()).d(conversationIdType3, cnqjVar);
                                    cdvs cdvsVarF = null;
                                    if (zD) {
                                        String[] strArr = MessagesTable.a;
                                        brec brecVar = new brec();
                                        if (j != Long.MAX_VALUE) {
                                            brecVar.T(j);
                                        }
                                        strArrF = ((auue) fcsuVar.b()).f(conversationIdType3, new brdv(brecVar));
                                    } else {
                                        strArrF = null;
                                    }
                                    if (catxVar4.d) {
                                        zC = ((cdww) catuVar3.n.b()).g(conversationIdType3);
                                    } else {
                                        caud caudVar = (caud) caue.a.createBuilder();
                                        brdr brdrVarD = MessagesTable.d();
                                        brdrVarD.A("getMessageIdsQuery");
                                        brdrVarD.f(new Function() { // from class: catp
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                ekrg ekrgVar = catu.a;
                                                return ((bran) obj2).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        brdrVarD.h(new Function() { // from class: catq
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                brec brecVar2 = (brec) obj2;
                                                ekrg ekrgVar = catu.a;
                                                brecVar2.m(conversationIdType3);
                                                brecVar2.T(j);
                                                return brecVar2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        final brdp brdpVarB = brdrVarD.b();
                                        brdr brdrVarD2 = MessagesTable.d();
                                        brdrVarD2.A("+queueCleanupParts-messages");
                                        brdrVarD2.h(new Function() { // from class: catm
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                brec brecVar2 = (brec) obj2;
                                                ekrg ekrgVar = catu.a;
                                                brecVar2.s(brdpVarB);
                                                return brecVar2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        brap brapVar = (brap) brdrVarD2.b().p();
                                        while (brapVar.moveToNext()) {
                                            try {
                                                Uri uriO = brapVar.o();
                                                if (uriO != null) {
                                                    caudVar.a(uriO.toString());
                                                    if (((caue) caudVar.instance).c.size() >= ((Integer) catu.b.e()).intValue()) {
                                                        catuVar3.k.a((caue) caudVar.build());
                                                        caudVar.copyOnWrite();
                                                        ((caue) caudVar.instance).c = evsn.emptyProtobufList();
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        brapVar.close();
                                        if (((caue) caudVar.instance).c.size() > 0) {
                                            catuVar3.k.a((caue) caudVar.build());
                                        }
                                        catb catbVar = (catb) catc.a.createBuilder();
                                        cdyi cdyiVar = (cdyi) cdyj.a.createBuilder();
                                        bsje bsjeVarC = PartsTable.c();
                                        bsjeVarC.A("+queueCleanupParts-parts");
                                        bsjeVarC.h(new Function() { // from class: catn
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                bsjl bsjlVar = (bsjl) obj2;
                                                ekrg ekrgVar = catu.a;
                                                bsjlVar.i(conversationIdType3);
                                                bsjlVar.x();
                                                bsjlVar.o(brdpVarB);
                                                return bsjlVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                                        while (bsgtVar.moveToNext()) {
                                            try {
                                                Uri uriI = bsgtVar.i();
                                                if (uriI != null) {
                                                    if (cdyf.a(uriI)) {
                                                        cdyiVar.a(uriI.toString());
                                                    } else if (elha.b(bsgtVar.c()) != elha.GIF_CHOOSER) {
                                                        String string = uriI.toString();
                                                        catbVar.copyOnWrite();
                                                        catc catcVar = (catc) catbVar.instance;
                                                        string.getClass();
                                                        evtg evtgVar = catcVar.b;
                                                        if (!evtgVar.c()) {
                                                            catcVar.b = evsn.mutableCopy(evtgVar);
                                                        }
                                                        catcVar.b.add(string);
                                                        if (((catc) catbVar.instance).b.size() >= ((Integer) catu.c.e()).intValue()) {
                                                            catuVar3.j.a((catc) catbVar.build());
                                                            catbVar.copyOnWrite();
                                                            ((catc) catbVar.instance).b = evsn.emptyProtobufList();
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        bsgtVar.close();
                                        if (((catc) catbVar.instance).b.size() > 0) {
                                            catuVar3.j.a((catc) catbVar.build());
                                        }
                                        if (((cdyj) cdyiVar.instance).b.size() > 0) {
                                            ((cazj) catuVar3.l.a.b()).a(cbcu.f("delete_part_cms_attachment", (cdyj) cdyiVar.build()));
                                        }
                                        cdvsVarF = elka.b(catxVar4.e) == elka.CONVERSATION_FROM_CMS_ACTION ? ((cdww) catuVar3.n.b()).f(conversationIdType3, superSortLabelA, j) : ((cdww) catuVar3.n.b()).e(conversationIdType3, superSortLabelA, j);
                                        zC = cdvsVarF.c();
                                        ((cdww) catuVar3.n.b()).h(conversationIdType3, j);
                                    }
                                    if (zC) {
                                        cqce cqceVar = catuVar3.d;
                                        cqbd cqbdVarC3 = cqceVar.c();
                                        cqbdVarC3.I("Deleted local");
                                        cqbdVarC3.c(conversationIdType3);
                                        cqbdVarC3.z("maxTimestampToDelete", j);
                                        cqbdVarC3.r();
                                        ekfw ekfwVar = new ekfw();
                                        ekrw ekrwVarH = catu.a.h();
                                        ekrwVarH.X(eksq.a, "BugleNotifications");
                                        ekrd ekrdVar = (ekrd) ekrwVarH;
                                        ekrdVar.X(cqnc.r, conversationIdType3.toString());
                                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler", "deleteLocallyAndQueue", 342, "DeleteConversationHandler.java")).q("Deleting conversation, canceling IM notification (handler)");
                                        ((cgpi) catuVar3.A.b()).a(conversationIdType3);
                                        if (!superSortLabelA.b() || botm.b(conversationIdType3) == null) {
                                            ((cgoq) catuVar3.e.b()).d(conversationIdType3);
                                            catuVar3.x.d(conversationIdType3);
                                            catuVar3.u.ifPresent(new Consumer() { // from class: catr
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj2) {
                                                    ((cqdn) obj2).g();
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            cczi ccziVar = avos.a;
                                            if (!((Boolean) ccziVar.e()).booleanValue() && cnqjVar.c()) {
                                                cauk caukVar = catuVar3.i;
                                                caui cauiVar = (caui) cauj.a.createBuilder();
                                                long jA = cnqk.a(cnqjVar);
                                                cauiVar.copyOnWrite();
                                                ((cauj) cauiVar.instance).c = jA;
                                                cauiVar.copyOnWrite();
                                                ((cauj) cauiVar.instance).d = j;
                                                ((cazj) caukVar.a.b()).a(cbcu.f("delete_thread_from_telephony", (cauj) cauiVar.build()));
                                            } else if (!zD) {
                                                if (!((Boolean) ccziVar.e()).booleanValue()) {
                                                    cqbd cqbdVarE3 = cqceVar.e();
                                                    cqbdVarE3.I("Local conversation");
                                                    cqbdVarE3.c(conversationIdType3);
                                                    cqbdVarE3.I("has an invalid telephony thread id; will delete messages individually.");
                                                    cqbdVarE3.r();
                                                }
                                                if (cdvsVarF != null) {
                                                    ekgb<Uri> ekgbVarB = cdvsVarF.b();
                                                    caud caudVar2 = (caud) caue.a.createBuilder();
                                                    for (Uri uri : ekgbVarB) {
                                                        if (uri != null) {
                                                            caudVar2.a(uri.toString());
                                                            if (((caue) caudVar2.instance).c.size() >= ((Integer) catu.b.e()).intValue()) {
                                                                catuVar3.k.a((caue) caudVar2.build());
                                                                caudVar2.copyOnWrite();
                                                                ((caue) caudVar2.instance).c = evsn.emptyProtobufList();
                                                            }
                                                        }
                                                    }
                                                    if (((caue) caudVar2.instance).c.size() > 0) {
                                                        catuVar3.k.a((caue) caudVar2.build());
                                                    }
                                                }
                                            } else if (strArrF != null) {
                                                catuVar3.m.b(catuVar3.f, strArrF);
                                            }
                                            runnable.run();
                                            cbcwVarJ = cbcw.j(ekfwVar.g());
                                        } else {
                                            cbcwVarJ = cbcw.j(ekfwVar.g());
                                        }
                                    } else {
                                        if (!catxVar4.d) {
                                            cqbd cqbdVarE4 = catuVar3.d.e();
                                            cqbdVarE4.I("Could not delete local");
                                            cqbdVarE4.c(conversationIdType3);
                                            cqbdVarE4.r();
                                            if (elka.b(catxVar4.e) != elka.CONVERSATION_FROM_CMS_ACTION) {
                                                catuVar3.y.a();
                                            }
                                        }
                                        cbcwVarJ = cbcw.i();
                                    }
                                    return cbcwVarJ;
                                } finally {
                                    catuVar3.w.e(ajfo.h);
                                }
                            }
                        });
                    }
                }, catuVar.g);
            }
        }, eoscVar);
    }
}
