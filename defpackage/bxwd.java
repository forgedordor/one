package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwd {
    public final bxwn a;

    public bxwd(bxwn bxwnVar) {
        this.a = bxwnVar;
    }

    public final boolean a(int i) {
        if (i == 4 || i == 5) {
            return !this.a.d;
        }
        bxwn bxwnVar = this.a;
        return (bxwnVar.d || bxwnVar.d()) ? false : true;
    }

    public final boolean b() {
        bxwn bxwnVar = this.a;
        if (bxwnVar.d()) {
            return false;
        }
        return !bxwnVar.d || bxwnVar.e == 1;
    }

    public final boolean c() {
        return !this.a.e();
    }

    public final boolean d() {
        return !this.a.f;
    }
}
