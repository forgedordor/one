package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjv {
    public final int a;
    public int b;
    public int c;
    public final boolean d = true;
    public final boolean e = true;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final GestureDetector p;
    public boolean q;
    public final cii r;
    private final Context s;

    public cjv(Context context, int i, cii ciiVar) {
        this.s = context;
        this.a = i;
        this.r = ciiVar;
        this.p = new GestureDetector(context, new cju(this));
    }

    public final float a() {
        if (!b()) {
            float f = this.g;
            if (f > 0.0f) {
                return this.f / f;
            }
            return 1.0f;
        }
        boolean z = true;
        if (!this.q ? this.f <= this.g : this.f >= this.g) {
            z = false;
        }
        float fAbs = Math.abs(1.0f - (this.f / this.g)) * 0.5f;
        if (this.g <= this.a) {
            return 1.0f;
        }
        return z ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public final boolean b() {
        return this.o != 0;
    }
}
