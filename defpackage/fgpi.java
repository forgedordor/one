package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpi implements fgqf, fgqd {
    private final char a;

    public fgpi(char c) {
        this.a = c;
    }

    @Override // defpackage.fgqd
    public final int a() {
        return 1;
    }

    @Override // defpackage.fgqf
    public final int b() {
        return 1;
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }
}
