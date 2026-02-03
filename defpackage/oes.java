package defpackage;

import android.util.SparseLongArray;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oes implements mse {
    private final SparseLongArray a = new SparseLongArray();
    private long b;

    @Override // defpackage.mse
    public final long a() {
        return this.b;
    }

    @Override // defpackage.mse
    public final mca b() {
        return mca.a;
    }

    public final void c(int i, long j) {
        SparseLongArray sparseLongArray = this.a;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                String str = mgb.a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long jMin = Long.MAX_VALUE;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
                }
                this.b = jMin;
            }
        }
    }

    @Override // defpackage.mse
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.mse
    public final void d(mca mcaVar) {
    }
}
