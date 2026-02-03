package defpackage;

import j$.nio.file.FileSystems;
import j$.nio.file.Files;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exkc {
    public static void a(File file) {
        if (file != null) {
            b(file);
        }
    }

    private static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            if (!Files.isSymbolicLink(FileSystems.getDefault().getPath(file.getPath(), new String[0])) && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    b(file2);
                }
            }
        }
        file.delete();
    }
}
