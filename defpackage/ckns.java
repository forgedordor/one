package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckns implements ckno {
    private final String a;

    public ckns(String str) {
        this.a = str;
    }

    @Override // defpackage.ckno
    public final String a(Resources resources, ckmb ckmbVar) {
        return resources.getString(R.string.add_reaction_for_text_message_rcs_fallback_text_v2, ckmbVar.d, this.a);
    }

    @Override // defpackage.ckno
    public final String b(Resources resources, ckmb ckmbVar) {
        return resources.getString(R.string.remove_reaction_from_text_message_rcs_fallback_text_v2, ckmbVar.d, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ckns) {
            return this.a.equals(((ckns) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
