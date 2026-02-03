package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbk implements lun {
    final /* synthetic */ egxv a;
    final /* synthetic */ egxm b;

    public czbk(egxv egxvVar, egxm egxmVar) {
        this.a = egxvVar;
        this.b = egxmVar;
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.a.e(this.b);
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        Uri[] uriArr = czbo.a;
        int length = uriArr.length;
        for (int i = 0; i < 2; i++) {
            this.a.d(uriArr[i], true, this.b);
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
