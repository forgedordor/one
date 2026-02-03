package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqdp {
    public static final ExecutorService a(String str, int i, int i2) {
        return Executors.newFixedThreadPool(i, new cqcj(str, i2));
    }
}
