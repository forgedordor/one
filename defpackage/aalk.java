package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalk extends fcyz implements fdat {
    int a;
    final /* synthetic */ aall b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalk(aall aallVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aallVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aalk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aall aallVar = this.b;
            Conversation conversation = aallVar.c;
            anpj anpjVarJ = conversation.c().j();
            anpjVarJ.getClass();
            aalj aaljVar = new aalj(anov.a(anpjVarJ));
            anpj anpjVarH = conversation.h();
            anpjVarH.getClass();
            fdpl fdplVarA = anov.a(anpjVarH);
            anpj anpjVarI = conversation.i();
            anpjVarI.getClass();
            fdpl fdplVarB = fdsc.b(fdud.b(aaljVar, fdplVarA, anov.a(anpjVarI), aallVar.d, new aalf(null)), 1);
            aalg aalgVar = new aalg(aallVar);
            this.a = 1;
            if (fdplVarB.a(aalgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aalk(this.b, fcxyVar);
    }
}
