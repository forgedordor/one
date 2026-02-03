package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpn {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final csq b = new csq();
    public final csq c = new csq();
    private final String d;

    public egpn(String str) {
        ejwl.b(!ejwk.c(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = str;
    }

    public final int a(Object obj) {
        ecem.c();
        Integer num = (Integer) this.c.get(obj.getClass());
        ejwl.p(num != null, "The callback %s has not been registered", obj.getClass());
        ejwl.p(b(num.intValue()) == obj, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    public final Object b(int i) {
        ecem.c();
        Object obj = this.b.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.c.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        obj.getClass();
        return obj;
    }

    public final void c() {
        ecem.c();
        this.b.clear();
    }

    public final void d(Object obj) {
        ecem.c();
        csq csqVar = this.c;
        Class<?> cls = obj.getClass();
        if (csqVar.containsKey(cls)) {
            Integer num = (Integer) csqVar.get(cls);
            num.intValue();
            ejwl.p(this.b.put(num, obj) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
        } else {
            Integer numValueOf = Integer.valueOf(a.getAndIncrement());
            csqVar.put(cls, numValueOf);
            this.b.put(numValueOf, obj);
        }
    }

    public final void e(Bundle bundle) {
        ecem.c();
        if (bundle != null) {
            String str = this.d;
            String strConcat = "CallbackIdMap.classes".concat(str);
            ejwl.m(bundle.containsKey(strConcat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(strConcat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        int i2 = intArray[i];
                        ejwl.s(iIntValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void f(Bundle bundle) {
        ecem.c();
        String str = this.d;
        String strConcat = "CallbackIdMap.classes".concat(str);
        ejwl.p(!bundle.containsKey(strConcat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", strConcat);
        csq csqVar = this.c;
        int i = csqVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : csqVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(strConcat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(str), iArr);
    }

    public final void g() {
        ecem.c();
        for (Map.Entry entry : this.c.entrySet()) {
            ejwl.p(this.b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
