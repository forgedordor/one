package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycq extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycq(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycq) c((bxuv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        bxuv bxuvVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (bxuvVar = (bxuv) this.b) != null) {
            yek yekVar = this.c;
            ekrd ekrdVar = (ekrd) yek.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$1$1", "invokeSuspend", 188, "PagedMessageListUiAdapterImpl.kt");
            String strA = bxuvVar.a.a();
            int i2 = bxuvVar.b;
            ekrdVar.B("Scrolling to search result %s at absolute offset %s", strA, i2);
            this.a = 1;
            if (yekVar.h.b(i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ycq ycqVar = new ycq(this.c, fcxyVar);
        ycqVar.b = obj;
        return ycqVar;
    }
}
