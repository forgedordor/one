package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzo implements fcfm {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.fcfm
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
