package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class annx extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoer b;
    final /* synthetic */ BugleConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public annx(aoer aoerVar, BugleConversation bugleConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aoerVar;
        this.c = bugleConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((annx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarA = anov.a(this.b.e());
            annw annwVar = new annw(this.c);
            this.a = 1;
            if (fdplVarA.a(annwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new annx(this.b, this.c, fcxyVar);
    }
}
