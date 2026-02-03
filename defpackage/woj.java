package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class woj extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ vvr d;
    final /* synthetic */ wor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woj(vvr vvrVar, wor worVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = vvrVar;
        this.e = worVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((woj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        int i = this.c;
        if (i == 0) {
            fctl.b(obj);
            ekrw ekrwVarG = wor.a.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$cancel$2", "invokeSuspend", 135, "DraftAttachmentPostProcessorImpl.kt");
            vvr vvrVar = this.d;
            ekrdVar.t("Cancel early processing %s", vvrVar);
            wor worVar = this.e;
            this.c = 1;
            obj = worVar.f(vvrVar, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj3 = this.b;
            obj2 = this.a;
            fctl.b(obj);
            ((bxno) obj3).c((Uri) obj2, ((Number) obj).longValue());
            return fctx.a;
        }
        fctl.b(obj);
        if (((Boolean) obj).booleanValue()) {
            vvr vvrVar2 = this.d;
            obj2 = vvrVar2.b.c;
            if (obj2 == null) {
                dltd dltdVar = vvrVar2.a;
                obj2 = dltdVar instanceof dltn ? Uri.parse(((dltn) dltdVar).f()) : null;
            }
            if (obj2 != null) {
                wor worVar2 = this.e;
                this.a = obj2;
                bxno bxnoVar = worVar2.b;
                this.b = bxnoVar;
                this.c = 2;
                obj = worVar2.e(this);
                if (obj != fcylVar) {
                    obj3 = bxnoVar;
                    ((bxno) obj3).c((Uri) obj2, ((Number) obj).longValue());
                }
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new woj(this.d, this.e, fcxyVar);
    }
}
