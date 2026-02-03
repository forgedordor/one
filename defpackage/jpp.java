package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpp extends ContentObserver {
    final /* synthetic */ fdoa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpp(fdoa fdoaVar, Handler handler) {
        super(handler);
        this.a = fdoaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b(fctx.a);
    }
}
