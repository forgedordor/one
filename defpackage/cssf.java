package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssf {
    private final Context a;

    public cssf(Context context) {
        this.a = context;
    }

    public static String a(String str) {
        return lbo.a().b(str);
    }

    public static String b(String str, boolean z) {
        if (!z) {
            return lbo.a().c(str, lbu.a);
        }
        int i = lbo.d;
        return new lbm(null).a().c(str, lbu.a);
    }

    @Deprecated
    public static String c(String str) {
        return lbo.a().c(str, lbu.a);
    }

    public final String d(String str) throws Resources.NotFoundException {
        lbq lbqVar = lbu.a;
        if (!e() || TextUtils.isEmpty(str)) {
            return str;
        }
        String string = this.a.getResources().getString(R.string.comma_list_separator);
        lbo lboVarA = lbo.a();
        if (!str.contains(", ")) {
            return lboVarA.c(str, lbqVar);
        }
        String[] strArrSplit = str.split(", ");
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = lboVarA.c(strArrSplit[i], lbqVar);
        }
        return new ejwc(string).f(strArrSplit);
    }

    public final boolean e() {
        return this.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final String f(String str, TextPaint textPaint, int i, int i2) throws Resources.NotFoundException {
        Context context = this.a;
        String strD = d(str);
        String string = TextUtils.listEllipsize(context, ekjz.a(ejxk.e(", ").f().i(str)), context.getResources().getString(R.string.enumeration_comma), textPaint, i, i2).toString();
        return TextUtils.isEmpty(string) ? strD : string;
    }
}
