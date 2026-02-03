package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprx {
    public static final dpsb a(dprz dprzVar) {
        dike dikeVar = dprzVar.g;
        dojr dojrVar = dprzVar.b;
        Uri uri = Uri.parse(dojrVar.b);
        dilo diloVar = dikeVar != null ? new dilo(dikeVar) : null;
        boolean z = dprzVar.e;
        fdae fdaeVar = dprzVar.c;
        boolean z2 = dprzVar.f;
        return new dpsb(dprzVar.a, uri, dojrVar.c, dprzVar.d, dojrVar.d, dojrVar.e, z2, fdaeVar, z, diloVar);
    }
}
