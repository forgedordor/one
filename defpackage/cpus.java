package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpus {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleCmsPrimaryDevice");

    public static ekgb a(eqiz eqizVar) {
        Stream map = Collection.EL.stream(eqizVar.f).filter(new Predicate() { // from class: cpuq
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
                int iA;
                eqjb eqjbVar = (eqjb) obj;
                int i = cpus.a;
                int iA2 = eqjd.a(eqjbVar.c);
                return iA2 != 0 && iA2 == 3 && (iA = eqjc.a(eqjbVar.d)) != 0 && iA == 4;
            }
        }).map(new Function() { // from class: cpur
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cpus.a;
                return ((eqjb) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        if (ekgbVar.size() > 1) {
            eksl ekslVar = (eksl) b.j();
            ekslVar.X(bzmz.o, efvl.b().a(ekgbVar));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceUtility", "getBoxPrimaryDeviceIds", 37, "CmsPrimaryDeviceUtility.java")).q("Found more than 1 primary devices in box");
        }
        return ekgbVar;
    }
}
