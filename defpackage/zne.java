package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zne extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public zne(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zne zneVar = new zne((fcxy) obj3);
        zneVar.c = (fdpm) obj;
        zneVar.b = (Throwable) obj2;
        return zneVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r7 = this.c;
            Object obj2 = this.b;
            if (obj2 == null) {
                ((ekrd) znp.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 91, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit after timeout. Emitting null to avoid empty message list.");
            } else {
                ((ekrd) ((ekrd) znp.a.j()).g((Throwable) obj2).h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 98, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit due to cancellation or timeout. Emitting null to avoid empty message list.");
            }
            this.c = null;
            this.a = 1;
            if (r7.fO(null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
