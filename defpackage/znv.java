package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znv implements Closeable, ajlz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler");
    private final znu b;
    private final zoj c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final cquc e;

    public znv(znu znuVar, zoj zojVar, ajma ajmaVar) {
        this.b = znuVar;
        this.c = zojVar;
        this.e = ajmaVar.c(this);
    }

    @Override // defpackage.ajlz
    public final void a() {
        if (this.d.get()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 36, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
            return;
        }
        znu znuVar = this.b;
        if (znuVar.h()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 40, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already invalid");
            return;
        }
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 43, "MessageListPagingSourceChangeHandler.kt")).q("Invalidating pagingSource due to data change");
        znuVar.e();
        this.c.b = null;
    }

    @Override // defpackage.ajlz
    public final void b(ajle ajleVar, ajly ajlyVar) {
        ajleVar.getClass();
        if (this.d.get()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 23, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
            return;
        }
        znu znuVar = this.b;
        if (znuVar.h()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 27, "MessageListPagingSourceChangeHandler.kt")).q("Skipping onChanged since the source is already invalid");
        } else {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 30, "MessageListPagingSourceChangeHandler.kt")).D("Invalidating pagingSource,operation %s on %s", ajleVar, ajlyVar);
            znuVar.e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.set(true);
        this.e.close();
    }
}
