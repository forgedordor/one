package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aohv implements aoip {
    public static final aohv a = new aohv();

    private aohv() {
    }

    @Override // defpackage.aoip
    public final int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aoip
    public final int b() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aoip
    public final int c() {
        return 104857600;
    }

    @Override // defpackage.aoip
    public final int d() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aoip
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aohv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1315564555;
    }

    public final String toString() {
        return "DefaultRcsConfig";
    }
}
