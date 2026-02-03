package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adja {
    private final fcsu a;

    public adja(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(emxp emxpVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.IN_APP_UPDATE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emxpVar.getClass();
        ellhVar2.br = emxpVar;
        ellhVar2.g |= 1;
        aillVar.k(ellgVar, emxt.IN_APP_UPDATE_EVENT);
    }

    public final void b(int i, boolean z) {
        emxl emxlVar = (emxl) emxp.a.createBuilder();
        emxlVar.copyOnWrite();
        emxp emxpVar = (emxp) emxlVar.instance;
        emxpVar.c = i - 1;
        emxpVar.b |= 1;
        emxlVar.copyOnWrite();
        emxp emxpVar2 = (emxp) emxlVar.instance;
        emxpVar2.d = (true != z ? 3 : 2) - 1;
        emxpVar2.b |= 2;
        a((emxp) emxlVar.build());
    }
}
