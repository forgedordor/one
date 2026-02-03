package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzq extends dhph implements Closeable {
    public final ByteBuffer a;

    public dhzq(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = dhzr.a;
        TartarusKt.freeTartarusBuffer(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhzq) && fdbq.f(this.a, ((dhzq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
