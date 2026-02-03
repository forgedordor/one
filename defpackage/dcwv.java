package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwv {
    public static Bundle a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String b() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static void c(Bundle bundle) {
        if (!((Boolean) dcwx.c.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        devq devqVar = dcwx.b;
        if (iDataSize <= ((Integer) devqVar.a()).intValue()) {
            return;
        }
        throw new IllegalStateException("Max allowed bundle size of " + devqVar.a().toString() + " exceeded, you are passing in a bundle of " + iDataSize + " size.");
    }

    public static void d(FeedbackOptions feedbackOptions) {
        if (((Boolean) dcwx.c.a()).booleanValue()) {
            Parcel parcelObtain = Parcel.obtain();
            dcwl.a(feedbackOptions, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            devq devqVar = dcwx.b;
            if (iDataSize <= ((Integer) devqVar.a()).intValue()) {
                return;
            }
            throw new IllegalStateException("Max allowed feedback options size of " + devqVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
        }
    }

    public static void e(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }
}
