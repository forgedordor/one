package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbm {
    private boolean a;
    private int b;
    private lbq c;

    public lbm() {
        Locale locale = Locale.getDefault();
        int i = lbo.d;
        b(TextUtils.getLayoutDirectionFromLocale(locale) == 1);
    }

    private final void b(boolean z) {
        this.a = z;
        this.c = lbo.a;
        this.b = 2;
    }

    public final lbo a() {
        return (this.b == 2 && this.c == lbo.a) ? this.a ? lbo.c : lbo.b : new lbo(this.a, this.b, this.c);
    }

    public lbm(byte[] bArr) {
        b(true);
    }
}
