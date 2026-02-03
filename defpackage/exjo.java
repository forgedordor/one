package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjo implements exli {
    final /* synthetic */ exjr a;
    final /* synthetic */ exjf b;
    final /* synthetic */ String c;

    public exjo(exjr exjrVar, exjf exjfVar, String str) {
        this.a = exjrVar;
        this.b = exjfVar;
        this.c = str;
    }

    @Override // defpackage.exli
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        exjf exjfVar = this.b;
        Effect.nativeLoadChoreoWithRemoteAssetManager(exjfVar.toByteArray(), j, this.c, new exjn(this.a));
    }
}
