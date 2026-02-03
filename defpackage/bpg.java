package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpg implements koi {
    final /* synthetic */ Handler a;
    final /* synthetic */ Callable b;
    final /* synthetic */ bph c;

    public bpg(bph bphVar, Handler handler, Callable callable) {
        this.c = bphVar;
        this.a = handler;
        this.b = callable;
    }

    @Override // defpackage.koi
    public final Object a(kog kogVar) {
        kogVar.a(new bpf(this), bpc.a());
        this.c.a.set(kogVar);
        return "HandlerScheduledFuture-".concat(String.valueOf(this.b.toString()));
    }
}
