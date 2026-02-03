package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eag {
    public static final float a(etv etvVar) {
        return etvVar.x().e == dwm.b ? Float.intBitsToFloat((int) (etvVar.o() >> 32)) : Float.intBitsToFloat((int) (etvVar.o() & 4294967295L));
    }

    public static final boolean b(etv etvVar, float f) {
        etvVar.x();
        return (etvVar.w() ? -f : a(etvVar)) <= 0.0f;
    }
}
