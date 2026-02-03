package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhv extends ffhr {
    private final File a;
    private final String b;
    private final String c;

    public ffhv(File file) {
        this(file, "application/octet-stream");
    }

    @Override // defpackage.ffhu
    public long a() {
        return this.a.length();
    }

    @Override // defpackage.ffhu
    public String e() {
        return this.c;
    }

    @Override // defpackage.ffht
    public String f() {
        return this.b;
    }

    @Override // defpackage.ffhu
    public String g() {
        return ffho.e;
    }

    @Override // defpackage.ffht
    public void h(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        FileInputStream fileInputStream = new FileInputStream(this.a);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } finally {
            fileInputStream.close();
        }
    }

    public File i() {
        return this.a;
    }

    public InputStream j() {
        return new FileInputStream(this.a);
    }

    public ffhv(File file, String str) {
        this(file, str, null);
    }

    public ffhv(File file, String str, String str2) {
        this(file, null, str, str2);
    }

    public ffhv(File file, String str, String str2, String str3) {
        super(str2);
        if (file != null) {
            this.a = file;
            if (str != null) {
                this.b = str;
            } else {
                this.b = file.getName();
            }
            this.c = str3;
            return;
        }
        throw new IllegalArgumentException("File may not be null");
    }
}
