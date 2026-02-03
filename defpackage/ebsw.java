package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsw extends Exception {
    public ebsw(Intent intent) {
        super("Intent not registered in manifest: ".concat(String.valueOf(String.valueOf(intent))));
    }
}
