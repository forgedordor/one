package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eigb implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ eigp a;
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ eigb(eigp eigpVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str, String str2, int i, String str3) {
        this.a = eigpVar;
        this.b = onSharedPreferenceChangeListener;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.b;
        if (eidc.v()) {
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            return;
        }
        String str2 = this.f;
        int i = this.e;
        String str3 = this.d;
        eieh eiehVarC = this.a.c(str2, this.c, str3, i);
        try {
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
