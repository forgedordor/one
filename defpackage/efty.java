package defpackage;

import android.content.ContextWrapper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efty extends ClickableSpan {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        eftw eftwVar;
        if (view instanceof eftx) {
            ((eftx) view).i();
        }
        Object context = view.getContext();
        while (true) {
            if (!(context instanceof eftw)) {
                if (!(context instanceof ContextWrapper)) {
                    eftwVar = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                eftwVar = (eftw) context;
                break;
            }
        }
        if (eftwVar != null) {
            eftwVar.a();
            view.cancelPendingInputEvents();
        } else {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
