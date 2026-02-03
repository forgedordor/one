package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpa {
    public static final chpb a(chpe chpeVar) {
        String str = chpeVar.c;
        String str2 = chpeVar.d;
        String str3 = chpeVar.e;
        chpq chpqVarB = chpq.b(chpeVar.f);
        if (chpqVarB == null) {
            chpqVarB = chpq.UNRECOGNIZED;
        }
        chpq chpqVar = chpqVarB;
        chpqVar.getClass();
        return new chpb(str, str2, str3, chpqVar, false, 16);
    }

    public static final chpc b(chph chphVar) {
        String str = chphVar.c;
        str.getClass();
        Uri uri = str.length() == 0 ? null : Uri.parse(chphVar.c);
        chpq chpqVarB = chpq.b(chphVar.d);
        if (chpqVarB == null) {
            chpqVarB = chpq.UNRECOGNIZED;
        }
        chpqVarB.getClass();
        return new chpc(uri, chpqVarB, false, 4);
    }
}
