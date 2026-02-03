package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class laj extends RuntimeException {
    public laj() {
        this(null);
    }

    public laj(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
