package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzo extends ContentObserver {
    final /* synthetic */ lzp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzo(lzp lzpVar) {
        super(new Handler());
        this.a = lzpVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.k();
    }
}
