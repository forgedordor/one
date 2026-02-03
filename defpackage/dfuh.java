package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dfuh extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efla eflaVarB = TraceId.b();
        eflaVarB.c(((fhaz) obj).b);
        return eflaVarB.d();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        fhay fhayVar = (fhay) fhaz.a.createBuilder();
        String strA = ((TraceId) obj).a();
        fhayVar.copyOnWrite();
        ((fhaz) fhayVar.instance).b = strA;
        return (fhaz) fhayVar.build();
    }
}
