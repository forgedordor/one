package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbg extends ehba {
    final /* synthetic */ ehay a;
    final /* synthetic */ ehbk b;

    public ehbg(ehbk ehbkVar, ehay ehayVar) {
        this.a = ehayVar;
        this.b = ehbkVar;
    }

    @Override // defpackage.ehba
    public final void a(ehaw ehawVar) {
        ecem.c();
        ehbk ehbkVar = this.b;
        if (ehbkVar.b == null) {
            throw new ehbj();
        }
        lvj lvjVar = ehbkVar.a;
        if (!lvjVar.P().a().equals(lvb.d) && !lvjVar.P().a().equals(lvb.e)) {
            throw new ehbi();
        }
        final ehcf ehcfVar = ehbkVar.b;
        ehay ehayVar = this.a;
        ecem.c();
        final ehci ehciVar = (ehci) ehcfVar.b.get(ehayVar);
        ejwl.m(ehciVar != null, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
        ecem.c();
        ehcg ehcgVar = ehciVar.a;
        ehcgVar.getClass();
        ehciVar.a = new ehat(ejwi.j(ehawVar), ehcgVar.a(), ehcgVar.c(), ehcgVar.d());
        ecem.c();
        ehcfVar.d.execute(eiid.k(new Runnable() { // from class: ehcb
            @Override // java.lang.Runnable
            public final void run() {
                ehcfVar.d(ehciVar);
            }
        }));
    }
}
