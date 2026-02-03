package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgd extends Exception {
    public dbgd(String str) {
        super(str);
    }

    public dbgd(Throwable th) {
        super("Failed to make IPC to Fi app", th);
    }
}
