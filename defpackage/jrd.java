package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrd extends fdbr implements fdap {
    final /* synthetic */ CancellationSignal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrd(CancellationSignal cancellationSignal) {
        super(1);
        this.a = cancellationSignal;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (((Throwable) obj) != null) {
            this.a.cancel();
        }
        return fctx.a;
    }
}
