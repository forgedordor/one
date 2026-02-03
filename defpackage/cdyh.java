package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyh extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler");
    private final fdjx b;
    private final cden c;

    public cdyh(fdjx fdjxVar, cden cdenVar) {
        fdjxVar.getClass();
        cdenVar.getClass();
        this.b = fdjxVar;
        this.c = cdenVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("DeletePartCmsAttachmentHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cdyj.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cdyj cdyjVar = (cdyj) evuhVar;
        cdyjVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new cdyg(cdyjVar, this, null));
    }

    public final Object k(String str, String str2, Throwable th, fcxy fcxyVar) {
        Object objC;
        ekrd ekrdVarA = a.a(Level.WARNING);
        ekrdVarA.X(eksq.a, "BugleCmsMedia");
        ekrdVarA.X(bzmz.k, str2);
        ((ekrd) ekrdVarA.g(th).h("com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler", "processFailure", 103, "DeletePartCmsAttachmentHandler.kt")).q(str);
        return (th == null || (objC = fdxs.c(this.c.b(th), fcxyVar)) != fcyl.a) ? fctx.a : objC;
    }
}
