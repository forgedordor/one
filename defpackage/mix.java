package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mix extends miq {
    public mau b;
    public final mit c = new mit();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    private final int h;

    static {
        mbp.b("media3.decoder");
    }

    public mix(int i) {
        this.h = i;
    }

    private final ByteBuffer k(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new miw(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // defpackage.miq
    public void eP() {
        super.eP();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void h(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = k(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferK = k(i2);
        byteBufferK.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferK.put(byteBuffer);
        }
        this.d = byteBufferK;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean j() {
        return eR(1073741824);
    }
}
