package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crkw {
    private final eygg a;
    private final eosc b;

    public crkw(eygg eyggVar, eosc eoscVar) {
        this.a = eyggVar;
        this.b = eoscVar;
    }

    public final eiju a() {
        if (tet.a() && ((Boolean) ((cczi) tet.c.get()).e()).booleanValue()) {
            eygg eyggVar = this.a;
            if (((Optional) eyggVar.b()).isPresent()) {
                return ((crkx) ((Optional) eyggVar.b()).get()).b().h(new ejvr() { // from class: crkv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((crku) obj).e);
                    }
                }, this.b);
            }
        }
        return !((Boolean) ((cczi) tet.c.get()).e()).booleanValue() ? eijx.e(true) : eijx.e(false);
    }

    public final eiju b() {
        if (crbf.g()) {
            eygg eyggVar = this.a;
            if (((Optional) eyggVar.b()).isPresent()) {
                return ((crkx) ((Optional) eyggVar.b()).get()).b();
            }
        }
        crkt crktVar = (crkt) crku.a.createBuilder();
        crktVar.copyOnWrite();
        crku crkuVar = (crku) crktVar.instance;
        crkuVar.b |= 1;
        crkuVar.c = false;
        crktVar.copyOnWrite();
        crku.a((crku) crktVar.instance);
        return eijx.e(crktVar.build());
    }
}
