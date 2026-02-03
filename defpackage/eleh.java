package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleh {
    public static final elca a = new elca() { // from class: elef
        @Override // defpackage.elca
        public final Iterable b(Object obj) {
            File[] fileArrListFiles;
            File file = (File) obj;
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                return DesugarCollections.unmodifiableList(Arrays.asList(fileArrListFiles));
            }
            int i = ekgb.d;
            return ekoe.a;
        }
    };

    public static void a(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static byte[] b(File file) {
        file.getClass();
        return eleg.a(file);
    }
}
