package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajkg extends fcyz implements fdat {
    final /* synthetic */ ajkh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajkg(ajkh ajkhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ajkhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajkg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ejxr ejxrVar = ajkb.b;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            ajkh ajkhVar = this.a;
            if (!((Optional) ajkhVar.a.b()).isEmpty()) {
                ((eksl) ajkhVar.c.h()).q("logging the cobalt app install metric");
                ajjz ajjzVar = ajkhVar.b;
                if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
                    Optional optional = ajjzVar.b;
                    if (optional.isPresent()) {
                        ((ajkc) optional.get()).a(2L, ajjzVar.a());
                    }
                    ajjzVar.c.a(4, eonc.j(ajjzVar.a())).t(new defe() { // from class: ajjy
                        @Override // defpackage.defe
                        public final void d(Exception exc) {
                            if ((exc instanceof dcff) && ((dcff) exc).a() == 17) {
                                return;
                            }
                            ((ekrd) ((ekrd) ((ekrd) ajjz.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/AppInstallCobaltLogger", "logUnexpectedFailure", 71, "AppInstallCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
                        }
                    });
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajkg(this.a, fcxyVar);
    }
}
