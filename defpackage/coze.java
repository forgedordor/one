package defpackage;

import androidx.car.app.model.Alert;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coze {
    public static final coze a;
    public static final coze b;
    public static final coze c;
    public static final coze d;
    private static final /* synthetic */ coze[] h;
    public final int e;
    public final enmr f;
    public final String g;

    static {
        coze cozeVar = new coze("UNKNOWN", 0, Alert.DURATION_SHOW_INDEFINITELY, enmr.TRANSPORT_UNKNOWN, "UNKNOWN");
        a = cozeVar;
        coze cozeVar2 = new coze("SINGLE_REGISTRATION", 1, 0, enmr.TRANSPORT_SINGLE_REGISTRATION, "Chat API w/ RCS-SG");
        b = cozeVar2;
        coze cozeVar3 = new coze("TACHYGRAM", 2, 1, enmr.TRANSPORT_TACHYGRAM, "Chat API w/ Tachygram");
        c = cozeVar3;
        coze cozeVar4 = new coze("DUAL_REGISTRATION", 3, 2, enmr.TRANSPORT_RCS, "Chat API w/ RCS");
        d = cozeVar4;
        coze[] cozeVarArr = {cozeVar, cozeVar2, cozeVar3, cozeVar4};
        h = cozeVarArr;
        fczb.a(cozeVarArr);
    }

    private coze(String str, int i, int i2, enmr enmrVar, String str2) {
        this.e = i2;
        this.f = enmrVar;
        this.g = str2;
    }

    public static coze[] values() {
        return (coze[]) h.clone();
    }
}
