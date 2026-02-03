package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyp implements ozd {
    public static oyp a;

    @Override // defpackage.ozd
    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
    }
}
