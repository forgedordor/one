package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegv extends lji {
    final /* synthetic */ Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eegv(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    @Override // defpackage.lji
    protected final void k(List list) {
        list.add(0);
        this.f.j();
    }

    @Override // defpackage.lji
    protected final void m(lhg lhgVar) {
        Chip chip = this.f;
        lhgVar.q(chip.f());
        lhgVar.t(chip.isClickable());
        lhgVar.s(chip.getAccessibilityClassName());
        lhgVar.S(chip.getText());
    }

    @Override // defpackage.lji
    protected final void n(int i, lhg lhgVar) {
        if (i != 1) {
            lhgVar.w("");
            lhgVar.o(Chip.d);
            return;
        }
        Chip chip = this.f;
        CharSequence text = chip.getText();
        lhgVar.w(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, true != TextUtils.isEmpty(text) ? text : "").trim());
        RectF rectFC = chip.c();
        int i2 = (int) rectFC.left;
        int i3 = (int) rectFC.top;
        int i4 = (int) rectFC.right;
        int i5 = (int) rectFC.bottom;
        Rect rect = chip.j;
        rect.set(i2, i3, i4, i5);
        lhgVar.o(rect);
        lhgVar.i(lhd.a);
        lhgVar.y(chip.isEnabled());
        lhgVar.s(Button.class.getName());
    }

    @Override // defpackage.lji
    protected final void o(int i, boolean z) {
        if (i == 1) {
            this.f.g = z;
        }
        Chip chip = this.f;
        eegx eegxVar = chip.e;
        boolean z2 = chip.g;
        if (eegxVar.g != null) {
            if (eegxVar.t(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : eegx.a)) {
                chip.refreshDrawableState();
            }
        }
    }

    @Override // defpackage.lji
    public final boolean s(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f.performClick();
            }
            if (i == 1) {
                this.f.k();
            }
        }
        return false;
    }
}
