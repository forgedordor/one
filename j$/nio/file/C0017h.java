package j$.nio.file;

import java.io.IOException;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0017h extends java.nio.file.FileSystem {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ C0017h(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ java.nio.file.FileSystem g(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0016g ? ((C0016g) fileSystem).a : new C0017h(fileSystem);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0017h) {
            obj = ((C0017h) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return s.f(this.a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        z zVarH = this.a.h(str);
        if (zVarH == null) {
            return null;
        }
        return zVarH instanceof x ? ((x) zVarH).a : new y(zVarH);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new v(this.a.i());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.l();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.F fM = this.a.m();
        int i = j$.nio.file.attribute.G.a;
        if (fM == null) {
            return null;
        }
        return fM.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.n();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        I iP = this.a.p();
        if (iP == null) {
            return null;
        }
        return iP.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.d dVarT = this.a.t();
        int i = j$.nio.file.spi.c.b;
        if (dVarT == null) {
            return null;
        }
        return dVarT instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) dVarT).b : new j$.nio.file.spi.c(dVarT);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.C();
    }
}
