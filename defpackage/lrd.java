package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lrd extends lpu implements Runnable {
    private final Reference a;
    private final Reference b;

    public lrd(TextView textView, lre lreVar) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(lreVar);
    }

    @Override // defpackage.lpu
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceD;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceD = lpz.c().d((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceD);
                int selectionEnd = Selection.getSelectionEnd(charSequenceD);
                textView.setText(charSequenceD);
                if (charSequenceD instanceof Spannable) {
                    lre.a((Spannable) charSequenceD, selectionStart, selectionEnd);
                    return;
                }
                return;
            }
        }
    }
}
