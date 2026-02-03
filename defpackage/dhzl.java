package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzl {
    public final ByteBuffer a;
    public final int b;

    public dhzl(ByteBuffer byteBuffer, int i) {
        this.a = byteBuffer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhzl)) {
            return false;
        }
        dhzl dhzlVar = (dhzl) obj;
        return fdbq.f(this.a, dhzlVar.a) && this.b == dhzlVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
