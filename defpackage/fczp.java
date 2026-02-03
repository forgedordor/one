package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fczp extends fczr {
    private boolean b;

    public fczp(File file) {
        super(file);
    }

    @Override // defpackage.fczr
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
