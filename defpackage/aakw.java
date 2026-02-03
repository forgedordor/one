package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakw extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ ConversationViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakw(fdpl fdplVar, ConversationViewModel conversationViewModel, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = conversationViewModel;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aakw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarB = fdsc.b(new aakv(this.b), 1);
            aaks aaksVar = new aaks(this.c);
            this.a = 1;
            if (fdplVarB.a(aaksVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aakw(this.b, this.c, fcxyVar);
    }
}
