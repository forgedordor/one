package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrc {
    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
