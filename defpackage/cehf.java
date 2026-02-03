package defpackage;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
final class cehf {
    public static final cehf a;
    public static final ekgp b;
    private static final /* synthetic */ cehf[] d;
    final int c = 0;

    static {
        cehf cehfVar = new cehf();
        a = cehfVar;
        d = new cehf[]{cehfVar};
        b = ekmi.d(Arrays.asList(values()), new ejvr() { // from class: cehe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return 0;
            }
        });
    }

    private cehf() {
    }

    public static cehf[] values() {
        return (cehf[]) d.clone();
    }
}
