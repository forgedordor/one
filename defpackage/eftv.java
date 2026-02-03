package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftv extends efty {
    private final Context a;

    public eftv(Context context) {
        this.a = context;
    }

    @Override // defpackage.efty, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (Build.VERSION.SDK_INT >= 31) {
            textPaint.setFakeBoldText(this.a.getResources().getConfiguration().fontWeightAdjustment == 300);
        }
        textPaint.setUnderlineText(true);
    }
}
