package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxj implements bayh, bayb, baye, baxz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager");
    public final long b;
    public final long c;
    public final long d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fdjx j;
    private final fcsu k;
    private final fctc l;
    private final cohg m;

    public ccxj(long j, long j2, long j3, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.j = fdjxVar;
        this.e = fcsuVar;
        this.k = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.l = fctd.a(new fdae() { // from class: ccxf
            @Override // defpackage.fdae
            public final Object invoke() {
                return new cub((int) this.a.d);
            }
        });
        this.m = new cohf("EmergencySessionManagerImpl::createTraceSpan");
    }

    public static final void f(final amqj amqjVar) {
        amqk.b(amqjVar).q(new Function() { // from class: ccxg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpfn bpfnVar = (bpfn) obj;
                amqj amqjVar2 = amqjVar;
                bpfnVar.b(amqjVar2.a);
                bpfnVar.c(amqjVar2.b);
                return bpfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private final void h(MessageCoreData messageCoreData) {
        auvw.k(this.j, null, null, new ccxi(this, messageCoreData, null), 3);
    }

    @Override // defpackage.bayh
    public final void a(MessageCoreData messageCoreData) {
        if (((aquo) this.k.b()).a()) {
            cub cubVarB = b();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            if (!fdbq.f(cubVarB.c(conversationIdTypeA), false)) {
                h(messageCoreData);
                return;
            }
            ekrd ekrdVar = (ekrd) a.g();
            ekrdVar.X(cqnc.s, messageCoreData.A());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "onProcessSendSuccess", 149, "EmergencySessionManager.kt")).q("onProcessSendSuccess called but conversation is not emergency RCS.");
        }
    }

    public final cub b() {
        return (cub) this.l.a();
    }

    @Override // defpackage.bayh, defpackage.baye
    public final eieu c() {
        return this.m.a();
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        gb(messageCoreData);
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void e(String str) {
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        if (((aquo) this.k.b()).a()) {
            cub cubVarB = b();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            if (!fdbq.f(cubVarB.c(conversationIdTypeA), false)) {
                h(messageCoreData);
                return;
            }
            ekrd ekrdVar = (ekrd) a.g();
            ekrdVar.X(cqnc.s, messageCoreData.A());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "afterMessageInsertedInCriticalPath", 126, "EmergencySessionManager.kt")).q("afterMessageInsertedInCriticalPath called but conversation is not emergency RCS.");
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.baye
    public final /* synthetic */ void l(long j, fhaz fhazVar) {
    }
}
