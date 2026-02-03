package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yuy extends fcyz implements fdat {
    int a;
    final /* synthetic */ yvq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuy(yvq yvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yuy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarG = yvq.a.g();
            ekrwVarG.X(eksq.a, "BugleImage");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$1", "invokeSuspend", 178, "ImageBubbleUiAdapter.kt")).q("Checking to recover media viewer result");
            yvq yvqVar = this.b;
            this.a = 1;
            obj = yvqVar.A.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aggc aggcVar = (aggc) obj;
        if (aggcVar != null) {
            ekrw ekrwVarG2 = yvq.a.g();
            ekrwVarG2.X(eksq.a, "BugleImage");
            ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$1", "invokeSuspend", 181, "ImageBubbleUiAdapter.kt")).q("Recovered media viewer result");
            yvq yvqVar2 = this.b;
            dltb dltbVar = yvq.b;
            doig doigVarA = yvqVar2.s.a() ? dohx.a(aggcVar.a) : null;
            yvqVar2.b(aggcVar, yvqVar2.r.j(dltbVar, doigVarA != null ? doigVarA.b : null));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yuy(this.b, fcxyVar);
    }
}
