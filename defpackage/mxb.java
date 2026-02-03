package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxb extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    final /* synthetic */ mxd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxb(mxd mxdVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = mxdVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        mxd mxdVar = this.c;
        mxdVar.a(mwz.b(mxdVar.a, mxdVar.h, mxdVar.g));
    }
}
