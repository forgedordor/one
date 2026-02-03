package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnyd extends fdbo implements fdat {
    public static final dnyd a = new dnyd();

    public dnyd() {
        super(2, dnwt.class, "resolveMedia", "resolveMedia(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        fcxy fcxyVar = (fcxy) obj2;
        fdap fdapVar = ((dnwt) obj).b;
        if (fdapVar == null) {
            fdbq.c("cachingMediaResolver");
            fdapVar = null;
        }
        return fdapVar.invoke(fcxyVar);
    }
}
