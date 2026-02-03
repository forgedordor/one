package j$.desugar.sun.nio.fs;

import j$.nio.file.FileSystem;
import j$.nio.file.I;
import j$.nio.file.Path;
import j$.nio.file.attribute.F;
import java.util.Set;

/* loaded from: classes9.dex */
public final class i extends FileSystem {
    public final String a;
    public final String b;
    public final m c;

    public i(m mVar, String str, String str2) {
        this.c = mVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.FileSystem
    public final Set C() {
        return g.O(new Object[]{"basic"});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable g() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.FileSystem
    public final Path getPath(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.a, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x011e, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0134, code lost:
    
        if (r7 != ']') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0136, code lost:
    
        r1.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0145, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r0, r4 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    @Override // j$.nio.file.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.nio.file.z h(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.i.h(java.lang.String):j$.nio.file.z");
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable i() {
        return g.N(new Object[]{new o(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.FileSystem
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.FileSystem
    public final String l() {
        return "/";
    }

    @Override // j$.nio.file.FileSystem
    public final F m() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final boolean n() {
        return false;
    }

    @Override // j$.nio.file.FileSystem
    public final I p() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final j$.nio.file.spi.d t() {
        return this.c;
    }
}
