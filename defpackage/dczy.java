package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczy extends Exception {
    public dczy(String str) {
        super(String.format("Protocol version %s not supported", str));
    }
}
