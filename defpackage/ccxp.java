package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxp extends fcyz implements fdat {
    final /* synthetic */ ccxq a;
    final /* synthetic */ efoi b;
    final /* synthetic */ epqo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxp(ccxq ccxqVar, efoi efoiVar, epqo epqoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ccxqVar;
        this.b = efoiVar;
        this.c = epqoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final ccxq ccxqVar = this.a;
        dqsn dqsnVar = (dqsn) ccxqVar.d.b();
        final efoi efoiVar = this.b;
        final epqo epqoVar = this.c;
        dqsnVar.d("IncomingSessionNotificationHandler", new Runnable() { // from class: ccxo
            @Override // java.lang.Runnable
            public final void run() {
                ccxq ccxqVar2;
                final efoi efoiVar2 = efoiVar;
                alqm alqmVar = efoiVar2.c;
                final String str = ((aubq) alqmVar.e().get()).d;
                str.getClass();
                String[] strArr = bpfo.a;
                bpfj bpfjVar = new bpfj(bpfo.a);
                bpfjVar.A("IncomingSessionNotificationHandler.createEmergencySessionsTableQuery");
                bpfjVar.c(new Function() { // from class: ccxm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bpfn bpfnVar = (bpfn) obj2;
                        bpfnVar.b(str);
                        bpfnVar.c(amrb.a);
                        return bpfnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = bpfjVar.b().z();
                ekgbVarZ.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = ekgbVarZ.iterator();
                while (true) {
                    ccxqVar2 = ccxqVar;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((bpei) next).n().isAfter(((cogw) ccxqVar2.e.b()).f())) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 1) {
                    throw new IllegalStateException("Multiple EmergencySessionsTable entries returned.");
                }
                if (arrayList.isEmpty()) {
                    ekrd ekrdVar = (ekrd) ccxq.a.j();
                    ekrdVar.X(cqnc.I, alqmVar.j());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler$onMessageReceived$1", "invokeSuspend$lambda$3", 86, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification when there are no active sessions.");
                    return;
                }
                String str2 = ((aubq) alqmVar.e().get()).d;
                str2.getClass();
                Instant instantO = ((bpei) fcva.N(arrayList)).o();
                instantO.getClass();
                long j = ccxqVar2.b ? ccxqVar2.c : epqoVar.b;
                fcsu fcsuVar = ccxqVar2.e;
                amrb amrbVar = amrb.a;
                Instant instantPlusMillis = ((cogw) fcsuVar.b()).f().plusMillis(j);
                instantPlusMillis.getClass();
                amqk.b(new amqj(str2, amrbVar, j, instantO, instantPlusMillis)).q(new Function() { // from class: ccxn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bpfn bpfnVar = (bpfn) obj2;
                        bpfnVar.b(((aubq) efoiVar2.c.e().get()).d);
                        bpfnVar.c(amrb.a);
                        return bpfnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccxp(this.a, this.b, this.c, fcxyVar);
    }
}
