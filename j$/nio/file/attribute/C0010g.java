package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0010g implements BasicFileAttributes {
    public final /* synthetic */ h a;

    public /* synthetic */ C0010g(h hVar) {
        this.a = hVar;
    }

    public static /* synthetic */ BasicFileAttributes a(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof C0009f ? ((C0009f) hVar).a : hVar instanceof j ? ((j) hVar).a : hVar instanceof z ? ((z) hVar).a : new C0010g(hVar);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.E(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        h hVar = this.a;
        if (obj instanceof C0010g) {
            obj = ((C0010g) obj).a;
        }
        return hVar.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.E(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.E(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
