package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgfh extends cayv {
    public static final eksp a = eksp.c("BugleNotifications");
    public final Context b;
    public final cgbn c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final bxlc h;
    public final cogw i;
    public final cgdh j;
    public final dqsn k;
    public final fcsu l;
    public final auuh m;
    private final eosc n;

    public cgfh(eosc eoscVar, Context context, cgbn cgbnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, bxlc bxlcVar, auuh auuhVar, cogw cogwVar, cgdh cgdhVar, dqsn dqsnVar, fcsu fcsuVar5) {
        this.n = eoscVar;
        this.b = context;
        this.c = cgbnVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = bxlcVar;
        this.m = auuhVar;
        this.i = cogwVar;
        this.j = cgdhVar;
        this.k = dqsnVar;
        this.l = fcsuVar5;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).c = elgm.MARK_AS_NOTIFIED_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("MarkAsNotifiedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cgfj.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cgfj cgfjVar = (cgfj) evuhVar;
        return eijx.g(new Callable() { // from class: cgfd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cgfh cgfhVar = this.a;
                final cgfj cgfjVar2 = cgfjVar;
                try {
                    cogw cogwVar = cgfhVar.i;
                    Instant instantF = cogwVar.f();
                    String[] strArr = (String[]) cgfhVar.k.c("MarkAsNotifiedHandler#processPendingWorkItemAsync", new ejxr() { // from class: cgfe
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejxr
                        public final Object get() {
                            String[] strArrF;
                            cgfj cgfjVar3 = cgfjVar2;
                            String.valueOf(cgfjVar3.b);
                            boolean z = cqca.b;
                            String[] strArr2 = MessagesTable.a;
                            brec brecVar = new brec();
                            brecVar.E();
                            if (cgfjVar3.b.size() > 0) {
                                brecVar.o(barn.d(cgfjVar3.b));
                            }
                            final cgfh cgfhVar2 = cgfhVar;
                            if (cgfjVar3.b.size() == 0) {
                                auue auueVar = (auue) cgfhVar2.d.b();
                                ConversationIdType conversationIdType = barn.a;
                                brec brecVar2 = new brec();
                                brecVar2.E();
                                strArrF = auueVar.f(conversationIdType, new brdv(brecVar2));
                                if (strArrF == null) {
                                    strArrF = new String[0];
                                }
                            } else {
                                ArrayList arrayList = new ArrayList();
                                ekgb ekgbVarD = barn.d(cgfjVar3.b);
                                int size = ekgbVarD.size();
                                for (int i = 0; i < size; i++) {
                                    ConversationIdType conversationIdType2 = (ConversationIdType) ekgbVarD.get(i);
                                    cnqj cnqjVarA = ((bxjh) cgfhVar2.e.b()).a(conversationIdType2);
                                    fcsu fcsuVar = cgfhVar2.d;
                                    if (((auue) fcsuVar.b()).d(conversationIdType2, cnqjVarA)) {
                                        auue auueVar2 = (auue) fcsuVar.b();
                                        brec brecVar3 = new brec();
                                        brecVar3.E();
                                        String[] strArrF2 = auueVar2.f(conversationIdType2, new brdv(brecVar3));
                                        if (strArrF2 != null) {
                                            Collections.addAll(arrayList, strArrF2);
                                        }
                                    }
                                }
                                strArrF = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            }
                            brdu brduVar = new brdu();
                            brduVar.ap("markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate");
                            brduVar.v(true);
                            brduVar.W(brecVar);
                            int iE = brduVar.b().e();
                            if (iE > 0) {
                                Collection.EL.stream(cgfjVar3.b).forEach(new Consumer() { // from class: cgff
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        cgfhVar2.h.k(barn.b((String) obj));
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            ((eksl) ((eksl) cgfh.a.h()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkAsNotifiedHandler", "markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate", 208, "MarkAsNotifiedHandler.java")).B("Marking conversation(s) %s as notified (updateCount %d)", cgfjVar3.b, iE);
                            return strArrF;
                        }
                    });
                    if (strArr.length > 0) {
                        cgfhVar.m.e(cgfhVar.b, strArr);
                    }
                    if (cgfjVar2.b.size() > 0) {
                        Collection.EL.stream(cgfjVar2.b).forEach(new Consumer() { // from class: cgfg
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                cgfhVar.c.f().a(barn.b((String) obj));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    } else {
                        cgfhVar.c.f().a(barn.a);
                    }
                    cgrg cgrgVar = (cgrg) cgfhVar.l.b();
                    cgrgVar.a.c(cglf.NT_SECONDARY_USER);
                    if (cgfjVar2.c) {
                        cgfhVar.j.e(3, Duration.between(instantF, cogwVar.f()));
                    }
                    cbcu cbcuVarB = cggc.b();
                    return cbcw.j(ekgb.s(cbcuVarB, cggg.c()));
                } catch (RuntimeException e) {
                    if (cgfjVar2.c) {
                        cgfhVar.j.g(envi.MESSAGE_TYPE_UNKNOWN, 4, cgdh.c(e), Optional.of(Boolean.valueOf(cgfjVar2.c)));
                    }
                    throw e;
                }
            }
        }, this.n);
    }
}
