package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmuo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap");
    public final crny h;
    private final Optional i;
    public final Lock b = new ReentrantLock();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public boolean f = false;
    public Optional g = Optional.empty();
    public final cmuh c = new cmuh(-1, new Bundle());

    public cmuo(crny crnyVar, Optional optional) {
        this.h = crnyVar;
        this.i = optional;
    }

    public final Bundle a(int i) {
        Lock lock = this.b;
        lock.lock();
        try {
            cmuh cmuhVar = (cmuh) this.e.get(i);
            if (cmuhVar != null) {
                return new Bundle(cmuhVar.b);
            }
            Bundle bundle = Bundle.EMPTY;
            lock.unlock();
            return bundle;
        } finally {
            this.b.unlock();
        }
    }

    public final void b() {
        this.b.lock();
        try {
            SparseArray sparseArray = this.e;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                cmuh cmuhVar = (cmuh) sparseArray.valueAt(i);
                int i2 = cmuhVar.a;
                SparseArray sparseArray2 = this.d;
                cmuh cmuhVar2 = (cmuh) sparseArray2.get(i2);
                if (cmuhVar2 != null) {
                    if (cmuhVar.g().isPresent()) {
                        cmuhVar.c = cmug.b(i2, (String) cmuhVar.g().get(), this.h);
                    }
                    cmuhVar2.b.putAll(cmuhVar.b);
                    cmug cmugVar = cmuhVar.c;
                    if (cmugVar != null) {
                        cmuhVar2.c = cmugVar;
                    }
                    sparseArray2.put(i2, cmuhVar2);
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void c() {
        this.i.ifPresent(new Consumer() { // from class: cmun
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cmuu) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
