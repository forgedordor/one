package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rov {
    private static final rvc a = new rvb(new rvc() { // from class: rou
        @Override // defpackage.rvc
        public final Object a() {
            if (Build.VERSION.SDK_INT == 34) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
                Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
                bitmapCreateBitmap.recycle();
                z = bitmapCopy == null;
                if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                    Log.v("GainmapWorkaroundCalc", a.r(z, "calculateNeedsGainmapDecodeWorkaround="));
                }
                if (bitmapCopy != null) {
                    bitmapCopy.recycle();
                }
            }
            return Boolean.valueOf(z);
        }
    });

    public static boolean a(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
