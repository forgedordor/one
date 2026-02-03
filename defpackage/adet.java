package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adet implements View.OnClickListener {
    final /* synthetic */ adel a;
    final /* synthetic */ adfc b;

    public adet(adel adelVar, adfc adfcVar) {
        this.a = adelVar;
        this.b = adfcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(adfs.a);
        cczv cczvVar = cgwx.a;
        Uri uri = Uri.parse((String) cgwx.e.e());
        adfc adfcVar = this.b;
        Context contextA = adfcVar.c.A();
        aijh aijhVar = (aijh) adfcVar.e.b();
        dakl daklVar = (dakl) adfcVar.f.a.b();
        daklVar.getClass();
        aijhVar.getClass();
        daof.a(uri, daklVar, contextA, aijhVar, contextA.getPackageManager());
    }
}
