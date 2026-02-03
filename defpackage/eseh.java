package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eseh implements Executor {
    public static final eseh a;
    private static final Handler b;
    private static final /* synthetic */ eseh[] c;

    static {
        eseh esehVar = new eseh();
        a = esehVar;
        c = new eseh[]{esehVar};
        b = new Handler(Looper.getMainLooper());
    }

    private eseh() {
    }

    public static eseh[] values() {
        return (eseh[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
