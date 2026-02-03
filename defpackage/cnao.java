package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnao {
    private final cnhz a;
    private final eosc b;

    public cnao(cnhz cnhzVar, eosc eoscVar) {
        this.a = cnhzVar;
        this.b = eoscVar;
    }

    final eiju a(final audu auduVar) {
        return this.a.b(auduVar.c).h(new ejvr() { // from class: cnan
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezol ezolVar = (ezol) obj;
                eqdc eqdcVar = new eqdc();
                aubq aubqVar = auduVar.d;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                eqdcVar.b(URI.create(aubqVar.d));
                eqdcVar.c(ezolVar);
                return eqdcVar.a();
            }
        }, this.b);
    }
}
