package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqn {
    private final eosc a;
    private final aghv b;

    public crqn(eosc eoscVar, aghv aghvVar) {
        this.a = eoscVar;
        this.b = aghvVar;
    }

    public final ListenableFuture a(String str) {
        Optional optionalA = this.b.a();
        if (optionalA.isEmpty()) {
            return eork.g();
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        ((CronetEngine) optionalA.get()).newUrlRequestBuilder(str, new crqm(settableFutureCreate), this.a).setTrafficStatsTag(8197).build().start();
        return settableFutureCreate;
    }
}
