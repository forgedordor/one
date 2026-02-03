package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class K1 extends AbstractC0171y1 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    public K1(EnumC0099j3 enumC0099j3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.AbstractC0171y1
    public final T1 O() {
        return new L1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.AbstractC0171y1, j$.util.stream.R3
    public final int c() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC0094i3.r;
        }
        return 0;
    }
}
