package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcs implements lcr {
    ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public lcs(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.lcr
    public final lcw a() {
        return new lcw(new lcv(this));
    }

    @Override // defpackage.lcr
    public final void b(ClipData clipData) {
        this.a = clipData;
    }

    @Override // defpackage.lcr
    public final void c(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.lcr
    public final void d(int i) {
        this.c = i;
    }

    @Override // defpackage.lcr
    public final void e(Uri uri) {
        this.d = uri;
    }

    public lcs(lcw lcwVar) {
        this.a = lcwVar.d();
        this.b = lcwVar.b();
        this.c = lcwVar.a();
        this.d = lcwVar.a.d();
        this.e = lcwVar.a.e();
    }
}
