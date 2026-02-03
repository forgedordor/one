package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wei implements dmvc, fdbl {
    final /* synthetic */ dnhq a;

    public wei(dnhq dnhqVar) {
        this.a = dnhqVar;
    }

    @Override // defpackage.dmvc
    public final /* bridge */ /* synthetic */ Object a(dojv dojvVar, dnhn dnhnVar, fcxy fcxyVar) {
        Object objB = this.a.b(dojvVar, dnhnVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(3, this.a, dnhq.class, "addAttachment", "addAttachment(Lcom/google/android/libraries/compose/attachments/Attachment;Lcom/google/android/libraries/compose/draft/attachments/AttachmentAnalyticsPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
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
