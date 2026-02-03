package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwuj {
    public final Context a;

    public cwuj(Context context) {
        context.getClass();
        this.a = context;
    }

    public static /* synthetic */ cwui a(cwuj cwujVar, String str, String str2, Integer num, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        cpef.e(cwujVar.a, spannableStringBuilder, str2, null);
        if ((i & 4) != 0) {
            num = null;
        }
        return new cwui(spannableStringBuilder, str2, num, (i & 8) != 0);
    }
}
