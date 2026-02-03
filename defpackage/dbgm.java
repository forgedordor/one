package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgm {
    public final String a;
    public final Bitmap b;
    public final exjy c;
    public Effect d;
    public dbgl e;

    public dbgm(String str, Bitmap bitmap) {
        this.e = new dbgg(dbgk.NOT_YET_FINISHED_LOADING, null);
        this.a = str;
        this.c = null;
        this.b = bitmap;
        Color.argb(0, 0, 0, 0);
    }

    public dbgm(String str, Bitmap bitmap, byte[] bArr) {
        this.e = new dbgg(dbgk.NOT_YET_FINISHED_LOADING, null);
        this.a = str;
        this.c = null;
        this.b = bitmap;
        Color.argb(0, 0, 0, 0);
    }

    public dbgm(String str, exjy exjyVar, Bitmap bitmap) {
        this.e = new dbgg(dbgk.NOT_YET_FINISHED_LOADING, null);
        this.a = str;
        this.c = exjyVar;
        this.b = bitmap;
        Color.argb(0, 0, 0, 0);
    }
}
