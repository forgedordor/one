package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batm extends RuntimeException {
    public batm(String str) {
        super(str);
    }

    public batm(Throwable th) {
        super("Failed to create an attachment", th);
    }
}
