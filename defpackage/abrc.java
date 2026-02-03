package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrc implements ppr {
    final /* synthetic */ abrd a;
    private final abrd b;

    public abrc(abrd abrdVar, abrd abrdVar2) {
        this.a = abrdVar;
        this.b = abrdVar2;
    }

    @Override // defpackage.ppr
    public final void a(ppk ppkVar, boolean z, ppj ppjVar) {
        if (!z) {
            cqbd cqbdVarA = abrd.a.a();
            cqbdVarA.I("Ignoring post message from iFrame inside Ditto");
            cqbdVarA.r();
            return;
        }
        abrd abrdVar = this.a;
        if (abrdVar.j) {
            cqbd cqbdVarA2 = abrd.a.a();
            cqbdVarA2.I("Ignoring post message from closed transport");
            cqbdVarA2.r();
            return;
        }
        this.b.g = Optional.of(ppjVar);
        synchronized (abrdVar.b) {
            if (abrdVar.h.isPresent()) {
                ((kog) abrdVar.h.get()).b(null);
                abrdVar.h = Optional.empty();
            }
        }
        String strA = ppkVar.a();
        if (ejwk.c(strA)) {
            return;
        }
        abrd abrdVar2 = this.a;
        abrdVar2.f.b(strA, abrdVar2.d);
    }
}
