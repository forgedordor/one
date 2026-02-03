package org.tensorflow.lite.task.processor;

import defpackage.fgvw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class NearestNeighbor {
    static NearestNeighbor create(byte[] bArr, float f) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.nativeOrder());
        return new fgvw(byteBufferWrap, f);
    }

    public abstract float a();

    public abstract ByteBuffer b();
}
