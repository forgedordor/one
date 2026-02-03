package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elel {
    private static final Map a = new HashMap();

    private elel() {
    }

    public static synchronized void a(String str) {
        String str2;
        if (((String) a.get(str)) == null) {
            InputStream resourceAsStream = elel.class.getClassLoader() != null ? elel.class.getClassLoader().getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
            if (resourceAsStream != null) {
                try {
                    String strB = b(str);
                    String str3 = System.getProperty("java.io.tmpdir") + File.separator + System.currentTimeMillis() + "-";
                    for (int i = 1; i < 10000; i++) {
                        File file = new File(str3 + i);
                        if (file.mkdirs()) {
                            try {
                                File canonicalFile = file.getCanonicalFile();
                                canonicalFile.deleteOnExit();
                                File file2 = new File(canonicalFile, strB);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        while (true) {
                                            int i2 = resourceAsStream.read(bArr);
                                            if (i2 == -1) {
                                                fileOutputStream.close();
                                                resourceAsStream.close();
                                                file2.deleteOnExit();
                                                e(str, file2);
                                                return;
                                            }
                                            fileOutputStream.write(bArr, 0, i2);
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    resourceAsStream.close();
                                    throw th;
                                }
                            } catch (IOException unused) {
                                continue;
                            }
                        }
                    }
                    throw new AssertionError("Failed to create any usable temp directory between " + str3 + "1 and " + str3 + "9999, where java.io.tmpdir=" + System.getProperty("java.io.tmpdir") + ")");
                } catch (IOException e) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed while writing input stream to temp file '" + str + "': " + e.getMessage());
                    unsatisfiedLinkError.initCause(e);
                    throw unsatisfiedLinkError;
                }
            }
            String strB2 = b(str);
            StringBuilder sb = new StringBuilder(a.a(str, "Couldn't find classloader resource '", "'"));
            String strC = c(str, sb);
            if (strC == null) {
                String property = System.getProperty("os.name");
                if (property.equals("Mac OS X")) {
                    str2 = ".dylib";
                } else {
                    if (!property.equals("Linux")) {
                        throw new IllegalStateException(a.a(property, "Don't know how to unmap library name in current platform (", ")"));
                    }
                    str2 = ".so";
                }
                if (strB2.length() > str2.length() + 3 && strB2.startsWith("lib") && strB2.endsWith(str2)) {
                    strB2 = strB2.substring(3, strB2.length() - str2.length());
                }
                strC = d(strB2, str, sb);
            }
            if (strC == null) {
                throw new UnsatisfiedLinkError(sb.toString());
            }
        }
    }

    private static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    private static String c(String str, StringBuilder sb) {
        try {
            System.load(str);
            a.put(str, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't load(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static String d(String str, String str2, StringBuilder sb) {
        try {
            System.loadLibrary(str);
            a.put(str2, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't loadLibrary(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static void e(String str, File file) {
        try {
            System.load(file.getPath());
            a.put(str, file.getPath());
            file.getPath();
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            String property = System.getProperty("sun.arch.data.model");
            if ((!message.contains("ELFCLASS64") || !"32".equals(property)) && (!message.contains("ELFCLASS32") || !"64".equals(property))) {
                throw e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e.getMessage() + ". If you built this binary from google3, then you need to use the flag --java_cpu=" + (true != property.equals("32") ? "k8" : "piii") + ".  Failure to do so may cause unpredictable and serious failures.");
            unsatisfiedLinkError.setStackTrace(e.getStackTrace());
            throw unsatisfiedLinkError;
        }
    }
}
