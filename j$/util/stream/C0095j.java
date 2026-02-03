package j$.util.stream;

import j$.util.C0037f;
import j$.util.Map;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0095j implements BiFunction, Function {
    public final /* synthetic */ int a;
    public Function b;

    public /* synthetic */ C0095j(int i) {
        this.a = i;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objG = null;
        switch (this.a) {
            case 1:
                Function function = this.b;
                Map map = (Map) obj;
                Set set = Collectors.a;
                Map.EL.replaceAll(map, new C0095j(function, 0));
                return map;
            case 2:
                Object objApply = this.b.apply(obj);
                if (objApply == null) {
                    return null;
                }
                if (objApply instanceof Stream) {
                    return C0079f3.g((Stream) objApply);
                }
                if (AbstractC0070e.D(objApply)) {
                    return C0074e3.g(AbstractC0070e.t(objApply));
                }
                if (objApply instanceof IntStream) {
                    return IntStream.Wrapper.convert((IntStream) objApply);
                }
                if (AbstractC0070e.w(objApply)) {
                    return IntStream.VivifiedWrapper.convert(AbstractC0070e.q(objApply));
                }
                if (objApply instanceof C) {
                    return B.g((C) objApply);
                }
                if (j$.util.S.D(objApply)) {
                    return A.g(AbstractC0070e.o(objApply));
                }
                if (objApply instanceof LongStream) {
                    return C0126p0.g((LongStream) objApply);
                }
                if (AbstractC0070e.B(objApply)) {
                    return C0121o0.g(AbstractC0070e.s(objApply));
                }
                C0037f.a("java.util.stream.*Stream", objApply.getClass());
                throw null;
            default:
                Function function2 = this.b;
                if (obj != null) {
                    if (obj instanceof Stream) {
                        objG = C0079f3.g((Stream) obj);
                    } else {
                        if (!AbstractC0070e.D(obj)) {
                            C0037f.a("java.util.stream.Stream", obj.getClass());
                            throw null;
                        }
                        objG = C0074e3.g(AbstractC0070e.t(obj));
                    }
                }
                return function2.apply(objG);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ C0095j(Function function, int i) {
        this.a = i;
        this.b = function;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo536andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Function function = this.b;
        Set set = Collectors.a;
        return function.apply(obj2);
    }
}
