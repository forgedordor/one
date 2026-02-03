package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqg extends Exception {
    public dxqg() {
        super("Failed to access GNP API");
    }

    public dxqg(Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
