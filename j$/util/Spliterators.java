package j$.util;

import com.android.vcard.VCardConfig;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class Spliterators {
    public static final k0 a = new k0();
    public static final i0 b = new i0();
    public static final j0 c = new j0();
    public static final h0 d = new h0();

    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        public final int a;
        public long b;
        public int c;

        public AbstractSpliterator(long j, int i) {
            this.b = j;
            this.a = (i & 64) != 0 ? i | 16384 : i;
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.a;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            return this.b;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ java.util.Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public abstract /* synthetic */ boolean tryAdvance(Consumer consumer);

        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            e0 e0Var = new e0();
            long j = this.b;
            if (j <= 1 || !tryAdvance(e0Var)) {
                return null;
            }
            int i = this.c + 1024;
            if (i > j) {
                i = (int) j;
            }
            if (i > 33554432) {
                i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            }
            Object[] objArr = new Object[i];
            int i2 = 0;
            do {
                objArr[i2] = e0Var.a;
                i2++;
                if (i2 >= i) {
                    break;
                }
            } while (tryAdvance(e0Var));
            this.c = i2;
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - i2;
            }
            return new f0(objArr, 0, i2, this.a);
        }
    }

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static f0 b(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new f0(objArr, i, i2, i3);
    }

    public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {
        spliterator.getClass();
        return new a0(spliterator);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new l0(iArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> it, int i) {
        it.getClass();
        return new m0(it, i);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i, int i2, int i3) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new n0(jArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new m0(collection, i);
    }
}
