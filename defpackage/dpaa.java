package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpaa extends fdbo implements fdat {
    public static final dpaa a = new dpaa();

    public dpaa() {
        super(2, dobg.class, "resolveMedia", "resolveMedia(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        fcxy fcxyVar = (fcxy) obj2;
        fdap fdapVar = ((dobg) obj).d;
        if (fdapVar == null) {
            fdbq.c("cachingMediaResolver");
            fdapVar = null;
        }
        return fdapVar.invoke(fcxyVar);
    }
}
