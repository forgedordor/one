package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quv {
    private final qnb a;

    public quv(qnb qnbVar) {
        this.a = qnbVar;
    }

    public static String c(String str, quu quuVar, boolean z) {
        String strReplaceAll = str.replaceAll("\\W+", "");
        String strConcat = quuVar.c;
        if (z) {
            strConcat = ".temp".concat(String.valueOf(strConcat));
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    public final File a() {
        File file = new File(this.a.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, quu quuVar) throws IOException {
        File file = new File(a(), c(str, quuVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
