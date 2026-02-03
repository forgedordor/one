package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkr implements rfg {
    private final Resources.Theme a;
    private final Resources b;
    private final rks c;
    private final int d;
    private Object e;

    public rkr(Resources.Theme theme, Resources resources, rks rksVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = rksVar;
        this.d = i;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.rfg
    public final void e() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
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
            Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            rffVar.c(objC);
        } catch (Resources.NotFoundException e) {
            rffVar.f(e);
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
