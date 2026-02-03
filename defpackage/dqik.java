package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqik implements dqfx {
    final /* synthetic */ dqir a;

    public dqik(dqir dqirVar) {
        this.a = dqirVar;
    }

    @Override // defpackage.dqfx
    public final void a() {
        this.a.b.a();
    }

    @Override // defpackage.dqfx
    public final void b() {
        this.a.b.b();
    }

    @Override // defpackage.dqfx
    public final void c(float f) {
        dqir dqirVar = this.a;
        dqirVar.d.f(Float.valueOf(f));
        dqbh dqbhVar = dqirVar.b;
        if (((Boolean) ((dqbn) dqbhVar).f.c()).booleanValue()) {
            dqbhVar.a();
            dqirVar.e = true;
        }
    }

    @Override // defpackage.dqfx
    public final void d() throws IllegalStateException {
        dqir dqirVar = this.a;
        fduf fdufVar = dqirVar.d;
        Float f = (Float) fdufVar.c();
        if (f != null) {
            dqbh dqbhVar = dqirVar.b;
            float fFloatValue = f.floatValue();
            if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
                throw new IllegalArgumentException("Progress must be value [0-1]");
            }
            ((ekrd) dqbn.a.h().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "seek", 91, "AudioPlayerImpl.kt")).t("Seeking to position: %s", Float.valueOf(fFloatValue));
            dqbn dqbnVar = (dqbn) dqbhVar;
            long duration = (long) (dqbnVar.e().getDuration() * fFloatValue);
            dqbnVar.d.f(Duration.ofMillis(duration));
            dqbnVar.e().seekTo((int) duration);
        }
        fdufVar.f(null);
        if (dqirVar.e) {
            dqirVar.b.b();
            dqirVar.e = false;
        }
    }
}
