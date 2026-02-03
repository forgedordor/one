package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zhs extends fcyz implements fdat {
    int a;
    final /* synthetic */ zih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhs(zih zihVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zhs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ((ekrd) zih.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$1", "invokeSuspend", 120, "VideoBubbleUiAdapter.kt")).q("Checking to recover media viewer result");
            zih zihVar = this.b;
            this.a = 1;
            obj = zihVar.y.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aggc aggcVar = (aggc) obj;
        if (aggcVar != null) {
            ((ekrd) zih.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$1", "invokeSuspend", 123, "VideoBubbleUiAdapter.kt")).q("Recovered media viewer result");
            zih zihVar2 = this.b;
            dltb dltbVar = zih.b;
            doig doigVarA = zihVar2.p.a() ? dohx.a(aggcVar.a) : null;
            zihVar2.b(aggcVar, zihVar2.n.j(dltbVar, doigVarA != null ? doigVarA.b : null));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zhs(this.b, fcxyVar);
    }
}
