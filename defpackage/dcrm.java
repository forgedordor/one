package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrm {
    private final byte[] a;

    public dcrm(byte[] bArr) {
        this.a = bArr;
    }

    public final String a() {
        return Base64.encodeToString(this.a, 11);
    }
}
