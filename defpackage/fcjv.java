package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcjv implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcao b;
    final /* synthetic */ fbrg c;
    final /* synthetic */ fckp d;

    public fcjv(fckp fckpVar, Status status, fcao fcaoVar, fbrg fbrgVar) {
        this.a = status;
        this.b = fcaoVar;
        this.c = fbrgVar;
        this.d = fckpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.d;
        fckpVar.G = true;
        fckpVar.C.a(this.a, this.b, this.c);
    }
}
