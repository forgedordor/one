package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmvf implements dmvc, fdbl {
    final /* synthetic */ dmvc a;

    public dmvf(dmvc dmvcVar) {
        this.a = dmvcVar;
    }

    @Override // defpackage.dmvc
    public final Object a(dojv dojvVar, dnhn dnhnVar, fcxy fcxyVar) {
        return this.a.a(dojvVar, dnhnVar, fcxyVar);
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(3, this.a, dmvc.class, "invoke", "invoke(Lcom/google/android/libraries/compose/media/local/LocalMedia$Visual;Lcom/google/android/libraries/compose/draft/attachments/AttachmentAnalyticsPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dmvc) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
