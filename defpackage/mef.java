package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mef {
    private static Executor a;

    public static synchronized Executor a() {
        if (a == null) {
            a = mgb.R("ExoPlayer:BackgroundExecutor");
        }
        return a;
    }
}
