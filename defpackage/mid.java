package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mid extends mhf {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public mid() {
        super(false);
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = mgb.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (i3 > 0) {
                this.c -= i3;
                g(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new mic(e, 2000);
        }
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) throws IOException {
        Uri uri = mhtVar.a;
        this.b = uri;
        j();
        try {
            String path = uri.getPath();
            mee.f(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                long j = mhtVar.e;
                randomAccessFile.seek(j);
                long j2 = mhtVar.f;
                long length = this.a.length() - j;
                this.c = length;
                if (length < 0) {
                    throw new mic(null, null, 2008);
                }
                this.d = true;
                i(mhtVar);
                return this.c;
            } catch (IOException e) {
                throw new mic(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new mic(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new mic(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new mic(e3, 2006);
        } catch (RuntimeException e4) {
            throw new mic(e4, 2000);
        }
    }

    @Override // defpackage.mhl
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.mhl
    public final void d() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new mic(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
