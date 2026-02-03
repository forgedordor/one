package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmi {
    public static final int a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? R.drawable.four_participants_unknown_avatar : R.drawable.three_participant_unknown_avatar : R.drawable.two_participants_unknown_avatar : R.drawable.unknown_avatar;
    }

    public static final Uri b(int i) {
        Uri uri = Uri.parse("android.resource://com.google.android.apps.messaging.shared.kids/" + a(i));
        uri.getClass();
        return uri;
    }
}
