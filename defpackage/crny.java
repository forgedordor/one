package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class crny {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils");
    public final Lock b = new ReentrantLock();
    public final SparseArray c = new SparseArray();
    protected final fcsu d;
    protected final ejxr e;
    protected final fcsu f;
    protected final fcsu g;
    protected volatile fcsu h;

    public crny(final Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.d = fcsuVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.e = ejxx.a(new ejxr() { // from class: crnv
            @Override // defpackage.ejxr
            public final Object get() {
                Object systemService = context.getSystemService("phone");
                systemService.getClass();
                return (TelephonyManager) systemService;
            }
        });
        this.h = fcsuVar2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public final crmx g() {
        return (crmx) this.g.b();
    }

    public crof h(int i) {
        throw null;
    }

    public final crof i() {
        return h(b());
    }

    public final crof j() {
        return h(c());
    }

    public final crof k() {
        return h(f());
    }

    public abstract Optional l(awxn awxnVar);

    public abstract List m();

    public abstract void n();

    public final void o(crnx crnxVar) {
        Iterator it = m().iterator();
        while (it.hasNext() && crnxVar.a(((crof) it.next()).a())) {
        }
    }

    public final boolean p(int i) {
        if (((crnw) this.d.b()).a() && e() >= 2) {
            int iB = b();
            if (i != -1 && i != iB) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 293, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning false");
                return false;
            }
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 298, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning true by default");
        return true;
    }

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s(awxn awxnVar);

    public abstract void t(int i, String str, int i2, String str2, String str3, alqm alqmVar, int i3, Optional optional);
}
