package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obd {
    public int b;
    public long h;
    public long j;
    public final SparseArray a = new SparseArray();
    public mdk c = mdk.a;
    public int d = -1;
    public obb[] e = new obb[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = Long.MAX_VALUE;

    public final obb a(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.d * this.c.e).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        return new obb(byteBufferOrder, j, j + this.d);
    }

    public final obc b(int i) {
        SparseArray sparseArray = this.a;
        mee.d(mgb.U(sparseArray, i), "Source not found.");
        return (obc) sparseArray.get(i);
    }

    public final void c() {
        mee.d(!this.c.equals(mdk.a), "Audio mixer is not configured.");
    }

    public final void d() {
        this.g = Math.min(this.i, this.h + this.d);
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }
}
