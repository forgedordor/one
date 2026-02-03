package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyki implements cazx {
    final /* synthetic */ cykk a;

    public cyki(cykk cykkVar) {
        this.a = cykkVar;
    }

    @Override // defpackage.cazx
    public final void a() {
        final cykk cykkVar = this.a;
        cqdq.e(new Runnable() { // from class: cykh
            @Override // java.lang.Runnable
            public final void run() {
                cykkVar.k.a("Wear sync deduped to existing queue", true);
            }
        });
    }

    @Override // defpackage.cazx
    public final void b() {
        final cykk cykkVar = this.a;
        cqdq.e(new Runnable() { // from class: cykg
            @Override // java.lang.Runnable
            public final void run() {
                cykkVar.k.a("Wear sync queued", true);
            }
        });
    }
}
