package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esnd {
    final List a = new ArrayList();

    final void a(ByteBuffer byteBuffer) {
        List list = this.a;
        if (list.isEmpty() || list.get(list.size() - 1) != byteBuffer) {
            list.add(byteBuffer);
        }
    }
}
