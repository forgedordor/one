package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgpk implements cgpi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationDirectorImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final asjn e;
    public final asjm f;
    public final asjp g;
    private final fcsu h;
    private final fcsu i;
    private final arpr j;
    private final fcsu k;
    private final fcsu l;

    public cgpk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, arpr arprVar, fcsu fcsuVar6, fcsu fcsuVar7, asjn asjnVar, asjm asjmVar, asjp asjpVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.h = fcsuVar3;
        this.d = fcsuVar4;
        this.i = fcsuVar5;
        this.j = arprVar;
        this.k = fcsuVar6;
        this.l = fcsuVar7;
        this.e = asjnVar;
        this.f = asjmVar;
        this.g = asjpVar;
    }

    @Override // defpackage.cgpi
    public final void a(ConversationIdType conversationIdType) {
        ((cgkj) this.b.b()).b(cglf.NT_INCOMING_MESSAGE, ((cgql) this.h.b()).a(conversationIdType));
    }

    @Override // defpackage.cgpi
    public final void b(final ConversationIdType conversationIdType, final Duration duration, final boolean z) {
        if (!this.j.a()) {
            eiju eijuVarB = ((akbs) this.i.b()).b(new BugleConversationId(conversationIdType));
            ejvr ejvrVar = new ejvr() { // from class: cgpj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    akbr akbrVar = (akbr) obj;
                    int iOrdinal = akbrVar.ordinal();
                    cgpk cgpkVar = this.a;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            ((cgrx) cgpkVar.d.b()).a(new BugleConversationId(conversationIdType2));
                            return null;
                        }
                        if (iOrdinal != 3) {
                            throw new IllegalStateException(String.format("Unknown ConversationTrustedContactsNotificationState: %s", akbrVar.name()));
                        }
                        if (!cgpkVar.e.a() && !cgpkVar.f.a() && !cgpkVar.g.a()) {
                            throw new IllegalStateException(String.format("Unknown ConversationTrustedContactsNotificationState: %s", akbrVar.name()));
                        }
                        ekrw ekrwVarH = cgpk.a.h();
                        ekrwVarH.X(eksq.a, "BugleNotifications");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrdVar.X(cqnc.S, "IncomingMessageNotificationDirectorImpl");
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationDirectorImpl", "queueNotificationBasedOnParentApprovalStatus", 173, "IncomingMessageNotificationDirectorImpl.java")).t("Skipping notification enqueue for conversationId=%s", conversationIdType2.a());
                        return null;
                    }
                    boolean z2 = z;
                    Duration duration2 = duration;
                    cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
                    String strA = conversationIdType2.a();
                    cgos cgosVar = (cgos) cgov.a.createBuilder();
                    long millis = duration2.toMillis();
                    cgosVar.copyOnWrite();
                    cgov cgovVar = (cgov) cgosVar.instance;
                    cgovVar.b |= 1;
                    cgovVar.c = millis;
                    cgpbVar.a(strA, (cgov) cgosVar.build());
                    cgpbVar.copyOnWrite();
                    cgpd cgpdVar = (cgpd) cgpbVar.instance;
                    cgpdVar.b |= 2;
                    cgpdVar.e = false;
                    cgpbVar.copyOnWrite();
                    cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
                    cgpdVar2.b |= 1;
                    cgpdVar2.d = false;
                    ((cgkj) cgpkVar.b.b()).d((cgiw) cgpkVar.c.b(), (cgpd) cgpbVar.build(), z2);
                    return null;
                }
            };
            fcsu fcsuVar = this.l;
            eijuVarB.h(ejvrVar, (Executor) fcsuVar.b()).k(auvh.b(), (Executor) fcsuVar.b());
            return;
        }
        String strA = conversationIdType.a();
        cgqt cgqtVar = (cgqt) this.k.b();
        cgqu cgquVar = (cgqu) cgqv.a.createBuilder();
        cgquVar.copyOnWrite();
        cgqv cgqvVar = (cgqv) cgquVar.instance;
        strA.getClass();
        cgqvVar.b |= 1;
        cgqvVar.c = strA;
        long millis = duration.toMillis();
        cgquVar.copyOnWrite();
        cgqv cgqvVar2 = (cgqv) cgquVar.instance;
        cgqvVar2.b |= 2;
        cgqvVar2.d = millis;
        cgquVar.copyOnWrite();
        cgqv cgqvVar3 = (cgqv) cgquVar.instance;
        cgqvVar3.b |= 4;
        cgqvVar3.e = z;
        cgqv cgqvVar4 = (cgqv) cgquVar.build();
        caxr caxrVar = new caxr();
        caxrVar.a = strA;
        ((cazj) cgqtVar.a.b()).g(cbcu.g("CONVERSATION_NOTIFICATION", cgqvVar4, caxrVar.a()));
    }

    @Override // defpackage.cgpi
    public final void c() {
        cgkj cgkjVar = (cgkj) this.b.b();
        cgiw cgiwVar = (cgiw) this.c.b();
        cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
        cgpbVar.copyOnWrite();
        cgpd cgpdVar = (cgpd) cgpbVar.instance;
        cgpdVar.b |= 2;
        cgpdVar.e = false;
        cgpbVar.copyOnWrite();
        cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
        cgpdVar2.b |= 1;
        cgpdVar2.d = true;
        cgpbVar.copyOnWrite();
        cgpd cgpdVar3 = (cgpd) cgpbVar.instance;
        cgpdVar3.b |= 4;
        cgpdVar3.f = true;
        cgkjVar.d(cgiwVar, (cgpd) cgpbVar.build(), true);
    }

    @Override // defpackage.cgpi
    public final void d() {
        cgkj cgkjVar = (cgkj) this.b.b();
        cgiw cgiwVar = (cgiw) this.c.b();
        cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
        cgpbVar.copyOnWrite();
        cgpd cgpdVar = (cgpd) cgpbVar.instance;
        cgpdVar.b |= 2;
        cgpdVar.e = false;
        cgpbVar.copyOnWrite();
        cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
        cgpdVar2.b |= 1;
        cgpdVar2.d = false;
        cgkjVar.d(cgiwVar, (cgpd) cgpbVar.build(), true);
    }

    @Override // defpackage.cgpi
    public final void e() {
        cgkj cgkjVar = (cgkj) this.b.b();
        cgiw cgiwVar = (cgiw) this.c.b();
        cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
        cgpbVar.copyOnWrite();
        cgpd cgpdVar = (cgpd) cgpbVar.instance;
        cgpdVar.b |= 2;
        cgpdVar.e = true;
        cgpbVar.copyOnWrite();
        cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
        cgpdVar2.b |= 1;
        cgpdVar2.d = false;
        cgkjVar.d(cgiwVar, (cgpd) cgpbVar.build(), true);
    }
}
