package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxx implements fcmw {
    @Override // defpackage.fcmw
    public final fcmv a(int i) {
        return new fbxw(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
