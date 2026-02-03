package defpackage;

import android.os.Handler;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpb extends log implements Runnable {
    private final Reference a;

    public lpb(TextView textView) {
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.log
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
        TextView textView = (TextView) this.a.get();
        if (textView != null && textView.isAttachedToWindow()) {
            CharSequence charSequenceC = lok.b().c(textView.getText());
            int selectionStart = Selection.getSelectionStart(charSequenceC);
            int selectionEnd = Selection.getSelectionEnd(charSequenceC);
            textView.setText(charSequenceC);
            if (charSequenceC instanceof Spannable) {
                lpc.a((Spannable) charSequenceC, selectionStart, selectionEnd);
            }
        }
    }
}
