package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egjs implements res {
    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        if ((b().b & 32) != 0) {
            messageDigest.update(b().h.getBytes(a));
        } else {
            messageDigest.update(b().c.getBytes(a));
        }
    }

    public abstract egbs b();
}
