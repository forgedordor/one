package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwi extends dcfm {
    public dcwi(Context context) {
        super(context, dcwe.b, dcfa.q, dcfl.a);
        devq.b(context.getApplicationContext());
    }

    public static Bitmap a(Activity activity) {
        try {
            return b(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static Bitmap b(View view) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            canvasBeginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
            view.draw(canvasBeginRecording);
            picture.endRecording();
            return Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public final defn c(final FeedbackOptions feedbackOptions) {
        final long jNanoTime = System.nanoTime();
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dcwh
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                FeedbackOptions feedbackOptions2 = feedbackOptions;
                dcws dcwsVar = (dcws) obj;
                try {
                    dcwa dcwaVar = feedbackOptions2.t;
                    long j = jNanoTime;
                    if (dcwaVar != null) {
                        Context context = dcwsVar.c;
                        dcwv.e(new dcwt(context, dcwaVar, j));
                        dcwv.e(new dcwu(context, dcwaVar, j));
                    }
                    dcwv.d(feedbackOptions2);
                    ((IFeedbackService) dcwsVar.w()).startFeedbackWithTimestamp(new ErrorReport(feedbackOptions2, dcwsVar.a.getCacheDir()), j);
                    ((defr) obj2).b(null);
                } catch (RemoteException e) {
                    Log.e("gF_FeedbackClient", "Failed to start feedback", e);
                    ((defr) obj2).a(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        dcizVar.c = 6005;
        return m(dcizVar.a());
    }
}
