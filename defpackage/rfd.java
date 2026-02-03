package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rfd implements rfg {
    private final String a;
    private final AssetManager b;
    private Object c;

    public rfd(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object c(AssetManager assetManager, String str);

    @Override // defpackage.rfg
    public final void e() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            f(obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    protected abstract void f(Object obj);

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        try {
            Object objC = c(this.b, this.a);
            this.c = objC;
            rffVar.c(objC);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            rffVar.f(e);
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
