package defpackage;

import j$.util.DesugarDate;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnou extends fcyz implements fdat {
    final /* synthetic */ cnov a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnou(fcxy fcxyVar, cnov cnovVar) {
        super(2, fcxyVar);
        this.a = cnovVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnou) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cnog cnogVar;
        fctl.b(obj);
        final cnov cnovVar = this.a;
        boolean z = false;
        try {
            cnogVar = ((cnoh) cnovVar.d.l()).c;
            if (cnogVar == null) {
                cnogVar = cnog.a;
            }
        } catch (evtj e) {
            ekrw ekrwVarJ = cnov.a.j();
            ekrwVarJ.X(eksq.a, "BugleTelephony");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch", "getReverseSyncState", 110, "TelephonySyncPauseLatch.kt")).q("Incorrect protobuf in settings store");
        }
        if (cnogVar.b) {
            cbfd cbfdVarA = cbfi.a();
            cbfdVarA.A("TelephonySyncPauseLatch#isLatched");
            cbeg cbegVar = cbfi.c;
            cbfdVarA.c(cbegVar.e, cbegVar.j);
            cbfdVarA.e(new Function() { // from class: cnot
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    cbfh cbfhVar = (cbfh) obj2;
                    String[] strArr = {"ReverseTelephonySync-", "IncrementalReverseSyncWorkItemHandler-"};
                    int iIntValue = cbfi.c().intValue();
                    if (iIntValue < 41030) {
                        dqru.x("queue", iIntValue);
                    }
                    cnov cnovVar2 = cnovVar;
                    cbfhVar.ap(new dqpm("work_queue.queue", 3, cbfh.au(strArr), false));
                    cbfhVar.e(DesugarDate.from(cnovVar2.c.f()));
                    return cbfhVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cbfdVarA.C(new dqxl("MAX(timestamp,minimum_start_time) DESC", new Object[0]));
            cbfdVarA.y(1);
            dqqj dqqjVarP = cbfdVarA.b().p();
            try {
                cbei cbeiVar = (cbei) dqqjVarP;
                if (cbeiVar.moveToNext()) {
                    long jMax = Math.max(cbeiVar.c(), cbeiVar.g().getTime());
                    long epochMilli = cnovVar.c.f().toEpochMilli();
                    Object objB = cnovVar.b.b();
                    objB.getClass();
                    if (jMax > epochMilli - ((Number) objB).longValue()) {
                        z = true;
                    }
                }
                fczl.a(dqqjVarP, null);
            } finally {
            }
        } else {
            ekrw ekrwVarE = cnov.a.e();
            ekrwVarE.X(eksq.a, "BugleTelephony");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.V(10, TimeUnit.SECONDS);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch", "isLatchedSync", 79, "TelephonySyncPauseLatch.kt")).q("Reverse Sync is currently not running. Forward sync is not latched.");
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnou cnouVar = new cnou(fcxyVar, this.a);
        cnouVar.b = obj;
        return cnouVar;
    }
}
