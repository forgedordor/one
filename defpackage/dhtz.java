package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhtz implements dhuh {
    private final dbyl a;
    private final Context b;
    private final Map c;
    private final Optional d;

    public dhtz(dbyl dbylVar, Context context, Map map, Optional optional) {
        context.getClass();
        this.a = dbylVar;
        this.b = context;
        this.c = map;
        this.d = optional;
    }

    private final sem g(dhnv dhnvVar, evqs evqsVar) {
        dhuy dhuyVar = (dhuy) this.c.get(dhnvVar.b);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        sem semVar = (sem) sen.a.createBuilder();
        see seeVar = (see) sef.a.createBuilder();
        seeVar.copyOnWrite();
        sef sefVar = (sef) seeVar.instance;
        sefVar.b |= 16;
        sefVar.c = evqsVar;
        String packageName = this.b.getPackageName();
        seeVar.copyOnWrite();
        sef sefVar2 = (sef) seeVar.instance;
        packageName.getClass();
        sefVar2.b |= 128;
        sefVar2.d = packageName;
        long jB = dhua.b(dhnvVar);
        seeVar.copyOnWrite();
        sef sefVar3 = (sef) seeVar.instance;
        sefVar3.b |= 1024;
        sefVar3.f = jB;
        seeVar.copyOnWrite();
        sef sefVar4 = (sef) seeVar.instance;
        sefVar4.b |= 512;
        sefVar4.e = 757365213L;
        seeVar.copyOnWrite();
        sef sefVar5 = (sef) seeVar.instance;
        int i = dhuyVar.f;
        sefVar5.g = 0;
        sefVar5.b |= 2048;
        seeVar.copyOnWrite();
        sef sefVar6 = (sef) seeVar.instance;
        int i2 = dhuyVar.g;
        sefVar6.h = 0;
        sefVar6.b |= 4096;
        seeVar.copyOnWrite();
        sef sefVar7 = (sef) seeVar.instance;
        int i3 = dhuyVar.h;
        sefVar7.i = 0;
        sefVar7.b |= 8192;
        sef sefVar8 = (sef) seeVar.build();
        semVar.copyOnWrite();
        sen senVar = (sen) semVar.instance;
        sefVar8.getClass();
        senVar.d = sefVar8;
        senVar.b |= 2;
        return semVar;
    }

    private final void h(sen senVar) {
        this.a.k(senVar, dqnz.b(this.b, new dhuf())).c();
    }

    @Override // defpackage.dhuh
    public final void a(dhnv dhnvVar, dhwj dhwjVar, sfp sfpVar) {
        Map map;
        dhwjVar.getClass();
        sem semVarG = g(dhnvVar, dhwjVar.e);
        sea seaVar = (sea) seb.a.createBuilder();
        long jG = fdhi.g(dhwjVar.b);
        seaVar.copyOnWrite();
        seb sebVar = (seb) seaVar.instance;
        sebVar.b |= 2;
        sebVar.e = jG;
        sew sewVar = (sew) sex.a.createBuilder();
        dhvp dhvpVar = dhwjVar.a;
        int iB = dhui.b(dhvpVar.a) - 1;
        sewVar.copyOnWrite();
        sex sexVar = (sex) sewVar.instance;
        sexVar.b |= 1;
        sexVar.c = iB;
        int iA = dhui.a(dhvpVar.b) - 1;
        sewVar.copyOnWrite();
        sex sexVar2 = (sex) sewVar.instance;
        sexVar2.b |= 2;
        sexVar2.d = iA;
        evsn evsnVarBuild = sewVar.build();
        evsnVarBuild.getClass();
        seaVar.copyOnWrite();
        seb sebVar2 = (seb) seaVar.instance;
        sebVar2.d = (sex) evsnVarBuild;
        sebVar2.b |= 1;
        List<dhwg> list = dhwjVar.c;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (dhwg dhwgVar : list) {
            sec secVar = (sec) sed.a.createBuilder();
            dhpd dhpdVar = dhwgVar.c;
            String str = dhpdVar.a;
            secVar.copyOnWrite();
            sed sedVar = (sed) secVar.instance;
            sedVar.b |= 1;
            sedVar.c = str;
            String str2 = dhpdVar.b;
            secVar.copyOnWrite();
            sed sedVar2 = (sed) secVar.instance;
            sedVar2.b |= 2;
            sedVar2.d = str2;
            long jG2 = fdhi.g(dhwgVar.b);
            secVar.copyOnWrite();
            sed sedVar3 = (sed) secVar.instance;
            sedVar3.b |= 16;
            sedVar3.e = jG2;
            dhpa dhpaVar = dhwgVar.a;
            if (dhpaVar != null && (map = dhpaVar.a) != null) {
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    sdy sdyVar = (sdy) sdz.a.createBuilder();
                    String str3 = (String) entry.getKey();
                    sdyVar.copyOnWrite();
                    sdz sdzVar = (sdz) sdyVar.instance;
                    str3.getClass();
                    sdzVar.b |= 1;
                    sdzVar.c = str3;
                    float fFloatValue = ((Number) entry.getValue()).floatValue();
                    sdyVar.copyOnWrite();
                    sdz sdzVar2 = (sdz) sdyVar.instance;
                    sdzVar2.b |= 2;
                    sdzVar2.d = fFloatValue;
                    evsn evsnVarBuild2 = sdyVar.build();
                    evsnVarBuild2.getClass();
                    arrayList2.add((sdz) evsnVarBuild2);
                }
                secVar.copyOnWrite();
                sed sedVar4 = (sed) secVar.instance;
                evtg evtgVar = sedVar4.f;
                if (!evtgVar.c()) {
                    sedVar4.f = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(arrayList2, sedVar4.f);
            }
            String str4 = dhwgVar.d;
            if (str4 != null) {
                sdw sdwVar = (sdw) sdx.a.createBuilder();
                sdwVar.copyOnWrite();
                sdx sdxVar = (sdx) sdwVar.instance;
                sdxVar.b |= 1;
                sdxVar.c = str4;
                secVar.copyOnWrite();
                sed sedVar5 = (sed) secVar.instance;
                sdx sdxVar2 = (sdx) sdwVar.build();
                sdxVar2.getClass();
                sedVar5.g = sdxVar2;
                sedVar5.b |= 32;
            }
            evsn evsnVarBuild3 = secVar.build();
            evsnVarBuild3.getClass();
            arrayList.add((sed) evsnVarBuild3);
        }
        seaVar.copyOnWrite();
        seb sebVar3 = (seb) seaVar.instance;
        evtg evtgVar2 = sebVar3.c;
        if (!evtgVar2.c()) {
            sebVar3.c = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(arrayList, sebVar3.c);
        if (sfpVar != null) {
            seaVar.copyOnWrite();
            seb sebVar4 = (seb) seaVar.instance;
            sebVar4.f = sfpVar.h;
            sebVar4.b |= 4;
        }
        evsn evsnVarBuild4 = seaVar.build();
        evsnVarBuild4.getClass();
        semVarG.copyOnWrite();
        sen senVar = (sen) semVarG.instance;
        sen senVar2 = sen.a;
        senVar.c = (seb) evsnVarBuild4;
        senVar.b |= 1;
        evsn evsnVarBuild5 = semVarG.build();
        evsnVarBuild5.getClass();
        h((sen) evsnVarBuild5);
    }

    @Override // defpackage.dhuh
    public final void b(dhnv dhnvVar, evqs evqsVar, sep sepVar) {
        dhnvVar.getClass();
        sem semVarG = g(dhnvVar, evqsVar);
        semVarG.copyOnWrite();
        sen senVar = (sen) semVarG.instance;
        sen senVar2 = sen.a;
        senVar.f = sepVar;
        senVar.b |= 8;
        evsn evsnVarBuild = semVarG.build();
        evsnVarBuild.getClass();
        h((sen) evsnVarBuild);
    }

    @Override // defpackage.dhuh
    public final void c(dhnv dhnvVar, evqs evqsVar, ser serVar) {
        dhnvVar.getClass();
        sem semVarG = g(dhnvVar, evqsVar);
        semVarG.copyOnWrite();
        sen senVar = (sen) semVarG.instance;
        sen senVar2 = sen.a;
        senVar.e = serVar;
        senVar.b |= 4;
        evsn evsnVarBuild = semVarG.build();
        evsnVarBuild.getClass();
        h((sen) evsnVarBuild);
    }

    @Override // defpackage.dhuh
    public final void d(dhnv dhnvVar, evqs evqsVar, long j, dhuo dhuoVar, int i, int i2) {
        dhnvVar.getClass();
        evqsVar.getClass();
        dhuoVar.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        sem semVarG = g(dhnvVar, evqsVar);
        sdu sduVar = (sdu) sdv.a.createBuilder();
        sduVar.copyOnWrite();
        sdv sdvVar = (sdv) sduVar.instance;
        sdvVar.b |= 1;
        sdvVar.c = j;
        int iC = dhua.c(dhuoVar);
        sduVar.copyOnWrite();
        sdv sdvVar2 = (sdv) sduVar.instance;
        sdvVar2.d = iC - 1;
        sdvVar2.b |= 2;
        sduVar.copyOnWrite();
        sdv sdvVar3 = (sdv) sduVar.instance;
        sdvVar3.e = dhue.a(i) - 1;
        sdvVar3.b |= 4;
        int iA = sfd.a(ewtg.a(i2));
        int i3 = iA != 0 ? iA : 1;
        sduVar.copyOnWrite();
        sdv sdvVar4 = (sdv) sduVar.instance;
        sdvVar4.f = i3 - 1;
        sdvVar4.b |= 8;
        semVarG.copyOnWrite();
        sen senVar = (sen) semVarG.instance;
        sdv sdvVar5 = (sdv) sduVar.build();
        sen senVar2 = sen.a;
        sdvVar5.getClass();
        senVar.g = sdvVar5;
        senVar.b |= 16;
        evsn evsnVarBuild = semVarG.build();
        evsnVarBuild.getClass();
        h((sen) evsnVarBuild);
    }

    @Override // defpackage.dhuh
    public final void e(dhnv dhnvVar, long j, evqs evqsVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        if (i == 1) {
            sem semVarG = g(dhnvVar, evqsVar);
            sek sekVar = (sek) sel.a.createBuilder();
            sekVar.copyOnWrite();
            sel selVar = (sel) sekVar.instance;
            selVar.b |= 1;
            selVar.c = j;
            semVarG.copyOnWrite();
            sen senVar = (sen) semVarG.instance;
            sel selVar2 = (sel) sekVar.build();
            sen senVar2 = sen.a;
            selVar2.getClass();
            senVar.i = selVar2;
            senVar.b |= 64;
            evsn evsnVarBuild = semVarG.build();
            evsnVarBuild.getClass();
            h((sen) evsnVarBuild);
            return;
        }
        sem semVarG2 = g(dhnvVar, evqsVar);
        sei seiVar = (sei) sej.a.createBuilder();
        seiVar.copyOnWrite();
        sej sejVar = (sej) seiVar.instance;
        sejVar.b |= 1;
        sejVar.c = j;
        seiVar.copyOnWrite();
        sej sejVar2 = (sej) seiVar.instance;
        sejVar2.d = dhue.b(i) - 1;
        sejVar2.b |= 2;
        int iA = sfd.a(ewtg.a(i2));
        int i3 = iA != 0 ? iA : 1;
        seiVar.copyOnWrite();
        sej sejVar3 = (sej) seiVar.instance;
        sejVar3.e = i3 - 1;
        sejVar3.b |= 4;
        semVarG2.copyOnWrite();
        sen senVar3 = (sen) semVarG2.instance;
        sej sejVar4 = (sej) seiVar.build();
        sen senVar4 = sen.a;
        sejVar4.getClass();
        senVar3.h = sejVar4;
        senVar3.b |= 32;
        evsn evsnVarBuild2 = semVarG2.build();
        evsnVarBuild2.getClass();
        h((sen) evsnVarBuild2);
    }

    @Override // defpackage.dhuh
    public final void f(dhnv dhnvVar, int i) {
        if (((Boolean) fdct.a(this.d, false)).booleanValue()) {
            evqs evqsVar = evqs.b;
            evqsVar.getClass();
            sem semVarG = g(dhnvVar, evqsVar);
            seg segVar = (seg) seh.a.createBuilder();
            segVar.copyOnWrite();
            seh sehVar = (seh) segVar.instance;
            sehVar.b |= 1;
            sehVar.c = 0L;
            segVar.copyOnWrite();
            seh sehVar2 = (seh) segVar.instance;
            sehVar2.d = i - 1;
            sehVar2.b |= 2;
            semVarG.copyOnWrite();
            sen senVar = (sen) semVarG.instance;
            seh sehVar3 = (seh) segVar.build();
            sen senVar2 = sen.a;
            sehVar3.getClass();
            senVar.j = sehVar3;
            senVar.b |= 128;
            evsn evsnVarBuild = semVarG.build();
            evsnVarBuild.getClass();
            h((sen) evsnVarBuild);
        }
    }
}
