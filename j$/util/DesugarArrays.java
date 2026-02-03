package j$.util;

import j$.util.Spliterator;
import j$.util.stream.C0056b0;
import j$.util.stream.C0101k0;
import j$.util.stream.EnumC0094i3;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;

/* loaded from: classes9.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }

    public static IntStream stream(int[] iArr) {
        Spliterator.OfInt ofIntSpliterator = Spliterators.spliterator(iArr, 0, iArr.length, 1040);
        return new C0056b0(ofIntSpliterator, EnumC0094i3.o(ofIntSpliterator), false);
    }

    public static LongStream stream(long[] jArr) {
        Spliterator.OfLong ofLongSpliterator = Spliterators.spliterator(jArr, 0, jArr.length, 1040);
        return new C0101k0(ofLongSpliterator, EnumC0094i3.o(ofLongSpliterator), false);
    }
}
