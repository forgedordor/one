package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvwd extends lzp {
    public final ejvr a;
    public final Uri j;
    final Uri k;
    final String[] l;
    final String m;
    final String[] n;
    final String o;
    final String p;
    final String q;
    public boolean r;
    final /* synthetic */ dvwe s;
    private final dvwc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvwd(dvwe dvweVar, Context context, ejvr ejvrVar, Uri uri) {
        super(context);
        this.s = dvweVar;
        this.r = false;
        this.a = ejvrVar;
        this.j = uri;
        dvvx dvvxVar = (dvvx) dvweVar.b;
        ekgb ekgbVar = dvvxVar.b;
        ekgb ekgbVar2 = dvvxVar.d;
        this.k = dvvxVar.a;
        this.l = ekgbVar == null ? null : (String[]) ekgbVar.toArray(new String[((ekoe) ekgbVar).c]);
        this.m = ((dvvx) dvweVar.b).c;
        this.n = ekgbVar2 == null ? null : (String[]) ekgbVar2.toArray(new String[((ekoe) ekgbVar2).c]);
        dvvx dvvxVar2 = (dvvx) dvweVar.b;
        this.o = dvvxVar2.e;
        this.p = null;
        int i = dvvxVar2.f;
        this.q = a.v(i >= 0 ? String.valueOf(i) : "2147483647", "0, ");
        dvwc dvwcVar = new dvwc(this);
        this.t = dvwcVar;
        dvwi.a().c(uri, dvwcVar);
    }

    @Override // defpackage.lzp
    protected final void f() {
        if (this.r) {
            return;
        }
        this.r = true;
        new dvwb(this).executeOnExecutor(this.s.a, new Void[0]);
    }

    @Override // defpackage.lzp
    protected final void m() {
        if (q() || !this.s.e().g()) {
            f();
        }
    }
}
