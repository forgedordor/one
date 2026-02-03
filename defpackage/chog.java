package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chog implements eyif {
    public static ehwk a(fcsu fcsuVar) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        ejwl.b(timeUnit.toDays(7L) >= 7, "Setting a expireAfterWrite duration shorter than 1 week is not allowed");
        final egnl egnlVar = new egnl(fcsuVar);
        ehwk ehwkVar = ehwk.a;
        fcsu fcsuVar2 = new fcsu() { // from class: ehwi
            @Override // defpackage.fcsu
            public final Object b() {
                return egnlVar;
            }
        };
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(3L, timeUnit);
        ehwaVar.a = true;
        ehwc ehwcVar = new ehwc();
        ehwcVar.a = ehwe.ON_CHARGER;
        ehwcVar.b(7L, timeUnit);
        ehwaVar.b(ehwcVar.a());
        return ehwj.a(ehwaVar.a(), fcsuVar2);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
