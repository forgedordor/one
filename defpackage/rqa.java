package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqa implements rfi {
    private final ByteBuffer a;

    public rqa(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.rfi
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.rfi
    public final void b() {
    }
}
