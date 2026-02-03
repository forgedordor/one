package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atjh implements fdap {
    final /* synthetic */ atjl a;

    public atjh(atjl atjlVar) {
        this.a = atjlVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ekrw ekrwVarH = atjl.a.h();
        ekrwVarH.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = coie.j;
        atjl atjlVar = this.a;
        athh athhVar = atjlVar.c;
        ekrdVar.X(ekrzVar, athhVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/WaitingStep$awaitCallback$2$1$1", "invoke", 72, "WaitingStep.kt")).q("Continuation has been cancelled, removing related file processing listeners.");
        atjlVar.b.a(athhVar);
        return fctx.a;
    }
}
