package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes9.dex */
public final /* synthetic */ class z implements h {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ z(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ w creationTime() {
        return j$.desugar.sun.nio.fs.g.z(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ w lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.z(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ w lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.z(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
