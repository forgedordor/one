package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodd implements dpxz {
    final /* synthetic */ dode a;

    public dodd(dode dodeVar) {
        this.a = dodeVar;
    }

    @Override // defpackage.dpxz
    public final void a() {
        dode dodeVar = this.a;
        fdlr fdlrVar = dodeVar.j;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        dodeVar.h.invoke();
    }

    @Override // defpackage.dpxz
    public final void b() {
        dode dodeVar = this.a;
        dodeVar.i = fdil.d(dodeVar.b, null, null, new docy(dodeVar, null), 3);
    }

    @Override // defpackage.dpxz
    public final void c(String str) {
        dode dodeVar = this.a;
        fdlr fdlrVar = dodeVar.j;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        dodeVar.j = fdil.d(dodeVar.b, null, null, new dodc(dodeVar, str, null), 3);
    }
}
