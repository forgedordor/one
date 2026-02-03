package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djk implements diw {
    private final /* synthetic */ djd a;

    public djk(float f, float f2, deh dehVar) {
        int[] iArr = diz.a;
        this.a = new djd(dehVar != null ? new dix(dehVar, f, f2) : new diy(f, f2));
    }

    @Override // defpackage.diw
    public final long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.a(dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.b(dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.c(j, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.d(j, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final boolean e() {
        return false;
    }
}
