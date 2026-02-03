package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfb implements dey {
    private final float a;
    private final float b;
    private final float c;
    private final dgh d;

    /* JADX WARN: Illegal instructions before constructor call */
    public dfb() {
        float f = 0.0f;
        this(f, f, 7);
    }

    @Override // defpackage.ddz
    public final /* bridge */ /* synthetic */ diw a(dib dibVar) {
        return f();
    }

    @Override // defpackage.dey
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.dey
    public final float c(long j, float f, float f2, float f3) {
        dgh dghVar = this.d;
        dghVar.a = f2;
        return Float.intBitsToFloat((int) (dghVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.dey
    public final float d(long j, float f, float f2, float f3) {
        dgh dghVar = this.d;
        dghVar.a = f2;
        return Float.intBitsToFloat((int) (dghVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    @Override // defpackage.dey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(float r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfb.e(float, float, float):long");
    }

    @Override // defpackage.dey
    public final /* synthetic */ djd f() {
        return new djd(this);
    }

    public dfb(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        dgh dghVar = new dgh();
        if (f < 0.0f) {
            dgd.a("Damping ratio must be non-negative");
        }
        dghVar.c = f;
        if (dghVar.a() <= 0.0f) {
            dgd.a("Spring stiffness constant must be positive.");
        }
        dghVar.b = Math.sqrt(f2);
        this.d = dghVar;
    }

    public /* synthetic */ dfb(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
