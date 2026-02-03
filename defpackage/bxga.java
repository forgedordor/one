package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxga extends bxgh {
    private final byte[] a;

    public bxga(String str, byte[] bArr, cogw cogwVar) {
        super(str, 1, cogwVar);
        this.a = bArr;
    }

    @Override // defpackage.bxgz
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.bxgh
    public final Bitmap d() throws bxgg {
        throw new bxgg();
    }

    @Override // defpackage.bxgh
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.bxgh
    public final Drawable f(Resources resources) throws bxgg {
        throw new bxgg();
    }

    @Override // defpackage.bxgz
    public final boolean h() {
        return true;
    }

    @Override // defpackage.bxgh
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bxgh
    public final byte[] j() {
        return this.a;
    }

    @Override // defpackage.bxgz
    protected final void b() {
    }
}
