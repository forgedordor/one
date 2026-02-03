package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diah {
    public static ListenableFuture a(Callable callable) {
        eosa eosaVar = new eosa(callable);
        new Thread(eosaVar).start();
        return eosaVar;
    }
}
