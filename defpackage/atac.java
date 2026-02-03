package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class atac extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        aubv aubvVar = (aubv) aubx.a.createBuilder();
        String strC = contentType.c();
        aubvVar.copyOnWrite();
        aubx aubxVar = (aubx) aubvVar.instance;
        strC.getClass();
        aubxVar.b |= 1;
        aubxVar.c = strC;
        String strB = contentType.b();
        aubvVar.copyOnWrite();
        aubx aubxVar2 = (aubx) aubvVar.instance;
        strB.getClass();
        aubxVar2.b |= 2;
        aubxVar2.d = strB;
        c(contentType, aubvVar);
        return (aubx) aubvVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubx aubxVar = (aubx) obj;
        efil efilVarD = ContentType.d();
        if ((aubxVar.b & 1) != 0) {
            efilVarD.f(aubxVar.c);
        }
        if ((aubxVar.b & 2) != 0) {
            efilVarD.e(aubxVar.d);
        }
        d(aubxVar, efilVarD);
        return efilVarD.g();
    }

    public void c(ContentType contentType, aubv aubvVar) {
        throw null;
    }

    public abstract void d(aubx aubxVar, efil efilVar);
}
