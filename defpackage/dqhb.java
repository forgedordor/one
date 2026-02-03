package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhb implements fdpm {
    final /* synthetic */ dqhd a;

    public dqhb(dqhd dqhdVar) {
        this.a = dqhdVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Integer num = (Integer) obj;
        if (num != null) {
            final dqhd dqhdVar = this.a;
            dqhd.bj(dqhdVar, num.intValue(), R.string.try_voice_recording_again, new View.OnClickListener() { // from class: dqha
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dqhdVar.bg();
                }
            });
        } else {
            this.a.aW();
        }
        return fctx.a;
    }
}
