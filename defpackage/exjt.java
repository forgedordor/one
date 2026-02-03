package defpackage;

import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjt implements exjr {
    final /* synthetic */ String a;
    final /* synthetic */ exjw b;

    public exjt(exjw exjwVar, String str) {
        this.a = str;
        this.b = exjwVar;
    }

    @Override // defpackage.exjr
    public final void a(Effect effect, String str) {
        this.b.a(this.a, effect, str);
    }
}
