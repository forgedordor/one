package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhtt extends dhtu {
    public final String a;
    public final ByteBuffer b;

    public dhtt(String str, ByteBuffer byteBuffer) {
        this.a = str;
        this.b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhtt)) {
            return false;
        }
        dhtt dhttVar = (dhtt) obj;
        return fdbq.f(this.a, dhttVar.a) && fdbq.f(this.b, dhttVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
