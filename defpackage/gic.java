package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gic implements kel {
    final /* synthetic */ gid a;

    public gic(gid gidVar) {
        this.a = gidVar;
    }

    @Override // defpackage.kel
    public final int a(int i) {
        gid gidVar = this.a;
        if (i < gidVar.a) {
            return i;
        }
        if (i < gidVar.b) {
            return i + 1;
        }
        int i2 = gidVar.c;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    @Override // defpackage.kel
    public final int b(int i) {
        gid gidVar = this.a;
        if (i <= gidVar.a - 1) {
            return i;
        }
        if (i <= gidVar.b - 1) {
            return i - 1;
        }
        int i2 = gidVar.c;
        return i > i2 + 1 ? i2 : i - 2;
    }
}
