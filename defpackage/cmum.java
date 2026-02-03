package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmum {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final crny b;
    public final eosc c;
    public final cmuo d;
    private final cmtg f;
    private final crma g;

    public cmum(crny crnyVar, cmtg cmtgVar, crma crmaVar, eosc eoscVar, cmuo cmuoVar) {
        this.b = crnyVar;
        this.f = cmtgVar;
        this.g = crmaVar;
        this.c = eoscVar;
        this.d = cmuoVar;
    }

    private final synchronized void e() {
        if (this.d.f) {
            return;
        }
        cmtg cmtgVar = this.f;
        cmtgVar.getClass();
        c(cmtgVar);
    }

    public final cmuh a(int i) {
        if (this.f != null) {
            e();
        }
        cmuo cmuoVar = this.d;
        int iA = cmuoVar.h.h(i).a();
        cmuoVar.b();
        Lock lock = cmuoVar.b;
        lock.lock();
        try {
            SparseArray sparseArray = cmuoVar.d;
            cmuh cmuhVar = (cmuh) sparseArray.get(iA);
            if (cmuhVar != null) {
                lock.unlock();
                return cmuhVar;
            }
            ekrw ekrwVarJ = cmuo.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.V(1, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap", "get", 76, "MmsConfigMap.java")).I("Get mms config failed: invalid subId. subId=%d, real subId=%d, map=%s", Integer.valueOf(i), Integer.valueOf(iA), sparseArray);
            cmuh cmuhVar2 = new cmuh(iA, new Bundle());
            sparseArray.put(iA, cmuhVar2);
            return cmuhVar2;
        } finally {
            cmuoVar.b.unlock();
        }
    }

    public final List b() {
        cmuo cmuoVar = this.d;
        cmuoVar.b();
        cmuoVar.b.lock();
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = cmuoVar.d;
                if (i >= sparseArray.size()) {
                    return arrayList;
                }
                cmuh cmuhVar = (cmuh) sparseArray.valueAt(i);
                if (cmuhVar != null) {
                    arrayList.add(cmuhVar);
                }
                i++;
            }
        } finally {
            cmuoVar.b.unlock();
        }
    }

    public final void c(cmup cmupVar) {
        ekgb ekgbVar;
        if (this.g.k()) {
            Stream map = Collection.EL.stream(this.b.m()).map(new Function() { // from class: cmui
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((crof) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgbVar = (ekgb) map.collect(ekcv.a);
        } else {
            ekrw ekrwVarJ = e.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager", "hasPhonePermissions", 153, "MmsConfigManager.java")).q("Loading mms config failed: no permission to access subscriptions.");
            int i2 = ekgb.d;
            ekgbVar = ekoe.a;
        }
        SparseArray sparseArray = new SparseArray();
        cmupVar.b();
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Integer) it.next()).intValue();
            final cmuh cmuhVar = new cmuh(iIntValue, cmupVar.a(iIntValue));
            this.a.compareAndSet(false, cmuhVar.k());
            cmuhVar.g().ifPresent(new Consumer() { // from class: cmuj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cmuhVar.c = cmug.b(iIntValue, (String) obj, this.a.b);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            sparseArray.append(iIntValue, cmuhVar);
        }
        cmuo cmuoVar = this.d;
        Lock lock = cmuoVar.b;
        lock.lock();
        try {
            SparseArray sparseArray2 = cmuoVar.d;
            sparseArray2.clear();
            Iterator<E> it2 = ekgbVar.iterator();
            while (it2.hasNext()) {
                cmuh cmuhVar2 = (cmuh) sparseArray.get(((Integer) it2.next()).intValue());
                int i3 = cmuhVar2.a;
                ejwl.l(i3 != -1);
                lock.lock();
                try {
                    sparseArray2.put(i3, cmuhVar2);
                    lock.unlock();
                } finally {
                }
            }
        } finally {
            cmuoVar.f = true;
            if (cmuoVar.g.isEmpty()) {
                cmuoVar.g = Optional.of(Instant.now());
            }
            cmuoVar.b.unlock();
            Iterator<E> it3 = ekgbVar.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).intValue();
                cmuoVar.c();
            }
        }
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = b().iterator();
        while (it.hasNext()) {
            if (str.equals(((cmuh) it.next()).i())) {
                return true;
            }
        }
        return false;
    }
}
