package com.google.android.libraries.mdi.search.g3appsearch.app;

import defpackage.afb;
import defpackage.afc;
import defpackage.afe;
import defpackage.aff;
import defpackage.afl;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import defpackage.ahy;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class G3AttributionInfo {
    public static final aff a;
    public static final afo b;
    public static final afo c;
    public final String d;
    public final String e;
    public final byte[] f;
    public final String g;

    static {
        afe afeVar = new afe("g3attrinfo", "G3AttributionInfo");
        afeVar.a = true;
        a = afeVar.a();
        try {
            afo afoVarA = new afq<G3AttributionInfo>() { // from class: com.google.android.libraries.mdi.search.g3appsearch.app.$$__AppSearch__G3AttributionInfo
                @Override // defpackage.afq
                public final afo a() {
                    afb afbVar = new afb("G3AttributionInfo");
                    afc afcVar = new afc("ptoken");
                    afcVar.b(2);
                    afbVar.c(afcVar.a());
                    afm afmVar = new afm("normal");
                    afmVar.b(2);
                    afmVar.e(2);
                    afmVar.c(1);
                    afmVar.d(0);
                    afbVar.c(afmVar.a());
                    return afbVar.a();
                }

                @Override // defpackage.afq
                public final /* bridge */ /* synthetic */ afv b(Object obj) {
                    G3AttributionInfo g3AttributionInfo = (G3AttributionInfo) obj;
                    afu afuVar = new afu(g3AttributionInfo.e, g3AttributionInfo.d, "G3AttributionInfo");
                    byte[] bArr = g3AttributionInfo.f;
                    if (bArr != null) {
                        afuVar.i("ptoken", bArr);
                    }
                    String str = g3AttributionInfo.g;
                    if (str != null) {
                        afuVar.b("normal", str);
                    }
                    return afuVar.e();
                }

                @Override // defpackage.afq
                public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
                    String strK = afvVar.k();
                    String strL = afvVar.l();
                    byte[][] bArrV = afvVar.v("ptoken");
                    String str = null;
                    byte[] bArr = (bArrV == null || bArrV.length == 0) ? null : bArrV[0];
                    String[] strArrU = afvVar.u("normal");
                    if (strArrU != null && strArrU.length != 0) {
                        str = strArrU[0];
                    }
                    return new G3AttributionInfo(strK, strL, bArr, str);
                }

                @Override // defpackage.afq
                public final String d() {
                    return "G3AttributionInfo";
                }

                @Override // defpackage.afq
                public final List e() {
                    return Collections.EMPTY_LIST;
                }
            }.a();
            b = afoVarA;
            afb afbVar = new afb("G3AttributionInfo");
            List listB = afoVarA.b();
            for (int i = 0; i < listB.size(); i++) {
                afl aflVar = (afl) listB.get(i);
                if (!aflVar.g().equals("normal")) {
                    afbVar.c(aflVar);
                }
            }
            afbVar.c(new afm("normal").a());
            c = afbVar.a();
        } catch (ahy e) {
            throw new IllegalStateException("Could not get schema for generated G3AttributionInfo", e);
        }
    }

    public G3AttributionInfo(String str, String str2, byte[] bArr, String str3) {
        this.d = str;
        this.e = str2;
        this.f = bArr;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G3AttributionInfo) {
            return Objects.equals(this.g, ((G3AttributionInfo) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.g);
    }

    public final String toString() {
        return "{normal: " + this.g + "}";
    }
}
