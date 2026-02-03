package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wot extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvo b;
    final /* synthetic */ wov c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wot(fcxy fcxyVar, vvo vvoVar, wov wovVar) {
        super(2, fcxyVar);
        this.b = vvoVar;
        this.c = wovVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        wot wotVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            wotVar = this;
        } else {
            ekrw ekrwVarE = wov.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/HugoAttachmentResolver$process$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 31, "HugoAttachmentResolver.kt");
            vvo vvoVar = this.b;
            ekrdVar.t("Resolving %s", vvoVar);
            wov wovVar = this.c;
            wou wouVar = new wou(vvoVar);
            this.a = 1;
            wotVar = this;
            obj = wovVar.c.c(vvoVar.c, vvoVar.e, true, wouVar, wotVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dltd dltdVar = (dltd) obj;
        if (dltdVar == null) {
            vvo vvoVar2 = wotVar.b;
            Objects.toString(vvoVar2);
            throw new IllegalStateException("Hugo is unable to resolve ".concat(String.valueOf(vvoVar2)));
        }
        if (dltdVar instanceof dltn) {
            return dltdVar;
        }
        Objects.toString(dltdVar);
        throw new IllegalStateException("Expected a resolved LocalAttachment but got ".concat(dltdVar.toString()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wot wotVar = new wot(fcxyVar, this.b, this.c);
        wotVar.d = obj;
        return wotVar;
    }
}
