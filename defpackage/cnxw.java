package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxw extends Exception {
    public cnxw(String str, Throwable th) {
        super("A delay was requested while running processBatch. Reason: ".concat(str), th);
    }
}
