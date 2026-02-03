package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebss extends ebsz {
    @Override // defpackage.ebsz
    protected final int a(Context context, ebsy ebsyVar, boolean z) {
        return (ebsyVar.a.getAuthority().lastIndexOf(64) < 0 || kya.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
