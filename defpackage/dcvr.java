package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvr implements dcvy {
    @Override // defpackage.dcvy
    public final dcvx a(Context context, String str, dcvw dcvwVar) {
        dcvx dcvxVar = new dcvx();
        int iB = dcvwVar.b(context, str, true);
        dcvxVar.b = iB;
        if (iB != 0) {
            dcvxVar.c = 1;
            return dcvxVar;
        }
        int iA = dcvwVar.a(context, str);
        dcvxVar.a = iA;
        if (iA != 0) {
            dcvxVar.c = -1;
        }
        return dcvxVar;
    }
}
