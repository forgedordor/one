package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtaa {
    public static dsvb a(String str) {
        ejwl.a(!str.isEmpty());
        evsl evslVar = dtaf.a;
        dtad dtadVar = (dtad) dtae.a.createBuilder();
        dtadVar.copyOnWrite();
        dtae dtaeVar = (dtae) dtadVar.instance;
        dtaeVar.b |= 1;
        dtaeVar.c = str;
        dtadVar.copyOnWrite();
        dtae dtaeVar2 = (dtae) dtadVar.instance;
        dtaeVar2.b |= 2;
        dtaeVar2.d = true;
        return new dsvb(evslVar, (dtae) dtadVar.build());
    }

    public static dsvb b() {
        ejwl.a(true);
        evsl evslVar = dtaf.a;
        dtad dtadVar = (dtad) dtae.a.createBuilder();
        dtadVar.copyOnWrite();
        dtae dtaeVar = (dtae) dtadVar.instance;
        dtaeVar.b = 1 | dtaeVar.b;
        dtaeVar.c = "obake_android";
        return new dsvb(evslVar, (dtae) dtadVar.build());
    }
}
