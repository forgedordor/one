package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txe {
    public static final eksp a = eksp.c("BugleCmsPrimaryDevice");
    private final aurx b;
    private final eosc c;

    public txe(aurx aurxVar, eosc eoscVar) {
        this.b = aurxVar;
        this.c = eoscVar;
    }

    public final eiju a(final eqiz eqizVar) {
        return this.b.n().i(new eooz() { // from class: txd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                eksp ekspVar = txe.a;
                if (optional.isEmpty()) {
                    ((eksl) ((eksl) txe.a.j()).h("com/google/android/apps/messaging/cloudstore/grpc/CmsPrimaryDeviceChecker", "throwIfDeviceNotAllowed", 49, "CmsPrimaryDeviceChecker.java")).q("No device ID on the device");
                    return eijx.e(null);
                }
                eqiz eqizVar2 = eqizVar;
                Optional optionalFindFirst = Collection.EL.stream(eqizVar2.f).filter(new Predicate() { // from class: txa
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
                    public final boolean test(Object obj2) {
                        eksp ekspVar2 = txe.a;
                        return ((eqjb) obj2).b.equals(optional.get());
                    }
                }).findFirst();
                if (cpyl.a()) {
                    if (optionalFindFirst.isEmpty()) {
                        throw new cpyy("Box primary device does not match current device, device is not included in box", 2);
                    }
                    int iA = eqjc.a(((eqjb) optionalFindFirst.get()).d);
                    if (iA == 0 || iA != 4) {
                        throw new cpyy("Device is disabled or unspecified", 1);
                    }
                } else {
                    if (optionalFindFirst.isEmpty()) {
                        throw new cpyy("Device is not included in box");
                    }
                    int iA2 = eqjc.a(((eqjb) optionalFindFirst.get()).d);
                    if (iA2 == 0 || iA2 != 4) {
                        throw new cpyy("Device is disabled or unspecified");
                    }
                }
                ((eksl) ((eksl) txe.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CmsPrimaryDeviceChecker", "throwIfDeviceNotAllowed", 94, "CmsPrimaryDeviceChecker.java")).q("Current device is primary device");
                return eijx.e(null);
            }
        }, this.c);
    }
}
