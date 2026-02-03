package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import java.text.Bidi;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgd {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/linkify/RtlLinkify");
    private final cssf b;

    public afgd(cssf cssfVar) {
        this.b = cssfVar;
    }

    final Spannable a(Spannable spannable, ekgp ekgpVar) {
        ClickableSpan[] clickableSpanArr;
        cdrw[] cdrwVarArr;
        cdrw cdrwVar;
        ClickableSpan[] clickableSpanArr2;
        char c;
        int length;
        if (!this.b.e() && !new Bidi(String.valueOf(spannable), -2).isMixed()) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ClickableSpan[] clickableSpanArr3 = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
        int length2 = clickableSpanArr3.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            ClickableSpan clickableSpan = clickableSpanArr3[i];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            String string = spannable.subSequence(spanStart, spanEnd).toString();
            try {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(i2, spanStart).toString());
                clickableSpanArr = clickableSpanArr3;
            } catch (StringIndexOutOfBoundsException unused) {
                char[] charArray = spannable.toString().toCharArray();
                StringBuilder sb = new StringBuilder();
                int length3 = charArray.length;
                int i3 = 0;
                while (i3 < length3) {
                    char c2 = charArray[i3];
                    if (Character.isDigit(c2)) {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (c2 < '0') {
                            c = '0';
                        } else if (c2 <= '9') {
                            sb.append('1');
                        } else {
                            c = '0';
                        }
                        sb.append(c);
                    } else {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (Character.isLetter(c2)) {
                            byte directionality = Character.getDirectionality(c2);
                            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                                sb.append('R');
                            } else {
                                sb.append('L');
                            }
                        } else {
                            sb.append(c2);
                        }
                    }
                    i3++;
                    clickableSpanArr3 = clickableSpanArr2;
                }
                clickableSpanArr = clickableSpanArr3;
                String string2 = sb.toString();
                if (ekgpVar != null) {
                    cdrwVarArr = (cdrw[]) ekgpVar.values().toArray(new cdrw[0]);
                    cdrwVar = (cdrw) ekgpVar.get(clickableSpan);
                } else {
                    cdrwVarArr = null;
                    cdrwVar = null;
                }
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/linkify/RtlLinkify", "formatSpannableForRtl", 70, "RtlLinkify.java")).L("Index out of bounds! linkedText is \"%s\", spanStart = %d, spanEnd = %d, prevSpanEnd = %d, currentLinkEntityType is %s, linkEntityTypes are %s", string2, Integer.valueOf(spanStart), Integer.valueOf(spanEnd), Integer.valueOf(i2), cdrwVar, Arrays.toString(cdrwVarArr));
            }
            int length4 = spannableStringBuilder.length();
            if (ekgpVar != null && ekgpVar.containsKey(clickableSpan) && ((cdrw) ekgpVar.get(clickableSpan)).equals(cdrw.PHONE_NUMBER)) {
                spannableStringBuilder.append((CharSequence) cssf.b(spannable.subSequence(spanStart, spanEnd).toString(), true));
                length4 = spannableStringBuilder.toString().indexOf(string, length4);
                length = string.length() + length4;
            } else {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(spanStart, spanEnd).toString());
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(clickableSpan, length4, length, spannable.getSpanFlags(clickableSpan));
            i++;
            i2 = spanEnd;
            clickableSpanArr3 = clickableSpanArr;
        }
        spannableStringBuilder.append((CharSequence) spannable.subSequence(i2, spannable.length()).toString());
        return spannableStringBuilder;
    }
}
