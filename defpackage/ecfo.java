package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfo {
    private OutputStream a;
    private ecgg b;

    public final void a(List list) {
        Closeable closeable = (OutputStream) ekis.j(list);
        if (closeable instanceof ecgg) {
            this.b = (ecgg) closeable;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void b() throws IOException {
        if (this.b == null) {
            throw new ecgh("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.b();
    }
}
