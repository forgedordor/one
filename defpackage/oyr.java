package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyr extends ozf {
    int ag;
    private CharSequence[] ah;
    private CharSequence[] ai;

    private final ListPreference bb() {
        return (ListPreference) ba();
    }

    @Override // defpackage.ozf
    public final void aW(boolean z) {
        int i;
        if (!z || (i = this.ag) < 0) {
            return;
        }
        String string = this.ai[i].toString();
        ListPreference listPreferenceBb = bb();
        if (listPreferenceBb.Q(string)) {
            listPreferenceBb.o(string);
        }
    }

    @Override // defpackage.ozf
    protected final void eU(iu iuVar) {
        iuVar.h(this.ah, this.ag, new oyq(this));
        iuVar.g(null, null);
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.ag = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ah = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.ai = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceBb = bb();
        if (listPreferenceBb.g == null || listPreferenceBb.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ag = listPreferenceBb.k(listPreferenceBb.i);
        this.ah = listPreferenceBb.g;
        this.ai = listPreferenceBb.h;
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ag);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ai);
    }
}
