package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcad {
    static final Logger a = Logger.getLogger(fbnf.class.getName());
    public final Object b = new Object();
    public final fbpn c;

    public fcad(fbpn fbpnVar, long j, String str) {
        fbpnVar.getClass();
        this.c = fbpnVar;
        fbpe fbpeVar = new fbpe();
        fbpeVar.a = str.concat(" created");
        fbpeVar.b = fbpf.CT_INFO;
        fbpeVar.b(j);
        b(fbpeVar.a());
    }

    static void a(fbpn fbpnVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + fbpnVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(fbpg fbpgVar) {
        int iOrdinal = fbpgVar.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, fbpgVar.a);
    }
}
