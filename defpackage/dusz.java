package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dusz implements ecjt {
    private static String b(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.ecjt
    public final /* bridge */ /* synthetic */ evuh a(ecju ecjuVar, evuh evuhVar) throws NumberFormatException {
        dtsb dtsbVar = (dtsb) evuhVar;
        if (dtsbVar.e) {
            return dtsbVar;
        }
        HashSet hashSet = new HashSet();
        dtrz dtrzVar = (dtrz) dtsbVar.toBuilder();
        dtrzVar.copyOnWrite();
        dtsb dtsbVar2 = (dtsb) dtrzVar.instance;
        dtsbVar2.b |= 2;
        int i = 1;
        dtsbVar2.e = true;
        ekqg ekqgVarListIterator = ecjuVar.b().entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            List listI = ejxk.d("|").i((CharSequence) ((Map.Entry) ekqgVarListIterator.next()).getKey());
            if (listI.size() >= 4) {
                String str = (String) listI.get(0);
                String str2 = (String) listI.get(i);
                int i2 = Integer.parseInt((String) listI.get(2));
                String str3 = str + "|" + str2 + "|" + i2;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String strB = b(str3, "w");
                    String strB2 = b(str3, "c");
                    long jA = ecjuVar.a(strB, 0L);
                    long jA2 = ecjuVar.a(strB2, 0L);
                    dtrn dtrnVar = (dtrn) dtro.a.createBuilder();
                    dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
                    dtrvVar.copyOnWrite();
                    dtrw dtrwVar = (dtrw) dtrvVar.instance;
                    str2.getClass();
                    int i3 = i;
                    dtrwVar.b |= 1;
                    dtrwVar.c = str2;
                    dtrvVar.copyOnWrite();
                    dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
                    str.getClass();
                    dtrwVar2.b |= 2;
                    dtrwVar2.d = str;
                    dtrnVar.copyOnWrite();
                    dtro dtroVar = (dtro) dtrnVar.instance;
                    dtrw dtrwVar3 = (dtrw) dtrvVar.build();
                    dtrwVar3.getClass();
                    dtroVar.c = dtrwVar3;
                    dtroVar.b |= 1;
                    dtrnVar.copyOnWrite();
                    dtro dtroVar2 = (dtro) dtrnVar.instance;
                    dtroVar2.b |= 8;
                    dtroVar2.f = i2;
                    dtrnVar.copyOnWrite();
                    dtro dtroVar3 = (dtro) dtrnVar.instance;
                    dtroVar3.b |= 16;
                    dtroVar3.g = jA2;
                    dtrnVar.copyOnWrite();
                    dtro dtroVar4 = (dtro) dtrnVar.instance;
                    dtroVar4.b |= 32;
                    dtroVar4.h = jA;
                    dtrzVar.copyOnWrite();
                    dtsb dtsbVar3 = (dtsb) dtrzVar.instance;
                    dtro dtroVar5 = (dtro) dtrnVar.build();
                    dtroVar5.getClass();
                    dtsbVar3.a();
                    dtsbVar3.d.add(dtroVar5);
                    i = i3;
                }
            }
        }
        return (dtsb) dtrzVar.build();
    }
}
