package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdu {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int A;
    public final float B;
    public final int C;
    public final float D;
    public final float E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final int L;
    public final CharSequence u;
    public final Layout.Alignment v;
    public final Layout.Alignment w;
    public final Bitmap x;
    public final float y;
    public final int z;

    static {
        mdt mdtVar = new mdt();
        mdtVar.a = "";
        mdtVar.a();
        a = mgb.O(0);
        b = mgb.O(17);
        c = mgb.O(1);
        d = mgb.O(2);
        e = mgb.O(3);
        f = mgb.O(18);
        g = mgb.O(4);
        h = mgb.O(5);
        i = mgb.O(6);
        j = mgb.O(7);
        k = mgb.O(8);
        l = mgb.O(9);
        m = mgb.O(10);
        n = mgb.O(11);
        o = mgb.O(12);
        p = mgb.O(13);
        q = mgb.O(14);
        r = mgb.O(15);
        s = mgb.O(16);
        t = mgb.O(19);
    }

    public mdu(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, int i8) {
        if (charSequence == null) {
            mee.f(bitmap);
        } else {
            mee.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.u = SpannedString.valueOf(charSequence);
        } else {
            this.u = charSequence != null ? charSequence.toString() : null;
        }
        this.v = alignment;
        this.w = alignment2;
        this.x = bitmap;
        this.y = f2;
        this.z = i2;
        this.A = i3;
        this.B = f3;
        this.C = i4;
        this.D = f5;
        this.E = f6;
        this.F = z;
        this.G = i6;
        this.H = i5;
        this.I = f4;
        this.J = i7;
        this.K = f7;
        this.L = i8;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mdu mduVar = (mdu) obj;
            if (TextUtils.equals(this.u, mduVar.u) && this.v == mduVar.v && this.w == mduVar.w && ((bitmap = this.x) != null ? !((bitmap2 = mduVar.x) == null || !bitmap.sameAs(bitmap2)) : mduVar.x == null) && this.y == mduVar.y && this.z == mduVar.z && this.A == mduVar.A && this.B == mduVar.B && this.C == mduVar.C && this.D == mduVar.D && this.E == mduVar.E && this.F == mduVar.F && this.G == mduVar.G && this.H == mduVar.H && this.I == mduVar.I && this.J == mduVar.J && this.K == mduVar.K && this.L == mduVar.L) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.u, this.v, this.w, this.x, Float.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D), Float.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Float.valueOf(this.I), Integer.valueOf(this.J), Float.valueOf(this.K), Integer.valueOf(this.L));
    }
}
