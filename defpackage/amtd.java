package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtd extends amud {
    public String a;
    public Uri b;
    public Size c;
    public Optional d = Optional.empty();
    public long e;
    public boolean f;
    public Uri g;
    public amyb h;
    public String i;
    public Uri j;
    public amvx k;
    public byte l;

    @Override // defpackage.amud
    public final void a(amvx amvxVar) {
        if (amvxVar == null) {
            throw new NullPointerException("Null displayState");
        }
        this.k = amvxVar;
    }

    @Override // defpackage.amud
    public final void b(long j) {
        this.e = j;
        this.l = (byte) (this.l | 1);
    }
}
