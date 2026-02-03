package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.Y;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final /* synthetic */ class r implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ r(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path f(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof s ? ((s) path).a : new r(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ H D(I i, F[] fArr) {
        return H.a(this.a.register(i == null ? null : i.a, C.l(fArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) C.b(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ H g(I i, F[] fArr, G[] gArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = i == null ? null : i.a;
        WatchEvent.Kind[] kindArrL = C.l(fArr);
        if (gArr != null) {
            int length = gArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i2 = 0; i2 < length; i2++) {
                G g = gArr[i2];
                modifierArr2[i2] = g == null ? null : g.a;
            }
            modifierArr = modifierArr2;
        }
        return H.a(path.register(watchService, kindArrL, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return f(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C0016g.D(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return f(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return f(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return f(this.a.getRoot());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path h(Path path) {
        return f(this.a.resolve(s.f(path)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path i(k[] kVarArr) {
        return f(this.a.toRealPath(C.k(kVarArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new w(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    /* renamed from: l */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(s.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean m(Path path) {
        return this.a.startsWith(s.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean n(Path path) {
        return this.a.endsWith(s.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return f(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path p(Path path) {
        return f(this.a.resolveSibling(s.f(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return f(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return f(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return Y.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return f(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path t(Path path) {
        return f(this.a.relativize(s.f(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return f(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }
}
