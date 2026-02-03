package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byfv {
    public static final cqce a = cqce.g("BugleDataModel", "WorkerDatabaseOperations");
    private static final String e;
    public final cogw b;
    public final dqsn c;
    public final bprb d;

    static {
        String[] strArr = bprf.a;
        bpqd bpqdVar = bprf.c;
        e = "NOT EXISTS (SELECT other._id FROM generic_worker_queue AS other WHERE other.in_flight = 1  AND " + bpqdVar.b.toString() + " = other.worker_type AND " + bpqdVar.c.toString() + " = other.item_table_type AND " + bpqdVar.d.toString() + " = other.item_id)";
    }

    public byfv(cogw cogwVar, dqsn dqsnVar) {
        String[] strArr = bprf.a;
        bprc bprcVar = new bprc();
        bprcVar.ap("clearInflightUpdater");
        bprcVar.c(false);
        bprcVar.d(new Function() { // from class: byfs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpre bpreVar = (bpre) obj;
                cqce cqceVar = byfv.a;
                bpreVar.d(true);
                return bpreVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.d = bprcVar.b();
        this.b = cogwVar;
        this.c = dqsnVar;
    }

    public final bpre a(int i) {
        dqxm dqxmVar = ((Boolean) ccze.Q.e()).booleanValue() ? new dqxm(e) : new dqxm("1");
        String[] strArr = bprf.a;
        bpre bpreVar = new bpre();
        bpreVar.d(false);
        bpreVar.i(i);
        bpreVar.ar(dqxmVar);
        return bpreVar;
    }

    public final void b() {
        cqaz.h();
        if (((Boolean) ccze.Q.e()).booleanValue()) {
            String[] strArr = bprf.a;
            bpqt bpqtVar = new bpqt();
            bpqtVar.f("dedupeGenericWorkerQueue");
            bpqtVar.a(new Function() { // from class: byfp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpre bpreVar = (bpre) obj;
                    cqce cqceVar = byfv.a;
                    String[] strArr2 = bprf.a;
                    bpreVar.ap(new dqpk("generic_worker_queue._id", 3, new dqxm("(SELECT one._id FROM generic_worker_queue AS one INNER JOIN generic_worker_queue AS other  ON one.worker_type = other.worker_type AND one.item_table_type = other.item_table_type AND one.item_id = other.item_id AND one.account_id = other.account_id AND one._id > other._id AND one.in_flight = other.in_flight AND one.flags = other.flags AND other.retry_count < " + aypc.a() + ")")));
                    bpreVar.d(false);
                    return bpreVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iD = bpqtVar.d();
            if (iD > 0) {
                a.m(a.g(iD, "Deduped work items "));
            }
        }
    }
}
