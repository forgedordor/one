package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvu extends fcyz implements fdat {
    int a;
    final /* synthetic */ xvw b;
    final /* synthetic */ vvw c;
    final /* synthetic */ dpfy d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvu(xvw xvwVar, vvw vvwVar, dpfy dpfyVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xvwVar;
        this.c = vvwVar;
        this.d = dpfyVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xvw xvwVar = this.b;
            vwj vwjVar = (vwj) xvwVar.m.a();
            vvw vvwVar = this.c;
            vto vtoVar = new vto(xvwVar.i.a());
            this.a = 1;
            obj = vwjVar.b(vvwVar, vtoVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.d.f.e();
            this.b.i.b();
        } else {
            ekrw ekrwVarI = xvw.a.i();
            ekrwVarI.X(eksq.a, "BugleMediaViewer");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter$onSend$1$1$1", "invokeSuspend", 190, "MediaViewerComposeRowUiAdapter.kt")).t("Failed to send %s", this.e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xvu(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
