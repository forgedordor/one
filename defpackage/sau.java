package defpackage;

import android.net.LocalSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sau {
    public final LocalSocket a;
    private final sak b;

    public sau(LocalSocket localSocket, sak sakVar) {
        this.a = localSocket;
        this.b = sakVar;
    }

    public final InputStream a() {
        return this.b.a();
    }

    public final OutputStream b() {
        return this.a.getOutputStream();
    }
}
