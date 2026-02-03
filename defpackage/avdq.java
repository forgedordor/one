package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avdq {
    public static final avlk a(avdp avdpVar) {
        avdpVar.getClass();
        avlh avlhVar = (avlh) avlk.a.createBuilder();
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).c = avdpVar.a;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).d = avdpVar.b;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).e = avdpVar.c;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).f = avdpVar.d;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).g = avdpVar.e;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).h = avdpVar.f;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).i = avdpVar.g;
        avlhVar.copyOnWrite();
        ((avlk) avlhVar.instance).n = avdpVar.m;
        evvp evvpVarC = evxc.c(avdpVar.t.toEpochMilli());
        avlhVar.copyOnWrite();
        avlk avlkVar = (avlk) avlhVar.instance;
        evvpVarC.getClass();
        avlkVar.s = evvpVarC;
        avlkVar.b |= 256;
        Collection<avgf> collection = avdpVar.u;
        ArrayList arrayList = new ArrayList(fcva.p(collection, 10));
        for (avgf avgfVar : collection) {
            avli avliVar = (avli) avlj.a.createBuilder();
            avliVar.getClass();
            long j = avgfVar.a;
            avliVar.copyOnWrite();
            avlj avljVar = (avlj) avliVar.instance;
            avljVar.b |= 1;
            avljVar.c = j;
            String str = avgfVar.b;
            avliVar.copyOnWrite();
            avlj avljVar2 = (avlj) avliVar.instance;
            avljVar2.b |= 2;
            avljVar2.d = str;
            evsn evsnVarBuild = avliVar.build();
            evsnVarBuild.getClass();
            arrayList.add((avlj) evsnVarBuild);
        }
        avlhVar.copyOnWrite();
        avlk avlkVar2 = (avlk) avlhVar.instance;
        evtg evtgVar = avlkVar2.t;
        if (!evtgVar.c()) {
            avlkVar2.t = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, avlkVar2.t);
        String str2 = avdpVar.j;
        if (str2 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar3 = (avlk) avlhVar.instance;
            avlkVar3.b |= 4;
            avlkVar3.l = str2;
        }
        String str3 = avdpVar.l;
        if (str3 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar4 = (avlk) avlhVar.instance;
            avlkVar4.b |= 512;
            avlkVar4.u = str3;
        }
        String str4 = avdpVar.h;
        if (str4 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar5 = (avlk) avlhVar.instance;
            avlkVar5.b |= 1;
            avlkVar5.j = str4;
        }
        String str5 = avdpVar.i;
        if (str5 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar6 = (avlk) avlhVar.instance;
            avlkVar6.b |= 2;
            avlkVar6.k = str5;
        }
        String str6 = avdpVar.k;
        if (str6 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar7 = (avlk) avlhVar.instance;
            avlkVar7.b |= 8;
            avlkVar7.m = str6;
        }
        String str7 = avdpVar.r;
        if (str7 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar8 = (avlk) avlhVar.instance;
            avlkVar8.b |= 64;
            avlkVar8.q = str7;
        }
        String str8 = avdpVar.s;
        if (str8 != null) {
            avlhVar.copyOnWrite();
            avlk avlkVar9 = (avlk) avlhVar.instance;
            avlkVar9.b |= 128;
            avlkVar9.r = str8;
        }
        Uri uri = avdpVar.o;
        if (uri != null) {
            String string = uri.toString();
            avlhVar.copyOnWrite();
            avlk avlkVar10 = (avlk) avlhVar.instance;
            string.getClass();
            avlkVar10.b |= 16;
            avlkVar10.o = string;
        }
        Uri uri2 = avdpVar.p;
        if (uri2 != null) {
            String string2 = uri2.toString();
            avlhVar.copyOnWrite();
            avlk avlkVar11 = (avlk) avlhVar.instance;
            string2.getClass();
            avlkVar11.b |= 32;
            avlkVar11.p = string2;
        }
        Integer num = avdpVar.q;
        if (num != null) {
            int iIntValue = num.intValue();
            avlhVar.copyOnWrite();
            avlk avlkVar12 = (avlk) avlhVar.instance;
            avlkVar12.b |= 1024;
            avlkVar12.v = iIntValue;
        }
        evsn evsnVarBuild2 = avlhVar.build();
        evsnVarBuild2.getClass();
        return (avlk) evsnVarBuild2;
    }

    public static final Instant b(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Instant instant = ((avdp) it.next()).t;
        while (it.hasNext()) {
            Instant instant2 = ((avdp) it.next()).t;
            if (instant.compareTo(instant2) > 0) {
                instant = instant2;
            }
        }
        return instant;
    }

    public static final boolean c(avdp avdpVar) {
        avdpVar.getClass();
        return avdpVar.j != null;
    }
}
