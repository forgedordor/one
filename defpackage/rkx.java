package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkx implements rfg {
    private final File a;
    private final rky b;
    private Object c;

    public rkx(File file, rky rkyVar) {
        this.a = file;
        this.b = rkyVar;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.rfg
    public final void e() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        try {
            Object objB = this.b.b(this.a);
            this.c = objB;
            rffVar.c(objB);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
            }
            rffVar.f(e);
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
