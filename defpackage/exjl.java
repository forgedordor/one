package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exjl implements Effect.NativeLoadCallback {
    final /* synthetic */ exjr a;

    public exjl(exjr exjrVar) {
        this.a = exjrVar;
    }

    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        Effect.b(this.a, j != 0 ? new Effect(j) : null, str);
    }
}
