package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iep {
    public static final ics a(ics icsVar, float f, float f2, ikp ikpVar) {
        boolean z;
        int i;
        if (ikpVar != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        return ((Float.compare(f, 0.0f) <= 0 || Float.compare(f2, 0.0f) <= 0) && !z) ? icsVar : ijn.a(icsVar, new ieo(f, f2, i, ikpVar, z));
    }
}
