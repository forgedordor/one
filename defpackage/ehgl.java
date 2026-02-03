package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgl {
    public final fcsu a;
    public final fcsu b;
    public final eosc c;
    public final dzyn d;
    public final ehgc e;
    private final fctc f;

    public ehgl(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, dzyn dzynVar, ehgc ehgcVar) {
        eoscVar.getClass();
        dzynVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
        this.d = dzynVar;
        this.e = ehgcVar;
        this.f = fctd.a(new fdae() { // from class: ehgg
            @Override // defpackage.fdae
            public final Object invoke() {
                return new ConcurrentHashMap(((Map) this.a.b.b()).size(), 0.75f, 4);
            }
        });
    }

    public final ListenableFuture a(String str, dzzs dzzsVar) {
        String str2 = dzzsVar.c;
        str2.getClass();
        if (str2.length() == 0) {
            dzyn dzynVar = this.d;
            if (!dzynVar.f.a(this.e.a(str)).d) {
                return eorv.a;
            }
        }
        ehgk ehgkVar = new ehgk(this, str, dzzsVar);
        ehgk ehgkVar2 = (ehgk) ((ConcurrentHashMap) this.f.a()).put(str, ehgkVar);
        if (ehgkVar2 == null || !fdbq.f(ehgkVar2.b.c, dzzsVar.c)) {
            ehgkVar2 = ehgkVar;
        }
        SettableFuture settableFuture = ehgkVar.c;
        settableFuture.o(ehgkVar2.d.c());
        return settableFuture;
    }
}
