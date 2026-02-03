package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fczs implements fdev {
    public final File a;

    public fczs(File file) {
        this.a = file;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fczq(this);
    }
}
