package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esvs implements eora {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ eswn b;
    final /* synthetic */ esvt c;

    public esvs(esvt esvtVar, ListenableFuture listenableFuture, eswn eswnVar) {
        this.a = listenableFuture;
        this.b = eswnVar;
        this.c = esvtVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            eork.r(this.a, eiid.h(new esvr(this, this.b)), eoqg.a);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }
}
