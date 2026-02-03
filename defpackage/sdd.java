package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdd {
    public static final /* synthetic */ sdc a(scv scvVar) {
        evsn evsnVarBuild = scvVar.build();
        evsnVarBuild.getClass();
        return (sdc) evsnVarBuild;
    }

    public static final void b(String str, scv scvVar) {
        scvVar.copyOnWrite();
        sdc sdcVar = (sdc) scvVar.instance;
        sdc sdcVar2 = sdc.a;
        sdcVar.b |= 1;
        sdcVar.c = str;
    }
}
