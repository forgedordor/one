package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvu implements rfg {
    private final dyvk a;
    private final int b;
    private final dyvv c;

    public dyvu(dyvk dyvkVar, dyvv dyvvVar, int i) {
        this.a = dyvkVar;
        this.c = dyvvVar;
        this.b = i;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.MEMORY_CACHE;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        rffVar.c(this.a.a(this.c.b(), this.b));
    }

    @Override // defpackage.rfg
    public final void d() {
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}
