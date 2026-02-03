package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drke {
    public final String a;
    public final Context b;
    public final EnumMap c = new EnumMap(drkg.class);
    private final drkf d;

    public drke(Context context, drkf drkfVar) {
        if (TextUtils.isEmpty("BundledEmojiListLoader")) {
            throw new IllegalArgumentException();
        }
        this.b = context;
        this.a = "BundledEmojiListLoader";
        this.d = drkfVar;
    }

    public static String a(String str, char c) {
        String strValueOf = String.valueOf(ejuf.d(Integer.toHexString(c)));
        ejuv ejuvVar = new ejuv(c);
        String strConcat = "%".concat(strValueOf);
        int length = strConcat.length();
        if (length == 0) {
            return ejuvVar.p(str);
        }
        int i = 0;
        if (length == 1) {
            return ejuvVar.h(str, strConcat.charAt(0));
        }
        String string = str.toString();
        int iD = ejuvVar.d(string);
        if (iD == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i, iD);
            sb.append((CharSequence) strConcat);
            i = iD + 1;
            iD = ejuvVar.e(string, i);
        } while (iD != -1);
        sb.append((CharSequence) string, i, length2);
        return sb.toString();
    }

    public static String b(String str) {
        return a(a(a(str, '%'), '|'), '>');
    }

    public final void c() {
        this.c.put((EnumMap) drkg.APP, (drkg) Long.toString(this.d.b));
    }

    public final void d() {
        this.c.put((EnumMap) drkg.OS, (drkg) this.d.a);
    }
}
