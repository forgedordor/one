package j$.util.stream;

import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0100k implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0100k(Function function, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = function;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Function function = this.b;
        switch (i) {
            case 0:
                Set set = Collectors.a;
                Map.EL.a((java.util.Map) obj, function.apply(obj2), ((Function) obj4).apply(obj2), (BinaryOperator) obj3);
                break;
            default:
                Set set2 = Collectors.a;
                Object objApply = function.apply(obj2);
                Objects.a(objApply, "element cannot be mapped to a null key");
                ((BiConsumer) obj3).accept(Map.EL.computeIfAbsent((java.util.Map) obj, objApply, new j$.desugar.sun.nio.fs.h(11, (Supplier) obj4)), obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
