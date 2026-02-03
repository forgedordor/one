package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejbx implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ejby b;

    public ejbx(ejby ejbyVar, String str) {
        this.a = str;
        this.b = ejbyVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.a;
        eyln eylnVar = (eyln) obj;
        ejby ejbyVar = this.b;
        if (TextUtils.equals(str, ejbyVar.e) && ejbyVar.d != null) {
            ejbz ejbzVar = ejbyVar.d;
            evtg<eylp> evtgVar = eylnVar.b;
            czch czchVar = (czch) ejbzVar;
            if (TextUtils.isEmpty(czchVar.t)) {
                return;
            }
            czchVar.g(false);
            czcj czcjVar = czchVar.i;
            List list = czcjVar.d;
            list.clear();
            for (eylp eylpVar : evtgVar) {
                eylj eyljVar = eylpVar.f;
                if (eyljVar == null) {
                    eyljVar = eylj.a;
                }
                Uri uri = Uri.parse(eyljVar.c);
                eylj eyljVar2 = eylpVar.g;
                if (eyljVar2 == null) {
                    eyljVar2 = eylj.a;
                }
                Uri uri2 = Uri.parse(eyljVar2.c);
                Uri uri3 = Uri.parse(eylpVar.c);
                String str2 = eylpVar.d;
                String str3 = eylpVar.e;
                String str4 = eylpVar.i;
                eylr eylrVar = eyljVar.d;
                if (eylrVar == null) {
                    eylrVar = eylr.a;
                }
                int i = eylrVar.b;
                eylr eylrVar2 = eyljVar.d;
                if (eylrVar2 == null) {
                    eylrVar2 = eylr.a;
                }
                list.add(new GifContentItem(uri, uri2, uri3, str2, str3, str4, i, eylrVar2.c));
            }
            czcjVar.a = false;
            czcjVar.p();
            czchVar.k.aj(0);
            czchVar.a.af(emsl.LOADED);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ejby ejbyVar = this.b;
        if (ejbyVar.d != null) {
            czch czchVar = (czch) ejbyVar.d;
            czchVar.g(false);
            czchVar.a.af(emsl.FAILED_TO_LOAD);
        }
    }
}
