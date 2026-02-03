package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atbx implements atcb {
    final /* synthetic */ atcd a;
    private Optional b = Optional.empty();

    public atbx(atcd atcdVar) {
        this.a = atcdVar;
    }

    @Override // defpackage.atcb
    public final String a() {
        return "HttpExecutionState";
    }

    @Override // defpackage.atcb
    public final void b(atbv atbvVar) {
        eksl ekslVar = (eksl) atcd.a.h();
        ekrz ekrzVar = coie.a;
        String str = this.a.c;
        ekslVar.X(ekrzVar, str);
        ekslVar.X(coie.i, "HttpExecutionState");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "enter", 212, "InProgressFileTransfer.java")).q("Starting the HTTP execution.");
        if (atbvVar.b() != 2) {
            throw new IllegalStateException(String.format("Transfer id %s can't enter %s without a UrlHttpRequest.", str, "HttpExecutionState"));
        }
        atcm atcmVarA = atbvVar.a();
        this.b = Optional.of(atcmVarA);
        atcmVarA.b();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [atcm, java.lang.Object] */
    @Override // defpackage.atcb
    public final void c() {
        if (this.b.isEmpty()) {
            return;
        }
        eksl ekslVar = (eksl) atcd.a.h();
        ekslVar.X(coie.a, this.a.c);
        ekslVar.X(coie.i, "HttpExecutionState");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "exit", 234, "InProgressFileTransfer.java")).q("Cancelling the HTTP execution.");
        ?? r0 = this.b.get();
        this.b = Optional.empty();
        r0.a();
    }
}
