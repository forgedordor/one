package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class amgp extends fdbo implements fdap {
    final /* synthetic */ amgw a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amgp(amgw amgwVar, int i) {
        super(1, fdbp.class, "getLatestMessagesSuspend", "getLatestMessages$getLatestMessagesSuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = amgwVar;
        this.b = i;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return amgw.c(this.a, this.b, (fcxy) obj);
    }
}
