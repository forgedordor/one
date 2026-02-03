package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjm implements exli {
    final /* synthetic */ exjr a;
    final /* synthetic */ exjy b;
    final /* synthetic */ String c;

    public exjm(exjr exjrVar, exjy exjyVar, String str) {
        this.a = exjrVar;
        this.b = exjyVar;
        this.c = str;
    }

    @Override // defpackage.exli
    public final void a(long j) {
        if (j == 0) {
            Effect.b(this.a, null, "RemoteAssetManager failed to natively load");
            return;
        }
        exjy exjyVar = this.b;
        Effect.nativeLoadWithRemoteAssetManager(exjyVar.toByteArray(), j, this.c, new exjl(this.a));
    }
}
