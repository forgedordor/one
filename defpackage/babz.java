package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class babz extends ContentObserver {
    final /* synthetic */ bacb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public babz(bacb bacbVar) {
        super(null);
        this.a = bacbVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b.clear();
    }
}
