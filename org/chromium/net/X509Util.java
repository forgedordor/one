package org.chromium.net;

import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.util.Pair;
import defpackage.a;
import defpackage.ffxm;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.fgad;
import internal.J.N;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509Certificate sTestRoot;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static fgad sTrustStorageListener;
    private static final Object sLock = new Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void addTestRootCertificate(byte[] bArr) {
        X509Certificate x509CertificateCreateCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            ensureTestInitializedLocked();
            KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(keyStore.size()), x509CertificateCreateCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static List<X509Certificate> checkServerTrustedIgnoringRuntimeException(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2, byte[] bArr, byte[] bArr2) throws CertificateException {
        try {
            Iterator it = ServiceLoader.load(ffxm.class, ffxm.class.getClassLoader()).iterator();
            ffxm ffxmVar = (ffxm) (it.hasNext() ? it.next() : null);
            return (ffxmVar == null || (bArr == null && bArr2 == null)) ? x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2) : ffxmVar.a();
        } catch (RuntimeException e) {
            ffyc.d(TAG, "checkServerTrusted() unexpectedly threw: %s", e);
            throw new CertificateException(e);
        }
    }

    public static void clearTestRootCertificates() {
        synchronized (sLock) {
            ensureTestInitializedLocked();
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (IOException unused) {
            }
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static X509TrustManagerExtensions createTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        ffyc.c(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e.toString());
                    }
                }
            }
            ffyc.c(TAG, "Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e2) {
            ffyc.d(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e2);
            throw new KeyStoreException(e2);
        }
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new fgad();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
            intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
            intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            ffxu.a(ffxu.a, sTrustStorageListener, intentFilter);
        }
    }

    private static void ensureTestInitializedLocked() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (sTestKeyStore == null) {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
    }

    public static byte[][] getUserAddedRoots() {
        ArrayList arrayList = new ArrayList();
        synchronized (sLock) {
            try {
                try {
                    ensureInitialized();
                    KeyStore keyStore = sSystemKeyStore;
                    if (keyStore == null) {
                        return new byte[0][];
                    }
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement.startsWith("user:")) {
                                try {
                                    Certificate certificate = sSystemKeyStore.getCertificate(strNextElement);
                                    if (certificate instanceof X509Certificate) {
                                        arrayList.add(((X509Certificate) certificate).getEncoded());
                                    } else {
                                        ffyc.i(TAG, a.a(strNextElement, "alias: ", " is not a X509 Cert, skipping"));
                                    }
                                } catch (KeyStoreException e) {
                                    ffyc.l("Error reading cert with alias %s, error: %s", strNextElement, e);
                                } catch (CertificateEncodingException e2) {
                                    ffyc.l("Error encoding cert with alias %s, error: %s", strNextElement, e2);
                                }
                            }
                        }
                        X509Certificate x509Certificate = sTestRoot;
                        if (x509Certificate != null) {
                            try {
                                arrayList.add(x509Certificate.getEncoded());
                            } catch (CertificateEncodingException e3) {
                                ffyc.d(TAG, "Error encoding test root cert, error %s", e3);
                            }
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    } catch (KeyStoreException e4) {
                        ffyc.d(TAG, "Error reading cert aliases: %s", e4);
                        return new byte[0][];
                    }
                } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    return new byte[0][];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            char[] cArr2 = HEX_DIGITS;
            byte b = bArrDigest[3 - i];
            int i2 = i + i;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) throws KeyStoreException {
        if (sSystemKeyStore == null) {
            return $assertionsDisabled;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String strHashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String strF = a.f(i, strHashPrincipal, ".");
            if (!new File(sSystemCertificateDirectory, strF).exists()) {
                return $assertionsDisabled;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:".concat(strF));
            if (certificate != null) {
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                } else {
                    ffyc.c(TAG, "Anchor " + strF + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        N.M6C2IQIc();
    }

    private static void reloadTestTrustManager() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        ensureTestInitializedLocked();
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void setTestRootCertificateForBuiltin(byte[] bArr) {
        X509Certificate x509CertificateCreateCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            sTestRoot = x509CertificateCreateCertificateFromBytes;
        }
    }

    static boolean verifyKeyUsage(X509Certificate x509Certificate) throws CertificateParsingException {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals(OID_TLS_SERVER_AUTH) || str.equals(OID_ANY_EKU) || str.equals(OID_SERVER_GATED_NETSCAPE) || str.equals(OID_SERVER_GATED_MICROSOFT)) {
                return true;
            }
        }
        return $assertionsDisabled;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) throws CertificateNotYetValidException, CertificateExpiredException {
        List<X509Certificate> listCheckServerTrustedIgnoringRuntimeException;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=".concat(String.valueOf(Arrays.deepToString(bArr))));
        }
        try {
            ensureInitialized();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(createCertificateFromBytes(bArr[0]));
                for (int i = 1; i < bArr.length; i++) {
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[i]));
                    } catch (CertificateException unused) {
                        ffyc.i(TAG, a.e(i, "intermediate ", " failed parsing"));
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!verifyKeyUsage(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (sLock) {
                        X509TrustManagerExtensions x509TrustManagerExtensions = sDefaultTrustManager;
                        if (x509TrustManagerExtensions == null) {
                            return new AndroidCertVerifyResult(-1);
                        }
                        try {
                            listCheckServerTrustedIgnoringRuntimeException = checkServerTrustedIgnoringRuntimeException(x509TrustManagerExtensions, x509CertificateArr, str, str2, bArr2, bArr3);
                        } catch (CertificateException e) {
                            X509TrustManagerExtensions x509TrustManagerExtensions2 = sTestTrustManager;
                            List<X509Certificate> listCheckServerTrustedIgnoringRuntimeException2 = null;
                            if (x509TrustManagerExtensions2 != null) {
                                try {
                                    listCheckServerTrustedIgnoringRuntimeException2 = checkServerTrustedIgnoringRuntimeException(x509TrustManagerExtensions2, x509CertificateArr, str, str2, bArr2, bArr3);
                                } catch (CertificateException unused2) {
                                }
                            }
                            if (listCheckServerTrustedIgnoringRuntimeException2 == null) {
                                ffyc.e(TAG, "Failed to validate the certificate chain, error: " + e.getMessage());
                                return new AndroidCertVerifyResult(-2);
                            }
                            listCheckServerTrustedIgnoringRuntimeException = listCheckServerTrustedIgnoringRuntimeException2;
                        }
                        return new AndroidCertVerifyResult(0, listCheckServerTrustedIgnoringRuntimeException.size() > 0 ? isKnownRoot(listCheckServerTrustedIgnoringRuntimeException.get(listCheckServerTrustedIgnoringRuntimeException.size() - 1)) : false, listCheckServerTrustedIgnoringRuntimeException);
                    }
                } catch (CertificateExpiredException unused3) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException unused4) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException unused5) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException unused6) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException unused7) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
