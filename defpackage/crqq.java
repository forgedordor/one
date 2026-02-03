package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Base64;
import com.google.android.ims.provisioning.config.WelcomeMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class crqq extends crqv {
    protected final Context a;

    public crqq(Context context) {
        this.a = context;
    }

    private final SharedPreferences t() {
        if (Looper.myLooper() == Looper.getMainLooper() && cqaz.b && !cczg.n()) {
            cqaz.c(a().concat(" reading from storage in UI thread at app start"));
        }
        return this.a.getSharedPreferences(a(), 0);
    }

    @Override // defpackage.crqv
    public final int d(String str, int i) {
        b(str);
        return t().getInt(str, i);
    }

    @Override // defpackage.crqv
    public final long e(String str, long j) {
        b(str);
        return t().getLong(str, j);
    }

    @Override // defpackage.crqv
    public final String f(String str, String str2) {
        b(str);
        return t().getString(str, str2);
    }

    @Override // defpackage.crqv
    public final void g(String str, boolean z) {
        b(str);
        t().edit().putBoolean(str, z).commit();
    }

    @Override // defpackage.crqv
    public final void h(String str, boolean z) {
        b(str);
        t().edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.crqv
    public final void i(String str, byte[] bArr) {
        b(str);
        l(str, Base64.encodeToString(bArr, 0));
    }

    @Override // defpackage.crqv
    public final void j(String str, int i) {
        b(str);
        t().edit().putInt(str, i).apply();
    }

    @Override // defpackage.crqv
    public final void k(String str, long j) {
        b(str);
        t().edit().putLong(str, j).apply();
    }

    @Override // defpackage.crqv
    public final void l(String str, String str2) {
        b(str);
        t().edit().putString(str, str2).apply();
    }

    @Override // defpackage.crqv
    public final void m(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.getSharedPreferences(a(), 0).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.crqv
    public final void n(String str) {
        b(str);
        t().edit().remove(str).apply();
    }

    @Override // defpackage.crqv
    public final void o(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.getSharedPreferences(a(), 0).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.crqv
    public final boolean p(String str) {
        b(str);
        return t().contains(str);
    }

    @Override // defpackage.crqv
    public final boolean q(String str, boolean z) {
        b(str);
        return t().getBoolean(str, z);
    }

    @Override // defpackage.crqv
    public final byte[] r(String str) {
        b(str);
        String strF = f(str, null);
        if (strF == null) {
            return null;
        }
        return Base64.decode(strF, 0);
    }

    @Override // defpackage.crqv
    public final WelcomeMessage s() {
        SharedPreferences sharedPreferencesT = t();
        String string = sharedPreferencesT.getString("rcs_welcome_message_message", null);
        if (string == null) {
            return null;
        }
        b("rcs_welcome_message_title");
        b("rcs_welcome_message_message");
        b("rcs_welcome_message_accept");
        b("rcs_welcome_message_reject");
        b("rcs_welcome_message_settings");
        return new WelcomeMessage(string, ejwk.b(sharedPreferencesT.getString("rcs_welcome_message_title", null)), sharedPreferencesT.getBoolean("rcs_welcome_message_accept", true), sharedPreferencesT.getBoolean("rcs_welcome_message_reject", false), sharedPreferencesT.getBoolean("rcs_welcome_message_settings", false));
    }

    protected void b(String str) {
    }
}
