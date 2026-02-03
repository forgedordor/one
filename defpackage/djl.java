package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djl implements djb {
    private final int a;
    private final int b;
    private final des c;
    private final djd d;

    public djl(int i, int i2, des desVar) {
        this.a = i;
        this.b = i2;
        this.c = desVar;
        this.d = new djd(new dfc(i, i2, desVar));
    }

    @Override // defpackage.diw
    public final /* synthetic */ long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return dja.a(this);
    }

    @Override // defpackage.diw
    public final /* synthetic */ deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return div.a(this, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.d.c(j, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.d.d(j, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.djb
    public final int f() {
        return this.b;
    }

    @Override // defpackage.djb
    public final int g() {
        return this.a;
    }

    public djl() {
        this(300, 0, dev.a);
    }
}
