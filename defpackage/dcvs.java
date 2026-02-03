package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvs implements dcvy {
    @Override // defpackage.dcvy
    public final dcvx a(Context context, String str, dcvw dcvwVar) {
        int iB;
        dcvx dcvxVar = new dcvx();
        int iA = dcvwVar.a(context, str);
        dcvxVar.a = iA;
        int i = 1;
        int i2 = 0;
        if (iA != 0) {
            iB = dcvwVar.b(context, str, false);
            dcvxVar.b = iB;
        } else {
            iB = dcvwVar.b(context, str, true);
            dcvxVar.b = iB;
        }
        int i3 = dcvxVar.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            dcvxVar.c = i;
            return dcvxVar;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        dcvxVar.c = i;
        return dcvxVar;
    }
}
