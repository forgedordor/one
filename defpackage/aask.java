package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aask implements aaso {
    private static final Pattern a = Pattern.compile("\\d+");

    @Override // defpackage.aaso
    public final void a(SpannableStringBuilder spannableStringBuilder) {
        Matcher matcher = a.matcher(spannableStringBuilder);
        while (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) ejxq.b("#", matcher.end() - matcher.start()));
            spannableStringBuilder.setSpan(new RedactedSpan(aasn.DIGIT), matcher.start(), matcher.end(), 17);
        }
    }
}
