package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kra implements kqz {
    final float a;
    float b;

    public kra(float f, float f2) {
        this.a = f2;
        this.b = f;
    }

    @Override // defpackage.kqz
    public final float a() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}
