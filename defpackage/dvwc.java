package defpackage;

import android.database.ContentObserver;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvwc extends ContentObserver {
    final /* synthetic */ dvwd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvwc(dvwd dvwdVar) {
        super(dvwdVar.s.e);
        this.a = dvwdVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        dvia.a(Looper.getMainLooper() == Looper.myLooper(), "checkMainThread failed");
        this.a.k();
    }
}
