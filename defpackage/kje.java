package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kje {
    public static final kjd a(long j, long j2) {
        return new kjd(kjb.a(j), kjb.b(j), kjb.a(j) + ((int) (j2 >> 32)), kjb.b(j) + ((int) (4294967295L & j2)));
    }

    public static final kjd b(ihu ihuVar) {
        return new kjd(Math.round(ihuVar.b), Math.round(ihuVar.c), Math.round(ihuVar.d), Math.round(ihuVar.e));
    }
}
