package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofi {
    public final Resources a;

    public ofi(Resources resources) {
        mee.f(resources);
        this.a = resources;
    }

    private static final String e(mau mauVar) {
        String str = mauVar.d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String str2 = mgb.a;
        Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
        String displayName = localeForLanguageTag.getDisplayName(locale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String a(mau mauVar) {
        int i = mauVar.j;
        return i == -1 ? "" : this.a.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String b(mau mauVar) {
        String strD = d(e(mauVar), c(mauVar));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        String str = mauVar.b;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final String c(mau mauVar) {
        int i = mauVar.f;
        String string = (i & 2) != 0 ? this.a.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = d(string, this.a.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = d(string, this.a.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? d(string, this.a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
