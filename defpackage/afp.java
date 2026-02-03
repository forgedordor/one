package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface afp extends Closeable {
    ags a(String str, agu aguVar);

    ListenableFuture b();

    ListenableFuture c(agh aghVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ListenableFuture d(agj agjVar);

    ListenableFuture e(agw agwVar);

    aia f();

    ListenableFuture g(agu aguVar);
}
