package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfp implements fdae {
    final /* synthetic */ vft a;
    final /* synthetic */ zqw b;
    final /* synthetic */ Context c;
    final /* synthetic */ zqm d;

    public vfp(vft vftVar, zqw zqwVar, Context context, zqm zqmVar) {
        this.a = vftVar;
        this.b = zqwVar;
        this.c = context;
        this.d = zqmVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object objE = vdz.a.e();
        objE.getClass();
        this.a.a.a(fcva.aF(this.b.a, (CharSequence) objE, null, null, new fdap() { // from class: vfo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String strL;
                String strC;
                Object next;
                ajlt ajltVar = (ajlt) obj;
                ajltVar.getClass();
                amvr amvrVarG = ajltVar.g();
                if (!(amvrVarG instanceof amwf)) {
                    return amvrVarG instanceof amwa ? ((amwa) amvrVarG).m() : (!(amvrVarG instanceof amwm) || (strL = ((amwm) amvrVarG).l()) == null) ? "" : strL;
                }
                if (((Boolean) ((cczi) crbf.aB.get()).e()).booleanValue()) {
                    amwf amwfVar = (amwf) amvrVarG;
                    ekgb ekgbVarA = amwfVar.a();
                    ekgbVarA.getClass();
                    Iterator<E> it = ekgbVarA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((amwe) next).c() == amwd.ORIGINAL_TEXT) {
                            break;
                        }
                    }
                    amwe amweVar = (amwe) next;
                    if (amweVar == null || (strC = amweVar.e()) == null) {
                        strC = amwfVar.c();
                    }
                } else {
                    strC = ((amwf) amvrVarG).c();
                }
                strC.getClass();
                return strC;
            }
        }, 30), this.c.getString(R.string.message_context_menu_text_copied_toast_text));
        this.d.b();
        return fctx.a;
    }
}
