package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnko implements eyif {
    public static ehwk a(final cnkm cnkmVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ehwa ehwaVar = new ehwa();
        Object objB = fcsuVar.b();
        objB.getClass();
        ehwaVar.c(((Number) objB).longValue(), TimeUnit.MINUTES);
        if (!((Boolean) fcsuVar2.b()).booleanValue()) {
            ehwc ehwcVar = new ehwc();
            ehwcVar.a = ehwe.ON_NETWORK_CONNECTED;
            ehwaVar.b(ehwcVar.a());
        }
        ehwk ehwkVar = ehwk.a;
        return ehwj.a(ehwaVar.a(), new fcsu() { // from class: cnkn
            @Override // defpackage.fcsu
            public final Object b() {
                return cnkmVar;
            }
        });
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
