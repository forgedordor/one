package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyv extends ozf {
    final Set ag = new HashSet();
    boolean ah;
    CharSequence[] ai;
    CharSequence[] aj;

    private final MultiSelectListPreference bb() {
        return (MultiSelectListPreference) ba();
    }

    @Override // defpackage.ozf
    public final void aW(boolean z) {
        if (z && this.ah) {
            MultiSelectListPreference multiSelectListPreferenceBb = bb();
            Set set = this.ag;
            if (multiSelectListPreferenceBb.Q(set)) {
                multiSelectListPreferenceBb.k(set);
            }
        }
        this.ah = false;
    }

    @Override // defpackage.ozf
    protected final void eU(iu iuVar) {
        int length = this.aj.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ag.contains(this.aj[i].toString());
        }
        CharSequence[] charSequenceArr = this.ai;
        oyu oyuVar = new oyu(this);
        ir irVar = iuVar.a;
        irVar.r = charSequenceArr;
        irVar.z = oyuVar;
        irVar.v = zArr;
        irVar.w = true;
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.h(bundle);
        if (bundle != null) {
            Set set = this.ag;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ah = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.ai = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.aj = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceBb = bb();
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceBb.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceBb.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.ag;
        set2.clear();
        set2.addAll(multiSelectListPreferenceBb.i);
        this.ah = false;
        this.ai = charSequenceArr2;
        this.aj = charSequenceArr;
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ag));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ah);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.aj);
    }
}
