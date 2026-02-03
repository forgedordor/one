package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ado extends adj {
    final /* synthetic */ adq a;
    final /* synthetic */ String b;
    final /* synthetic */ adx c;

    public ado(adq adqVar, String str, adx adxVar) {
        this.a = adqVar;
        this.b = str;
        this.c = adxVar;
    }

    @Override // defpackage.adj
    public final void a(Object obj, kun kunVar) throws Exception {
        adq adqVar = this.a;
        Map map = adqVar.c;
        adx adxVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.j(obj, adxVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((Number) obj2).intValue();
        adqVar.d.add(str);
        try {
            adqVar.a(iIntValue, adxVar, obj, kunVar);
        } catch (Exception e) {
            adq adqVar2 = this.a;
            adqVar2.d.remove(this.b);
            throw e;
        }
    }

    @Override // defpackage.adj
    public final void b() {
        this.a.e(this.b);
    }
}
