package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fgpo extends fgpn {
    protected final int d;

    protected fgpo(fgmu fgmuVar, int i, boolean z, int i2) {
        super(fgmuVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        try {
            fgqb.b(appendable, this.a.a(fgmqVar).a(j), this.d);
        } catch (RuntimeException unused) {
            fgpw.b(appendable, this.d);
        }
    }
}
