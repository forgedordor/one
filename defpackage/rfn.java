package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfn extends rfd {
    public rfn(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.rfg
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.rfd
    protected final /* synthetic */ Object c(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.rfd
    protected final /* synthetic */ void f(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
