package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgy {
    final /* synthetic */ bxgx b;
    private final AtomicInteger c = new AtomicInteger(0);
    private final AtomicInteger d = new AtomicInteger(0);
    public final SparseArray a = new SparseArray();

    public bxgy(bxgx bxgxVar) {
        this.b = bxgxVar;
    }

    public static final Bitmap c(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        Bitmap bitmapDecodeRegion;
        return (rect == null || (bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, false)) == null || (bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options)) == null) ? BitmapFactory.decodeStream(inputStream, null, options) : bitmapDecodeRegion;
    }

    public static final int d(bxgh bxghVar) {
        if (!bxghVar.i()) {
            return 0;
        }
        try {
            Bitmap bitmapD = bxghVar.d();
            if (bitmapD == null || !bitmapD.isMutable()) {
                return 0;
            }
            int width = bitmapD.getWidth();
            int height = bitmapD.getHeight();
            if (width <= 0 || height <= 0) {
                return 0;
            }
            return f(width, height);
        } catch (bxgg unused) {
            return 0;
        }
    }

    private final Bitmap e(int i, int i2) {
        LinkedList linkedList;
        bxgh bxghVar;
        bxgx bxgxVar = this.b;
        synchronized (bxgxVar) {
            int iF = f(i, i2);
            if (iF == 0 || (linkedList = (LinkedList) this.a.get(iF)) == null || linkedList.isEmpty()) {
                return null;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= linkedList.size()) {
                    bxghVar = null;
                    break;
                }
                bxgh bxghVar2 = (bxgh) linkedList.get(i3);
                if (bxghVar2.n() == 1) {
                    bxghVar2.o();
                    if (bxghVar2.n() == 1) {
                        bxghVar = (bxgh) linkedList.remove(i3);
                        break;
                    }
                    ((eksl) ((eksl) bxgx.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 324, "PoolableImageCache.java")).q("Image refCount changed from 1 in getReusableBitmapFromPool.");
                    bxghVar2.r();
                }
                i3++;
            }
            if (bxghVar == null) {
                return null;
            }
            try {
                cqaz.k(bxghVar.h.isHeldByCurrentThread());
                long jA = bxgxVar.e.a();
                bxghVar.o();
                long j = bxghVar.g;
                bxghVar.r();
                long j2 = jA - j;
                if (j2 < bxgx.c) {
                    ekrw ekrwVarO = bxgx.b.o();
                    ekrwVarO.X(bxhf.c, Long.valueOf(j2));
                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 346, "PoolableImageCache.java")).q("Not reusing first available bitmap from the pool because it has not been in the pool long enough. ");
                    linkedList.addLast(bxghVar);
                    return null;
                }
                bxghVar.p();
                cqaz.k(((bxgh) this.b.remove(bxghVar.e)) == bxghVar);
                Bitmap bitmapE = bxghVar.e();
                bxghVar.q();
                return bitmapE;
            } catch (Throwable th) {
                throw th;
            } finally {
                bxghVar.r();
            }
        }
    }

    private static final int f(int i, int i2) {
        if (i > 65535 || i2 > 65535) {
            return 0;
        }
        return (i << 16) | i2;
    }

    public final Bitmap a(int i, int i2, int i3) {
        OutOfMemoryError outOfMemoryError;
        Bitmap bitmap;
        try {
            Bitmap bitmapE = e(i, i2);
            if (bitmapE == null) {
                bitmapE = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            bitmap = bitmapE;
        } catch (OutOfMemoryError e) {
            outOfMemoryError = e;
            bitmap = null;
        }
        try {
            bitmap.eraseColor(i3);
            return bitmap;
        } catch (OutOfMemoryError e2) {
            outOfMemoryError = e2;
            ((eksl) ((eksl) ((eksl) bxgx.b.j()).g(outOfMemoryError)).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "createOrReuseBitmap", (char) 411, "PoolableImageCache.java")).q("try to createOrReuseBitmap.");
            this.b.f.a(15, 1);
            return bitmap;
        }
    }

    public final Bitmap b(InputStream inputStream, Rect rect, BitmapFactory.Options options, int i, int i2) throws IOException {
        Bitmap bitmapC;
        if (i <= 0 || i2 <= 0) {
            ((eksl) ((eksl) bxgx.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 163, "PoolableImageCache.java")).q("Decoding bitmap with invalid size.");
            throw new IOException("Invalid size / corrupted image");
        }
        cqaz.l(inputStream);
        if (!options.inJustDecodeBounds) {
            options.inBitmap = e(i, i2);
        }
        Bitmap bitmap = null;
        try {
            bitmapC = c(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            bitmapC = null;
        } catch (OutOfMemoryError unused2) {
        }
        try {
            this.d.incrementAndGet();
            return bitmapC;
        } catch (IllegalArgumentException unused3) {
            if (options.inBitmap == null) {
                return bitmapC;
            }
            options.inBitmap.recycle();
            options.inBitmap = null;
            Bitmap bitmapC2 = c(inputStream, rect, options);
            int iIncrementAndGet = this.c.incrementAndGet();
            if (iIncrementAndGet % 100 != 0) {
                return bitmapC2;
            }
            eksl ekslVar = (eksl) bxgx.b.j();
            ekslVar.X(bxhf.a, Integer.valueOf(this.d.get()));
            ekslVar.X(bxhf.b, Integer.valueOf(iIncrementAndGet));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "onFailedToReuse", 463, "PoolableImageCache.java")).q("Pooled bitmap consistently not being reused.");
            return bitmapC2;
        } catch (OutOfMemoryError unused4) {
            bitmap = bitmapC;
            ((eksl) ((eksl) bxgx.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 181, "PoolableImageCache.java")).q("Oom decoding inputStream.");
            this.b.f.a(15, 1);
            return bitmap;
        }
    }
}
