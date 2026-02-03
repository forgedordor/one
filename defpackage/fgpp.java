package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpp implements fgqf, fgqd {
    private final String a;

    public fgpp(String str) {
        this.a = str;
    }

    @Override // defpackage.fgqd
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        String str = this.a;
        return fgpw.d(charSequence, i, str) ? i + str.length() : ~i;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }
}
