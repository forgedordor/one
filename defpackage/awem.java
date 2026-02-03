package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awem implements eyif {
    public static ehwk a(final awek awekVar) {
        ehwk ehwkVar = ehwk.a;
        fcsu fcsuVar = new fcsu() { // from class: awel
            @Override // defpackage.fcsu
            public final Object b() {
                return awekVar;
            }
        };
        ehwa ehwaVar = new ehwa();
        ehwaVar.c(86400000L, TimeUnit.MILLISECONDS);
        return ehwj.a(ehwaVar.a(), fcsuVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
