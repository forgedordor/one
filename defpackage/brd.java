package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class brd implements bdv {
    public static bdv e(bdv bdvVar) {
        atr atrVar = (atr) bdvVar;
        return new bqu(atrVar.a, atrVar.b, atrVar.c, atrVar.d);
    }

    @Override // defpackage.bdv
    public abstract float a();

    @Override // defpackage.bdv
    public abstract float b();

    @Override // defpackage.bdv
    public abstract float c();

    public abstract float d();
}
