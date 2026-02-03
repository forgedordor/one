package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dykb extends dyay {
    final /* synthetic */ dykc a;

    public dykb(dykc dykcVar) {
        this.a = dykcVar;
    }

    @Override // defpackage.dyay
    public final void c(ekgb ekgbVar) {
        final dykh dykhVar = this.a.a;
        dykhVar.d = ekgbVar;
        ecem.e(new Runnable() { // from class: dykf
            @Override // java.lang.Runnable
            public final void run() {
                dykh dykhVar2 = dykhVar;
                dykhVar2.a(dykhVar2.c);
            }
        });
    }
}
