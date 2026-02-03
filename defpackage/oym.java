package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oym extends Preference {
    private long a;

    public oym(Context context, List list, long j) {
        super(context);
        this.A = R.layout.expand_button;
        H(ku.a(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        L(R.string.expand_button_title);
        I(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequenceT = preference.t();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequenceT)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.D)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceT)) {
                string = string == null ? charSequenceT : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequenceT);
            }
        }
        n(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        pabVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long eT() {
        return this.a;
    }
}
