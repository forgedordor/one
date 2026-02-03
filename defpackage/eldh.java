package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eldh extends elcj implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public eldh(String str, int i, String str2) {
        this.d = str2;
        MessageDigest messageDigestH = h(str);
        this.a = messageDigestH;
        int digestLength = messageDigestH.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        ejwl.g(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = i(messageDigestH);
    }

    private static MessageDigest h(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean i(MessageDigest messageDigest) throws CloneNotSupportedException {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.elcu
    public final elcv f() {
        if (this.c) {
            try {
                return new eldf((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new eldf(h(this.a.getAlgorithm()), this.b);
    }

    @Override // defpackage.elcu
    public final int g() {
        return this.b * 8;
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new eldg(this.a.getAlgorithm(), this.b, this.d);
    }

    public eldh(String str, String str2) {
        MessageDigest messageDigestH = h(str);
        this.a = messageDigestH;
        this.b = messageDigestH.getDigestLength();
        this.d = str2;
        this.c = i(messageDigestH);
    }
}
