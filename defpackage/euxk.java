package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxk implements euxm {
    public final ByteBuffer a;
    private final euxo b;

    public euxk(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        euxd euxdVar = new euxd();
        euxdVar.c(2);
        euxdVar.b(10);
        this.b = euxdVar.a();
    }

    @Override // defpackage.euxm
    public final euxo a() {
        return this.b;
    }

    @Override // defpackage.euxm
    public final void b() {
    }
}
