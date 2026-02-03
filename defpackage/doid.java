package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doid implements doif {
    public static final doid a = new doid();

    private doid() {
    }

    @Override // defpackage.doif
    public final int a() {
        return R.string.image_format_type;
    }

    @Override // defpackage.doif
    public final String b() {
        return "image";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doid)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1215726681;
    }

    public final String toString() {
        return "Image";
    }
}
