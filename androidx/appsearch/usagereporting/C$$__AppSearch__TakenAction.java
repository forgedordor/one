package androidx.appsearch.usagereporting;

import defpackage.afb;
import defpackage.afj;
import defpackage.afo;
import defpackage.afq;
import defpackage.afs;
import defpackage.afu;
import defpackage.afv;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: androidx.appsearch.usagereporting.$$__AppSearch__TakenAction, reason: invalid class name */
/* loaded from: classes.dex */
public final class C$$__AppSearch__TakenAction implements afq<TakenAction> {
    @Override // defpackage.afq
    public final afo a() {
        afb afbVar = new afb("builtin:TakenAction");
        afj afjVar = new afj("actionType");
        afjVar.b(2);
        afjVar.c(0);
        afbVar.c(afjVar.a());
        return afbVar.a();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ afv b(Object obj) {
        TakenAction takenAction = (TakenAction) obj;
        afu afuVar = new afu(takenAction.f, takenAction.g, "builtin:TakenAction");
        afuVar.d(takenAction.h);
        afuVar.g(takenAction.i);
        afuVar.k("actionType", takenAction.j);
        return afuVar.e();
    }

    @Override // defpackage.afq
    public final /* bridge */ /* synthetic */ Object c(afv afvVar, afs afsVar) {
        afvVar.d("actionType");
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.afq
    public final String d() {
        return "builtin:TakenAction";
    }

    @Override // defpackage.afq
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
