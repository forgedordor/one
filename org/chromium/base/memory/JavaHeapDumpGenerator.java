package org.chromium.base.memory;

import android.os.Debug;
import defpackage.ffyc;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(String str) throws IOException {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            ffyc.e("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e.getMessage());
            return false;
        }
    }
}
