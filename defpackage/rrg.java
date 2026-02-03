package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrg implements rrh {
    @Override // defpackage.rrh
    public final rhy a(rhy rhyVar, rex rexVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferB = ((rqs) rhyVar.c()).b();
        int i = ruu.a;
        rut rutVar = null;
        if (!byteBufferB.isReadOnly() && byteBufferB.hasArray()) {
            rutVar = new rut(byteBufferB.array(), byteBufferB.arrayOffset(), byteBufferB.limit());
        }
        if (rutVar != null && rutVar.a == 0 && rutVar.b == rutVar.c.length) {
            bArrArray = byteBufferB.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferB.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
            ruu.b(byteBufferAsReadOnlyBuffer);
            byteBufferAsReadOnlyBuffer.get(bArr);
            bArrArray = bArr;
        }
        return new rqb(bArrArray);
    }
}
