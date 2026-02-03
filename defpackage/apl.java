package defpackage;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apl implements ali {
    @Override // defpackage.ali
    public final CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.ali
    public final boolean b(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }
}
