package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esim {
    public static final void a(kvq kvqVar, esjm esjmVar) throws Resources.NotFoundException {
        if (esjmVar != null) {
            try {
                defn defnVar = esjmVar.c;
                dclh.m(defnVar);
                Bitmap bitmap = (Bitmap) degc.g(defnVar, 5L, TimeUnit.SECONDS);
                kvqVar.m(bitmap);
                kvi kviVar = new kvi();
                kviVar.f(bitmap);
                kviVar.e(null);
                kvqVar.u(kviVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                esjmVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                esjmVar.close();
            }
        }
    }
}
