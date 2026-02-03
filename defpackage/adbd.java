package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbd extends fcyz implements fdat {
    final /* synthetic */ adbm a;
    final /* synthetic */ hsf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adbd(adbm adbmVar, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = adbmVar;
        this.b = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            cwem cwemVarB = adbg.b(this.b);
            if ((cwemVarB != null ? cwemVarB.c : null) == cwen.e) {
                adbm adbmVar = this.a;
                if (!adbmVar.i) {
                    ekrw ekrwVarH = adbm.a.h();
                    ekrwVarH.X(eksq.a, "BugleCdp");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragmentPeer$onCreateView$1$2$1$1$1$1", "invokeSuspend", 127, "HomeMiniConversationDetailsFragmentPeer.kt")).q("Destroy Mini CDP fragment");
                    adbb adbbVar = adbmVar.c;
                    cg cgVar = new cg(adbbVar.J());
                    cgVar.o(adbbVar);
                    cgVar.c();
                }
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = adbm.a.j();
            ekrwVarJ.X(eksq.a, "BugleCdp");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragmentPeer$onCreateView$1$2$1$1$1$1", "invokeSuspend", 135, "HomeMiniConversationDetailsFragmentPeer.kt")).q("Failed to remove Mini CDP fragment post state saved");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adbd(this.a, this.b, fcxyVar);
    }
}
