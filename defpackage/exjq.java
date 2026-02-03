package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjq implements exli {
    final /* synthetic */ exjr a;
    final /* synthetic */ exjd b;
    final /* synthetic */ String c;

    public exjq(exjr exjrVar, exjd exjdVar, String str) {
        this.a = exjrVar;
        this.b = exjdVar;
        this.c = str;
    }

    @Override // defpackage.exli
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        exjd exjdVar = this.b;
        Effect.nativeLoadCapabilityWithRemoteAssetManager(exjdVar.toByteArray(), j, this.c, new exjp(this.a));
    }
}
