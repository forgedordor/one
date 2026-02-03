package defpackage;

import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eaxq implements BiFunction {
    public final /* synthetic */ BiFunction a;

    public /* synthetic */ eaxq(BiFunction biFunction) {
        this.a = biFunction;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Long l = (Long) obj;
        Optional optional = (Optional) obj2;
        ekrg ekrgVar = eayh.a;
        if (optional.isEmpty() || ((eayg) optional.get()).d()) {
            return Optional.of(eayg.a(l.longValue()));
        }
        ebaw ebawVarC = ((eayg) optional.get()).c();
        long jLongValue = ebawVarC.b == 1 ? ((Long) ebawVarC.c).longValue() : 0L;
        BiFunction biFunction = this.a;
        Long lValueOf = Long.valueOf(jLongValue);
        Long l2 = (Long) biFunction.apply(l, lValueOf);
        return l2.equals(lValueOf) ? Optional.empty() : Optional.of(eayg.a(l2.longValue()));
    }
}
