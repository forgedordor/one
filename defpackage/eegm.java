package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eegm extends pnz {
    final /* synthetic */ eegq b;

    public eegm(eegq eegqVar) {
        this.b = eegqVar;
    }

    @Override // defpackage.pnz
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.pnz
    public final void c(Drawable drawable) {
        eegq eegqVar = this.b;
        ColorStateList colorStateList = eegqVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(eegqVar.d, colorStateList.getDefaultColor()));
        }
    }
}
