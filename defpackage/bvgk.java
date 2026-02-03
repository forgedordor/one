package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvgk implements ebvg {
    final /* synthetic */ bvgl a;

    public bvgk(bvgl bvglVar) {
        this.a = bvglVar;
    }

    @Override // defpackage.ebvg
    public final void a(String str, boolean z) {
        bvgl bvglVar = this.a;
        synchronized (bvglVar) {
            ezol ezolVar = bvglVar.k;
            String str2 = bvglVar.l;
            if (ezolVar != null && !TextUtils.isEmpty(str2)) {
                eooq.g(eoqt.t(bvglVar.m.a(ezolVar, str2, str, z).r()), cqoc.a, eoqg.a);
            }
        }
    }

    @Override // defpackage.ebvg
    public final void b() {
    }
}
