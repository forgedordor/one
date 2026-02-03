package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxw implements fcmv {
    public final ByteBuffer a;

    public fbxw(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.fcmv
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.fcmv
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.fcmv
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.fcmv
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
