package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efpe extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjll cjllVar = (cjll) cjlm.a.createBuilder();
        String strA = ((TraceId) obj).a();
        cjllVar.copyOnWrite();
        cjlm cjlmVar = (cjlm) cjllVar.instance;
        cjlmVar.b |= 1;
        cjlmVar.c = strA;
        return (cjlm) cjllVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjlm cjlmVar = (cjlm) obj;
        efla eflaVarB = TraceId.b();
        if ((cjlmVar.b & 1) != 0) {
            eflaVarB.c(cjlmVar.c);
        }
        return eflaVarB.d();
    }
}
