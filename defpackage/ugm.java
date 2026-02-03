package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugm implements ufz {
    final /* synthetic */ anpj a;
    private cquc b;

    public ugm(anpj anpjVar) {
        this.a = anpjVar;
    }

    @Override // defpackage.ufz
    public final void a(final fdae fdaeVar) {
        this.b = this.a.a(new anpi() { // from class: ugl
            @Override // defpackage.anpi
            public final eiju a() {
                fdaeVar.invoke();
                return eijx.e(null);
            }
        });
    }

    @Override // defpackage.ufz
    public final void b() {
        cquc cqucVar = this.b;
        if (cqucVar == null) {
            fdbq.c("subscriptionToken");
            cqucVar = null;
        }
        cqucVar.a();
    }
}
