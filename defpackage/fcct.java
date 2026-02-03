package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcct implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcao b;
    final /* synthetic */ fbrg c;
    final /* synthetic */ fccu d;

    public fcct(fccu fccuVar, Status status, fcao fcaoVar, fbrg fbrgVar) {
        this.a = status;
        this.b = fcaoVar;
        this.c = fbrgVar;
        this.d = fccuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
