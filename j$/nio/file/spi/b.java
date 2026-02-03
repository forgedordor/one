package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.C;
import j$.nio.file.C0013d;
import j$.nio.file.C0016g;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0003a;
import j$.nio.file.FileSystem;
import j$.nio.file.Path;
import j$.nio.file.attribute.AbstractC0005b;
import j$.nio.file.attribute.B;
import j$.nio.file.attribute.C0004a;
import j$.nio.file.attribute.C0006c;
import j$.nio.file.attribute.C0007d;
import j$.nio.file.attribute.C0009f;
import j$.nio.file.attribute.i;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.y;
import j$.nio.file.k;
import j$.nio.file.n;
import j$.nio.file.s;
import j$.nio.file.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final /* synthetic */ class b extends d {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, k[] kVarArr) throws IOException {
        this.b.setAttribute(s.f(path), str, C.f(obj), C.k(kVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0003a[] enumC0003aArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathF = s.f(path);
        AccessMode[] accessModeArr = null;
        if (enumC0003aArr != null) {
            int length = enumC0003aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0003a enumC0003a = enumC0003aArr[i];
                accessModeArr2[i] = enumC0003a == null ? null : enumC0003a == EnumC0003a.READ ? AccessMode.READ : enumC0003a == EnumC0003a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathF, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(s.f(path), s.f(path2), g.R(copyOptionArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, m[] mVarArr) throws IOException {
        this.b.createDirectory(s.f(path), g.S(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(s.f(path), s.f(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, m[] mVarArr) throws IOException {
        this.b.createSymbolicLink(s.f(path), s.f(path2), g.S(mVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(s.f(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(s.f(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ q h(Path path, Class cls, k[] kVarArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(s.f(path), C.c(cls), C.k(kVarArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof p) {
            return ((p) fileAttributeView).a;
        }
        if (AbstractC0005b.z(fileAttributeView)) {
            BasicFileAttributeView basicFileAttributeViewI = AbstractC0005b.i(fileAttributeView);
            return basicFileAttributeViewI instanceof C0007d ? ((C0007d) basicFileAttributeViewI).a : j$.nio.file.q.r(basicFileAttributeViewI) ? new i(j$.nio.file.q.i(basicFileAttributeViewI)) : j$.nio.file.q.v(basicFileAttributeViewI) ? new y(AbstractC0005b.p(basicFileAttributeViewI)) : new C0006c(basicFileAttributeViewI);
        }
        if (!AbstractC0005b.B(fileAttributeView)) {
            return AbstractC0005b.D(fileAttributeView) ? new B(AbstractC0005b.r(fileAttributeView)) : new o(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeViewM = AbstractC0005b.m(fileAttributeView);
        return fileOwnerAttributeViewM instanceof t ? ((t) fileOwnerAttributeViewM).a : r.s(fileOwnerAttributeViewM) ? new C0004a(r.i(fileOwnerAttributeViewM)) : j$.nio.file.q.v(fileOwnerAttributeViewM) ? new y(AbstractC0005b.p(fileOwnerAttributeViewM)) : new j$.nio.file.attribute.s(fileOwnerAttributeViewM);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0013d i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(s.f(path));
        if (fileStore == null) {
            return null;
        }
        return new C0013d(fileStore);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem j(URI uri) {
        return C0016g.D(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        return j$.nio.file.r.f(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(s.f(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(s.f(path), s.f(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(s.f(path), s.f(path2), g.R(copyOptionArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, m[] mVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(s.f(path), C.g(set), executorService, g.S(mVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, m[] mVarArr) {
        return this.b.newByteChannel(s.f(path), C.g(set), g.S(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, h hVar) {
        return new u(this.b.newDirectoryStream(s.f(path), new h(1, hVar)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, m[] mVarArr) {
        return this.b.newFileChannel(s.f(path), C.g(set), g.S(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem t(Path path, Map map) {
        return C0016g.D(this.b.newFileSystem(s.f(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem u(URI uri, Map map) {
        return C0016g.D(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathF = s.f(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.m.a(nVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathF, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathF = s.f(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.m.a(nVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathF, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.file.attribute.h x(Path path, Class cls, k[] kVarArr) {
        return C0009f.a(this.b.readAttributes(s.f(path), C.d(cls), C.k(kVarArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, k[] kVarArr) {
        return C.e(this.b.readAttributes(s.f(path), str, C.k(kVarArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        return j$.nio.file.r.f(this.b.readSymbolicLink(s.f(path)));
    }
}
