package defpackage;

import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drwg extends ICrossProcessPreferenceClient.Stub {
    private final WeakReference a;

    public drwg(drwj drwjVar) {
        this.a = new WeakReference(drwjVar);
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onPreferenceChange(byte[] bArr) {
        ekhx ekhxVarO;
        drwj drwjVar = (drwj) this.a.get();
        if (drwjVar == null) {
            return;
        }
        try {
            drwp drwpVar = (drwp) evsn.parseFrom(drwp.a, bArr, evrr.a());
            synchronized (drwjVar) {
                if (drwo.a(drwpVar.c) == 7) {
                    drwjVar.b.remove(drwpVar.e);
                } else {
                    drwjVar.b.put(drwpVar.e, drwx.e(drwpVar));
                }
                ekhxVarO = ekhx.o(drwjVar.c);
            }
            drwjVar.d(ekhxVarO, new ekph(drwpVar.e));
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) drwj.a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences$CrossProcessPreferencesClient", "onPreferenceChange", 532, "CrossProcessSharedPreferences.java")).t("Failed to decode %s to PreferenceElem", bArr);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onServerDestroy() {
        drwj drwjVar = (drwj) this.a.get();
        if (drwjVar == null) {
            return;
        }
        drwjVar.b();
    }
}
