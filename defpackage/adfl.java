package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfl {
    public static final void a(TextView textView) throws Resources.NotFoundException {
        if (b(textView, textView.getMinWidth())) {
            return;
        }
        int integer = textView.getResources().getInteger(R.integer.photos_onboarding_text_auto_size_step);
        int minWidth = textView.getMinWidth() + integer;
        int maxWidth = textView.getMaxWidth();
        if (integer <= 0) {
            throw new IllegalArgumentException(a.e(integer, "Step must be positive, was: ", "."));
        }
        int iA = fczg.a(minWidth, maxWidth, integer);
        if (minWidth <= iA) {
            while (!b(textView, minWidth) && minWidth != iA) {
                minWidth += integer;
            }
        }
    }

    private static final boolean b(TextView textView, int i) {
        int compoundPaddingStart = (i - textView.getCompoundPaddingStart()) - textView.getCompoundPaddingEnd();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(textView.getTypeface());
        textPaint.setTextSize(textView.getTextSize());
        textPaint.density = textView.getResources().getDisplayMetrics().density;
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), compoundPaddingStart);
        builderObtain.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        builderObtain.setIncludePad(textView.getIncludeFontPadding());
        builderObtain.setBreakStrategy(textView.getBreakStrategy());
        builderObtain.setHyphenationFrequency(textView.getHyphenationFrequency());
        builderObtain.setJustificationMode(textView.getJustificationMode());
        if (Build.VERSION.SDK_INT >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builderObtain.setTextDirection(textView.getTextDirectionHeuristic());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        staticLayoutBuild.getClass();
        boolean z = staticLayoutBuild.getLineCount() <= textView.getMaxLines();
        if (!z) {
            return z;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = staticLayoutBuild.getHeight() + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
        textView.setLayoutParams(layoutParams);
        return z;
    }
}
