package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqo {
    private final Queue a;

    public rqo() {
        char[] cArr = rvk.a;
        this.a = new ArrayDeque(0);
    }

    final synchronized rcj a(ByteBuffer byteBuffer) {
        rcj rcjVar;
        rcjVar = (rcj) this.a.poll();
        if (rcjVar == null) {
            rcjVar = new rcj();
        }
        rcjVar.b = null;
        Arrays.fill(rcjVar.a, (byte) 0);
        rcjVar.c = new rci();
        rcjVar.d = 0;
        rcjVar.b = byteBuffer.asReadOnlyBuffer();
        rcjVar.b.position(0);
        rcjVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return rcjVar;
    }

    final synchronized void b(rcj rcjVar) {
        rcjVar.b = null;
        rcjVar.c = null;
        this.a.offer(rcjVar);
    }
}
