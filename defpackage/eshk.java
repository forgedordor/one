package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshk {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static eshk c;

    private eshk() {
    }

    public static eshk b() {
        if (esic.a == null) {
            esic.a = new esic();
        }
        if (c == null) {
            c = new eshk();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(eshr eshrVar) {
        eshn eshnVar = (eshn) eshrVar;
        if (TextUtils.isEmpty(eshnVar.b)) {
            return true;
        }
        return eshnVar.e + eshnVar.d < a() + a;
    }
}
