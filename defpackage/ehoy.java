package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehoy extends lxd implements lun {
    public final Map a = new csq(2);
    public boolean b = false;
    public lvj c = null;
    private final Map d = new csq();
    private boolean e = false;

    private final void l(lvj lvjVar) {
        ejwl.l(Looper.getMainLooper().getThread() == Thread.currentThread());
        Set set = (Set) this.a.remove(lvjVar);
        ejwl.m(set != null, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (lvjVar == this.c) {
            this.c = null;
        }
        Set setKeySet = this.d.keySet();
        setKeySet.getClass();
        set.getClass();
        ekpb ekpbVar = new ekpb(setKeySet, set);
        ejwl.p(ekpbVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", ekpbVar);
    }

    @Override // defpackage.lxd
    public final void fC() {
        for (ehox ehoxVar : this.d.values()) {
            ehoxVar.b.a(ehoxVar.a);
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        l(lvjVar);
        lvjVar.P().d(this);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        l(lvjVar);
        lvjVar.P().d(this);
    }

    public final Object k(int i, lvj lvjVar, ehow ehowVar, ehov ehovVar) {
        ejwl.l(Looper.getMainLooper().getThread() == Thread.currentThread());
        lvb lvbVarA = lvjVar.P().a();
        ejwl.p(lvbVarA == lvb.b, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", lvbVarA);
        if (this.e) {
            Set set = (Set) this.a.get(lvjVar);
            Integer numValueOf = Integer.valueOf(i);
            ejwl.n(set.add(numValueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            Map map = this.d;
            ejwl.n(map.containsKey(numValueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((ehox) map.get(numValueOf)).a;
        }
        ejwl.m(lvjVar == this.c, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        Object objA = ehowVar.a();
        Map map2 = this.d;
        Integer numValueOf2 = Integer.valueOf(i);
        ejwl.n(map2.put(numValueOf2, new ehox(objA, ehovVar)) == null, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        ejwl.n(((Set) this.a.get(lvjVar)).add(numValueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return objA;
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
