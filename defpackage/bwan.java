package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwan implements eyif {
    public static ehwk a(final bwal bwalVar, aqvc aqvcVar, long j) {
        aqvcVar.getClass();
        if (!aqvcVar.a()) {
            return ehwk.a;
        }
        ehwk ehwkVar = ehwk.a;
        fcsu fcsuVar = new fcsu() { // from class: bwam
            @Override // defpackage.fcsu
            public final Object b() {
                return bwalVar;
            }
        };
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(j, TimeUnit.MILLISECONDS);
        ehwc ehwcVar = new ehwc();
        ehwcVar.a = ehwe.ON_CHARGER;
        ehwaVar.b(ehwcVar.a());
        return ehwj.a(ehwaVar.a(), fcsuVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
