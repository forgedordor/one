package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wna implements wms {
    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        dltd dltdVar = vvrVar.a;
        if (!(dltdVar instanceof dojp)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        dojp dojpVar = (dojp) dltdVar;
        vvq vvqVar = vvrVar.b;
        String str2 = dojpVar.b;
        Uri uri = vvqVar.c;
        Uri uri2 = Uri.parse(str2);
        Uri uri3 = uri == null ? uri2 : uri;
        String strA = dogh.a(dojpVar.a).a();
        uri3.getClass();
        return new wno(new wnp(strA, uri3, dojpVar.e, dojpVar.f, vvqVar.b), uri2);
    }
}
