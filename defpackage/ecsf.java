package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsf extends lji {
    private final TextView f;

    public ecsf(TextView textView) {
        super(textView);
        this.f = textView;
    }

    private final CharSequence w(ClickableSpan clickableSpan) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.lji, defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.ae(lhd.a);
        lhgVar.t(false);
    }

    @Override // defpackage.lji
    protected final void k(List list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.lji
    protected final void l(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan clickableSpanU = u(i);
        if (clickableSpanU != null) {
            accessibilityEvent.setContentDescription(w(clickableSpanU));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.g(i, "LinkSpan is null for offset: "));
            accessibilityEvent.setContentDescription(this.f.getText());
        }
    }

    @Override // defpackage.lji
    protected final void n(int i, lhg lhgVar) {
        ClickableSpan clickableSpanU = u(i);
        Rect rect = new Rect();
        if (clickableSpanU != null) {
            lhgVar.w(w(clickableSpanU));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.g(i, "LinkSpan is null for offset: "));
            lhgVar.w(this.f.getText());
        }
        lhgVar.A(true);
        lhgVar.t(true);
        v(clickableSpanU, rect);
        if (rect.isEmpty()) {
            Log.w("TvLinksAccessibilityHelper", a.g(i, "LinkSpan bounds is empty for: "));
            rect.set(0, 0, 1, 1);
            lhgVar.o(rect);
        } else {
            v(clickableSpanU, rect);
            lhgVar.o(rect);
        }
        lhgVar.h(16);
    }

    @Override // defpackage.lji
    public final boolean s(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan clickableSpanU = u(i);
        if (clickableSpanU != null) {
            clickableSpanU.onClick(this.f);
            return true;
        }
        Log.e("TvLinksAccessibilityHelper", a.g(i, "LinkSpan is null for offset: "));
        return false;
    }

    final ClickableSpan u(int i) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    final void v(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        TextView textView = this.f;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        rect.right = (int) primaryHorizontal2;
        if (lineForOffset == lineForOffset2) {
            rect.left = (int) primaryHorizontal;
        } else {
            rect.left = 0;
        }
        rect.top = layout.getLineTop(lineForOffset2);
        rect.bottom = layout.getLineBottom(lineForOffset2);
        rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
    }
}
