package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clko {
    public static final clko a;
    public static final clko b;
    public static final clko c;
    public static final clko d;
    public static final clko e;
    private static final /* synthetic */ clko[] h;
    public final int f;
    public final int g;

    static {
        clko clkoVar = new clko("TOMBSTONE_SUCCESS_HELP_STILL_NEEDED", 0, 246, R.string.end_of_emergency_tombstone_success_text);
        a = clkoVar;
        clko clkoVar2 = new clko("TOMBSTONE_SUCCESS_HELP_NO_LONGER_NEEDED", 1, 247, R.string.end_of_emergency_tombstone_success_text);
        b = clkoVar2;
        clko clkoVar3 = new clko("TOMBSTONE_FAILURE_HELP_STILL_NEEDED", 2, 248, R.string.end_of_emergency_tombstone_failure_text);
        c = clkoVar3;
        clko clkoVar4 = new clko("TOMBSTONE_FAILURE_HELP_NO_LONGER_NEEDED", 3, 249, R.string.end_of_emergency_tombstone_failure_text);
        d = clkoVar4;
        clko clkoVar5 = new clko("TOMBSTONE_UNEXPECTED_END", 4, 250, R.string.end_of_emergency_tombstone_unexpected_text);
        e = clkoVar5;
        clko[] clkoVarArr = {clkoVar, clkoVar2, clkoVar3, clkoVar4, clkoVar5};
        h = clkoVarArr;
        fczb.a(clkoVarArr);
    }

    private clko(String str, int i, int i2, int i3) {
        this.f = i2;
        this.g = i3;
    }

    public static clko[] values() {
        return (clko[]) h.clone();
    }
}
