package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcz {
    public static final avkq a(avcy avcyVar) {
        avcyVar.getClass();
        avkp avkpVar = (avkp) avkq.a.createBuilder();
        avkpVar.copyOnWrite();
        ((avkq) avkpVar.instance).b = avcyVar.a;
        long epochMilli = avcyVar.b.toEpochMilli();
        avkpVar.copyOnWrite();
        ((avkq) avkpVar.instance).c = epochMilli;
        evsn evsnVarBuild = avkpVar.build();
        evsnVarBuild.getClass();
        return (avkq) evsnVarBuild;
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
        Instant instant = ((avcy) it.next()).b;
        while (it.hasNext()) {
            Instant instant2 = ((avcy) it.next()).b;
            if (instant.compareTo(instant2) > 0) {
                instant = instant2;
            }
        }
        return instant;
    }
}
