package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpd implements rhy, rht {
    private final Resources a;
    private final rhy b;

    private rpd(Resources resources, rhy rhyVar) {
        rvi.f(resources);
        this.a = resources;
        rvi.f(rhyVar);
        this.b = rhyVar;
    }

    public static rhy f(Resources resources, rhy rhyVar) {
        if (rhyVar == null) {
            return null;
        }
        return new rpd(resources, rhyVar);
    }

    @Override // defpackage.rhy
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.rhy
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.rhy
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.rht
    public final void d() {
        rhy rhyVar = this.b;
        if (rhyVar instanceof rht) {
            ((rht) rhyVar).d();
        }
    }

    @Override // defpackage.rhy
    public final void e() {
        this.b.e();
    }
}
