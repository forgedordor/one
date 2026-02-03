package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abex {
    public static final eksp a = eksp.c("BugleSatelliteBg");
    public final Supplier b;
    public final eosc c;
    public Instant d;
    public final abew e = new abew(this);

    public abex(final fcsu fcsuVar, final eygg eyggVar, eygg eyggVar2) {
        this.c = (eosc) eyggVar2.b();
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: abeu
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = abex.a;
                abmr abmrVar = (abmr) eyggVar.b();
                final fcsu fcsuVar2 = fcsuVar;
                return abmrVar.a(new fcsu() { // from class: abet
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (abka) fcsuVar2.b();
                    }
                }, abou.BACKGROUND, "Bugle.Satellite.Background.JsBridgeEstablishDuration");
            }
        });
        ejxrVarA.getClass();
        this.b = new Supplier() { // from class: abev
            @Override // java.util.function.Supplier
            public final Object get() {
                return (abmq) ejxrVarA.get();
            }
        };
    }
}
