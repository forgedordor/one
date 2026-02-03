package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class liv extends ContentObserver {
    final /* synthetic */ lix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liv(lix lixVar) {
        super(new Handler());
        this.a = lixVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        lix lixVar = this.a;
        if (!lixVar.c || (cursor = lixVar.d) == null || cursor.isClosed()) {
            return;
        }
        lixVar.b = lixVar.d.requery();
    }
}
