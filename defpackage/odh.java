package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odh {
    public static final long a = mgb.w(500);
    public final String b;
    public final oaf c;
    public final odf d;
    public final SparseArray e;
    public boolean f;
    public boolean g;
    public int h;
    public long i;
    public long j;
    public long k;
    public oag l;
    public long m;
    public volatile int n;
    public volatile int o;

    public odh(String str, oaf oafVar, odf odfVar) {
        this.b = str;
        this.c = oafVar;
        this.d = odfVar;
        mee.a(true);
        mee.b(true, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.e = new SparseArray();
        this.h = -2;
        this.m = -9223372036854775807L;
        this.j = Long.MAX_VALUE;
    }

    public static odg a(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        odg odgVar = (odg) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            odg odgVar2 = (odg) sparseArray.valueAt(i);
            if (odgVar2.f < odgVar.f) {
                odgVar = odgVar2;
            }
        }
        return odgVar;
    }

    public final ekgb b(int i) {
        return this.c.a(i);
    }

    public final boolean c(String str) {
        return b(mbw.b(str)).contains(str);
    }
}
