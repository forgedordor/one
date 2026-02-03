package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sot extends soy {
    private final String a;
    private final int b;
    private final smy c;

    public sot(String str, int i, smy smyVar) {
        this.a = str;
        this.b = i;
        this.c = smyVar;
    }

    @Override // defpackage.soy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.soy
    public final smy b() {
        return this.c;
    }

    @Override // defpackage.soy
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soy) {
            soy soyVar = (soy) obj;
            if (this.a.equals(soyVar.c()) && this.b == soyVar.a()) {
                soyVar.f();
                soyVar.e();
                soyVar.d();
                if (this.c.equals(soyVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1525764945) ^ 1001110;
    }

    public final String toString() {
        return "MagicRewriteRequest{message=" + this.a + ", tone=" + this.b + ", streamingCallback=null, overrideRequestKind=0, maxDecodeSteps=0, userProperties=UserProperties{isMinorUser=false}}";
    }

    @Override // defpackage.soy
    public final void d() {
    }

    @Override // defpackage.soy
    public final void e() {
    }

    @Override // defpackage.soy
    public final void f() {
    }
}
