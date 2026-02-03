package defpackage;

import android.os.Build;
import android.text.InputFilter;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebt {
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static void a(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            e(spannableStringBuilder);
            spannableStringBuilder.clearSpans();
            spannableStringBuilder.setFilters(new InputFilter[0]);
            return;
        }
        if (!(charSequence instanceof SpannableString)) {
            return;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        spannableString.removeSpan(null);
        Object[] spans = spannableString.getSpans(0, spannableString.length(), Object.class);
        if (spans == null || (length = spans.length) == 0) {
            return;
        }
        spannableString.setSpan(null, 0, 0, 0);
        e(spannableString);
        while (true) {
            int length = length - 1;
            if (length < 0) {
                spannableString.removeSpan(null);
                return;
            }
            spannableString.removeSpan(spans[length]);
        }
    }

    public static void b(TextView textView) {
        d(textView, LinkMovementMethod.getInstance());
    }

    public static void c(TextView textView) {
        AccessibilityManager accessibilityManager;
        if (textView == null || Build.VERSION.SDK_INT >= 28 || (accessibilityManager = (AccessibilityManager) textView.getContext().getSystemService("accessibility")) == null || !accessibilityManager.isEnabled()) {
            return;
        }
        textView.addOnAttachStateChangeListener(new eebs());
        if (textView instanceof EditText) {
            ((EditText) textView).addTextChangedListener(new eebr());
        }
    }

    public static void d(TextView textView, MovementMethod movementMethod) {
        boolean zIsClickable = textView.isClickable();
        boolean zIsLongClickable = textView.isLongClickable();
        textView.setMovementMethod(movementMethod);
        textView.setClickable(zIsClickable);
        textView.setLongClickable(zIsLongClickable);
    }

    private static void e(Spannable spannable) {
        for (SpanWatcher spanWatcher : (SpanWatcher[]) spannable.getSpans(0, spannable.length(), SpanWatcher.class)) {
            spannable.removeSpan(spanWatcher);
        }
    }
}
