package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dzsk implements Runnable {
    public final /* synthetic */ dzsn a;

    public /* synthetic */ dzsk(dzsn dzsnVar) {
        this.a = dzsnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final dzsn dzsnVar = this.a;
        dzsnVar.g = dzsnVar.a.e().toMillis();
        dzsnVar.d.post(new Runnable() { // from class: dzsm
            @Override // java.lang.Runnable
            public final void run() {
                dzsn dzsnVar2 = dzsnVar;
                dzsnVar2.h = dzsnVar2.a.e().toMillis();
            }
        });
        dzsnVar.a(new dzsl(dzsnVar), dzsnVar.c.d());
    }
}
