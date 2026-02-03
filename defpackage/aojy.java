package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aojy extends aoka {
    public final aokj a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final int h;

    public aojy(int i, int i2, int i3, int i4, boolean z, int i5, aokj aokjVar) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = i5;
        this.a = aokjVar;
    }

    @Override // defpackage.aokk
    public final int a() {
        return this.e;
    }

    @Override // defpackage.aokk
    public final int b() {
        return this.d;
    }

    @Override // defpackage.aokk
    public final int c() {
        return this.c;
    }

    @Override // defpackage.aokk
    public final int d() {
        return this.f;
    }

    @Override // defpackage.aokk
    public final int e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoka) {
            aoka aokaVar = (aoka) obj;
            if (this.c == aokaVar.c() && this.d == aokaVar.b() && this.e == aokaVar.a() && this.f == aokaVar.d() && this.g == aokaVar.g() && this.h == aokaVar.e() && this.a.equals(aokaVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aokk
    public final aokj f() {
        return this.a;
    }

    @Override // defpackage.aokk
    @Deprecated
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int i = true != this.g ? 1237 : 1231;
        int i2 = this.c;
        return ((((i ^ ((((((((i2 ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ this.h) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "BugleSimpleMessageProperties{currentMessageCount=" + this.c + ", codePointsUsed=" + this.d + ", codePointsRemaining=" + this.e + ", maxMessageCount=" + this.f + ", lengthRequiresMms=" + this.g + ", maxSubjectLength=" + this.h + ", requiredProtocol=" + this.a.toString() + "}";
    }
}
