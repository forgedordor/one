package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehge {
    public static final ListenableFuture a(final List list) {
        return eika.a(list).b(new eooy() { // from class: ehgd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.e(list);
            }
        }, eoqg.a);
    }
}
