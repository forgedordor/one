package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepj extends eepe {
    public final eeph a;
    public final eepi b;
    public Drawable c;

    public eepj(Context context, eeok eeokVar, eeph eephVar, eepi eepiVar) {
        super(context, eeokVar);
        this.a = eephVar;
        this.b = eepiVar;
        eepiVar.j = this;
    }

    private final boolean a() {
        return this.k != null && eeoe.a(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eepj.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.eepe
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.d();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.eepe, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
