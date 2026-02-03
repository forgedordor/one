package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbz extends mix {
    public long h;
    public int i;
    private int j;

    public nbz() {
        super(2);
        this.j = 32;
    }

    @Override // defpackage.mix, defpackage.miq
    public final void eP() {
        super.eP();
        this.i = 0;
    }

    public final void k(int i) {
        mee.a(true);
        this.j = i;
    }

    public final boolean l(mix mixVar) {
        ByteBuffer byteBuffer;
        mee.a(!mixVar.j());
        mee.a(!mixVar.d());
        mee.a(!mixVar.eS());
        if (m()) {
            if (this.i >= this.j) {
                return false;
            }
            ByteBuffer byteBuffer2 = mixVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.f = mixVar.f;
            if (mixVar.f()) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = mixVar.d;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = mixVar.f;
        return true;
    }

    public final boolean m() {
        return this.i > 0;
    }
}
