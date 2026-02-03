package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqni {
    static final cczi a;
    static final cczi b;
    static final cczi c;
    static final cczi d;
    private static final int e;

    static {
        int iIntValue = Level.INFO.intValue();
        e = iIntValue;
        a = cdag.e(cdag.b, "flogger_client_logging_minimum_log_level", Level.WARNING.intValue());
        b = cdag.e(cdag.b, "flogger_logs_file_rotation_set_size", 4);
        c = cdag.e(cdag.b, "flogger_logs_file_size_limit", 4194304);
        d = cdag.e(cdag.b, "flogger_logs_file_minimum_log_level", iIntValue);
    }
}
