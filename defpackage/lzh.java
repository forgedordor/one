package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzh extends lvy {
    public final int a;
    public final Bundle h;
    public final lzp i;
    public lzi j;
    private lvj k;

    public lzh(int i, Bundle bundle, lzp lzpVar) {
        this.a = i;
        this.h = bundle;
        this.i = lzpVar;
        if (lzpVar.i != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        lzpVar.i = this;
        lzpVar.b = i;
    }

    public final void b() {
        lvj lvjVar = this.k;
        lzi lziVar = this.j;
        if (lvjVar == null || lziVar == null) {
            return;
        }
        super.k(lziVar);
        f(lvjVar, lziVar);
    }

    final void c() {
        if (lzl.e(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        lzp lzpVar = this.i;
        lzpVar.h();
        lzpVar.e = true;
        lzi lziVar = this.j;
        if (lziVar != null) {
            k(lziVar);
            if (lziVar.c) {
                if (lzl.e(2)) {
                    lzp lzpVar2 = lziVar.a;
                    Objects.toString(lzpVar2);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(lzpVar2)));
                }
                lziVar.b.c(lziVar.a);
            }
        }
        lzh lzhVar = lzpVar.i;
        if (lzhVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (lzhVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        lzpVar.i = null;
        lzpVar.l();
        lzpVar.f = true;
        lzpVar.d = false;
        lzpVar.e = false;
        lzpVar.g = false;
        lzpVar.h = false;
    }

    @Override // defpackage.lvv
    protected final void h() {
        if (lzl.e(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        this.i.o();
    }

    @Override // defpackage.lvv
    protected final void i() {
        if (lzl.e(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        this.i.p();
    }

    @Override // defpackage.lvv
    public final void k(lvz lvzVar) {
        super.k(lvzVar);
        this.k = null;
        this.j = null;
    }

    final void p(lvj lvjVar, lzf lzfVar) {
        lzi lziVar = new lzi(this.i, lzfVar);
        f(lvjVar, lziVar);
        lvz lvzVar = this.j;
        if (lvzVar != null) {
            k(lvzVar);
        }
        this.k = lvjVar;
        this.j = lziVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        lzp lzpVar = this.i;
        sb.append(lzpVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(lzpVar)));
        sb.append("}}");
        return sb.toString();
    }
}
