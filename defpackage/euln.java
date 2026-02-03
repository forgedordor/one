package defpackage;

import android.net.Uri;
import android.os.LocaleList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euln extends eulr {
    public euln(euls eulsVar) {
        super(eulsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.widget.TextView r25, defpackage.eukb r26) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euln.b(android.widget.TextView, eukb):void");
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(this);
                int spanEnd = spanned.getSpanEnd(this);
                if (spanStart < 0 || spanStart >= spanEnd || spanEnd > text.length()) {
                    Log.d("TextLinks", "Cannot show link toolbar. Invalid text indices");
                    return;
                }
                ejwl.a(text != null);
                ejwl.a(true);
                ejwl.a(spanEnd <= text.length());
                ejwl.a(true);
                LocaleList textLocales = textView.getTextLocales();
                String lowerCase = null;
                lah lahVarD = textLocales == null ? null : lah.d(textLocales);
                try {
                    Uri uri = Uri.parse(text.subSequence(spanStart, spanEnd).toString());
                    String scheme = uri.getScheme();
                    if (scheme != null) {
                        lowerCase = scheme.toLowerCase(Locale.ROOT);
                    }
                    if (lowerCase != null && !scheme.equals(lowerCase)) {
                        String string = uri.buildUpon().scheme(lowerCase).build().toString();
                        if (string.length() == spanEnd - spanStart) {
                            text = new SpannableString(new SpannableStringBuilder(text).replace(spanStart, spanEnd, (CharSequence) string));
                        }
                    }
                } catch (Exception e) {
                    Log.e("TextClassification", "Error fixing uri scheme", e);
                }
                eult.a.execute(new eulm(textView, this, new euka(text, spanStart, spanEnd, lahVarD), spanned));
            }
        }
    }
}
