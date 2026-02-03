package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecwt implements eora {
    final /* synthetic */ ecwu a;

    public ecwt(ecwu ecwuVar) {
        this.a = ecwuVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final List list = (List) obj;
        eg egVarG = this.a.G();
        if (egVarG != null) {
            egVarG.runOnUiThread(new Runnable() { // from class: ecws
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    ejwl.m(Looper.getMainLooper().equals(Looper.myLooper()), "Should be called on the UI thread!");
                    List list2 = list;
                    final ecwu ecwuVar = this.a.a;
                    ecwp ecwpVar = ecwuVar.d;
                    ecwpVar.a = ekgb.n(list2);
                    ecwpVar.p();
                    ecwuVar.b.setDisplayedChild(1);
                    if (ecwuVar.ag) {
                        return;
                    }
                    String string = ecwuVar.m.getString("com.google.android.libraries.tachyon.countrycode.arg.COUNTRY_CODE_SELECTED");
                    for (final int i = 0; i < ecwuVar.d.a(); i++) {
                        if (TextUtils.equals(((ecww) ecwuVar.d.a.get(i)).c, string)) {
                            ecwuVar.c.post(new Runnable() { // from class: ecwr
                                @Override // java.lang.Runnable
                                public final void run() throws Resources.NotFoundException {
                                    ecwu ecwuVar2 = ecwuVar;
                                    ecwuVar2.e.ab(i, ecwuVar2.B().getDimensionPixelSize(R.dimen.list_scroll_offset));
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) ecwu.a.j()).g(th)).h("com/google/android/libraries/tachyon/countrycode/CountryCodeFragment$1", "onFailure", 'f', "CountryCodeFragment.java")).q("Failed to load list of countries.");
    }
}
