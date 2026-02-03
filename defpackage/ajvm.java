package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajvm implements cqto {
    final /* synthetic */ ajvn a;

    public ajvm(ajvn ajvnVar) {
        this.a = ajvnVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        ekfw ekfwVar = new ekfw();
        anpi anpiVar = new anpi() { // from class: ajvh
            @Override // defpackage.anpi
            public final eiju a() {
                return this.a.a.g();
            }
        };
        ajvn ajvnVar = this.a;
        ekfwVar.h(ajvnVar.j.a(anpiVar));
        ekfwVar.h(ajvnVar.h.f(new cqtk() { // from class: ajvi
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return this.a.a.g();
            }
        }, "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister"));
        if (((Boolean) ((cczi) crbf.aE.get()).e()).booleanValue() || ((Boolean) ((cczi) crbf.aF.get()).e()).booleanValue()) {
            ekfwVar.h(ajvnVar.k.a(new anpi() { // from class: ajvj
                @Override // defpackage.anpi
                public final eiju a() {
                    return this.a.a.g();
                }
            }));
        }
        ekfwVar.h(ajvnVar.m.b().a(new anpi() { // from class: ajvk
            @Override // defpackage.anpi
            public final eiju a() {
                return this.a.a.g();
            }
        }));
        if (ajvnVar.r.a()) {
            ekfwVar.h(ajvnVar.o.a(new anpi() { // from class: ajvl
                @Override // defpackage.anpi
                public final eiju a() {
                    return this.a.a.g();
                }
            }));
        }
        ajvnVar.l = cqty.a(ekfwVar.g());
    }

    @Override // defpackage.cqto
    public final void fK() {
        ajvn ajvnVar = this.a;
        cquc cqucVar = ajvnVar.l;
        cqucVar.getClass();
        cqucVar.a();
        ajvnVar.l = null;
    }
}
