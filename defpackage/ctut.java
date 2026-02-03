package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctut extends fcyz implements fdat {
    final /* synthetic */ ctuu a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctut(ctuu ctuuVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ctuuVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctut) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        awch awchVarA = ((awci) this.a.d.b()).a();
        String str = ((avog) awchVarA.a(this.b)).a;
        String str2 = ((avog) awchVarA.a(this.c)).a;
        ekrw ekrwVarH = ctuu.a.h();
        ekrwVarH.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/startchat/logger/StartChatEventLogger$onContactSuggestionResultClick$1", "invokeSuspend", 167, "StartChatEventLogger.kt")).D("onContactSuggestionResultClick. destination: %s, input: %s", str, str2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctut(this.a, this.b, this.c, fcxyVar);
    }
}
