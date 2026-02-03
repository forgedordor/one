package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cple implements femm {
    public final fena a;
    public final feov b;
    public final fenp c;
    final /* synthetic */ cplf d;

    public cple(cplf cplfVar, fena fenaVar, feov feovVar, fenp fenpVar) {
        this.d = cplfVar;
        this.a = fenaVar;
        this.b = feovVar;
        this.c = fenpVar;
    }

    private static final String b(feti fetiVar, String str) {
        try {
            int i = feww.b;
            return fewv.a.b(fetiVar).decode(str);
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // defpackage.femm
    public final void a(String str) {
        cplf cplfVar = this.d;
        cplf.a(cplfVar.i);
        feou feouVar = cplfVar.i;
        feouVar.getClass();
        if (feouVar instanceof fenk) {
            if (feouVar.b(VCardConstants.PARAM_ENCODING) == null) {
                cplfVar.i.c(fexb.d(str));
                return;
            } else {
                cplfVar.i.c(b((feti) cplfVar.i.b(VCardConstants.PARAM_ENCODING), fexb.d(str)));
                return;
            }
        }
        if (feouVar.b(VCardConstants.PARAM_ENCODING) == null) {
            cplfVar.i.c(str);
        } else {
            cplfVar.i.c(b((feti) cplfVar.i.b(VCardConstants.PARAM_ENCODING), str));
        }
    }
}
