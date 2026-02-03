package defpackage;

import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzf {
    public final String a;
    public final Uri b;
    final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public dzzf(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final dzzf a() {
        return new dzzf(this.a, this.b, this.c, this.d, this.e, true, this.g);
    }

    public final dzzf b() {
        Uri uri = this.b;
        if (uri == null) {
            Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new dzzf(this.a, uri, this.c, this.d, this.e, this.f, true);
    }

    public final dzzf c() {
        String str = this.c;
        if (str.isEmpty()) {
            return new dzzf(this.a, this.b, str, this.d, true, this.f, this.g);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final dzzf d(String str) {
        return new dzzf(this.a, this.b, this.c, str, this.e, this.f, this.g);
    }

    @Deprecated
    public final dzzh e(String str, double d) {
        Double dValueOf = Double.valueOf(d);
        int i = dzzh.e;
        return new dzyy(this, str, dValueOf, false);
    }

    @Deprecated
    public final dzzh f(String str, int i) {
        Integer numValueOf = Integer.valueOf(i);
        int i2 = dzzh.e;
        return new dzyw(this, str, numValueOf);
    }

    @Deprecated
    public final dzzh g(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        int i = dzzh.e;
        return new dzyv(this, str, lValueOf, false);
    }

    @Deprecated
    public final dzzh h(String str, String str2) {
        int i = dzzh.e;
        return new dzza(this, str, str2, false);
    }

    @Deprecated
    public final dzzh i(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = dzzh.e;
        return new dzyx(this, str, boolValueOf, false);
    }

    @Deprecated
    public final dzzh j(String str, byte[] bArr) {
        int i = dzzh.e;
        return new dzzb(this, str, bArr);
    }

    @Deprecated
    public final dzzh k(String str, Object obj, dzze dzzeVar) {
        int i = dzzh.e;
        return new dzzc(this, str, obj, dzzeVar);
    }

    public final dzzh l(String str, double d) {
        Double dValueOf = Double.valueOf(d);
        int i = dzzh.e;
        return new dzyy(this, str, dValueOf, true);
    }

    public final dzzh m(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        int i = dzzh.e;
        return new dzyv(this, str, lValueOf, true);
    }

    public final dzzh n(String str, String str2) {
        int i = dzzh.e;
        return new dzza(this, str, str2, true);
    }

    public final dzzh o(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = dzzh.e;
        return new dzyx(this, str, boolValueOf, true);
    }

    public final dzzh p(String str, dzze dzzeVar, String str2) {
        int i = dzzh.e;
        return new dzzd(this, str, str2, dzzeVar);
    }

    @Deprecated
    public final dzzh q(String str, float f) {
        Float fValueOf = Float.valueOf(f);
        int i = dzzh.e;
        return new dzyz(this, str, fValueOf);
    }

    public dzzf(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    public dzzf() {
        this("PhenotypePrefs", null, "", "", false, false, false);
    }
}
