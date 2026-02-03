package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exlj implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("XenoEffectBuilderSandboxes");
    }
}
