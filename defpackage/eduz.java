package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eduz {
    public static void a(iy iyVar) {
        int i = ecyk.a()[iyVar.getIntent().getIntExtra("com.google.profile.photopicker.THEME_OVERRIDE", 0)];
        je jeVarL = iyVar.l();
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 1) {
                jeVarL.m(1);
                jeVarL.p();
            } else {
                if (i2 != 2) {
                    return;
                }
                jeVarL.m(2);
                jeVarL.p();
            }
        }
    }
}
