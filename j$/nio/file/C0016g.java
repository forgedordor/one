package j$.nio.file;

import java.io.IOException;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0016g extends FileSystem {
    public final /* synthetic */ java.nio.file.FileSystem a;

    public C0016g(java.nio.file.FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ FileSystem D(java.nio.file.FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0017h ? ((C0017h) fileSystem).a : new C0016g(fileSystem);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Set C() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.FileSystem fileSystem = this.a;
        if (obj instanceof C0016g) {
            obj = ((C0016g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Iterable g() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return r.f(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ z h(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof y ? ((y) pathMatcher).a : new x(pathMatcher);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable i() {
        return new v(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ String l() {
        return this.a.getSeparator();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.attribute.F m() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.F(userPrincipalLookupService);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean n() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ I p() {
        return I.g(this.a.newWatchService());
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.spi.d t() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.b.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.c ? ((j$.nio.file.spi.c) fileSystemProviderProvider).a : new j$.nio.file.spi.b(fileSystemProviderProvider);
    }
}
