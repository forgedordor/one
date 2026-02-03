package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctoq extends fdbb implements fdau {
    public ctoq(Object obj) {
        super(3, obj, ctor.class, "createChatbotDirectoryUiData", "createChatbotDirectoryUiData(Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatBotInfo;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/contactlist/rbm/ChatbotDirectoryUiData;", 4);
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cueh cuehVar;
        final ctok ctokVar = (ctok) obj;
        cudx cudxVar = (cudx) obj2;
        final ctor ctorVar = (ctor) this.b;
        boolean z = false;
        if (ctokVar.a && ((cuehVar = cudxVar.d) == cueh.a || cuehVar == cueh.c)) {
            z = true;
        }
        return new ctot(z, new fdae() { // from class: ctoo
            @Override // defpackage.fdae
            public final Object invoke() {
                ((afzc) ctorVar.b.b()).j(new ageb(ctokVar.b));
                return fctx.a;
            }
        });
    }
}
