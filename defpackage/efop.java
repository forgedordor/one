package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efop extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        cjgk cjgkVar = (cjgk) cjgl.a.createBuilder();
        String strC = contentType.c();
        cjgkVar.copyOnWrite();
        cjgl cjglVar = (cjgl) cjgkVar.instance;
        strC.getClass();
        cjglVar.b |= 1;
        cjglVar.c = strC;
        String strB = contentType.b();
        cjgkVar.copyOnWrite();
        cjgl cjglVar2 = (cjgl) cjgkVar.instance;
        strB.getClass();
        cjglVar2.b |= 2;
        cjglVar2.d = strB;
        c(contentType, cjgkVar);
        return (cjgl) cjgkVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjgl cjglVar = (cjgl) obj;
        efil efilVarD = ContentType.d();
        if ((cjglVar.b & 1) != 0) {
            efilVarD.f(cjglVar.c);
        }
        if ((cjglVar.b & 2) != 0) {
            efilVarD.e(cjglVar.d);
        }
        d(cjglVar, efilVarD);
        return efilVarD.g();
    }

    public abstract void c(ContentType contentType, cjgk cjgkVar);

    public abstract void d(cjgl cjglVar, efil efilVar);
}
