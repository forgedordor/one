package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaym implements ehsl {
    final /* synthetic */ aayn a;

    public aaym(aayn aaynVar) {
        this.a = aaynVar;
    }

    @Override // defpackage.ehsl
    public final ejwi a() {
        return ejud.a;
    }

    @Override // defpackage.ehsl
    public final ListenableFuture c() {
        return eijx.e(ehsj.b(new Intent().setClassName(this.a.a, "com.google.android.apps.messaging.main.MainActivity")));
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ ehsj e() {
        return ehsk.a();
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void d() {
    }
}
