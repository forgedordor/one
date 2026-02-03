package j$.util;

import androidx.car.app.model.Alert;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0184y implements IntConsumer {
    private long count;
    private long sum;
    private int min = Alert.DURATION_SHOW_INDEFINITELY;
    private int max = Integer.MIN_VALUE;

    public final void a(C0184y c0184y) {
        this.count += c0184y.count;
        this.sum += c0184y.sum;
        this.min = Math.min(this.min, c0184y.min);
        this.max = Math.max(this.max, c0184y.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final String toString() {
        String simpleName = C0184y.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
