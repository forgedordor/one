package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwym {
    static ParcelableSpan a(Context context, int i, String str) {
        try {
            return new dwyg(kyy.b(context, i));
        } catch (Resources.NotFoundException | IllegalArgumentException e) {
            dvhv.g("RichTextConvUtil", "Failed to load font", e);
            return new TypefaceSpan(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ejwi b(Context context, dwrv dwrvVar) {
        switch (dwrvVar.b().ordinal()) {
            case 1:
                return ejwi.j(new StyleSpan(1));
            case 2:
                return ejwi.j(new StyleSpan(2));
            case 3:
                return ejwi.j(new UnderlineSpan());
            case 4:
                return ejwi.j(new StrikethroughSpan());
            case 5:
                return ejwi.j(new SuperscriptSpan());
            case 6:
                return ejwi.j(new SubscriptSpan());
            case 7:
                if (!fbfm.i()) {
                    return ejwi.j(new ForegroundColorSpan(dwrvVar.d()));
                }
                break;
            case 8:
                return fbfm.i() ? ejud.a : ejwi.j(new BackgroundColorSpan(dwrvVar.a()));
            case 9:
                return ejwi.j(new AbsoluteSizeSpan((int) (dwrvVar.h() * context.getResources().getDisplayMetrics().scaledDensity)));
            case 10:
                ekgb ekgbVarL = dwrvVar.l();
                int i = ((ekoe) ekgbVarL).c;
                int i2 = 0;
                while (i2 < i) {
                    int iOrdinal = ((dwrz) ekgbVarL.get(i2)).ordinal();
                    i2++;
                    switch (iOrdinal) {
                        case 1:
                            return ejwi.j(new TypefaceSpan("sans-serif-light"));
                        case 2:
                        case 8:
                            return ejwi.j(new TypefaceSpan("sans-serif"));
                        case 3:
                            return ejwi.j(new TypefaceSpan("sans-serif-medium"));
                        case 4:
                            return ejwi.j(new TypefaceSpan("sans-serif-black"));
                        case 5:
                            return ejwi.j(a(context, R.font.google_sans, "sans-serif"));
                        case 6:
                            return ejwi.j(a(context, R.font.google_sans_medium, "sans-serif-medium"));
                    }
                }
                return ejud.a;
            case 11:
                int iE = dwrvVar.e();
                return ejwi.j(new AlignmentSpan.Standard(iE != 1 ? iE != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER));
            case 12:
                return ejwi.j(new URLSpan(((dwoj) dwrvVar.f()).a));
        }
        return ejud.a;
    }

    public static void c(SpannableString spannableString, dwrn dwrnVar, int i, ejwi ejwiVar) {
        if (ejwiVar.g()) {
            int iB = dwrnVar.b();
            int iA = dwrnVar.a();
            if (iB != 0) {
                if (iB >= 0 || iB > iA || iA > i) {
                    return;
                }
            } else if (iA != 0) {
                iB = 0;
                if (iB >= 0) {
                    return;
                } else {
                    return;
                }
            }
            Object objC = ejwiVar.c();
            int iB2 = dwrnVar.b();
            if (dwrnVar.a() != 0) {
                i = dwrnVar.a();
            }
            spannableString.setSpan(objC, iB2, i, 33);
        }
    }
}
