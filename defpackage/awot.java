package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awot {
    public static final awos a(awmp awmpVar, awmp awmpVar2, boolean z) {
        if (awmpVar.b() && awmpVar2.b()) {
            return z ? awos.a : awos.f;
        }
        if (awmpVar.b()) {
            return z ? awos.b : awos.g;
        }
        if (awmpVar2.b()) {
            return z ? awos.c : awos.h;
        }
        awnn awnnVar = awmpVar.c;
        awnn awnnVar2 = awmpVar2.c;
        if (fdbq.f(awnnVar, awnnVar2)) {
            awmt awmtVar = (awmt) awmpVar.d;
            awmt awmtVar2 = (awmt) awmpVar2.d;
            return awmtVar.c != awmtVar2.c ? z ? awos.k : awos.l : !fdbq.f(awmtVar.d, awmtVar2.d) ? z ? awos.m : awos.n : !fdbq.f(awmtVar.b, awmtVar2.b) ? z ? awos.o : awos.p : !fdbq.f(awmtVar.g, awmtVar2.g) ? z ? awos.q : awos.r : z ? awos.a : awos.f;
        }
        Set set = awnnVar2.b;
        Set set2 = awnnVar.b;
        return (fdbq.f(set2, set) || !set2.containsAll(set)) ? (fdbq.f(set2, set) || !set.containsAll(set2)) ? z ? awos.d : awos.i : z ? awos.u : awos.v : z ? awos.s : awos.t;
    }

    public static final awos b(awmp awmpVar, awmp awmpVar2, audk audkVar) {
        awmpVar.getClass();
        awmpVar2.getClass();
        awos awosVar = null;
        if (audkVar != null) {
            evtg evtgVar = audkVar.h;
            evtgVar.getClass();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : evtgVar) {
                aubq aubqVar = ((auek) obj).c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                if (hashSet.add(aubqVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            if (awmpVar.c.b.size() != size) {
                awosVar = awos.w;
            } else if (awmpVar2.c.b.size() != size) {
                awosVar = awos.x;
            } else {
                awmu awmuVar = ((awmt) awmpVar.d).c;
                awmu awmuVar2 = awmu.d;
                if (awmuVar == awmuVar2) {
                    awosVar = awos.y;
                } else if (((awmt) awmpVar2.d).c == awmuVar2) {
                    awosVar = awos.z;
                }
            }
        }
        return awosVar == null ? a(awmpVar, awmpVar2, true) : awosVar;
    }
}
