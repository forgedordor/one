package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhh implements dzgw {
    final /* synthetic */ dzhi a;

    public dzhh(dzhi dzhiVar) {
        this.a = dzhiVar;
    }

    @Override // defpackage.dzgw
    public final boolean a(dzgh dzghVar) {
        dzhi dzhiVar = this.a;
        if (!((Boolean) dzhiVar.d.b()).booleanValue()) {
            return false;
        }
        dzgq dzgqVar = (dzgq) dzgr.a.createBuilder();
        fcsu fcsuVar = dzhiVar.a;
        if (fcsuVar.b() != null) {
            String str = (String) fcsuVar.b();
            dzgqVar.copyOnWrite();
            dzgr dzgrVar = (dzgr) dzgqVar.instance;
            str.getClass();
            dzgrVar.b |= 1;
            dzgrVar.c = str;
        }
        fcsu fcsuVar2 = dzhiVar.b;
        if (((Integer) fcsuVar2.b()).intValue() > 0) {
            int iIntValue = ((Integer) fcsuVar2.b()).intValue();
            dzgqVar.copyOnWrite();
            dzgr dzgrVar2 = (dzgr) dzgqVar.instance;
            dzgrVar2.b |= 2;
            dzgrVar2.d = iIntValue;
        }
        fcsu fcsuVar3 = dzhiVar.c;
        if (((Integer) fcsuVar3.b()).intValue() > 0) {
            int iIntValue2 = ((Integer) fcsuVar3.b()).intValue();
            dzgqVar.copyOnWrite();
            dzgr dzgrVar3 = (dzgr) dzgqVar.instance;
            dzgrVar3.b |= 4;
            dzgrVar3.e = iIntValue2;
        }
        int i = Build.VERSION.SDK_INT;
        dzgqVar.copyOnWrite();
        dzgr dzgrVar4 = (dzgr) dzgqVar.instance;
        dzgrVar4.b |= 8;
        dzgrVar4.f = i;
        dzgi dzgiVar = (dzgi) dzgj.a.createBuilder();
        dzgiVar.copyOnWrite();
        dzgj dzgjVar = (dzgj) dzgiVar.instance;
        dzgr dzgrVar5 = (dzgr) dzgqVar.build();
        dzgrVar5.getClass();
        dzgjVar.c = dzgrVar5;
        dzgjVar.b = 4;
        dzgj dzgjVar2 = (dzgj) dzgiVar.build();
        dzghVar.copyOnWrite();
        dzgs dzgsVar = (dzgs) dzghVar.instance;
        dzgs dzgsVar2 = dzgs.a;
        dzgjVar2.getClass();
        dzgsVar.a();
        dzgsVar.e.add(dzgjVar2);
        return true;
    }
}
