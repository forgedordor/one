package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffba {
    public final ffaj a;
    public final ffae b;
    public final fezb c;
    public final int d;
    public final int e;
    public final int f;
    private final List g;
    private final int h;
    private int i;

    public ffba(ffaj ffajVar, List list, int i, ffae ffaeVar, fezb fezbVar, int i2, int i3, int i4) {
        this.a = ffajVar;
        this.g = list;
        this.h = i;
        this.b = ffaeVar;
        this.c = fezbVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static /* synthetic */ ffba c(ffba ffbaVar, int i, ffae ffaeVar, fezb fezbVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ffbaVar.h;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            ffaeVar = ffbaVar.b;
        }
        ffae ffaeVar2 = ffaeVar;
        if ((i2 & 4) != 0) {
            fezbVar = ffbaVar.c;
        }
        fezb fezbVar2 = fezbVar;
        int i4 = ffbaVar.d;
        int i5 = ffbaVar.e;
        int i6 = ffbaVar.f;
        fezbVar2.getClass();
        return new ffba(ffbaVar.a, ffbaVar.g, i3, ffaeVar2, fezbVar2, i4, i5, i6);
    }

    public final fexr a() {
        ffae ffaeVar = this.b;
        if (ffaeVar != null) {
            return ffaeVar.e;
        }
        return null;
    }

    public final fezh b(fezb fezbVar) {
        fezbVar.getClass();
        List list = this.g;
        int i = this.h;
        if (i >= list.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        ffae ffaeVar = this.b;
        if (ffaeVar != null) {
            if (!ffaeVar.b.b(fezbVar.a)) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must retain the same host and port");
            }
            if (this.i != 1) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must call proceed() exactly once");
            }
        }
        int i2 = i + 1;
        ffba ffbaVarC = c(this, i2, null, fezbVar, 58);
        feyr feyrVar = (feyr) list.get(i);
        fezh fezhVarA = feyrVar.a(ffbaVarC);
        if (ffaeVar != null && i2 < list.size() && ffbaVarC.i != 1) {
            throw new IllegalStateException(a.h(feyrVar, "network interceptor ", " must call proceed() exactly once"));
        }
        if (fezhVarA.g != null) {
            return fezhVarA;
        }
        throw new IllegalStateException(a.h(feyrVar, "interceptor ", " returned a response with no body"));
    }
}
