package defpackage;

import io.grpc.Status;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcee {
    private static final Logger f = Logger.getLogger(fcee.class.getName());
    public final long a;
    public final ejxm b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Status e;

    public fcee(long j, ejxm ejxmVar) {
        this.a = j;
        this.b = ejxmVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(fcfi fcfiVar, Executor executor) {
        a(executor, new fced(fcfiVar));
    }
}
