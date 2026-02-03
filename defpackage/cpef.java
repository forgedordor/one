package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpef {
    public static String a(Context context) {
        return b(context.getString(R.string.learn_more));
    }

    public static String b(String str) {
        return str.replaceAll("\\s", " ");
    }

    public static void c(Context context, SpannableStringBuilder spannableStringBuilder, String str, boolean z, ClickableSpan clickableSpan) {
        int iLastIndexOf = spannableStringBuilder.toString().lastIndexOf(str);
        if (iLastIndexOf >= 0) {
            int length = str.length() + iLastIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(cpds.a(context, android.R.attr.textColorLink)), iLastIndexOf, length, 17);
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), iLastIndexOf, length, 17);
            if (clickableSpan != null) {
                spannableStringBuilder.setSpan(clickableSpan, iLastIndexOf, length, 17);
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), iLastIndexOf, length, 17);
            }
        }
    }

    public static void d(Context context, SpannableStringBuilder spannableStringBuilder, String str, boolean z, View.OnClickListener onClickListener) {
        c(context, spannableStringBuilder, str, z, onClickListener != null ? new cpee(onClickListener) : null);
    }

    public static void e(Context context, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        d(context, spannableStringBuilder, str, false, onClickListener);
    }
}
