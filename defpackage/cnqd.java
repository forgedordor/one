package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqd implements eyif {
    public static ehwk a(final cnqb cnqbVar) {
        ehwk ehwkVar = ehwk.a;
        fcsu fcsuVar = new fcsu() { // from class: cnqc
            @Override // defpackage.fcsu
            public final Object b() {
                return cnqbVar;
            }
        };
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(7L, TimeUnit.DAYS);
        return ehwj.a(ehwaVar.a(), fcsuVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
