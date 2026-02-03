package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anbh {
    private final AtomicInteger a = new AtomicInteger(Integer.MIN_VALUE);

    public final CoreBugleMessageId a() {
        long jIncrementAndGet = this.a.incrementAndGet();
        ejwl.l(jIncrementAndGet < 0);
        return new CoreBugleMessageId(new MessageIdType(jIncrementAndGet), -1L);
    }
}
