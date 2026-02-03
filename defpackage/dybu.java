package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dybu extends dyay {
    final /* synthetic */ dybw a;

    public dybu(dybw dybwVar) {
        this.a = dybwVar;
    }

    @Override // defpackage.dyay
    public final void b(final Object obj) {
        dyrf.a(new Runnable() { // from class: dybt
            @Override // java.lang.Runnable
            public final void run() {
                dybw dybwVar = this.a.a;
                dybwVar.e = obj;
                dybwVar.F();
            }
        });
    }

    @Override // defpackage.dyay
    public final void c(final ekgb ekgbVar) {
        dyrf.a(new Runnable() { // from class: dybs
            @Override // java.lang.Runnable
            public final void run() {
                dybw dybwVar = this.a.a;
                dybwVar.g = ekgbVar;
                dybwVar.F();
            }
        });
    }
}
