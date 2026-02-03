package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rck implements rcg {
    private static final String k = "rck";
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final rqq j;
    private int[] l;
    private short[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] m = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public rci f = new rci();

    public rck(rqq rqqVar, rci rciVar, ByteBuffer byteBuffer, int i) {
        this.j = rqqVar;
        c(rciVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap bitmapB = this.j.a.b(this.u, this.t, config);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17, types: [short] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // defpackage.rcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rck.a():android.graphics.Bitmap");
    }

    @Override // defpackage.rcg
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(rci rciVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "Sample size must be >=0, not: "));
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        this.r = 0;
        this.f = rciVar;
        this.e = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.q = false;
        Iterator it = rciVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((rch) it.next()).g == 3) {
                this.q = true;
                break;
            }
        }
        this.s = iHighestOneBit;
        int i2 = rciVar.f;
        this.u = i2 / iHighestOneBit;
        int i3 = rciVar.g;
        this.t = i3 / iHighestOneBit;
        rqq rqqVar = this.j;
        this.c = rqqVar.c(i2 * i3);
        int i4 = this.u * this.t;
        rig rigVar = rqqVar.b;
        this.d = rigVar == null ? new int[i4] : (int[]) rigVar.a(i4, int[].class);
    }
}
