package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dhly {
    OPEN("open"),
    CLOSED("closed");

    public final String c;

    dhly(String str) {
        this.c = str;
    }

    public static dhly a(String str) {
        dhly[] dhlyVarArrValues = values();
        for (int i = 0; i < dhlyVarArrValues.length; i++) {
            if (dhlyVarArrValues[i].c.equalsIgnoreCase(str)) {
                return dhlyVarArrValues[i];
            }
        }
        return null;
    }
}
