package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doie implements doif {
    public static final doie a = new doie();

    private doie() {
    }

    @Override // defpackage.doif
    public final int a() {
        return R.string.video_format_type;
    }

    @Override // defpackage.doif
    public final String b() {
        return "video";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doie)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1227616121;
    }

    public final String toString() {
        return "Video";
    }
}
