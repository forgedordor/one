package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgf implements bbl {
    final /* synthetic */ int a;
    final /* synthetic */ ByteBuffer b;

    public bgf(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // defpackage.bbl
    public final int a() {
        return 4;
    }

    @Override // defpackage.bbl
    public final int b() {
        return this.a;
    }

    @Override // defpackage.bbl
    public final ByteBuffer c() {
        return this.b;
    }
}
