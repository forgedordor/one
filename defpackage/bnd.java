package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnd {
    public final bml a;
    public final bni b;
    public final bms c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public bnd(bml bmlVar, bni bniVar, bms bmsVar, List list) {
        this.a = bmlVar;
        this.b = bniVar;
        this.c = bmsVar;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}
