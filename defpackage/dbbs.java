package defpackage;

import j$.time.Duration;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbs extends fcyz implements fdat {
    int a;
    final /* synthetic */ dbbp b;
    final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbs(dbbp dbbpVar, JSONObject jSONObject, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dbbpVar;
        this.c = jSONObject;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbbs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        ppj ppjVar = null;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                Duration duration = dbbp.a;
                dbbr dbbrVar = new dbbr(this.b, null);
                this.a = 1;
                if (fdna.b(fdhi.j(fdhk.g(duration.getSeconds(), fdhl.d), fdhk.f(duration.getNano(), fdhl.a)), dbbrVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            ppj ppjVar2 = this.b.h;
            if (ppjVar2 == null) {
                fdbq.c("activeReplyProxy");
            } else {
                ppjVar = ppjVar2;
            }
            ppjVar.a(this.c.toString());
        } catch (fdmx unused) {
            this.b.f.f(dbbd.a);
            ((ekrd) dbbp.c.j().h("com/google/android/apps/messaging/youtube/YouTubePlayerWebView$postPlayerMessage$1", "invokeSuspend", 148, "YouTubePlayerWebView.kt")).q("YouTube web player creation timed out.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dbbs(this.b, this.c, fcxyVar);
    }
}
