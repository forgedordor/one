package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rai implements qyz {
    private final Map a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0;
    private final rar c;

    public rai(rar rarVar) {
        this.c = rarVar;
    }

    static int e(InputStream inputStream) {
        return (n(inputStream) << 24) | n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16);
    }

    static long f(InputStream inputStream) {
        return (n(inputStream) & 255) | ((n(inputStream) & 255) << 8) | ((n(inputStream) & 255) << 16) | ((n(inputStream) & 255) << 24) | ((n(inputStream) & 255) << 32) | ((n(inputStream) & 255) << 40) | ((n(inputStream) & 255) << 48) | ((n(inputStream) & 255) << 56);
    }

    static String h(rah rahVar) {
        return new String(m(rahVar, f(rahVar)), "UTF-8");
    }

    static void j(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void k(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void l(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        k(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] m(rah rahVar, long j) throws IOException {
        long jA = rahVar.a();
        if (j >= 0 && j <= jA) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(rahVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException(a.F(jA, j, "streamToBytes length=", ", maxLength="));
    }

    private static int n(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void o(String str, rag ragVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            this.b += ragVar.a - ((rag) map.get(str)).a;
        } else {
            this.b += ragVar.a;
        }
        map.put(str, ragVar);
    }

    private final void p(String str) {
        rag ragVar = (rag) this.a.remove(str);
        if (ragVar != null) {
            this.b -= ragVar.a;
        }
    }

    private static final String q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // defpackage.qyz
    public final synchronized qyy a(String str) {
        rag ragVar = (rag) this.a.get(str);
        if (ragVar == null) {
            return null;
        }
        File fileG = g(str);
        try {
            rah rahVar = new rah(new BufferedInputStream(new FileInputStream(fileG)), fileG.length());
            try {
                String str2 = rag.a(rahVar).b;
                if (!TextUtils.equals(str, str2)) {
                    raa.a("%s: key=%s, found=%s", fileG.getAbsolutePath(), str, str2);
                    p(str);
                    return null;
                }
                byte[] bArrM = m(rahVar, rahVar.a());
                qyy qyyVar = new qyy();
                qyyVar.a = bArrM;
                qyyVar.b = ragVar.c;
                qyyVar.c = ragVar.d;
                qyyVar.d = ragVar.e;
                qyyVar.e = ragVar.f;
                qyyVar.f = ragVar.g;
                List<qzh> list = ragVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (qzh qzhVar : list) {
                    treeMap.put(qzhVar.a, qzhVar.b);
                }
                qyyVar.g = treeMap;
                qyyVar.h = DesugarCollections.unmodifiableList(list);
                return qyyVar;
            } finally {
                rahVar.close();
            }
        } catch (IOException e) {
            raa.a("%s: %s", fileG.getAbsolutePath(), e.toString());
            i(str);
            return null;
        }
    }

    @Override // defpackage.qyz
    public final synchronized void b() {
        File fileA = this.c.a();
        if (fileA.exists()) {
            File[] fileArrListFiles = fileA.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        rah rahVar = new rah(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            rag ragVarA = rag.a(rahVar);
                            ragVarA.a = length;
                            o(ragVarA.b, ragVarA);
                            rahVar.close();
                        } catch (Throwable th) {
                            rahVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileA.mkdirs()) {
            raa.b("Unable to create cache dir %s", fileA.getAbsolutePath());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.qyz
    public final synchronized void c(java.lang.String r29, defpackage.qyy r30) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rai.c(java.lang.String, qyy):void");
    }

    @Override // defpackage.qyz
    public final synchronized void d(String str) {
        qyy qyyVarA = a(str);
        if (qyyVarA != null) {
            qyyVarA.f = 0L;
            qyyVarA.e = 0L;
            c(str, qyyVarA);
        }
    }

    public final File g(String str) {
        return new File(this.c.a(), q(str));
    }

    public final synchronized void i(String str) {
        boolean zDelete = g(str).delete();
        p(str);
        if (zDelete) {
            return;
        }
        raa.a("Could not delete cache entry for key=%s, filename=%s", str, q(str));
    }
}
