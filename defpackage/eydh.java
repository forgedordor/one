package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydh implements eycc {
    private final CronetEngine a;
    private final diep b;
    private final ExecutorService c;

    public eydh(CronetEngine cronetEngine, diep diepVar, ExecutorService executorService) {
        cronetEngine.getClass();
        this.a = cronetEngine;
        this.b = diepVar;
        this.c = executorService;
    }

    @Override // defpackage.eycc
    public final eycv a(String str, String str2, eyce eyceVar, eycb eycbVar) {
        str.getClass();
        str2.getClass();
        ExecutorService executorService = this.c;
        return new eydn(str, str2, eyceVar, this.a, executorService, new eydj(executorService), eycbVar != null ? new eydp(executorService, eycbVar, this.b) : null);
    }
}
