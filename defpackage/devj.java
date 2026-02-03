package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class devj extends ContentObserver {
    final /* synthetic */ devn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public devj(devn devnVar) {
        super(null);
        this.a = devnVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
