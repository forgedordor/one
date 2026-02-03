package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjj {
    private static dvjj a;
    private final Set b = new HashSet();

    private dvjj() {
        dvjm.a();
    }

    public static synchronized dvjj c() {
        if (a == null) {
            a = new dvjj();
        }
        return a;
    }

    @SafeVarargs
    private static ejwi d(Object... objArr) {
        return ejwi.j(ekgb.p(objArr));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0170. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122 A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List a() {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvjj.a():java.util.List");
    }

    public final synchronized void b(ekgb ekgbVar) {
        this.b.addAll(ekgbVar);
    }
}
