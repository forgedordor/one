package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjg implements fdpm {
    final /* synthetic */ ConstraintLayout a;

    public afjg(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        float fFloatValue = ((Number) obj).floatValue();
        ktp ktpVar = new ktp();
        ConstraintLayout constraintLayout = this.a;
        ktpVar.d(constraintLayout);
        ktpVar.h(R.id.conversation_list_root_container, fFloatValue);
        ktpVar.h(R.id.conversation_container_background, 1.0f - fFloatValue);
        ktpVar.c(constraintLayout);
        return fctx.a;
    }
}
