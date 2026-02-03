package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdk extends fcyz implements fdat {
    int a;
    final /* synthetic */ zdm b;
    final /* synthetic */ amvy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdk(zdm zdmVar, amvy amvyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zdmVar;
        this.c = amvyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zdm zdmVar = this.b;
            amvy amvyVar = this.c;
            Uri uriE = amvyVar.e();
            String strB = amvyVar.b();
            long j = fdhi.a;
            agdn agdnVar = new agdn(uriE, strB, 0L, true);
            this.a = 1;
            obj = zdmVar.g.f(agdnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aggc aggcVar = (aggc) obj;
        ekrw ekrwVarH = zdm.a.h();
        ekrwVarH.X(eksq.a, "BugleRbmRichCard");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter$openVideo$1", "invokeSuspend", 418, "RichCardBubbleUiAdapter.kt")).t("Rich Card bubble video MediaViewer result: %s", aggcVar);
        if (aggcVar != null) {
            zdm zdmVar2 = this.b;
            dltb dltbVar = zdm.b;
            doig doigVarA = zdmVar2.i.a() ? dohx.a(aggcVar.a) : null;
            zdmVar2.c(aggcVar, zdmVar2.h.j(dltbVar, doigVarA != null ? doigVarA.b : null));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zdk(this.b, this.c, fcxyVar);
    }
}
