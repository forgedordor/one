package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwwo implements eora {
    final /* synthetic */ dwwp a;

    public dwwo(dwwp dwwpVar) {
        this.a = dwwpVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        dwwp dwwpVar = this.a;
        synchronized (dwwpVar) {
            dwwpVar.d = (dwwy) dwwpVar.a.apply(obj);
            if (!dwwpVar.c) {
                dwwpVar.d.j(dwwpVar.b);
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
