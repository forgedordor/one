package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drxi implements AutoCloseable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager");
    public final ejwi b;
    private final drxj e;
    public final AtomicReference d = new AtomicReference(null);
    private final int f = 3;
    public final boolean c = true;

    public drxi(ejwi ejwiVar, drxj drxjVar) {
        this.b = ejwiVar;
        this.e = drxjVar;
    }

    private static boolean b(String str) {
        return str.length() == 1 && str.charAt(0) == '-';
    }

    private static boolean d(String str) {
        return str.length() == 1 && str.charAt(0) == '*';
    }

    public abstract Object a(String str);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drxi.c(java.lang.String):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
