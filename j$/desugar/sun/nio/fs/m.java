package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.A;
import j$.nio.file.C0013d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0003a;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class m extends j$.nio.file.spi.d {
    public final String b;
    public final String c = "/";
    public volatile i d;

    public m(String str) {
        this.b = str;
    }

    public static void B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    public static boolean C(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.d
    public final void A(Path path, String str, Object obj, j$.nio.file.k... kVarArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((w) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (w) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.d
    public final void a(Path path, EnumC0003a... enumC0003aArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC0003a enumC0003a : enumC0003aArr) {
            int i = j.a[enumC0003a.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i == 2) {
                zCanRead = file.canWrite();
            } else if (i == 3) {
                zCanRead = file.canExecute();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.d
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.a(path2, new j$.nio.file.k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.d
    public final void c(Path path, j$.nio.file.attribute.m... mVarArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.a(path.getParent(), new j$.nio.file.k[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void e(Path path, Path path2, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new EnumC0003a[0]);
            path.toFile().delete();
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.file.attribute.q h(Path path, Class cls, j$.nio.file.k... kVarArr) {
        cls.getClass();
        if (cls == InterfaceC0008e.class) {
            return (j$.nio.file.attribute.q) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.d
    public final C0013d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.d
    public final FileSystem j(URI uri) {
        i iVar;
        B(uri);
        i iVar2 = this.d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.d;
                if (iVar == null) {
                    iVar = new i(this, this.b, this.c);
                    this.d = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.d
    public final Path k(URI uri) {
        byte bA;
        i iVar = this.d;
        String str = this.b;
        String str2 = this.c;
        char[] cArr = p.c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bA = (byte) ((p.a(rawPath.charAt(i3)) << 4) | p.a(rawPath.charAt(i4)));
                if (bA == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bA = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bA;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new o(iVar, new String(bArrCopyOf, q.a), str, str2);
    }

    @Override // j$.nio.file.spi.d
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.d
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.d
    public final boolean n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC0003a[0]);
        a(path2, new EnumC0003a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.a(path2, new j$.nio.file.k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        return s(path, set, mVarArr);
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, h hVar) {
        k kVar = new k();
        kVar.a = new l(this, path, hVar);
        return kVar;
    }

    @Override // j$.nio.file.spi.d
    public final FileChannel s(Path path, Set set, j$.nio.file.attribute.m... mVarArr) throws IOException {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.n) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(A.CREATE_NEW) && set.contains(A.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(A.CREATE) && !set.contains(A.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(A.READ) && set.contains(A.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        A a = A.APPEND;
        if (set.contains(a) && set.contains(A.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        A a2 = A.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(a2) || set.contains(a)) ? set.contains(A.SYNC) ? "rws" : set.contains(A.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(A.TRUNCATE_EXISTING) && set.contains(a2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(a) && !set.contains(A.DELETE_ON_CLOSE)) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof e) {
            int i = e.e;
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((e) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(A.DELETE_ON_CLOSE), set.contains(a), path);
    }

    @Override // j$.nio.file.spi.d
    public final FileSystem u(URI uri, Map map) {
        B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.file.attribute.h x(Path path, Class cls, j$.nio.file.k... kVarArr) {
        if (cls == j$.nio.file.attribute.h.class) {
            return (j$.nio.file.attribute.h) cls.cast(((InterfaceC0008e) h(path, InterfaceC0008e.class, kVarArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final Map y(Path path, String str, j$.nio.file.k... kVarArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        b bVar = new b(path);
        HashSet hashSet = b.b;
        a aVar = new a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                aVar.a.add(str2);
            }
        }
        j$.nio.file.attribute.h attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((c) attributes).h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((c) attributes).c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((c) attributes).b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((c) attributes).a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((c) attributes).i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((c) attributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((c) attributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((c) attributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((c) attributes).g), "isOther");
        }
        return Collections.unmodifiableMap(aVar.b);
    }

    @Override // j$.nio.file.spi.d
    public final Path z(Path path) {
        return new o(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }
}
