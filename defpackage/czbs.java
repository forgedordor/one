package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbs extends ContentObserver {
    final /* synthetic */ czbt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czbs(czbt czbtVar) {
        super(null);
        this.a = czbtVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        czbt czbtVar = this.a;
        if (czbtVar.h.compareAndSet(false, true)) {
            cqdq.c(czbtVar.c(), 150L);
        }
    }
}
