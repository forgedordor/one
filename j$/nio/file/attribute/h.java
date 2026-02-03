package j$.nio.file.attribute;

/* loaded from: classes9.dex */
public interface h {
    w creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    w lastAccessTime();

    w lastModifiedTime();

    long size();
}
