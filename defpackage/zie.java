package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zie extends fcyz implements fdat {
    int a;
    final /* synthetic */ zih b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zie(zih zihVar, Uri uri, String str, long j, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zihVar;
        this.c = uri;
        this.d = str;
        this.e = j;
        this.f = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zie) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zih zihVar = this.b;
            agdn agdnVar = new agdn(this.c, this.d, this.e, this.f);
            this.a = 1;
            obj = zihVar.g.f(agdnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aggc aggcVar = (aggc) obj;
        ((ekrd) zih.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$openLegacyMediaViewer$1", "invokeSuspend", 572, "VideoBubbleUiAdapter.kt")).t("Video bubble MediaViewer result: %s", aggcVar);
        if (aggcVar != null) {
            zih zihVar2 = this.b;
            dltb dltbVar = zih.b;
            doig doigVarA = zihVar2.p.a() ? dohx.a(aggcVar.a) : null;
            zihVar2.b(aggcVar, zihVar2.n.j(dltbVar, doigVarA != null ? doigVarA.b : null));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zie(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
