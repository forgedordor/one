package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknu implements ckno {
    @Override // defpackage.ckno
    public final String a(Resources resources, ckmb ckmbVar) {
        return resources.getString(R.string.add_reaction_for_video_rcs_fallback_text, ckmbVar.d);
    }

    @Override // defpackage.ckno
    public final String b(Resources resources, ckmb ckmbVar) {
        return resources.getString(R.string.remove_reaction_from_video_rcs_fallback_text, ckmbVar.d);
    }
}
