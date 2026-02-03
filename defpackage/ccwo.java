package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwo implements ccwi {
    public final fcsu a;
    private final fdjx b;

    public ccwo(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
        this.a = fcsuVar;
    }

    public static final bpfi f(final String str, final amrb amrbVar) {
        String[] strArr = bpfo.a;
        bpfj bpfjVar = new bpfj(bpfo.a);
        bpfjVar.A("EmergencyDatabaseOperationsImpl.createEmergencySessionsTableQuery");
        bpfjVar.c(new Function() { // from class: ccwk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpfn bpfnVar = (bpfn) obj;
                bpfnVar.b(str);
                amrb amrbVar2 = amrbVar;
                if (amrbVar2 != null) {
                    bpfnVar.c(amrbVar2);
                }
                return bpfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bpfjVar.b();
    }

    @Override // defpackage.ccwi
    public final amqj a(String str, amrb amrbVar) {
        str.getClass();
        amrbVar.getClass();
        ekgb ekgbVarZ = f(str, amrbVar).z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekgbVarZ) {
            if (((bpei) obj).n().isAfter(((cogw) this.a.b()).f())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("Multiple EmergencySessionsTable entries returned.");
        }
        bpei bpeiVar = (bpei) fcva.P(arrayList);
        if (bpeiVar != null) {
            return amqk.a(bpeiVar);
        }
        return null;
    }

    @Override // defpackage.ccwi
    public final eiju b(String str, amrb amrbVar) {
        str.getClass();
        amrbVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new ccwm(this, str, amrbVar, null));
    }

    @Override // defpackage.ccwi
    public final Object c(String str, amrb amrbVar, fcxy fcxyVar) {
        return fdil.c(this.b, null, new ccwl(this, str, amrbVar, null), 3).c(fcxyVar);
    }

    @Override // defpackage.ccwi
    public final Object d(String str, fcxy fcxyVar) {
        return fdil.c(this.b, null, new ccwn(this, str, null), 3).c(fcxyVar);
    }

    @Override // defpackage.ccwi
    public final Object e(String str, amrb amrbVar) {
        String[] strArr = bpfo.a;
        final bpfn bpfnVar = new bpfn();
        bpfnVar.b(str);
        if (amrbVar != null) {
            bpfnVar.c(amrbVar);
        }
        bpfl bpflVar = new bpfl();
        bpflVar.ap("EmergencyDatabaseOperationsImpl.invalidateEmergencySessions");
        bpflVar.d(0L);
        bpflVar.c(((cogw) this.a.b()).f());
        bpflVar.af(new bpfm((bpfn) new Function() { // from class: ccwj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bpfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpfn())));
        return new Integer(bpflVar.b().e());
    }
}
