package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqm {
    public static final boolean a(oxh oxhVar, oxh oxhVar2, orr orrVar) {
        orrVar.getClass();
        if (oxhVar2 == null) {
            return true;
        }
        if ((oxhVar2 instanceof oxg) && (oxhVar instanceof oxf)) {
            return true;
        }
        if ((oxhVar instanceof oxg) && (oxhVar2 instanceof oxf)) {
            return false;
        }
        return (oxhVar.e == oxhVar2.e && oxhVar.f == oxhVar2.f && oxhVar2.a(orrVar) <= oxhVar.a(orrVar)) ? false : true;
    }
}
