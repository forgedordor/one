package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgc implements eyif {
    public static BlockedParticipantsActivity a(Activity activity) {
        if (!(activity instanceof BlockedParticipantsActivity)) {
            throw new IllegalStateException(a.L(activity, tgb.class, "Attempt to inject a Activity wrapper of type "));
        }
        BlockedParticipantsActivity blockedParticipantsActivity = (BlockedParticipantsActivity) activity;
        blockedParticipantsActivity.getClass();
        return blockedParticipantsActivity;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
