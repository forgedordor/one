package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coua {
    public static final eksp a = eksp.c("BugleFileTransfer");
    private final Context b;
    private final cqmr c;
    private final cqsu d;

    public coua(Context context, cqmr cqmrVar, cqsu cqsuVar) {
        this.b = context;
        this.c = cqmrVar;
        this.d = cqsuVar;
    }

    private final byte[] d(Uri uri, int i, int i2, int i3) {
        return this.d.o(i2, i3, 250, 250, i, uri, "image/jpeg");
    }

    public final byte[] a(bazc bazcVar, int i) {
        ejwl.a(bazcVar.aX());
        Uri uriT = bazcVar.t();
        if (uriT == null) {
            return null;
        }
        if (bazcVar.c() <= 0 || bazcVar.b() <= 0) {
            bazcVar.af();
        }
        int iC = bazcVar.c();
        int iB = bazcVar.b();
        try {
            String strR = bazcVar.R();
            return le.z(strR) ? c(uriT, i, iC, iB) : b(uriT, strR, i, iC, iB);
        } catch (IOException e) {
            ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", 'H', "FilePreviewCreator.java")).q("Cannot get a File Transfer preview.");
            return null;
        }
    }

    public final byte[] b(Uri uri, String str, int i, int i2, int i3) {
        ejwl.a(le.m(str));
        if (!this.d.l(str, uri)) {
            return d(uri, i, i2, i3);
        }
        ((eksl) ((eksl) a.e()).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getPreviewForImage", 108, "FilePreviewCreator.java")).q("Getting preview for GIF-files is not supported at the moment.");
        return null;
    }

    public final byte[] c(Uri uri, int i, int i2, int i3) {
        Context context = this.b;
        Bitmap bitmapD = this.d.d(uri, 250, 250);
        Uri uriD = bxlf.d(null, context);
        File fileH = bxlf.h(uriD, context);
        if (bitmapD != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileH);
                try {
                    bitmapD.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } finally {
                bitmapD.recycle();
            }
        }
        byte[] bArrD = d(uriD, i, i2, i3);
        this.c.k(fileH);
        return bArrD;
    }
}
