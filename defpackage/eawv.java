package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawv {
    public static eogr a(eawo eawoVar, int i, int i2) {
        return b(eawoVar, i, i2, eaiu.a);
    }

    public static eogr b(eawo eawoVar, int i, int i2, eaiu eaiuVar) {
        eogr eogrVar = (eogr) eogw.a.createBuilder();
        eoft eoftVar = (eoft) eofu.a.createBuilder();
        eoftVar.copyOnWrite();
        eofu eofuVar = (eofu) eoftVar.instance;
        eofuVar.b |= 1;
        eawn eawnVar = (eawn) eawoVar;
        eofuVar.c = eawnVar.a;
        eoftVar.copyOnWrite();
        eofu eofuVar2 = (eofu) eoftVar.instance;
        eofuVar2.b |= 2;
        eofuVar2.d = eawnVar.b;
        eofu eofuVar3 = (eofu) eoftVar.build();
        eogrVar.copyOnWrite();
        eogw eogwVar = (eogw) eogrVar.instance;
        eofuVar3.getClass();
        eogwVar.e = eofuVar3;
        eogwVar.b |= 4;
        eogrVar.copyOnWrite();
        eogw eogwVar2 = (eogw) eogrVar.instance;
        eogwVar2.b |= 16777216;
        eogwVar2.j = i == 2;
        eogrVar.copyOnWrite();
        eogw eogwVar3 = (eogw) eogrVar.instance;
        eogwVar3.n = i - 1;
        eogwVar3.b |= Integer.MIN_VALUE;
        eogrVar.copyOnWrite();
        eogw eogwVar4 = (eogw) eogrVar.instance;
        eogwVar4.l = 1;
        eogwVar4.b |= 536870912;
        eogrVar.copyOnWrite();
        eogw eogwVar5 = (eogw) eogrVar.instance;
        eogwVar5.o = (i2 != 3 ? 3 : 2) - 1;
        eogwVar5.c |= 1;
        eogrVar.copyOnWrite();
        eogw eogwVar6 = (eogw) eogrVar.instance;
        eogwVar6.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        eogwVar6.k = "4.3.1";
        eaiuVar.a();
        eogrVar.copyOnWrite();
        eogw eogwVar7 = (eogw) eogrVar.instance;
        eogwVar7.c |= 8;
        eogwVar7.q = false;
        eaiuVar.c();
        return eogrVar;
    }
}
