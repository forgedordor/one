package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqq {
    public final rii a;
    public final rig b;

    public rqq(rii riiVar, rig rigVar) {
        this.a = riiVar;
        this.b = rigVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        rig rigVar = this.b;
        if (rigVar == null) {
            return;
        }
        rigVar.c(bArr);
    }

    public final byte[] c(int i) {
        rig rigVar = this.b;
        return rigVar == null ? new byte[i] : (byte[]) rigVar.a(i, byte[].class);
    }
}
