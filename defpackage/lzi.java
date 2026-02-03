package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzi implements lvz {
    public final lzp a;
    public final lzf b;
    public boolean c = false;

    public lzi(lzp lzpVar, lzf lzfVar) {
        this.a = lzpVar;
        this.b = lzfVar;
    }

    @Override // defpackage.lvz
    public final void a(Object obj) {
        if (lzl.e(2)) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + lzp.r(obj));
        }
        this.c = true;
        this.b.b(this.a, obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
