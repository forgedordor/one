package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajqk extends cayv {
    public static final eksp a = eksp.c("BugleDataModel");
    public final Context b;
    public final bxlc c;
    public final eosc d;
    public final eosc e;
    public final eosc f;
    public final cmqj g;
    public final fcsu h;
    public final fcsu i;
    public final bxjh j;
    public final auuh k;
    public final ayqn l;
    public final cggc m;
    public final cggg n;
    private final crmx o;

    public ajqk(crmx crmxVar, Context context, bxlc bxlcVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cmqj cmqjVar, fcsu fcsuVar, fcsu fcsuVar2, bxjh bxjhVar, auuh auuhVar, ayqn ayqnVar, cggc cggcVar, cggg cgggVar) {
        this.o = crmxVar;
        this.b = context;
        this.c = bxlcVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = eoscVar3;
        this.g = cmqjVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = bxjhVar;
        this.k = auuhVar;
        this.l = ayqnVar;
        this.m = cggcVar;
        this.n = cgggVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("MarkMessagesAsReadHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ajpx.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ajpx ajpxVar = (ajpx) evuhVar;
        if (!this.o.G()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 124, "MarkMessagesAsReadHandler.java")).q("Not default SMS app. Can't mark as read.");
            return eijx.e(cbcw.k());
        }
        Stream map = Collection.EL.stream(ajpxVar.b).filter(new Predicate() { // from class: ajqb
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
                eksp ekspVar = ajqk.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).map(new Function() { // from class: ajqc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = ajqk.a;
                return bary.b((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        ekgb ekgbVar = (ekgb) map.collect(collector);
        if (ekgbVar.isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 135, "MarkMessagesAsReadHandler.java")).q("MessageIds list is empty.");
            return eijx.e(cbcw.k());
        }
        if (ekgbVar.size() != ajpxVar.b.size()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 138, "MarkMessagesAsReadHandler.java")).q("Some message ids are invalid.");
        }
        final boolean z = ajpxVar.c;
        final ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: ajpy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final MessageIdType messageIdType = (MessageIdType) obj;
                final ajqk ajqkVar = this.a;
                final boolean z2 = z;
                return eijx.g(new Callable() { // from class: ajqf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ajqk ajqkVar2 = ajqkVar;
                        baxe baxeVar = (baxe) ajqkVar2.i.b();
                        MessageIdType messageIdType2 = messageIdType;
                        MessageCoreData messageCoreDataA = baxeVar.A(messageIdType2);
                        if (messageCoreDataA == null) {
                            eksl ekslVar = (eksl) ajqk.a.j();
                            ekslVar.X(cqnc.a, messageIdType2.b());
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "markMessageAsRead", 186, "MarkMessagesAsReadHandler.java")).q("Failed to find message data");
                            return null;
                        }
                        boolean z3 = z2;
                        String[] strArr = MessagesTable.a;
                        brdu brduVar = new brdu();
                        brduVar.ap("markMessageAsRead-messages");
                        brduVar.F(true);
                        brec brecVar = new brec();
                        brecVar.p(messageCoreDataA.C());
                        if (z3) {
                            brduVar.v(true);
                            brecVar.b(new Function() { // from class: ajqi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar2 = (brec) obj2;
                                    eksp ekspVar = ajqk.a;
                                    brecVar2.O(false);
                                    return brecVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ajpz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar2 = (brec) obj2;
                                    eksp ekspVar = ajqk.a;
                                    brecVar2.E();
                                    return brecVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        } else {
                            brecVar.O(false);
                        }
                        brduVar.W(brecVar);
                        if (brduVar.b().e() > 0) {
                            bxlc bxlcVar = ajqkVar2.c;
                            bxlcVar.l(messageCoreDataA.A(), messageCoreDataA.C(), "read");
                            bxlcVar.d(messageCoreDataA.A());
                        }
                        String[] strArr2 = bofr.a;
                        bofo bofoVar = new bofo();
                        bofoVar.ap("markMessageAsRead-conversations");
                        bofoVar.c();
                        MessageIdType messageIdTypeC = messageCoreDataA.C();
                        bofq bofqVar = new bofq();
                        bofqVar.b(messageIdTypeC);
                        bofoVar.ae(new bofp(bofqVar), "conversation_suggestions-buildAndUpdateForTargetMessageId");
                        ajqkVar2.m.a(cggb.a);
                        ajqkVar2.n.b();
                        return messageCoreDataA;
                    }
                }, ajqkVar.d).i(new eooz() { // from class: ajqg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final MessageCoreData messageCoreData = (MessageCoreData) obj2;
                        if (messageCoreData == null) {
                            return eijx.e(ajqj.FAILED);
                        }
                        final boolean z3 = z2;
                        final ajqk ajqkVar2 = ajqkVar;
                        eiju eijuVarP = ajqkVar2.l.d(messageCoreData.C(), elny.MARK_MESSAGE_AS_READ).p();
                        eooz eoozVar = new eooz() { // from class: ajqd
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                final ajqk ajqkVar3 = ajqkVar2;
                                final MessageCoreData messageCoreData2 = messageCoreData;
                                final boolean z4 = z3;
                                return eijx.f(new Runnable() { // from class: ajqh
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ajqk ajqkVar4 = ajqkVar3;
                                        bxjh bxjhVar = ajqkVar4.j;
                                        MessageCoreData messageCoreData3 = messageCoreData2;
                                        cnqj cnqjVarA = bxjhVar.a(messageCoreData3.A());
                                        fcsu fcsuVar = ajqkVar4.h;
                                        if (((auue) fcsuVar.b()).d(messageCoreData3.A(), cnqjVarA)) {
                                            auue auueVar = (auue) fcsuVar.b();
                                            ConversationIdType conversationIdTypeA = messageCoreData3.A();
                                            String[] strArr = MessagesTable.a;
                                            brec brecVar = new brec();
                                            brecVar.p(messageCoreData3.C());
                                            String[] strArrF = auueVar.f(conversationIdTypeA, new brdv(brecVar));
                                            if (strArrF != null) {
                                                ajqkVar4.k.f(ajqkVar4.b, strArrF, z4);
                                            }
                                        }
                                        if (cnqjVarA.c()) {
                                            Uri uriU = messageCoreData3.u();
                                            if (uriU != null) {
                                                ajqkVar4.g.Y(uriU);
                                                return;
                                            }
                                            eksl ekslVar = (eksl) ajqk.a.j();
                                            ekslVar.X(cqnc.a, messageCoreData3.C().b());
                                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "doBackgroundWork", 279, "MarkMessagesAsReadHandler.java")).q("Message has a null uri");
                                        }
                                    }
                                }, ajqkVar3.f);
                            }
                        };
                        eosc eoscVar = ajqkVar2.e;
                        return eijuVarP.i(eoozVar, eoscVar).h(new ejvr() { // from class: ajqe
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                eksp ekspVar = ajqk.a;
                                return ajqj.SUCCEEDED;
                            }
                        }, eoscVar);
                    }
                }, ajqkVar.e);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
        return eijx.j(ekgbVar2).a(new Callable() { // from class: ajqa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = ajqk.a;
                ekgb ekgbVar3 = ekgbVar2;
                int size = ekgbVar3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object objQ = eork.q((eiju) ekgbVar3.get(i2));
                    i2++;
                    if (objQ == ajqj.SUCCEEDED) {
                        return cbcw.i();
                    }
                }
                return cbcw.k();
            }
        }, this.e);
    }
}
