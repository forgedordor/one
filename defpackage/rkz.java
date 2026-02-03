package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkz implements rky {
    @Override // defpackage.rky
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rky
    public final /* synthetic */ Object b(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.rky
    public final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
