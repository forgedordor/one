package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jy implements oo {
    final /* synthetic */ jz a;

    public jy(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.oo
    public final void a(oc ocVar, boolean z) {
        oc ocVarA = ocVar.a();
        oc ocVar2 = ocVarA != ocVar ? ocVarA : ocVar;
        jz jzVar = this.a;
        jx jxVarW = jzVar.w(ocVar2);
        if (jxVarW != null) {
            if (ocVarA == ocVar) {
                jzVar.C(jxVarW, z);
            } else {
                jzVar.A(jxVarW.a, jxVarW, ocVarA);
                jzVar.C(jxVarW, true);
            }
        }
    }

    @Override // defpackage.oo
    public final boolean b(oc ocVar) {
        Window.Callback callbackX;
        if (ocVar != ocVar.a()) {
            return true;
        }
        jz jzVar = this.a;
        if (!jzVar.z || (callbackX = jzVar.x()) == null || jzVar.G) {
            return true;
        }
        callbackX.onMenuOpened(108, ocVar);
        return true;
    }
}
