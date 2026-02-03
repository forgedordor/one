package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class Curve25519 {
    public static final String BEST = "best";
    public static final String J2ME = "j2me";
    public static final String JAVA = "java";
    public static final String NATIVE = "native";
    private final Curve25519Provider provider;

    private Curve25519(Curve25519Provider curve25519Provider) {
        this.provider = curve25519Provider;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.whispersystems.curve25519.Curve25519Provider constructClass(java.lang.String r4, org.whispersystems.curve25519.SecureRandomProvider r5) throws java.lang.ClassNotFoundException {
        /*
            int r0 = r4.hashCode()     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1052618729: goto L29;
                case 3020260: goto L1f;
                case 3209376: goto L15;
                case 3254818: goto Lb;
                default: goto La;
            }
        La:
            goto L33
        Lb:
            java.lang.String r0 = "java"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = r3
            goto L34
        L15:
            java.lang.String r0 = "j2me"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = r2
            goto L34
        L1f:
            java.lang.String r0 = "best"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = r1
            goto L34
        L29:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 0
            goto L34
        L33:
            r4 = -1
        L34:
            if (r4 == 0) goto L59
            if (r4 == r3) goto L52
            if (r4 == r2) goto L4b
            if (r4 != r1) goto L43
            java.lang.String r4 = "org.whispersystems.curve25519.OpportunisticCurve25519Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            goto L5f
        L43:
            org.whispersystems.curve25519.NoSuchProviderException r4 = new org.whispersystems.curve25519.NoSuchProviderException     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            java.lang.String r5 = "No such provider"
            r4.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            throw r4     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
        L4b:
            java.lang.String r4 = "org.whispersystems.curve25519.J2meCurve25519Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            goto L5f
        L52:
            java.lang.String r4 = "org.whispersystems.curve25519.JavaCurve25519Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            goto L5f
        L59:
            java.lang.String r4 = "org.whispersystems.curve25519.NativeCurve25519Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
        L5f:
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            org.whispersystems.curve25519.Curve25519Provider r4 = (org.whispersystems.curve25519.Curve25519Provider) r4     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
            if (r5 == 0) goto L6a
            r4.setRandomProvider(r5)     // Catch: java.lang.ClassNotFoundException -> L6b java.lang.IllegalAccessException -> L72 java.lang.InstantiationException -> L79
        L6a:
            return r4
        L6b:
            r4 = move-exception
            org.whispersystems.curve25519.NoSuchProviderException r5 = new org.whispersystems.curve25519.NoSuchProviderException
            r5.<init>(r4)
            throw r5
        L72:
            r4 = move-exception
            org.whispersystems.curve25519.NoSuchProviderException r5 = new org.whispersystems.curve25519.NoSuchProviderException
            r5.<init>(r4)
            throw r5
        L79:
            r4 = move-exception
            org.whispersystems.curve25519.NoSuchProviderException r5 = new org.whispersystems.curve25519.NoSuchProviderException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.curve25519.Curve25519.constructClass(java.lang.String, org.whispersystems.curve25519.SecureRandomProvider):org.whispersystems.curve25519.Curve25519Provider");
    }

    private static Curve25519Provider constructJ2meProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(J2ME, secureRandomProvider);
    }

    private static Curve25519Provider constructJavaProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(JAVA, secureRandomProvider);
    }

    private static Curve25519Provider constructNativeProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(NATIVE, secureRandomProvider);
    }

    private static Curve25519Provider constructOpportunisticProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(BEST, secureRandomProvider);
    }

    public static Curve25519 getInstance(String str) {
        return getInstance(str, null);
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Keys must not be null!");
        }
        if (bArr.length == 32 && bArr2.length == 32) {
            return this.provider.calculateAgreement(bArr2, bArr);
        }
        throw new IllegalArgumentException("Keys must be 32 bytes!");
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid private key length!");
        }
        Curve25519Provider curve25519Provider = this.provider;
        return curve25519Provider.calculateSignature(curve25519Provider.getRandom(64), bArr, bArr2);
    }

    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid private key!");
        }
        Curve25519Provider curve25519Provider = this.provider;
        return curve25519Provider.calculateVrfSignature(curve25519Provider.getRandom(64), bArr, bArr2);
    }

    public Curve25519KeyPair generateKeyPair() {
        Curve25519Provider curve25519Provider = this.provider;
        byte[] bArrGeneratePrivateKey = curve25519Provider.generatePrivateKey();
        return new Curve25519KeyPair(curve25519Provider.generatePublicKey(bArrGeneratePrivateKey), bArrGeneratePrivateKey);
    }

    public boolean isNative() {
        return this.provider.isNative();
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        }
        if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        }
        return this.provider.verifySignature(bArr, bArr2, bArr3);
    }

    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) throws VrfSignatureVerificationFailedException {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        }
        if (bArr2 == null || bArr3 == null || bArr3.length != 96) {
            throw new VrfSignatureVerificationFailedException("Invalid message or signature format");
        }
        return this.provider.verifyVrfSignature(bArr, bArr2, bArr3);
    }

    public static Curve25519 getInstance(String str, SecureRandomProvider secureRandomProvider) {
        if (NATIVE.equals(str)) {
            return new Curve25519(constructNativeProvider(secureRandomProvider));
        }
        if (JAVA.equals(str)) {
            return new Curve25519(constructJavaProvider(secureRandomProvider));
        }
        if (J2ME.equals(str)) {
            return new Curve25519(constructJ2meProvider(secureRandomProvider));
        }
        if (BEST.equals(str)) {
            return new Curve25519(constructOpportunisticProvider(secureRandomProvider));
        }
        throw new NoSuchProviderException(str);
    }
}
