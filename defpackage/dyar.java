package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyar extends dyaq {
    final /* synthetic */ dyas b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyar(dyas dyasVar) {
        super(dyasVar);
        this.b = dyasVar;
    }

    @Override // defpackage.dyaq
    public final void a(ConstraintLayout constraintLayout) {
        dyas dyasVar = this.b;
        dyasVar.l.setVisibility(0);
        MaterialButton materialButton = dyasVar.i;
        dyas.f(materialButton);
        MaterialButton materialButton2 = dyasVar.j;
        dyas.f(materialButton2);
        materialButton.setGravity(17);
        materialButton2.setGravity(17);
        MaterialButton materialButton3 = dyasVar.k;
        materialButton3.setGravity(17);
        if (materialButton3.getVisibility() == 0) {
            dyas.f(materialButton3);
            dyasVar.m.setVisibility(0);
        }
        int[][] iArr = {new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}};
        ktp ktpVar = new ktp();
        ktpVar.d(constraintLayout);
        int i = 0;
        while (i < 5) {
            int iY = i == 0 ? 0 : fcur.y(iArr[i - 1]);
            int i2 = i + 1;
            int iY2 = i == 4 ? 0 : fcur.y(iArr[i2]);
            int iY3 = fcur.y(iArr[i]);
            int i3 = iY == 0 ? 3 : 4;
            int i4 = iY;
            int i5 = iY3;
            ktpVar.g(i5, 3, i4, i3, 0);
            ktpVar.g(i5, 4, iY2, iY2 == 0 ? 4 : 3, 0);
            if (i4 != 0) {
                ktpVar.g(i4, 4, i5, 3, 0);
                i5 = i5;
            }
            if (iY2 != 0) {
                ktpVar.g(iY2, 3, i5, 4, 0);
            }
            i = i2;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            int[] iArr2 = iArr[i6];
            int length = iArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7 == 0 ? 0 : iArr2[i7 - 1];
                int i9 = i7 + 1;
                int i10 = i7 == iArr2.length + (-1) ? 0 : iArr2[i9];
                int i11 = i7;
                int i12 = iArr2[i11];
                ktpVar.g(i12, 6, i8, i8 == 0 ? 6 : 7, 0);
                int i13 = i8;
                ktpVar.g(i12, 7, i10, i10 == 0 ? 7 : 6, 0);
                if (i13 != 0) {
                    ktpVar.g(i13, 7, i12, 6, 0);
                    i12 = i12;
                }
                if (i10 != 0) {
                    ktpVar.g(i10, 6, i12, 7, 0);
                }
                if (i11 > 0) {
                    ktpVar.f(iArr2[i11], 3, iArr2[0], 3);
                    ktpVar.f(iArr2[i11], 4, iArr2[0], 4);
                }
                i7 = i9;
            }
        }
        ktpVar.c(constraintLayout);
    }
}
