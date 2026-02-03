package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vaj extends fcyz implements fdat {
    int a;
    final /* synthetic */ vak b;
    final /* synthetic */ enta c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vaj(vak vakVar, enta entaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vakVar;
        this.c = entaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = fdhi.a;
            Object objE = crbf.bi.e();
            objE.getClass();
            long jG = fdhk.g(((Number) objE).longValue(), fdhl.c);
            this.a = 1;
            if (fdkj.d(jG, this) == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) crbf.bj.e()).booleanValue()) {
            vak vakVar = this.b;
            ((ekrd) vakVar.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger$onSendClickedBeforeQueued$1", "invokeSuspend", 68, "MagicComposeSendClickedLogger.kt")).q("Using PWQ");
            vai vaiVar = (vai) vakVar.b.b();
            enta entaVar = this.c;
            caxr caxrVar = new caxr();
            Object objE2 = crbf.bk.e();
            objE2.getClass();
            caxrVar.c = Duration.ofMillis(((Number) objE2).longValue());
            ((cazj) vaiVar.a.b()).a(cbcu.g("magic_compose_send_clicked_log_handler", entaVar, caxrVar.a()));
        } else {
            vak vakVar2 = this.b;
            ((ekrd) vakVar2.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger$onSendClickedBeforeQueued$1", "invokeSuspend", 81, "MagicComposeSendClickedLogger.kt")).q("Not using PWQ");
            ((uzw) vakVar2.a.b()).m(this.c);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vaj(this.b, this.c, fcxyVar);
    }
}
