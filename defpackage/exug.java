package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exug {
    public static final exug a;
    private static final /* synthetic */ exug[] c;
    public final int b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;

    static {
        exug exugVar = new exug();
        a = exugVar;
        c = new exug[]{exugVar};
    }

    private exug() {
    }

    public static exug[] values() {
        return (exug[]) c.clone();
    }
}
