package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ebke {
    UNKNOWN("unknown"),
    SEND_RECEIVE("sendrecv"),
    SEND_ONLY("sendonly"),
    RECEIVE_ONLY("recvonly"),
    INACTIVE("inactive");

    public final String f;
    public final ebkb g;

    ebke(String str) {
        this.f = str;
        this.g = new ebkb(str, null);
    }
}
