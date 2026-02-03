package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxq extends ContentObserver {
    final /* synthetic */ dzxr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzxq(dzxr dzxrVar) {
        super(null);
        this.a = dzxrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}
