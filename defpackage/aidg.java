package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidg implements eyif {
    public static ehwk a(final aidc aidcVar) {
        ehwk ehwkVar = ehwk.a;
        fcsu fcsuVar = new fcsu() { // from class: aide
            @Override // defpackage.fcsu
            public final Object b() {
                return aidcVar;
            }
        };
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(1L, TimeUnit.DAYS);
        return ehwj.a(ehwaVar.a(), fcsuVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
