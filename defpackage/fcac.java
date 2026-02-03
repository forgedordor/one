package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcac extends fbnf {
    private final fcad a;

    public fcac(fcad fcadVar, fcmq fcmqVar) {
        fcadVar.getClass();
        this.a = fcadVar;
        fcmqVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.fbnf
    public final void a(int i, String str) {
        Level levelC = c(i);
        if (fcad.a.isLoggable(levelC)) {
            fcad.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.fbnf
    public final void b(int i, String str, Object... objArr) {
        Level levelC = c(i);
        d(i);
        a(i, fcad.a.isLoggable(levelC) ? MessageFormat.format(str, objArr) : null);
    }
}
