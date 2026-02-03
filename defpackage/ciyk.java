package defpackage;

import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyk implements ciys {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy");
    public final eosc b;
    public final asrc c;
    public final cjcb d;
    public final cjae e;
    private final eosc f;
    private final eosc g;
    private final crru h;
    private final BiFunction i;
    private final ciyd j;

    public ciyk(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, asrc asrcVar, cjcb cjcbVar, crru crruVar, BiFunction biFunction, ciyd ciydVar, cjae cjaeVar) {
        this.f = eoscVar;
        this.g = eoscVar2;
        this.c = asrcVar;
        this.d = cjcbVar;
        this.b = eoscVar3;
        this.h = crruVar;
        this.i = biFunction;
        this.j = ciydVar;
        this.e = cjaeVar;
    }

    @Override // defpackage.ciys
    public final eiju a(auib auibVar) {
        return this.j.a(this.h.a(this.i, RcsMessagingService.class).h(new ejvr() { // from class: ciye
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((RcsMessagingService) obj).getMessages(GetMessagesRequest.a);
            }
        }, this.g).i(new eooz() { // from class: ciyf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (!MessagingResult.d.equals(getMessagesResponse.a())) {
                    ekrw ekrwVarJ = ciyk.a.j();
                    ekrwVarJ.X(eksq.a, "BugleRcs");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 90, "GetAllMessagesStrategy.java")).q("Fetching incoming RCS messages failed");
                    return eijx.e(null);
                }
                ciyk ciykVar = this.a;
                ekgb ekgbVarB = getMessagesResponse.b();
                ciykVar.e.b(ekgbVarB.size());
                if (ekgbVarB.isEmpty()) {
                    ekrw ekrwVarJ2 = ciyk.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleRcs");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 97, "GetAllMessagesStrategy.java")).q("Fetching incoming RCS messages successful but no messages returned from GetAllMessagesStrategy");
                    return eijx.e(null);
                }
                ekfw ekfwVar = new ekfw();
                ekgb ekgbVarB2 = getMessagesResponse.b();
                int size = ekgbVarB2.size();
                for (int i = 0; i < size; i++) {
                    MessageNotification messageNotification = (MessageNotification) ekgbVarB2.get(i);
                    final basd basdVarA = basd.a(messageNotification.b().h());
                    eiju eijuVarA = ciykVar.d.a(messageNotification);
                    final asrc asrcVar = ciykVar.c;
                    asrcVar.getClass();
                    eooz eoozVar = new eooz() { // from class: ciyh
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return asrcVar.f((aufh) obj2);
                        }
                    };
                    eosc eoscVar = ciykVar.b;
                    ekfwVar.h(eijuVarA.i(eoozVar, eoscVar).h(new ejvr() { // from class: ciyi
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            aubl aublVar = (aubl) obj2;
                            aubk aubkVar = aubk.OK;
                            aubk aubkVarB = aubk.b(aublVar.c);
                            if (aubkVarB == null) {
                                aubkVarB = aubk.UNKNOWN_STATUS;
                            }
                            basd basdVar = basdVarA;
                            if (aubkVar.equals(aubkVarB)) {
                                ekrw ekrwVarE = ciyk.a.e();
                                ekrwVarE.X(eksq.a, "BugleRcs");
                                ekrd ekrdVar = (ekrd) ekrwVarE;
                                ekrdVar.X(cqnc.e, basdVar.toString());
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "maybeLogResults", 149, "GetAllMessagesStrategy.java")).q("Processing incoming RCS message success");
                                return null;
                            }
                            ekrw ekrwVarJ3 = ciyk.a.j();
                            ekrwVarJ3.X(eksq.a, "BugleRcs");
                            ekrd ekrdVar2 = (ekrd) ekrwVarJ3;
                            ekrdVar2.X(cqnc.e, basdVar.toString());
                            ekrdVar2.X(atnw.a, aublVar);
                            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "maybeLogResults", 145, "GetAllMessagesStrategy.java")).q("Processing incoming RCS message failed");
                            return null;
                        }
                    }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: ciyj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarI = ciyk.a.i();
                            ekrwVarI.X(eksq.a, "BugleRcs");
                            ekrd ekrdVar = (ekrd) ekrwVarI;
                            ekrdVar.X(cqnc.e, basdVarA.toString());
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "processMessages", 131, "GetAllMessagesStrategy.java")).q("Ignoring invalid incoming RCS message");
                            return null;
                        }
                    }, eoscVar));
                }
                return eijx.j(ekfwVar.g()).b(new eooy() { // from class: ciyg
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ekrw ekrwVarH = ciyk.a.h();
                        ekrwVarH.X(eksq.a, "BugleRcs");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 108, "GetAllMessagesStrategy.java")).q("Finished processing incoming RCS messages");
                        return eijx.e(null);
                    }
                }, ciykVar.b);
            }
        }, this.f), "GetMessages");
    }

    @Override // defpackage.ciys
    public final /* synthetic */ void b() {
    }
}
