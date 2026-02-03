package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdo extends Handler {
    public static final ffdo a = new ffdo();

    private ffdo() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = ffdn.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String strZ = (String) ffdn.b.get(loggerName);
        if (strZ == null) {
            strZ = fdgn.Z(loggerName, 23);
        }
        if (!Log.isLoggable(strZ, i)) {
            return;
        }
        if (thrown != null) {
            message = message + "\n" + Log.getStackTraceString(thrown);
        }
        int i2 = 0;
        while (true) {
            int length = message.length();
            if (i2 >= length) {
                return;
            }
            int iN = fdgn.N(message, '\n', i2, 4);
            if (iN != -1) {
                length = iN;
            }
            while (true) {
                iMin = Math.min(length, i2 + 4000);
                String strSubstring = message.substring(i2, iMin);
                strSubstring.getClass();
                Log.println(i, strZ, strSubstring);
                if (iMin >= length) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
