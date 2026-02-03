package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdoz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdpb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoz(cdpb cdpbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdpbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdoz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            obj = cdmc.a();
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            final cdpb cdpbVar = this.b;
            defn defnVarC = ((ddhv) cdpbVar.b.b()).c((cdou) cdpbVar.m.a());
            defnVarC.s(new defb() { // from class: cdov
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    cdpb cdpbVar2 = cdpbVar;
                    Object objB = cdpbVar2.e.b();
                    objB.getClass();
                    auvw.m((fdjx) objB, null, new cdox(cdpbVar2, null), 3);
                }
            });
            defnVarC.t(new defe() { // from class: cdow
                @Override // defpackage.defe
                public final void d(Exception exc) {
                    cdpb cdpbVar2 = cdpbVar;
                    Object objB = cdpbVar2.e.b();
                    objB.getClass();
                    auvw.m((fdjx) objB, null, new cdoy(cdpbVar2, exc, null), 3);
                    if (((Boolean) cdpbVar2.k.b()).booleanValue()) {
                        throw new IllegalStateException("Failed to register listener on a standalone device.", exc);
                    }
                }
            });
            return fctx.a;
        }
        ((cdmo) this.b.g.b()).b(cdmn.c);
        ekrw ekrwVarH = cdpb.a.h();
        ekrwVarH.X(eksq.a, "BugleTrustedContacts");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "TrustedContactsSyncManager");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager$registerListener$1", "invokeSuspend", 82, "TrustedContactsSyncManager.kt")).q("TrustedContacts not enabled due to preconditions. Does not need to register parental controls listener.");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdoz(this.b, fcxyVar);
    }
}
