package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akcm implements cqto {
    final /* synthetic */ akcp a;

    public akcm(akcp akcpVar) {
        this.a = akcpVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final akcp akcpVar = this.a;
        akcpVar.d = akcpVar.b.a(akcp.d(akcpVar.c.a), "ConversationClassificationsObservableSupplier#queryMobileBertScamConversationClassification").f(new cqtk() { // from class: akcj
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                akcp akcpVar2 = akcpVar;
                return auvw.c(akcpVar2.a, fcyi.a, fdjz.a, new akco(akcpVar2, null));
            }
        }, "ConversationClassificationsObservableSupplier::register", "ConversationClassificationsObservableSupplier::callback", "ConversationClassificationsObservableSupplier::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        akcp akcpVar = this.a;
        cquc cqucVar = akcpVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        akcpVar.d = null;
    }
}
