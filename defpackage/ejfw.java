package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfw implements ejfv {
    private final Context a;
    private final ekrg b;

    public ejfw(Context context) {
        context.getClass();
        this.a = context;
        this.b = ekrg.c("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl");
    }

    @Override // defpackage.ejfv
    public final Object a(Bitmap bitmap, Uri uri, boolean z) throws Exception {
        evqs evqsVar = evqs.b;
        evqr evqrVar = new evqr();
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, evqrVar)) {
                throw new Exception("Could not compress image");
            }
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(ebsv.a(this.a, uri, "w", z ? ebsu.a : ebsu.c).getParcelFileDescriptor());
            try {
                autoCloseOutputStream.write(evqrVar.b().I());
                fczl.a(autoCloseOutputStream, null);
                return uri;
            } finally {
            }
        } catch (FileNotFoundException e) {
            ((ekrd) this.b.i().h("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl", "saveToStorage", 54, "BitmapSaverImpl.kt")).t("Could not open output uri for writing. Error: %s", e.getMessage());
            return null;
        } catch (IOException e2) {
            ((ekrd) this.b.i().h("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl", "saveToStorage", 56, "BitmapSaverImpl.kt")).t("Could not write file. Error: %s", e2.getMessage());
            return null;
        }
    }
}
