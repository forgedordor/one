package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zde extends fdbo implements fdap {
    public zde(Object obj) {
        super(1, obj, zdm.class, "cancelRichCardAttachmentDownload", "cancelRichCardAttachmentDownload(Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        amuy amuyVar = (amuy) obj;
        amuyVar.getClass();
        ajmh ajmhVar = ((zdm) this.g).f;
        if (!(ajmhVar instanceof anfy)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((anfy) ajmhVar).b(amuyVar);
        return fctx.a;
    }
}
