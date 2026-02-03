package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doia implements doif {
    public static final doia a = new doia();

    private doia() {
    }

    @Override // defpackage.doif
    public final int a() {
        return R.string.audio_format_type;
    }

    @Override // defpackage.doif
    public final String b() {
        return "audio";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doia)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1208579796;
    }

    public final String toString() {
        return "Audio";
    }
}
