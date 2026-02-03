package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.util.Log;
import android.widget.TextView;
import androidx.core.app.RemoteActionCompat;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunn {
    public static WeakReference a = new WeakReference(null);
    public final TextView b;
    public final Rect c = new Rect();
    public final eund d;
    public final eunk e;

    public eunn(TextView textView) {
        this.b = textView;
        int highlightColor = textView.getHighlightColor();
        this.e = new eunk(Color.argb(20, Color.red(highlightColor), Color.green(highlightColor), Color.blue(highlightColor)));
        eumz eumzVar = new eumz(textView);
        this.d = eumzVar;
        eumzVar.a.J = true;
    }

    static String a(TextView textView, eunk eunkVar) {
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) text;
        int spanStart = spannable.getSpanStart(eunkVar);
        int spanEnd = spannable.getSpanEnd(eunkVar);
        int iMax = Math.max(0, Math.min(spanStart, spanEnd));
        int[] iArr = {0, spanStart, spanEnd};
        ejwl.a(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return textView.getText().subSequence(iMax, i).toString();
    }

    public static void b(eund eundVar) {
        ((eumz) eundVar).a.e();
        eundVar.c();
    }

    public static void c(String str) {
        if (Log.isLoggable("ToolbarController", 2)) {
            Log.v("ToolbarController", str);
        }
    }

    public static void d(TextView textView) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (eunk eunkVar : (eunk[]) spannable.getSpans(0, text.length(), eunk.class)) {
                spannable.removeSpan(eunkVar);
            }
        }
    }

    public static void e(Rect rect, TextView textView, int i, int i2) {
        int[] iArrH = h(textView, i, true);
        int[] iArrH2 = h(textView, i2, false);
        rect.set(iArrH[0], iArrH[1], iArrH2[0], iArrH2[1]);
        rect.sort();
    }

    public static boolean f(TextView textView, boolean z) {
        boolean zHasFocus = textView.hasFocus();
        boolean zIsAttachedToWindow = textView.isAttachedToWindow();
        boolean z2 = z && zHasFocus && zIsAttachedToWindow;
        if (!z2) {
            c(String.format("canShowToolbar=false. Reason: windowFocus=%b, viewFocus=%b, viewAttached=%b", Boolean.valueOf(z), Boolean.valueOf(zHasFocus), Boolean.valueOf(zIsAttachedToWindow)));
        }
        return z2;
    }

    static /* synthetic */ void g(RemoteActionCompat remoteActionCompat) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = remoteActionCompat.d;
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            Log.e("ToolbarController", "Error performing smart action", e);
        }
    }

    private static int[] h(TextView textView, int i, boolean z) {
        Layout layout = textView.getLayout();
        int lineForOffset = layout.getLineForOffset(i);
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(i);
        int lineTop = z ? layout.getLineTop(lineForOffset) : layout.getLineBottom(lineForOffset);
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        return new int[]{((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()) + iArr[0], ((lineTop + textView.getTotalPaddingTop()) - textView.getScrollY()) + iArr[1]};
    }
}
