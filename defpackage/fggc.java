package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggc extends fggb {
    private fggo q;

    public fggc(Context context) {
        super(context);
    }

    @Override // defpackage.fgcn
    public final fggo e() {
        return this.q;
    }

    @Override // defpackage.fgcn
    public final void i(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.q = new fggo(libraryLoader);
    }

    @Override // defpackage.fggb, defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        i(libraryLoader);
        return this;
    }
}
