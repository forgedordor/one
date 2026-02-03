package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class eacy {
    public final /* synthetic */ eada a;

    public /* synthetic */ eacy(eada eadaVar) {
        this.a = eadaVar;
    }

    public final boolean a(String str, String str2) {
        eadb[] eadbVarArrA = this.a.a(str);
        if (eadbVarArrA == null || eadbVarArrA.length == 0) {
            return false;
        }
        if (!str2.equals("")) {
            return Arrays.binarySearch(eadbVarArrA, str2) >= 0;
        }
        eadb eadbVar = eadbVarArrA[0];
        eada eadaVar = eadb.a;
        return eadbVar.e.equals("");
    }
}
