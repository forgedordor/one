package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbi {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    public static cbh g() {
        cch cchVar = new cch();
        cchVar.d(-1);
        cchVar.e(-1);
        cchVar.g(-1);
        cchVar.f(-1);
        cchVar.c(-1);
        return cchVar;
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        int iA = a();
        int iE = e();
        lcg.b(iE > 0, a.g(iE, "Invalid channel count: "));
        if (iA == 2) {
            return iE + iE;
        }
        throw new IllegalArgumentException(a.g(iA, "Invalid audio encoding: "));
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();
}
