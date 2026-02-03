package defpackage;

import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzg {
    public static final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            kfq.b("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            kfq.b("invalid end value");
        }
        if (i3 < 0) {
            kfq.b("invalid maxLines value");
        }
        if (i < 0) {
            kfq.b("invalid width value");
        }
        if (i4 < 0) {
            kfq.b("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        if (Build.VERSION.SDK_INT >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
