package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uia extends uik {
    public String a;
    public Uri b;
    public elha c;
    public Size d;
    public String e;
    public double f;
    public double g;
    public byte h;

    @Override // defpackage.uik
    public final void a(double d) {
        this.g = d;
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.uik
    public final void b(double d) {
        this.f = d;
        this.h = (byte) (this.h | 1);
    }
}
