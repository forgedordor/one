package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obt {
    public final mbo a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final oca g;

    public obt(mbo mboVar, boolean z, long j, oca ocaVar) {
        mee.d(true, "Audio and video cannot both be removed");
        if (c(mboVar)) {
            mee.a(j != -9223372036854775807L);
            mee.a(!z && ocaVar.b.isEmpty());
        }
        this.a = mboVar;
        this.b = z;
        this.c = false;
        this.d = false;
        this.e = j;
        this.f = -2147483647;
        this.g = ocaVar;
    }

    private static boolean c(mbo mboVar) {
        return Objects.equals(mboVar.a, "androidx-media3-GapMediaItem");
    }

    final long a(long j) {
        long j2;
        if (this.b) {
            j2 = -9223372036854775807L;
        } else {
            ekgb ekgbVar = this.g.b;
            int size = ekgbVar.size();
            long jA = j;
            for (int i = 0; i < size; i++) {
                jA = ((mdm) ekgbVar.get(i)).a(jA);
            }
            j2 = jA;
        }
        ekgb ekgbVar2 = this.g.c;
        int size2 = ekgbVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((map) ekgbVar2.get(i2)).a();
        }
        return Math.max(j2, j);
    }

    final boolean b() {
        return c(this.a);
    }
}
