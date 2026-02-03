package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxf implements fctc {
    private final fddy a;
    private final fdae b;
    private final fdae c;
    private final fdae d;
    private lxd e;

    public lxf(fddy fddyVar, fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3) {
        this.a = fddyVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        this.d = fdaeVar3;
    }

    @Override // defpackage.fctc
    public final /* bridge */ /* synthetic */ Object a() {
        lxd lxdVar = this.e;
        if (lxdVar != null) {
            return lxdVar;
        }
        lxd lxdVarB = lxi.a((lxp) this.b.invoke(), (lxk) this.c.invoke(), (lyp) this.d.invoke()).b(this.a);
        this.e = lxdVarB;
        return lxdVarB;
    }

    @Override // defpackage.fctc
    public final boolean b() {
        return this.e != null;
    }
}
