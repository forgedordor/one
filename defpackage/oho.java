package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oho {
    public static float a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void b(mdt mdtVar) {
        mdtVar.d(-3.4028235E38f, Integer.MIN_VALUE);
        CharSequence charSequence = mdtVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                mdtVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = mdtVar.a;
            mee.f(charSequence2);
            c((Spannable) charSequence2, new ejwm() { // from class: ohn
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
                }
            });
        }
    }

    public static void c(Spannable spannable, ejwm ejwmVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (ejwmVar.a(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
