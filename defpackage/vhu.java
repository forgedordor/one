package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhu extends fcyz implements fdat {
    final /* synthetic */ vie a;
    final /* synthetic */ ajlk b;
    final /* synthetic */ ajlu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhu(vie vieVar, ajlk ajlkVar, ajlu ajluVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vieVar;
        this.b = ajlkVar;
        this.c = ajluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vhu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = vie.a.h();
        ekrwVarH.X(eksq.a, "BugleConversation");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/actions/details/ConversationDetailsActionPlugin$onClick$1", "invokeSuspend", 161, "ConversationDetailsActionPlugin.kt")).q("Open conversation details from conversation detail action plugin.");
        this.a.d.h(new agbt(this.b, this.c, 3, 2));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vhu(this.a, this.b, this.c, fcxyVar);
    }
}
