package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgc extends bxgh {
    public final byte[] a;
    public final cqsu b;

    public bxgc(String str, byte[] bArr, int i, cogw cogwVar, cqsu cqsuVar) {
        super(str, i, cogwVar);
        this.a = bArr;
        this.b = cqsuVar;
    }

    @Override // defpackage.bxgz
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.bxgh
    public final Bitmap d() {
        o();
        try {
            cqaz.h();
            byte[] bArr = this.a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgh
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.bxgh
    public final Drawable f(Resources resources) {
        return null;
    }

    @Override // defpackage.bxgh
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bxgh
    public final byte[] j() {
        o();
        try {
            byte[] bArr = this.a;
            return Arrays.copyOf(bArr, bArr.length);
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgz
    public final boolean k() {
        return true;
    }

    @Override // defpackage.bxgz
    public final bxgk l() {
        cqaz.k(true);
        return new bxgb(this);
    }

    @Override // defpackage.bxgz
    protected final void b() {
    }
}
