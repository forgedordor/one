package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjbh extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auia auiaVar = (auia) auib.a.createBuilder();
        String strA = ((TraceId) obj).a();
        auiaVar.copyOnWrite();
        auib auibVar = (auib) auiaVar.instance;
        auibVar.b |= 1;
        auibVar.c = strA;
        return (auib) auiaVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        auib auibVar = (auib) obj;
        efla eflaVarB = TraceId.b();
        if ((auibVar.b & 1) != 0) {
            eflaVarB.c(auibVar.c);
        }
        return eflaVarB.d();
    }
}
