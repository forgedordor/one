package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpm {
    public final Logger a;
    public final Level b;

    public fcpm(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    private static String h(ffez ffezVar) {
        long j = ffezVar.b;
        return j <= 64 ? ffezVar.w().d() : ffezVar.x((int) Math.min(j, 64L)).d().concat("...");
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    final void b(int i, int i2, ffez ffezVar, int i3, boolean z) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", fcpk.a(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h(ffezVar));
        }
    }

    final void c(int i, int i2, fcqp fcqpVar, fffd fffdVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String strA = fcpk.a(i);
            String strValueOf = String.valueOf(fcqpVar);
            int iB = fffdVar.b();
            ffez ffezVar = new ffez();
            ffezVar.L(fffdVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strA + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + strValueOf + " length=" + iB + " bytes=" + h(ffezVar));
        }
    }

    final void d(int i, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", fcpk.a(i) + " PING: ack=false bytes=" + j);
        }
    }

    final void e(int i, int i2, fcqp fcqpVar) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", fcpk.a(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(fcqpVar));
        }
    }

    final void f(int i, fcrc fcrcVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String strA = fcpk.a(i);
            EnumMap enumMap = new EnumMap(fcpl.class);
            for (fcpl fcplVar : fcpl.values()) {
                int i2 = fcplVar.g;
                if (fcrcVar.c(i2)) {
                    enumMap.put((EnumMap) fcplVar, (fcpl) Integer.valueOf(fcrcVar.a(i2)));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strA + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    final void g(int i, int i2, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", fcpk.a(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }
}
