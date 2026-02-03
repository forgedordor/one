package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgv {
    public static final dkgv a;
    public static final dkgv b;
    public static final dkgv c;
    private static final /* synthetic */ dkgv[] d;

    static {
        dkgv dkgvVar = new dkgv("START", 0);
        a = dkgvVar;
        dkgv dkgvVar2 = new dkgv("CENTER", 1);
        b = dkgvVar2;
        dkgv dkgvVar3 = new dkgv(VCardConstants.PROPERTY_END, 2);
        c = dkgvVar3;
        dkgv[] dkgvVarArr = {dkgvVar, dkgvVar2, dkgvVar3};
        d = dkgvVarArr;
        fczb.a(dkgvVarArr);
    }

    private dkgv(String str, int i) {
    }

    public static dkgv[] values() {
        return (dkgv[]) d.clone();
    }
}
