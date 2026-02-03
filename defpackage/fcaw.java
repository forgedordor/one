package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcaw implements fcay {
    @Override // defpackage.fcaz
    public final /* bridge */ /* synthetic */ int a(fcix fcixVar, int i, Object obj, int i2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        fcixVar.i(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
