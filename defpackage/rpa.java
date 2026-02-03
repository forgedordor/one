package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpa implements rpb {
    private final rig a;
    private final List b;
    private final ParcelFileDescriptorRewinder c;

    public rpa(ParcelFileDescriptor parcelFileDescriptor, List list, rig rigVar) {
        rvi.f(rigVar);
        this.a = rigVar;
        rvi.f(list);
        this.b = list;
        this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.rpb
    public final int a() {
        return rer.b(this.b, new rek(this.c, this.a));
    }

    @Override // defpackage.rpb
    public final Bitmap b(BitmapFactory.Options options) throws Throwable {
        FileDescriptor fileDescriptor = this.c.a().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !rov.a(options) || !row.c(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        rvi.a(options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapB = row.b(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapB;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.rpb
    public final ImageHeaderParser.ImageType c() {
        return rer.e(this.b, new reh(this.c, this.a));
    }

    @Override // defpackage.rpb
    public final boolean e() {
        return rer.f(this.b, new ren(this.c, this.a));
    }

    @Override // defpackage.rpb
    public final void d() {
    }
}
