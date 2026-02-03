package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnh extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler");
    static final cczi b = cdag.h(cdag.b, "disable_logging_otp_auto_delete_handler_process_count", false);
    public final cdys c;
    public final fcsu d;
    public final fcsu e;
    public final appk f;
    public final fcsu g;
    public final fcsu h;
    private final eosc i;
    private final agnw j;
    private final fcsu k;
    private final agoo l;

    public agnh(eosc eoscVar, cdys cdysVar, agnw agnwVar, fcsu fcsuVar, fcsu fcsuVar2, agoo agooVar, fcsu fcsuVar3, appk appkVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.i = eoscVar;
        this.c = cdysVar;
        this.j = agnwVar;
        this.k = fcsuVar;
        this.d = fcsuVar2;
        this.l = agooVar;
        this.e = fcsuVar3;
        this.f = appkVar;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        pzh pzhVar = new pzh();
        if (((Boolean) agnl.d.e()).booleanValue()) {
            pzhVar.b = true;
        }
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("OtpDeletionHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return agnk.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final agnk agnkVar = (agnk) evuhVar;
        if (!((Boolean) b.e()).booleanValue()) {
            ((ains) this.k.b()).e("OTP.Auto.Delete.Handler.Process.Count", 1);
        }
        this.l.d(agnkVar.c, 3);
        if (((Boolean) agnl.a.e()).booleanValue()) {
            return this.j.a().h(new ejvr() { // from class: agng
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    agnh agnhVar = this.a;
                    if (!zBooleanValue) {
                        if (((arpw) agnhVar.h.b()).a()) {
                            ekrw ekrwVarH = agnh.a.h();
                            ekrwVarH.X(eksq.a, "BugleOtp");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler", "processPendingWorkItemAsync", 166, "OtpDeletionHandler.java")).q("Not processing OTP deletion job because setting is disabled.");
                        }
                        return cbcw.i();
                    }
                    final agnk agnkVar2 = agnkVar;
                    if (((arpw) agnhVar.h.b()).a()) {
                        ekrw ekrwVarH2 = agnh.a.h();
                        ekrwVarH2.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler", "processPendingWorkItemAsync", 172, "OtpDeletionHandler.java")).t("Running OtpDeletionHandler. SessionId %s.", agnkVar2.c);
                    } else {
                        ekrw ekrwVarH3 = agnh.a.h();
                        ekrwVarH3.X(eksq.a, "BugleOtp");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler", "processPendingWorkItemAsync", 175, "OtpDeletionHandler.java")).q("Running OtpDeletionHandler.");
                    }
                    eieu eieuVarK = eiiy.k("OtpDeletionHandler#deleteOtpMessages");
                    try {
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        ekfw ekfwVar2 = new ekfw();
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("OtpDeletionHandler#processPendingWorkItemAsync");
                        brdrVarD.h(new Function() { // from class: agmz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar = (brec) obj2;
                                ekrg ekrgVar = agnh.a;
                                brecVar.t((Iterable) Collection.EL.stream(agnkVar2.b).map(new Function() { // from class: agmx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        ekrg ekrgVar2 = agnh.a;
                                        return bary.b((String) obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new Supplier() { // from class: agmy
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new ArrayList();
                                    }
                                })));
                                brecVar.ag(100);
                                brecVar.al(117);
                                bpzs bpzsVarA = bpzx.a();
                                bpzsVarA.A("isOtp");
                                bpzsVarA.d(new Function() { // from class: agnd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        ekrg ekrgVar2 = agnh.a;
                                        return ((bpzc) obj3).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bpzsVarA.e(new Function() { // from class: agne
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bpzw bpzwVar = (bpzw) obj3;
                                        ekrg ekrgVar2 = agnh.a;
                                        bpzwVar.e(new dqxl("$V", new Object[]{MessagesTable.c.a}));
                                        return bpzwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bpzsVarA.e(new Function() { // from class: agnf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bpzw bpzwVar = (bpzw) obj3;
                                        ekrg ekrgVar2 = agnh.a;
                                        bpzwVar.b(1);
                                        return bpzwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brecVar.ar(new dqwh(bpzsVarA.b()));
                                bsbo bsboVarE = ParticipantsTable.e();
                                bsboVarE.A("isNotContact");
                                bsboVarE.f(new Function() { // from class: agnb
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        ekrg ekrgVar2 = agnh.a;
                                        return ((brzh) obj3).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bsboVarE.h(new Function() { // from class: agnc
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bsbx bsbxVar = (bsbx) obj3;
                                        ekrg ekrgVar2 = agnh.a;
                                        bsbxVar.ap(new dqpk("participants._id", 1, new dqxl("$V", new Object[]{MessagesTable.c.c})));
                                        bsbxVar.q();
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brecVar.ar(new dqwh(bsboVarE.b()));
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdrVarD.e(new Function() { // from class: agna
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bran branVar = (bran) obj2;
                                ekrg ekrgVar = agnh.a;
                                return new brao[]{branVar.a, branVar.b};
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brap brapVar = (brap) brdrVarD.b().p();
                        try {
                            if (((arqj) agnhVar.g.b()).a()) {
                                ekgc ekgcVar = new ekgc();
                                while (brapVar.moveToNext()) {
                                    ekgcVar.b(brapVar.p(), brapVar.q());
                                    MessageCoreData messageCoreDataW = ((baxe) agnhVar.e.b()).w(brapVar.q());
                                    if (messageCoreDataW != null) {
                                        ekfwVar2.h(messageCoreDataW);
                                    }
                                }
                                ekgd ekgdVarA = ekgcVar.a();
                                ekqg ekqgVarListIterator = ekgdVarA.x().listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    ekgb ekgbVarA = ekgdVarA.a((ConversationIdType) ekqgVarListIterator.next());
                                    if (agnhVar.f.a()) {
                                        agnhVar.c.g(ekgbVarA, cdyt.OTP_DELETION);
                                    } else {
                                        agnhVar.c.f(ekgbVarA);
                                    }
                                }
                            } else {
                                while (brapVar.moveToNext()) {
                                    ekfwVar.h(brapVar.q());
                                    MessageCoreData messageCoreDataW2 = ((baxe) agnhVar.e.b()).w(brapVar.q());
                                    if (messageCoreDataW2 != null) {
                                        ekfwVar2.h(messageCoreDataW2);
                                    }
                                }
                                if (agnhVar.f.a()) {
                                    agnhVar.c.g(ekfwVar.g(), cdyt.OTP_DELETION);
                                } else {
                                    agnhVar.c.f(ekfwVar.g());
                                }
                            }
                            final ekgb ekgbVarG = ekfwVar2.g();
                            if (!ekgbVarG.isEmpty()) {
                                final admk admkVar = (admk) agnhVar.d.b();
                                if (((Boolean) adml.a.e()).booleanValue()) {
                                    ((ekrd) ((ekrd) admk.a.h()).h("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger", "logAutoDelete", 44, "AutoDeletedMessagesEventLogger.java")).q("Not logging auto delete event because logging is disabled");
                                } else {
                                    ((ekrd) ((ekrd) admk.a.h()).h("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger", "logAutoDelete", 47, "AutoDeletedMessagesEventLogger.java")).q("Logging auto delete event");
                                    ejwl.a(!ekgbVarG.isEmpty());
                                    admkVar.k(new Supplier() { // from class: admj
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            final enhz enhzVar = (enhz) enic.a.createBuilder();
                                            Stream stream = Collection.EL.stream(ekgbVarG);
                                            final admk admkVar2 = admkVar;
                                            stream.forEach(new Consumer() { // from class: admi
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj2) {
                                                    MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                                    enia eniaVar = (enia) enib.a.createBuilder();
                                                    fcsu fcsuVar = admkVar2.b;
                                                    long jB = ((aika) fcsuVar.b()).b(messageCoreData.A());
                                                    eniaVar.copyOnWrite();
                                                    enib enibVar = (enib) eniaVar.instance;
                                                    enibVar.b |= 4;
                                                    enibVar.e = jB;
                                                    long jD = ((aika) fcsuVar.b()).d(messageCoreData);
                                                    eniaVar.copyOnWrite();
                                                    enib enibVar2 = (enib) eniaVar.instance;
                                                    enibVar2.b |= 2;
                                                    enibVar2.d = jD;
                                                    eniaVar.copyOnWrite();
                                                    enib enibVar3 = (enib) eniaVar.instance;
                                                    enibVar3.c = 5;
                                                    enibVar3.b |= 1;
                                                    enhz enhzVar2 = enhzVar;
                                                    enhzVar2.copyOnWrite();
                                                    enic enicVar = (enic) enhzVar2.instance;
                                                    enib enibVar4 = (enib) eniaVar.build();
                                                    enic enicVar2 = enic.a;
                                                    enibVar4.getClass();
                                                    evtg evtgVar = enicVar.b;
                                                    if (!evtgVar.c()) {
                                                        enicVar.b = evsn.mutableCopy(evtgVar);
                                                    }
                                                    enicVar.b.add(enibVar4);
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            return (enic) enhzVar.build();
                                        }
                                    });
                                }
                            }
                            brapVar.close();
                            cbcw cbcwVarI = cbcw.i();
                            eieuVarK.close();
                            return cbcwVarI;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.i);
        }
        if (((arpw) this.h.b()).a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleOtp");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler", "processPendingWorkItemAsync", 155, "OtpDeletionHandler.java")).q("Not processing OTP deletion job because flag is disabled.");
        }
        return eijx.e(cbcw.i());
    }
}
