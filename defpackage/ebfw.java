package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfw {
    private final ebfu a;
    private Socket b;

    public ebfw(ebfs ebfsVar) {
        this.a = new ebfr(ebfsVar);
    }

    private final boolean e() {
        return this.b != null;
    }

    public final InputStream a() throws IOException {
        if (!e() || this.b.isClosed()) {
            throw new IOException("Connection not opened");
        }
        return this.b.getInputStream();
    }

    public final OutputStream b() throws IOException {
        if (!e() || this.b.isClosed()) {
            throw new IOException("Connection not opened");
        }
        return this.b.getOutputStream();
    }

    public final void c() throws IOException {
        if (!e() || this.b.isClosed()) {
            return;
        }
        this.b.close();
        this.a.a().ifPresent(new Consumer() { // from class: ebfp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ebew) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d() {
        this.b = this.a.b();
    }

    public ebfw(ebfv ebfvVar, ebft ebftVar, String str, int i, Optional optional) {
        this.a = new ebfq(ebfvVar, ebftVar, str, i, optional);
    }
}
