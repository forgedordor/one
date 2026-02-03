package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avha implements Runnable {
    final /* synthetic */ avhb a;
    final /* synthetic */ evvp b;

    public avha(avhb avhbVar, evvp evvpVar) {
        this.a = avhbVar;
        this.b = evvpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final avgz avgzVar = new avgz(this.b);
        ejvr ejvrVar = new ejvr() { // from class: avgx
            @Override // defpackage.ejvr
            public final /* synthetic */ Object apply(Object obj) {
                return avgzVar.invoke(obj);
            }
        };
        avhb avhbVar = this.a;
        avhbVar.c.m(ejvrVar);
        if (((Boolean) avhbVar.f.b()).booleanValue()) {
            ((cazj) ((avif) avhbVar.e.b()).a.b()).a(cbcu.f("schedule_delete_and_import_contacts", evrl.a));
        } else {
            avhbVar.b.a();
        }
    }
}
