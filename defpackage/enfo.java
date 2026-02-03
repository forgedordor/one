package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enfo implements evst {
    OPEN_URL_APPLICATION_UNSPECIFIED(0),
    BROWSER(1),
    WEBVIEW(2);

    public final int d;

    enfo(int i) {
        this.d = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
