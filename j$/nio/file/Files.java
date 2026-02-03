package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.InterfaceC0008e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;

/* loaded from: classes9.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.O(new Object[]{A.CREATE_NEW, A.WRITE});
    }

    public static boolean a(Path path, k... kVarArr) {
        if (kVarArr.length == 0) {
            b(path);
        }
        try {
            int length = kVarArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                k kVar = kVarArr[i];
                if (kVar != k.NOFOLLOW_LINKS) {
                    kVar.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                b(path).a(path, new EnumC0003a[0]);
                return true;
            }
            b(path).x(path, j$.nio.file.attribute.h.class, k.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.spi.d b(Path path) {
        return path.getFileSystem().t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long copy(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                b(path).g(path);
                e = null;
            } catch (SecurityException e) {
                e = e;
            }
        } else {
            e = null;
        }
        try {
            OutputStream outputStreamW = b(path).w(path, A.CREATE_NEW, A.WRITE);
            try {
                long jTransferTo = inputStream instanceof InputStreamRetargetInterface ? ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW) : DesugarInputStream.transferTo(inputStream, outputStreamW);
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
                return jTransferTo;
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e != null) {
                throw e;
            }
            throw e2;
        }
    }

    public static boolean isSymbolicLink(Path path) {
        try {
            return b(path).x(path, j$.nio.file.attribute.h.class, k.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        j$.nio.file.spi.d dVarB = b(path);
        if (b(path2).equals(dVarB)) {
            dVarB.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = k.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == k.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        j$.nio.file.attribute.h hVarX = b(path).x(path, j$.nio.file.attribute.h.class, z ? new k[0] : new k[]{k.NOFOLLOW_LINKS});
        if (hVarX.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            b(path2).g(path2);
        } else if (a(path2, new k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (hVarX.isDirectory()) {
            path2.getFileSystem().t().c(path2, new j$.nio.file.attribute.m[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().t().v(path, new n[0]);
            try {
                copy(inputStreamV, path2, new CopyOption[0]);
                if (inputStreamV != null) {
                    inputStreamV.close();
                }
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((InterfaceC0008e) path2.getFileSystem().t().h(path2, InterfaceC0008e.class, new k[0])).a(hVarX.lastModifiedTime(), hVarX.lastAccessTime(), hVarX.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().t().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().t().f(path);
        return path2;
    }

    public static Path readSymbolicLink(Path path) {
        return b(path).z(path);
    }
}
