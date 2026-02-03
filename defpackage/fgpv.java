package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpv extends fgpn {
    public fgpv(fgmu fgmuVar, int i, boolean z) {
        super(fgmuVar, i, z);
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        try {
            fgqb.d(appendable, this.a.a(fgmqVar).a(j));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
