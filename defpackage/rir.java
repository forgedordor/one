package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rir implements rii {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final ris b;
    private final Set c;
    private final long d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public rir(long j) {
        rix rixVar = new rix();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.e = j;
        this.b = rixVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[Catch: all -> 0x011f, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0017, B:12:0x0032, B:24:0x0056, B:26:0x0059, B:28:0x0070, B:30:0x0078, B:41:0x009f, B:43:0x00ac, B:45:0x00bd, B:47:0x00c6, B:48:0x00d5, B:50:0x00f4, B:52:0x00fd, B:53:0x010c, B:49:0x00dc, B:35:0x0083, B:38:0x008a, B:39:0x0096, B:13:0x0035, B:19:0x0046, B:20:0x004b, B:21:0x004e, B:22:0x0051, B:23:0x0054, B:9:0x0015, B:56:0x0111, B:57:0x011e), top: B:61:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized android.graphics.Bitmap h(int r18, int r19, android.graphics.Bitmap.Config r20) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rir.h(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private final void i() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            j();
        }
    }

    private final void j() {
        ris risVar = this.b;
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + risVar.toString());
    }

    private final void k() {
        l(this.e);
    }

    private final synchronized void l(long j) {
        while (this.f > j) {
            ris risVar = this.b;
            Bitmap bitmap = (Bitmap) ((rix) risVar).g.b();
            if (bitmap != null) {
                ((rix) risVar).e(Integer.valueOf(rvk.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    j();
                }
                this.f = 0L;
                return;
            }
            this.f -= rvk.a(bitmap);
            this.j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(risVar.a(bitmap)));
            }
            i();
            bitmap.recycle();
        }
    }

    @Override // defpackage.rii
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        if (bitmapH == null) {
            return g(i, i2, config);
        }
        bitmapH.eraseColor(0);
        return bitmapH;
    }

    @Override // defpackage.rii
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        return bitmapH == null ? g(i, i2, config) : bitmapH;
    }

    @Override // defpackage.rii
    public final void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        l(0L);
    }

    @Override // defpackage.rii
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ris risVar = this.b;
                if (rvk.a(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                    int iA = rvk.a(bitmap);
                    riv rivVarD = ((rix) risVar).f.d(rvk.a(bitmap), bitmap.getConfig());
                    ((rix) risVar).g.c(rivVarD, bitmap);
                    NavigableMap navigableMapD = ((rix) risVar).d(bitmap.getConfig());
                    Integer num = (Integer) navigableMapD.get(Integer.valueOf(rivVarD.a));
                    navigableMapD.put(Integer.valueOf(rivVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.i++;
                    this.f += iA;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(risVar.a(bitmap)));
                    }
                    i();
                    k();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rii
    public final synchronized void e(float f) {
        this.e = Math.round(this.d * f);
        k();
    }

    @Override // defpackage.rii
    public final void f(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", a.g(i, "trimMemory, level="));
        }
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            l(this.e / 2);
        }
    }
}
