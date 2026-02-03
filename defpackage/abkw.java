package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkw {
    public static final cqce a = cqce.g("Bugle", "JsBridgeAppController");
    public final abmq b;
    public final abdy c;
    public final eosc d;
    public final AtomicBoolean e = new AtomicBoolean(true);
    private final abfv f;

    public abkw(abmr abmrVar, abdy abdyVar, abfv abfvVar, eosc eoscVar, fcsu fcsuVar) {
        this.c = abdyVar;
        this.f = abfvVar;
        this.d = eoscVar;
        this.b = abmrVar.a(fcsuVar, abou.FOREGROUND, "Bugle.Satellimessaging/dittosatellite/gaia:annotationste.Foreground.JsBridgeEstablishDuration");
    }

    public final eiju a(final eooy eooyVar) {
        return this.f.c().i(new eooz() { // from class: abkv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((Boolean) obj).booleanValue() ? eooyVar.a() : eijx.e(null);
            }
        }, this.d);
    }

    public final void b() {
        if (this.e.compareAndSet(false, true)) {
            eiju eijuVarC = this.b.c();
            ejvr ejvrVar = new ejvr() { // from class: abkt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    abkw.a.s("Could not pause foreground Ditto.", (Exception) obj);
                    return false;
                }
            };
            eosc eoscVar = this.d;
            eijuVarC.e(Exception.class, ejvrVar, eoscVar).k(auvh.b(), eoscVar);
            a(new eooy() { // from class: abku
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    abkw abkwVar = this.a;
                    return abkwVar.c.d().h(new ejvr() { // from class: abks
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return null;
                        }
                    }, abkwVar.d);
                }
            }).k(auvh.b(), eoscVar);
        }
    }
}
