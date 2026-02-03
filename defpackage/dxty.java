package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxty extends Exception {
    public dxty() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public dxty(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
