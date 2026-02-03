package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crap {
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;
    public byte f;
    private ezac g;

    public final crbg a() {
        return new crbg(this.a, this.b, this.c, this.d, this.e, this.g, (~this.f) & 63);
    }

    public final void b(ezac ezacVar) {
        if (ezacVar == null) {
            throw new NullPointerException("Null rejectionReason");
        }
        this.g = ezacVar;
        this.f = (byte) (this.f | 32);
    }
}
