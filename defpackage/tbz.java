package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbz {
    public final fcsu a;

    public tbz(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(int i) {
        enjq enjqVar = (enjq) enjr.a.createBuilder();
        enjqVar.copyOnWrite();
        enjr enjrVar = (enjr) enjqVar.instance;
        enjrVar.c = i - 1;
        enjrVar.b |= 1;
        enjr enjrVar2 = (enjr) enjqVar.build();
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_SYSTEM_BACKUP_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enjrVar2.getClass();
        ellhVar2.bC = enjrVar2;
        ellhVar2.g |= 32768;
        aillVar.k(ellgVar, emxt.BUGLE_SYSTEM_BACKUP_EVENT);
    }
}
