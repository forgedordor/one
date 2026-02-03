package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebab implements eora {
    final /* synthetic */ ebac a;

    public ebab(ebac ebacVar) {
        this.a = ebacVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ekrd) ((ekrd) ebac.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onSuccess", 205, "MobaltPeriodicJobImpl.java")).q("Mobalt: finish sending logs to the Cobalt Server successfully");
        ebac ebacVar = this.a;
        ebacVar.n.b(ebacVar.c, (int) ebacVar.d, "SUCCESS");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof CancellationException) {
            ((ekrd) ((ekrd) ((ekrd) ebac.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 193, "MobaltPeriodicJobImpl.java")).q("Mobalt: cancelled sending logs to the Cobalt Server");
            ebac ebacVar = this.a;
            ebacVar.n.b(ebacVar.c, (int) ebacVar.d, "CANCELLED");
        } else {
            ((ekrd) ((ekrd) ((ekrd) ebac.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 198, "MobaltPeriodicJobImpl.java")).q("Mobalt: failed sending logs to the Cobalt Server");
            ebac ebacVar2 = this.a;
            ebacVar2.n.b(ebacVar2.c, (int) ebacVar2.d, "FAILURE");
        }
    }
}
