package j$.util.function;

import j$.util.Map;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes9.dex */
public final /* synthetic */ class e implements Function, BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ e(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Set set = Collectors.a;
        Object objApply = this.b.apply(obj2);
        Object objApply2 = this.c.apply(obj2);
        objApply2.getClass();
        Object objPutIfAbsent = Map.EL.putIfAbsent((java.util.Map) obj, objApply, objApply2);
        if (objPutIfAbsent != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", objApply, objPutIfAbsent, objApply2));
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo536andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }
}
