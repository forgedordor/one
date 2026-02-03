package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywg extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ ahat b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywg(ahat ahatVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahatVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywg) c((ajlt) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ajlt ajltVar = (ajlt) this.a;
        if (ajltVar == null) {
            ((ekrd) ywm.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$unused$1$1$1$job$1$1", "invokeSuspend", 134, "MetatextClickHandlerImpl.kt")).q("Message is deleted, hiding bottom sheet");
            this.b.a();
            return false;
        }
        if (this.c || !ykm.w(ajltVar)) {
            return true;
        }
        ((ekrd) ywm.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$unused$1$1$1$job$1$1", "invokeSuspend", 140, "MetatextClickHandlerImpl.kt")).q("Message is sent, hiding bottom sheet");
        this.b.a();
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ywg ywgVar = new ywg(this.b, this.c, fcxyVar);
        ywgVar.a = obj;
        return ywgVar;
    }
}
