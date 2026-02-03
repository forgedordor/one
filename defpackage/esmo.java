package defpackage;

import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmo implements esog {
    private static final eksp a = eksp.c("xRPC");
    private final fcsu b;
    private final esod c;

    public esmo(esod esodVar) {
        this.c = esodVar;
        this.b = null;
    }

    @Override // defpackage.esog
    public final fbnd a(esof esofVar) throws esmn {
        ecem.b();
        esod esodVar = this.c;
        try {
            if (esodVar == null) {
                try {
                    return esoh.a(esofVar, (CronetEngine) this.b.b(), ejud.a);
                } catch (IllegalStateException | UnsatisfiedLinkError e) {
                    ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", 'Q', "CronetWithOkHttpFallbackTransport.java")).q("Failed to load Cronet, falling back on OkHttp implementation");
                    return esny.a(esofVar);
                }
            }
            try {
                try {
                    return esoh.a(esofVar, (CronetEngine) esodVar.a.a(new ejvr() { // from class: esqg
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return ((esqd) obj).a;
                        }
                    }), ejwi.j((String) esodVar.a.a(new ejvr() { // from class: esqf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return ((esqd) obj).b;
                        }
                    })));
                } catch (esqi e2) {
                    throw new esmn(e2);
                }
            } catch (esqi e3) {
                throw new esmn(e3);
            }
        } catch (esmn e4) {
            ((eksl) ((eksl) ((eksl) a.i()).g(e4)).h("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", 'H', "CronetWithOkHttpFallbackTransport.java")).q("Failed to load Cronet using manual selection, falling back on OkHttp implementation");
            return esny.a(esofVar);
        }
    }

    @Deprecated
    public esmo(fcsu fcsuVar) {
        this.c = null;
        fcsuVar.getClass();
        this.b = fcsuVar;
    }
}
