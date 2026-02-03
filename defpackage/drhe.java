package defpackage;

import android.util.Log;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhe implements drjc {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ drhg d;

    public drhe(drhg drhgVar, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = drhgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drjc
    public final void a(int i) {
        drhg drhgVar = this.d;
        drhgVar.l = Integer.toString(i);
        drhgVar.k.b();
        etdi etdiVar = (etdi) etdj.a.createBuilder();
        if (drhgVar.k.e()) {
            long jA = drhgVar.k.a();
            etdiVar.copyOnWrite();
            etdj etdjVar = (etdj) etdiVar.instance;
            etdjVar.b |= 2;
            etdjVar.e = jA;
            boolean zD = drhgVar.k.d();
            etdiVar.copyOnWrite();
            etdj etdjVar2 = (etdj) etdiVar.instance;
            etdjVar2.b |= 1;
            etdjVar2.c = zD;
            String str = drhgVar.l;
            if (str != null) {
                etdiVar.a(str);
                Log.d("HatsLibSurveyActivity", "Selected response: ".concat(String.valueOf(drhgVar.l)));
            }
        }
        etdj etdjVar3 = (etdj) etdiVar.build();
        if (etdjVar3 != null) {
            drhgVar.e.d(0, etdjVar3, (erwu) drhgVar.g.b.get(0));
            List list = drhgVar.e.b;
            if (drhq.b(0, etdjVar3.e)) {
                etdi etdiVar2 = (etdi) etdjVar3.toBuilder();
                etdiVar2.copyOnWrite();
                etdj.a((etdj) etdiVar2.instance);
                etdjVar3 = (etdj) etdiVar2.build();
            }
            list.add(etdjVar3);
        }
        drhf drhfVar = drhgVar.a;
        SurveyPromptActivity.H(drhfVar.a(), this.a, drhgVar.f, drhgVar.g, drhgVar.e, Integer.valueOf(this.b), drhgVar.i, drhgVar.j, this.c);
        drhgVar.m = true;
        drhfVar.dismissAllowingStateLoss();
    }
}
