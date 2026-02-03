package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class amgn extends fdbo implements fdap {
    final /* synthetic */ amgw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amgn(amgw amgwVar) {
        super(1, fdbp.class, "getEarliestMessagesSuspend", "getEarliestMessages$getEarliestMessagesSuspend(Lcom/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = amgwVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return amgw.b(this.a, 5, (fcxy) obj);
    }
}
