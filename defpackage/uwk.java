package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwk extends fcyz implements fdat {
    int a;
    final /* synthetic */ uwl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwk(uwl uwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uwk) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.c;
            final uwl uwlVar = this.b;
            final String string = uwlVar.a.getResources().getString(R.string.mc_enabled_pref_key);
            string.getClass();
            uwlVar.l = new eigb(uwlVar.k, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: uwg
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (fdbq.f(str, string)) {
                        fdos fdosVar2 = fdosVar;
                        uwl uwlVar2 = uwlVar;
                        auvw.k(uwlVar2.b, null, null, new uwi(fdosVar2, uwlVar2, null), 3);
                    }
                }
            }, "", "", 0, "MagicComposeLauncher");
            crqv crqvVar = (crqv) uwlVar.i.b();
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = uwlVar.l;
            if (onSharedPreferenceChangeListener == null) {
                fdbq.c("prefsListener");
                onSharedPreferenceChangeListener = null;
            }
            crqvVar.m(onSharedPreferenceChangeListener);
            auvw.k(uwlVar.b, null, null, new uwj(fdosVar, uwlVar, null), 3);
            fdae fdaeVar = new fdae() { // from class: uwh
                @Override // defpackage.fdae
                public final Object invoke() {
                    uwl uwlVar2 = uwlVar;
                    crqv crqvVar2 = (crqv) uwlVar2.i.b();
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = uwlVar2.l;
                    if (onSharedPreferenceChangeListener2 == null) {
                        fdbq.c("prefsListener");
                        onSharedPreferenceChangeListener2 = null;
                    }
                    crqvVar2.o(onSharedPreferenceChangeListener2);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uwk uwkVar = new uwk(this.b, fcxyVar);
        uwkVar.c = obj;
        return uwkVar;
    }
}
