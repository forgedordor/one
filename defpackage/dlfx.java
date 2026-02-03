package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfx implements kel {
    final /* synthetic */ int a;
    final /* synthetic */ juo b;

    public dlfx(int i, juo juoVar) {
        this.a = i;
        this.b = juoVar;
    }

    @Override // defpackage.kel
    public final int a(int i) {
        return i + this.a;
    }

    @Override // defpackage.kel
    public final int b(int i) {
        return fddu.i(i - this.a, 0, this.b.b.length());
    }
}
