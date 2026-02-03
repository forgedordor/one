package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface smj extends AutoCloseable {
    ListenableFuture a(int i);

    ListenableFuture b(int i, int i2);

    ListenableFuture c(smq smqVar);

    @Override // java.lang.AutoCloseable
    void close();

    ListenableFuture d();

    eosc e();

    Executor f();

    boolean g();

    ListenableFuture h(smq smqVar, ejcr ejcrVar);
}
