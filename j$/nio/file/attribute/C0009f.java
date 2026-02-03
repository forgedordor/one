package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* renamed from: j$.nio.file.attribute.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0009f implements h {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C0009f(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ h a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0010g) {
            return ((C0010g) basicFileAttributes).a;
        }
        if (AbstractC0005b.t(basicFileAttributes)) {
            DosFileAttributes dosFileAttributesL = AbstractC0005b.l(basicFileAttributes);
            if (dosFileAttributesL == null) {
                return null;
            }
            return new j(dosFileAttributesL);
        }
        if (!AbstractC0005b.w(basicFileAttributes)) {
            return new C0009f(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributesQ = AbstractC0005b.q(basicFileAttributes);
        if (posixFileAttributesQ == null) {
            return null;
        }
        return new z(posixFileAttributesQ);
    }

    @Override // j$.nio.file.attribute.h
    public final /* synthetic */ w creationTime() {
        return j$.desugar.sun.nio.fs.g.z(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0009f) {
            obj = ((C0009f) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
