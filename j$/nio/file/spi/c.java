package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC0014e;
import j$.nio.file.C;
import j$.nio.file.C0011b;
import j$.nio.file.C0013d;
import j$.nio.file.C0017h;
import j$.nio.file.EnumC0003a;
import j$.nio.file.attribute.B;
import j$.nio.file.attribute.C0004a;
import j$.nio.file.attribute.C0006c;
import j$.nio.file.attribute.C0007d;
import j$.nio.file.attribute.C0010g;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.i;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.s;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.y;
import j$.nio.file.l;
import j$.nio.file.n;
import j$.nio.file.r;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        d dVar = this.a;
        j$.nio.file.Path pathF = r.f(path);
        EnumC0003a[] enumC0003aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0003a[] enumC0003aArr2 = new EnumC0003a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                enumC0003aArr2[i] = accessMode == null ? null : accessMode == AccessMode.READ ? EnumC0003a.READ : accessMode == AccessMode.WRITE ? EnumC0003a.WRITE : EnumC0003a.EXECUTE;
            }
            enumC0003aArr = enumC0003aArr2;
        }
        dVar.a(pathF, enumC0003aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path pathF = r.f(path);
        j$.nio.file.Path pathF2 = r.f(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0011b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.b(pathF, pathF2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(r.f(path), g.Q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(r.f(path), r.f(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(r.f(path), r.f(path2), g.Q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(r.f(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(r.f(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        q qVarH = this.a.h(r.f(path), C.c(cls), C.i(linkOptionArr));
        if (qVarH == null) {
            return null;
        }
        if (qVarH instanceof o) {
            return ((o) qVarH).a;
        }
        if (qVarH instanceof InterfaceC0008e) {
            InterfaceC0008e interfaceC0008e = (InterfaceC0008e) qVarH;
            return interfaceC0008e instanceof C0006c ? ((C0006c) interfaceC0008e).a : interfaceC0008e instanceof i ? ((i) interfaceC0008e).a : interfaceC0008e instanceof y ? ((y) interfaceC0008e).a : new C0007d(interfaceC0008e);
        }
        if (!(qVarH instanceof u)) {
            return qVarH instanceof B ? ((B) qVarH).a : new p(qVarH);
        }
        u uVar = (u) qVarH;
        return uVar instanceof s ? ((s) uVar).a : uVar instanceof C0004a ? ((C0004a) uVar).a : uVar instanceof y ? ((y) uVar).a : new t(uVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0013d c0013dI = this.a.i(r.f(path));
        int i = AbstractC0014e.a;
        if (c0013dI == null) {
            return null;
        }
        return c0013dI.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0017h.g(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return j$.nio.file.s.f(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(r.f(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(r.f(path), r.f(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path pathF = r.f(path);
        j$.nio.file.Path pathF2 = r.f(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0011b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.o(pathF, pathF2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.a.p(r.f(path), C.g(set), executorService, g.Q(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(r.f(path), C.g(set), g.Q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new j$.nio.file.u(this.a.r(r.f(path), new h(1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(r.f(path), C.g(set), g.Q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0017h.g(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathF = r.f(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return dVar.v(pathF, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathF = r.f(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return dVar.w(pathF, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0010g.a(this.a.x(r.f(path), C.d(cls), C.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return j$.nio.file.s.f(this.a.z(r.f(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(r.f(path), str, C.f(obj), C.i(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0017h.g(this.a.t(r.f(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return C.e(this.a.y(r.f(path), str, C.i(linkOptionArr)));
    }
}
