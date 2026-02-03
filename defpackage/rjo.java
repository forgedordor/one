package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rjo implements rvq {
    final MessageDigest a;
    private final rvu b = new rvt();

    public rjo(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.rvq
    public final rvu eY() {
        return this.b;
    }
}
