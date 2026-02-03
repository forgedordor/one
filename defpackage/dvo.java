package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvo extends CancellationException {
    public dvo() {
        super(null);
    }

    public dvo(byte[] bArr) {
        super("The press gesture was canceled.");
    }
}
