package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegt extends eeqd {
    final /* synthetic */ Chip a;

    public eegt(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.eeqd
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        eegx eegxVar = chip.e;
        chip.setText(eegxVar.o ? eegxVar.d : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // defpackage.eeqd
    public final void a(int i) {
    }
}
