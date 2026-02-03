package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfu extends rfd {
    public rfu(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.rfg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rfd
    protected final /* synthetic */ Object c(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.rfd
    protected final /* synthetic */ void f(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
