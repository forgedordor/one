package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fcas extends Closeable {
    fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar);

    Collection b();

    ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
