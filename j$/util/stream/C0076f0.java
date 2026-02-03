package j$.util.stream;

import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0076f0 implements LongBinaryOperator, Consumer, IntFunction, LongFunction, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0076f0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 3:
                return AbstractC0171y1.D(j);
            case 4:
            default:
                return AbstractC0171y1.L(j);
            case 5:
                return AbstractC0171y1.K(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return j + j2;
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 2:
                return new Object[i];
            case 10:
                return new Object[i];
            case 11:
                return new Integer[i];
            case 12:
                return new Long[i];
            case 13:
                return new Double[i];
            case 16:
                return new Integer[i];
            default:
                return new Integer[i];
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 1:
                break;
            case 14:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new N0((A0) obj, (A0) obj2);
            case 5:
            case 7:
            default:
                return new R0((G0) obj, (G0) obj2);
            case 6:
                return new O0((C0) obj, (C0) obj2);
            case 8:
                return new P0((E0) obj, (E0) obj2);
        }
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }
}
