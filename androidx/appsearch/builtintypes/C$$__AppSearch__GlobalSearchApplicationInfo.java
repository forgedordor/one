package androidx.appsearch.builtintypes;

import defpackage.afb;
import defpackage.afj;
import defpackage.afm;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__GlobalSearchApplicationInfo, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__GlobalSearchApplicationInfo implements afq<GlobalSearchApplicationInfo> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:GlobalSearchApplicationInfo");
        afj afjVar = new afj("applicationType");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        afm afmVar = new afm("schemaTypes");
        afmVar.b(1);
        afmVar.e(2);
        afmVar.c(1);
        afmVar.d(0);
        afbVar.c(afmVar.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) obj;
        afu afuVar = new afu(globalSearchApplicationInfo.a, globalSearchApplicationInfo.b, "builtin:GlobalSearchApplicationInfo");
        afuVar.k("applicationType", globalSearchApplicationInfo.c);
        List list = globalSearchApplicationInfo.d;
        if (list != null) {
            afuVar.b("schemaTypes", (String[]) list.toArray(new String[0]));
        }
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        String strL = afvVar.l();
        String strK = afvVar.k();
        int iD = (int) afvVar.d("applicationType");
        String[] strArrU = afvVar.u("schemaTypes");
        return new GlobalSearchApplicationInfo(strL, strK, iD, strArrU != null ? Arrays.asList(strArrU) : null);
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:GlobalSearchApplicationInfo";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
