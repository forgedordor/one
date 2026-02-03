package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dril {
    private static final Pattern a = Pattern.compile("(?<=(['\"]|\\s|^))(_(\\w|[.!?,'\"#$*])+_)(?=([.!?,'\"]|\\s|$))");
    private static final Pattern b = Pattern.compile("(?<=(['\"]|\\s|^))(\\*(\\w|[.!?,'\"#$*])+\\*)(?=([.!?,'\"]|\\s|$))");

    public static Spannable a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        if (!str.contains(Character.toString('*')) && !str.contains(Character.toString('_'))) {
            return new SpannableString(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.addAll(drik.a(matcher));
        priorityQueue.addAll(drik.a(matcher2));
        int i = 0;
        while (i < str.length()) {
            if (priorityQueue.isEmpty() || i != ((drik) priorityQueue.peek()).a) {
                spannableStringBuilder.append(str.charAt(i));
            } else {
                drik drikVar = (drik) priorityQueue.remove();
                String str2 = drikVar.c;
                char cCharAt = str2.charAt(0);
                if (cCharAt == '*' || cCharAt == '_') {
                    spannableStringBuilder.append((CharSequence) str2.substring(1, str2.length() - 1));
                    spannableStringBuilder.setSpan(new StyleSpan(cCharAt == '*' ? 1 : 2), spannableStringBuilder.length() - ((drikVar.b - drikVar.a) - 2), spannableStringBuilder.length(), 33);
                } else {
                    spannableStringBuilder.append((CharSequence) str2);
                }
                i = drikVar.b - 1;
            }
            i++;
        }
        return spannableStringBuilder;
    }
}
