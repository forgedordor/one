package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnes implements cfoy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter");
    public final cneh b;
    public final eosc c;
    private final cmxn d;
    private final Map e;

    public cnes(Map map, cmxn cmxnVar, cneh cnehVar, eosc eoscVar) {
        this.d = cmxnVar;
        this.b = cnehVar;
        this.c = eoscVar;
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.util.Collection] */
    @Override // defpackage.cfoy
    public final eiju a(final ezjj ezjjVar) {
        eieu eieuVarK = eiiy.k("TachygramInboxMessageHandlerAdapter#handleInboxMessage");
        try {
            Map map = this.e;
            ezji ezjiVarB = ezji.b(ezjjVar.d);
            if (ezjiVarB == null) {
                ezjiVarB = ezji.UNRECOGNIZED;
            }
            cneg cnegVar = (cneg) map.get(ezjiVarB);
            ezji ezjiVarB2 = ezji.b(ezjjVar.d);
            if (ezjiVarB2 == null) {
                ezjiVarB2 = ezji.UNRECOGNIZED;
            }
            ezjiVarB2.a();
            cnegVar.getClass();
            cnjz cnjzVarA = cnegVar.a(ezjjVar);
            ?? A = cnjzVarA.a();
            ezji ezjiVarB3 = ezji.b(ezjjVar.d);
            if (ezjiVarB3 == null) {
                ezjiVarB3 = ezji.UNRECOGNIZED;
            }
            boolean zB = ekcz.b(A, ezjiVarB3);
            ezji ezjiVarB4 = ezji.b(ezjjVar.d);
            if (ezjiVarB4 == null) {
                ezjiVarB4 = ezji.UNRECOGNIZED;
            }
            ejwl.n(zB, "Tachygram does not support receiving InboxMessage.MessageType: %s", ezjiVarB4.a());
            this.d.h(ezjjVar.c);
            ezjjVar.getClass();
            eiju eijuVarH = auvw.c(cnjzVarA.a, fcyi.a, fdjz.a, new cnjy(cnjzVarA, ezjjVar, null)).h(new ejvr() { // from class: cnen
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekrw ekrwVarH = cnes.a.h();
                    ekrwVarH.X(eksq.a, "BugleTachygram");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.e, ezjjVar.c);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 96, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Incoming InboxMessage has been processed.");
                    return true;
                }
            }, eoqg.a);
            eooz eoozVar = new eooz() { // from class: cneo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cnfx cnfxVar = (cnfx) obj;
                    ekrg ekrgVar = cnes.a;
                    ekrw ekrwVarJ = ekrgVar.j();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarJ.X(ekrzVar, "BugleTachygram");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(cnfxVar);
                    ezjj ezjjVar2 = ezjjVar;
                    ekrz ekrzVar2 = cqnc.e;
                    ekrdVar.X(ekrzVar2, ezjjVar2.c);
                    ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 113, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    boolean z = cnfxVar.a;
                    dzir dzirVar = new dzir(z);
                    ezji ezjiVarB5 = ezji.b(ezjjVar2.d);
                    if (ezjiVarB5 == null) {
                        ezjiVarB5 = ezji.UNRECOGNIZED;
                    }
                    ekrdVar2.D("Tachygram could not process incoming InboxMessage. Failed with TachygramProcessingException. isPermanent: %s. messageType: %s.", dzirVar, new dziu(ezjiVarB5));
                    if (z) {
                        return eijx.e(true);
                    }
                    cnes cnesVar = this.a;
                    ekrw ekrwVarH = ekrgVar.h();
                    ekrwVarH.X(ekrzVar, "BugleTachygram");
                    ekrd ekrdVar3 = (ekrd) ekrwVarH;
                    ekrdVar3.X(ekrzVar2, ezjjVar2.c);
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "scheduleRetry", 161, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Scheduling retry for incoming message.");
                    eiju eijuVarI = ((cazj) cnesVar.b.a.b()).b(cbcu.f("tachygram_inbox_message_retry", ezjjVar2)).i(new eooz() { // from class: cnel
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cazi) obj2).b();
                        }
                    }, cnesVar.c);
                    ejvr ejvrVar = new ejvr() { // from class: cnem
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    return eijuVarI.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: cner
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return true;
                        }
                    }, eoqgVar);
                }
            };
            eosc eoscVar = this.c;
            eiju eijuVarE = eijuVarH.f(cnfx.class, eoozVar, eoscVar).e(eqcx.class, new ejvr() { // from class: cnep
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekrw ekrwVarJ = cnes.a.j();
                    ekrwVarJ.X(eksq.a, "BugleTachygram");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g((eqcx) obj);
                    ezjj ezjjVar2 = ezjjVar;
                    ekrdVar.X(cqnc.e, ezjjVar2.c);
                    ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 134, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    ezji ezjiVarB5 = ezji.b(ezjjVar2.d);
                    if (ezjiVarB5 == null) {
                        ezjiVarB5 = ezji.UNRECOGNIZED;
                    }
                    ekrdVar2.t("Tachygram could not process incoming InboxMessage. Permanently failing message due to TachygramException. messageType: %s.", new dziu(ezjiVarB5));
                    return true;
                }
            }, eoscVar).e(Throwable.class, new ejvr() { // from class: cneq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekrw ekrwVarJ = cnes.a.j();
                    ekrwVarJ.X(eksq.a, "BugleTachygram");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj);
                    ezjj ezjjVar2 = ezjjVar;
                    ekrdVar.X(cqnc.e, ezjjVar2.c);
                    ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 148, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    ezji ezjiVarB5 = ezji.b(ezjjVar2.d);
                    if (ezjiVarB5 == null) {
                        ezjiVarB5 = ezji.UNRECOGNIZED;
                    }
                    ekrdVar2.t("Tachygram could not process incoming InboxMessage. Permanently failing message. messageType %s.", new dziu(ezjiVarB5));
                    return true;
                }
            }, eoscVar);
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
