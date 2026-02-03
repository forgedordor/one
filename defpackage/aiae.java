package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiae {
    public static final /* synthetic */ aiad a(aiac aiacVar) {
        evsn evsnVarBuild = aiacVar.build();
        evsnVarBuild.getClass();
        return (aiad) evsnVarBuild;
    }

    public static final void b(ahzy ahzyVar, aiac aiacVar) {
        aiacVar.copyOnWrite();
        aiad aiadVar = (aiad) aiacVar.instance;
        aiad aiadVar2 = aiad.a;
        aiadVar.d = ahzyVar;
        aiadVar.c = 3;
    }

    public static final void c(aiaa aiaaVar, aiac aiacVar) {
        aiacVar.copyOnWrite();
        aiad aiadVar = (aiad) aiacVar.instance;
        aiad aiadVar2 = aiad.a;
        aiadVar.d = aiaaVar;
        aiadVar.c = 2;
    }

    public static final void d(String str, aiac aiacVar) {
        aiacVar.copyOnWrite();
        aiad aiadVar = (aiad) aiacVar.instance;
        aiad aiadVar2 = aiad.a;
        aiadVar.b |= 1;
        aiadVar.e = str;
    }
}
