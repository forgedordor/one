package androidx.appsearch.builtintypes.properties;

import defpackage.afb;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.properties.$$__AppSearch__Keyword, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__Keyword implements afq<Keyword> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("Keyword");
        afm afmVar = new afm("asText");
        afmVar.b(2);
        afmVar.e(1);
        afmVar.c(2);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        Keyword keyword = (Keyword) obj;
        afu afuVar = new afu(keyword.a, keyword.b, "Keyword");
        afuVar.b("asText", keyword.c);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        String[] strArrU = afvVar.u("asText");
        String str = null;
        if (strArrU != null && strArrU.length != 0) {
            str = strArrU[0];
        }
        Keyword keyword = new Keyword(str);
        keyword.a = strL;
        keyword.b = strK;
        return keyword;
    }

    @Override // defpackage.afq
    public final String d() {
        return "Keyword";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
