package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjd implements eyif {
    public static ehwk a(fcsu fcsuVar) {
        ehwk ehwkVar = ehwk.a;
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(3L, TimeUnit.DAYS);
        ehwc ehwcVar = new ehwc();
        ehwcVar.a = ehwe.ON_CHARGER;
        ehwcVar.b(4L, TimeUnit.DAYS);
        ehwaVar.b(ehwcVar.a());
        return ehwj.a(ehwaVar.a(), fcsuVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
